
package com.shashi.utility;

import jakarta.mail.MessagingException;

public class MailMessage {

	public static void registrationSuccess(String emailId, String name) {
		String recipient = emailId;
		String subject = "Registration Successful";
		String htmlTextMessage = "<html><body>"
				+ "<h2 style='color:green;'>Welcome to Kisan Samriddhi</h2>"
				+ "Hi " + name + ","
				+ "<br><br>Thank you for registering with Kisan Samriddhi.<br>"
				+ "We are delighted to have you on board. Explore our wide range of services aimed at empowering farmers across the nation."
				+ "<br>From latest crop techniques to affordable tools and government scheme updates — we have it all for you!"
				+ "<br><br>As a welcome gift, we are offering an additional 10% OFF up to ₹500 on your first purchase or booking."
				+ "<br>To avail this offer, please use the promo code below:"
				+ "<br><br><strong>PROMO CODE: KISAN500</strong><br><br>"
				+ "Wishing you prosperity and a great farming season ahead!"
				+ "<br><br>Warm regards,<br>Kisan Samriddhi Team"
				+ "</body></html>";
		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void transactionSuccess(String recipientEmail, String name, String transId, double transAmount) {
		String recipient = recipientEmail;
		String subject = "Order Confirmation from Kisan Samriddhi";
		String htmlTextMessage = "<html><body>"
				+ "<p>Hey " + name + ",<br/><br/>"
				+ "Thank you for choosing Kisan Samriddhi!<br/><br/>"
				+ "Your order has been placed successfully and is being processed."
				+ "<br/><h6>Please Note: This is a demo project email and no real transaction has occurred.</h6><br/>"
				+ "Here are your transaction details:<br/><br/>"
				+ "<strong style='color:red;'>Order ID: </strong><span style='color:green;'>" + transId + "</span><br/>"
				+ "<strong style='color:red;'>Amount Paid: </strong><span style='color:green;'>₹" + transAmount + "</span><br/><br/>"
				+ "We appreciate your support in strengthening Indian agriculture!<br/><br/>"
				+ "Come back soon!<br/><strong style='color:green;'>Kisan Samriddhi</strong></p>"
				+ "</body></html>";

		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void orderShipped(String recipientEmail, String name, String transId, double transAmount) {
		String recipient = recipientEmail;
		String subject = "Good News! Your Order from Kisan Samriddhi Has Shipped";
		String htmlTextMessage = "<html><body>"
				+ "<p>Hey " + name + ",<br/><br/>"
				+ "We’re excited to let you know your order has been shipped and is on its way!<br/><br/>"
				+ "<h6>Please Note: This is a demo project email and no real transaction has occurred.</h6><br/>"
				+ "Here are your order details:<br/><br/>"
				+ "<strong style='color:red;'>Order ID: </strong><span style='color:green;'>" + transId + "</span><br/>"
				+ "<strong style='color:red;'>Amount Paid: </strong><span style='color:green;'>₹" + transAmount + "</span><br/><br/>"
				+ "Thank you for supporting rural development!<br/><br/>"
				+ "Visit again!<br/><strong style='color:green;'>Kisan Samriddhi</strong></p>"
				+ "</body></html>";

		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void productAvailableNow(String recipientEmail, String name, String prodName, String prodId) {
		String recipient = recipientEmail;
		String subject = "Product " + prodName + " is Now Available at Kisan Samriddhi";
		String htmlTextMessage = "<html><body>"
				+ "<p>Hey " + name + ",<br/><br/>"
				+ "Thanks for browsing Kisan Samriddhi!<br/><br/>"
				+ "We noticed you were looking for <strong>" + prodName + "</strong> which was previously unavailable."
				+ "<br/><br/>We are happy to inform you that it is now back in stock!<br/>"
				+ "<h6>Please Note: This is a demo project email and no real transaction has occurred.</h6><br/>"
				+ "Here are the details:<br/><br/>"
				+ "<strong style='color:red;'>Product ID: </strong><span style='color:green;'>" + prodId + "</span><br/>"
				+ "<strong style='color:red;'>Product Name: </strong><span style='color:green;'>" + prodName + "</span><br/><br/>"
				+ "Grab it now before it runs out again!<br/><br/>"
				+ "Happy Farming!<br/><strong style='color:green;'>Kisan Samriddhi</strong></p>"
				+ "</body></html>";

		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static String sendMessage(String toEmailId, String subject, String htmlTextMessage) {
		try {
			JavaMailUtil.sendMail(toEmailId, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
			return "FAILURE";
		}
		return "SUCCESS";
	}
}
