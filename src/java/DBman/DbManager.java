package DBman;
import java.sql.*;
public class DbManager {
 Connection con;
 boolean status;
 public String cmd;
 public DbManager()
 {
     try{
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EXAMDB","root","");
     }catch(Exception e)
     {
      System.err.println(e);
      con=null;
     }
    }
 public boolean DDL()
 {
     try{
         Statement stmt=con.createStatement();
         stmt.execute(cmd);
         status=true;
       
     }catch (Exception e){
    System.err.println(e);
     status = false;
 }
     return status;
 }
 public boolean DML()
 {
try
{
  Statement stmt=con.createStatement();
 stmt.executeUpdate(cmd);
  status=true;
}catch(Exception e){
    System.err.println(e);
    status=false;
}
return status;
}
 //for DQL() select........
 public ResultSet DQL()
 {
     ResultSet rs;
  try
  {
      Statement stmt=con.createStatement();
      rs=stmt.executeQuery(cmd);
  }catch(Exception e){
      System.out.println(e);
      rs=null;
  }
  return rs;
  
 } 
 public String[] getNameAndPhoto(String uid)
 {
     cmd="Select Name,Profile_Pic_Path from candidate_registration where Roll_No='"+uid+"'";
     String []arr=new String [2];
     ResultSet r=DQL();
     try
     {
     while(r.next())
     {
         arr[0]=r.getString("Name");
         arr[1]=r.getString("Profile_Pic_Path");
     }
 }
     catch(Exception e)
     {
         
     }
  
return arr;
}
}
