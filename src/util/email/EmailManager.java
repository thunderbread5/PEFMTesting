/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.email;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author nickg
 */
public class EmailManager {

    private final String emailServerName = "smtp.gmail.com";
    private final String mailer = "JavaMailer";
    private String smtpAuthUser;
    private String smtpAuthPassword;

    public EmailManager() {
    }

    public EmailManager(String smtpAuthUser, String smtpAuthPassword) {
        this.smtpAuthUser = smtpAuthUser;
        this.smtpAuthPassword = smtpAuthPassword;
    }

    public Boolean validateUser(String validateURL, String username, Date validationExpiry, String fromEmailAddress, String toEmailAddress) {
        String emailBody = "";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        Calendar dateExpiryDate = Calendar.getInstance();
        dateExpiryDate.setTime(validationExpiry);
        String dateExpire = format.format(dateExpiryDate.getTime());

        emailBody += "Dear " + username + ",<br/><br/>";
        emailBody += "An account has been created for you for the PEFM System." + "<br/><br/> Please validate your account by clicking the url: <b>" + validateURL + "</b><br/>";
        emailBody += "Please note this URL will expire at <b>" + dateExpire + "</b>.</b><br/><br/><br/>";
        emailBody += "If you did not request this action, please contact your superior.";
        emailBody += "<br/><br/><br/>Yours Sincerely, <br/> Centre for Evaluation and Implementation Science (CEIS)";

        try {

            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            //comment out before deployment
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator(smtpAuthUser, smtpAuthPassword);
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            Transport transport = session.getTransport();

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(fromEmailAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("Validate New Account for PEFM System");
                msg.setContent(emailBody, "text/html");
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

//                transport.connect(emailServerName, smtpAuthUser, smtpAuthPassword);
                transport.send(msg);

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());

            return false;
        }
    }

    public Boolean validateAgencyUser(String validateURL, String username, Date validationExpiry, String fromEmailAddress, String toEmailAddress) {
        String emailBody = "";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        Calendar dateExpiryDate = Calendar.getInstance();
        dateExpiryDate.setTime(validationExpiry);
        String dateExpire = format.format(dateExpiryDate.getTime());

        emailBody += "Dear " + username + ",<br/><br/>";
        emailBody += "An account has been created for you for the Fidelity Checklist System." + "<br/><br/> Please validate your account by clicking the url: <b>" + validateURL + "</b><br/>";
        emailBody += "Please note this URL will expire at <b>" + dateExpire + "</b>.</b><br/><br/><br/>";
        emailBody += "If you did not request this action, please contact your superior or Point of Contact in MSF.";
        emailBody += "<br/><br/><br/>Yours Sincerely, <br/> Centre for Evaluation and Implementation Science (CEIS)";

        try {

            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            //comment out before deployment
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator(smtpAuthUser, smtpAuthPassword);
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            Transport transport = session.getTransport();

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(fromEmailAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("Validate New Account for Fidelity Checklist System");
                msg.setContent(emailBody, "text/html");
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

//                transport.connect(emailServerName, smtpAuthUser, smtpAuthPassword);
                transport.send(msg);

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());

            return false;
        }
    }

    public void emailUserAccDeletion(String username, String fromEmailAddress, String toEmailAddress) {
        String emailBody = "";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        Calendar otpExpiry = Calendar.getInstance();
        String dateExpire = format.format(otpExpiry.getTime());

        emailBody += "Dear " + username + ",<br/><br/>";
        emailBody += "As of " + dateExpire + ", the validation period for your account activation has expired. The link in the previous emaill will no longer work." + "<br/><br/><br/><br/>";
        emailBody += "Please contact your superior or Point of Contact in MSF to recreate your account.";
        emailBody += "<br/><br/><br/>Yours Sincerely, <br/> Centre for Evaluation and Implementation Science (CEIS)";

        try {

            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            //comment out before deployment
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator(smtpAuthUser, smtpAuthPassword);
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            Transport transport = session.getTransport();

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(fromEmailAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("Deletion of non-validated Account");
                msg.setContent(emailBody, "text/html");
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

//                transport.connect(emailServerName, smtpAuthUser, smtpAuthPassword);
                transport.send(msg);

            }
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());
        }
    }

    public Boolean requestPasswordChange(String resetPasswordURL, String username, Date passwordRequestExpiry, String fromEmailAddress, String toEmailAddress) {
        String emailBody = "";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        Calendar dateExpiryDate = Calendar.getInstance();
        dateExpiryDate.setTime(passwordRequestExpiry);
        String dateExpire = format.format(dateExpiryDate.getTime());

        emailBody += "Dear " + username + ",<br/><br/>";
        emailBody += "A request for your password to be changed has been made." + "<br/><br/> Please change your password by clicking the url: <b>" + resetPasswordURL + "</b><br/>";
        emailBody += "Please note this URL will expire at <b>" + dateExpire + "</b>.</b><br/><br/><br/>";
        emailBody += "If you did not request this action, please contact your superior or Point of Contact in MSF.";
        emailBody += "<br/><br/><br/>Yours Sincerely, <br/> Centre for Evaluation and Implementation Science (CEIS)";

        try {

            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            //comment out before deployment
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator(smtpAuthUser, smtpAuthPassword);
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            Transport transport = session.getTransport();

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(fromEmailAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("Request for Password change");
                msg.setContent(emailBody, "text/html");
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

//                transport.connect(emailServerName, smtpAuthUser, smtpAuthPassword);
                transport.send(msg);

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());

            return false;
        }
    }

    public Boolean remindProgrammeManagerToReview(String userFullName, String fromEmailAddress, String toEmailAddress, String ProgrammeName, Date ProgrammeDueDate) {
        String emailBody = "";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        emailBody += "Dear " + userFullName + ",<br/><br/>";

        emailBody += "This is an gentle reminder from the system that your " + ProgrammeName + " is due for a review. "
                + "Now, it's time to review the programme and start to surface relevant documents for your programme lastest by " + format.format(ProgrammeDueDate) + "." + "</b><br/>";

        emailBody += "If you have already done so, please ignore this email" + "</b>.</b><br/><br/><br/>";

        emailBody += "Since this is an automated email from the system, please do not reply to this message.";

        emailBody += "<br/><br/><br/>Yours Sincerely, <br/> Centre for Evaluation and Implementation Science (CEIS)";

        try {

            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            //comment out before deployment
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator(smtpAuthUser, smtpAuthPassword);
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            Transport transport = session.getTransport();

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(fromEmailAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("[Gentle Reminder] Remember to review on Programme: " + ProgrammeName);
                msg.setContent(emailBody, "text/html");
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

//                transport.connect(emailServerName, smtpAuthUser, smtpAuthPassword);
                transport.send(msg);

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());

            return false;
        }
    }

    public Boolean remindDeskHeadToReview(String userFullName, String fromEmailAddress, String toEmailAddress, String ProgrammeName, Date ProgrammeDueDate) {
        String emailBody = "";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        emailBody += "Dear " + userFullName + ",<br/><br/>";

        emailBody += "This is an gentle reminder from the system that " + ProgrammeName + " under your charge is soon due for a review. "
                + "All documents will be uploaded by the programme manager lastest by " + format.format(ProgrammeDueDate) + "." + "</b><br/>";

        emailBody += "If you have already done so, please ignore this email" + "</b>.</b><br/><br/><br/>";

        emailBody += "Since this is an automated email from the system, please do not reply to this message.";

        emailBody += "<br/><br/><br/>Yours Sincerely, <br/> Centre for Evaluation and Implementation Science (CEIS)";

        try {

            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            //comment out before deployment
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator(smtpAuthUser, smtpAuthPassword);
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            Transport transport = session.getTransport();

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(fromEmailAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("[Gentle Reminder] Remember to review on Programme: " + ProgrammeName);
                msg.setContent(emailBody, "text/html");
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

//                transport.connect(emailServerName, smtpAuthUser, smtpAuthPassword);
                transport.send(msg);

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());

            return false;
        }
    }

    public Boolean requestToUploadMoreDocuments(String SenderName, String fromEmailAddress, String userFullName, String toEmailAddress, String ProgrammeName) {
        String emailBody = "";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        emailBody += "Dear " + userFullName + ",<br/><br/>";

        emailBody += "This is an gentle reminder from the system that " + SenderName + " has send an request to upload more documents for Programme: " + ProgrammeName + ". " + "</b><br/><br/><br/>";

        emailBody += "If you have already done so, please ignore this email" + "</b>.</b><br/><br/><br/>";

        emailBody += "Since this is an automated email from the system, please do not reply to this message.";

        emailBody += "<br/><br/><br/>Yours Sincerely, <br/> Centre for Evaluation and Implementation Science (CEIS)";

        try {

            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            //comment out before deployment
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator(smtpAuthUser, smtpAuthPassword);
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            Transport transport = session.getTransport();

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(fromEmailAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("[Gentle Reminder] Remember to review on Programme: " + ProgrammeName);
                msg.setContent(emailBody, "text/html");
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

//                transport.connect(emailServerName, smtpAuthUser, smtpAuthPassword);
                transport.send(msg);

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());

            return false;
        }
    }

    public Boolean remindRatersToRate(String userFullName, String fromEmailAddress, String toEmailAddress, String ProgrammeName, Date ratingDueDate) {
        String emailBody = "";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        emailBody += "Dear " + userFullName + ",<br/><br/>";

        emailBody += "This is an gentle reminder from the CEIS Deskhead that you have yet to submit your  rating for " + ProgrammeName + ". "
                + "Now, it's time to submit your rating for the programme lastest by " + format.format(ratingDueDate) + "." + "</b><br/>";

        emailBody += "If you have already done so, please ignore this email" + "</b>.</b><br/><br/><br/>";

        emailBody += "Since this is an automated email from the system, please do not reply to this message.";

        emailBody += "<br/><br/><br/>Yours Sincerely, <br/> Centre for Evaluation and Implementation Science (CEIS)";

        try {

            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            //comment out before deployment
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator(smtpAuthUser, smtpAuthPassword);
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            Transport transport = session.getTransport();

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(fromEmailAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailAddress, false));
                msg.setSubject("[Gentle Reminder] Remember to submit your rating for Programme: " + ProgrammeName);
                msg.setContent(emailBody, "text/html");
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

//                transport.connect(emailServerName, smtpAuthUser, smtpAuthPassword);
                transport.send(msg);

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());

            return false;
        }
    }

    public Boolean sendPMForRatingDiscussion(String programmeManagerFullName, String programmeManagerEmail, String raterFullName, String raterEmailAddress, String fromEmailAddress, String ProgrammeName) {
        String emailBody = "";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        emailBody += "Dear " + programmeManagerFullName + ",<br/><br/>";

        emailBody += raterFullName + " is requesting to have a meeting with you to discuss on the rating part for " + ProgrammeName + "." + "</b><br/></b><br/>";

        emailBody += "Please let him/her know about your available dates and timings to have a discussion as soon as possible." + "</b><br/>";

        emailBody += "Since this is an automated email from the system, please do not reply to this message.";

        emailBody += "<br/><br/><br/>Yours Sincerely, <br/> Centre for Evaluation and Implementation Science (CEIS)";

        try {

            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            //comment out before deployment
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator(smtpAuthUser, smtpAuthPassword);
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            Transport transport = session.getTransport();

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(fromEmailAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(raterEmailAddress, false));
                msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(programmeManagerEmail, false));
                msg.setSubject("[Gentle Reminder] Remember to review on Programme: " + ProgrammeName);
                msg.setContent(emailBody, "text/html");
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

//                transport.connect(emailServerName, smtpAuthUser, smtpAuthPassword);
                transport.send(msg);

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());

            return false;
        }
    }

    public Boolean sendDeskHeadProgrammeFullyDocumented(String deskHeadFullName, String deskHeadEmail, String programmeManagerFullName, String programmeManagerEmail, String fromEmailAddress, String ProgrammeName) {
        String emailBody = "";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        emailBody += "Dear " + deskHeadFullName + ",<br/><br/>";

        emailBody += programmeManagerFullName + " has finished uploading all the documents required for " + ProgrammeName + "." + "</b><br/></b><br/>";

        emailBody += "Since this is an automated email from the system, please do not reply to this message.";

        emailBody += "<br/><br/><br/>Yours Sincerely, <br/> Centre for Evaluation and Implementation Science (CEIS)";

        try {

            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            //comment out before deployment
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator(smtpAuthUser, smtpAuthPassword);
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            Transport transport = session.getTransport();

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(fromEmailAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(deskHeadEmail, false));
                msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(programmeManagerEmail, false));
                msg.setSubject("[Gentle Reminder] Remember to review on Programme: " + ProgrammeName);
                msg.setContent(emailBody, "text/html");
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

//                transport.connect(emailServerName, smtpAuthUser, smtpAuthPassword);
                transport.send(msg);

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());

            return false;
        }
    }

    public Boolean requestToEditRating(String deskHeadName, String deskHeadEmail, String raterFullName, String raterEmailAddress, String fromEmailAddress, String ProgrammeName) {
        String emailBody = "";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        emailBody += "Dear " + deskHeadName + ",<br/><br/>";

        emailBody += raterFullName + " is requesting to edit his/her rating for programme: " + ProgrammeName + "." + "</b><br/></b><br/>";

        emailBody += "Please reject the rating in order for him/her to edit rating" + "</b><br/>";

        emailBody += "Since this is an automated email from the system, please do not reply to this message.";

        emailBody += "<br/><br/><br/>Yours Sincerely, <br/> Centre for Evaluation and Implementation Science (CEIS)";

        try {

            Properties props = new Properties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", emailServerName);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            //comment out before deployment
            props.put("mail.smtp.debug", "true");
            javax.mail.Authenticator auth = new SMTPAuthenticator(smtpAuthUser, smtpAuthPassword);
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            Message msg = new MimeMessage(session);

            Transport transport = session.getTransport();

            if (msg != null) {
                msg.setFrom(InternetAddress.parse(fromEmailAddress, false)[0]);
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(raterEmailAddress, false));
                msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(deskHeadEmail, false));
                msg.setSubject("[Gentle Reminder] Remember to review on Programme: " + ProgrammeName);
                msg.setContent(emailBody, "text/html");
                msg.setHeader("X-Mailer", mailer);

                Date timeStamp = new Date();
                msg.setSentDate(timeStamp);

//                transport.connect(emailServerName, smtpAuthUser, smtpAuthPassword);
                transport.send(msg);

                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());

            return false;
        }
    }

}
