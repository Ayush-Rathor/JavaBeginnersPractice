package project;
import java.sql.*;
public class connectionclass {
Connection cn;
Statement stm;
public connectionclass(){
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcity","root","ayush007");
stm=cn.createStatement();
}
catch(Exception e)
{
e.printStackTrace();
}
}
public static void main(String args[])
{
new connectionclass();
}
}