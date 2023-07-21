/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Darshan
 */
public class Connect
{
    public static Connection C;
    public static void main(String[] args)
    {
        try
        {
            C = DriverManager.getConnection("Jdbc:mysql://localhost:3306/CMS","root","");
            if(C != null)
            {
                System.out.println("E");
            }
            else
            {
                System.out.println("A");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }    
}
