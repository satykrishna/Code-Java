package com.example.CustomizedSerialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Account implements Serializable {

	private static Logger logger = Logger.getLogger(Account.class.getName());

	private static final long serialVersionUID = 1L;
	private String userName;
	private transient String password;
	private transient int pinNo;

	public Account(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public Account(String userName, String password, int pinNo) {
		this(userName, password);
		this.setPinNo(pinNo);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPinNo() {
		return pinNo;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	private void writeObject(ObjectOutputStream os) throws Exception {
		/*
		 * This should be available at sender side
		 */
		/*
		 * Default serialization is performed here
		 */
		logger.log(Level.INFO, "Performing default serialization");
		os.defaultWriteObject();
		logger.log(Level.INFO, "Performing customized serialization");
		String ePass = "123" + password;
		logger.log(Level.INFO, "encryption performed : " + ePass);
		os.writeObject(ePass);
		int ePin = 444 + pinNo;
		os.writeInt(ePin);

	}

	private void readObject(ObjectInputStream is) throws Exception {
		/*
		 * This should be available at receiver side
		 */
		logger.log(Level.INFO, "Performing default deserialization");
		is.defaultReadObject();
		logger.log(Level.INFO, "Performing ecnrypted deserialization");
		password = ((String) is.readObject()).substring(3);
		logger.log(Level.INFO, "password = " + password);
		pinNo = is.readInt() - 444;
		logger.log(Level.INFO, "pinNo = " + pinNo);

	}

	@Override
	public String toString() {
		return "[userName : " + userName + " password : " + password
				+ " pinNo : " + pinNo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Account)) {
			return false;
		}
		
		Account otherAccount = (Account) obj;
		
		if (otherAccount == this) {
			return true;
		}

		if (otherAccount.password != password
				|| otherAccount.userName != userName
				|| otherAccount.pinNo != pinNo) {
			return false;
		}

		return true;
	}

}
