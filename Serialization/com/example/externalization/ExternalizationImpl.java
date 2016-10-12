package com.example.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.logging.Logger;

public class ExternalizationImpl implements Externalizable {

	String s;
	int i;
	int j;

	public ExternalizationImpl(String s, int i, int j) {
		this.s = s;
		this.i = i;
		this.j = j;

	}
	
	public ExternalizationImpl() {
	   Logger.getLogger(this.getClass().getName()).info("Default constructor is called");
	}

	@Override
	public void readExternal(ObjectInput oi) throws IOException,
			ClassNotFoundException {
		
		Object obj = null;
		
		while((obj = oi.readObject()) !=null) {
			if(obj instanceof String) {
				s = (String)oi.readObject();				
			}
			else if(obj instanceof Integer) {
				i = (Integer)oi.readObject();
			}
		}
	}
 
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeInt(i);
		out.writeObject(s);

	}

}
