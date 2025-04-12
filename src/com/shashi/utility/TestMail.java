package com.shashi.utility;

import jakarta.mail.MessagingException;

public class TestMail {
	public static void main(String[] args) {
		try {
			String recipient = "ellison.alumni@gmail.com";
			String subject = "Mail Configuration Successfull";
			String htmlTextMessage = "" + "<html>"
					+ "<head><title>Java Mail Configuration Test</title><style>.greenText{color:green;} p{font-size:14;}</style></head><body>"
					+ "<h2 style='color:red;'>Welcome to Krishi Samriddhi</h2>" + "<p>Hey,<br>"
					+ "Thanks for singing up with Krishi Samriddhi.<br>"
					+ "We are delighted to have you as a part of our community. At Kisan Samriddhi, we are committed to providing high-quality agricultural products and tools to support the farming community across the nation."
					+ "<br>We invite you to explore our latest collection, featuring a wide range of essential farming supplies. "
				        +" Currently, we are offering up to 60% discount on select items to help you make the most of your purchases.<br>"
					+ " <br>As a token of appreciation, we are pleased to offer you an exclusive 10% discount (up to ₹500) on your first purchase. "
					+ "To avail this offer, please use the promo code below during checkout:<br>"
					+ "<span class='greenText'>KISAN500</span><br><br>"
				        + "Thank you once again for choosing Kisan Samriddhi. We look forward to serving you.<br>" 
					+"<br>Warm regards,<br>"
					+"Team Kisan Samriddhi"
					+ "</p>" + "</body>"
					+ "</html>";
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
			System.out.println("Mail Sent Successfully!");

		} catch (MessagingException e) {
			System.out.println("Mail Sending Failed With Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
