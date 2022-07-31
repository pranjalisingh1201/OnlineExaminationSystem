/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBman;
import java.net.*;
import java.io.*;
/**
 *
 * @author DELL
 */
public class SMSSender {
    private String SenderId,UserId,SecretKey;
public SMSSender()
{
UserId="KSSCKT";
SecretKey="41f95f660fxx";
SenderId="KSSCKT";
}
public boolean SendMySMS(String MobileNo,String MessageText)
{
try
{
String APIURL="http://t.160smsalert.com/submitsms.jsp?user="+URLEncoder.encode(UserId,"UTF-8")+"&key="+URLEncoder.encode(SecretKey,"UTF-8")+"&mobile="+URLEncoder.encode(MobileNo,"UTF-8")+"&message="+URLEncoder.encode(MessageText,"UTF-8")+"&senderid="+URLEncoder.encode(SenderId,"UTF-8")+"&accusage=1";
URL objURL=new URL(APIURL);
HttpURLConnection con=(HttpURLConnection)objURL.openConnection();
String response=con.getResponseMessage();//to send msg
return true;
}
catch(Exception ex)
{
return false;
}
}
    
}
