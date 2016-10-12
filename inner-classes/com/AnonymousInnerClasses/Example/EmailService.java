package com.AnonymousInnerClasses.Example;

public interface EmailService {

	public void sendEmail(EmailDetails e);

	class EmailDetails {

		private String toAddress;
		private String ccAddress;

		public String getToAddress() {
			return toAddress;
		}

		public void setToAddress(String toAddress) {
			this.toAddress = toAddress;
		}

		public String getCcAddress() {
			return ccAddress;
		}

		public void setCcAddress(String ccAddress) {
			this.ccAddress = ccAddress;
		}

		public String getSubjectLine() {
			return subjectLine;
		}

		public void setSubjectLine(String subjectLine) {
			this.subjectLine = subjectLine;
		}

		public String getMessageBody() {
			return messageBody;
		}

		public void setMessageBody(String messageBody) {
			this.messageBody = messageBody;
		}

		private String subjectLine;
		private String messageBody;
	}
	
	
	
	class ClassicEmail implements EmailService {

		@Override
		public void sendEmail(EmailService.EmailDetails e) {
			
			e.setSubjectLine("satya");
			e.setCcAddress("satykrishna@gmail.com");
		}
		
	}
}
