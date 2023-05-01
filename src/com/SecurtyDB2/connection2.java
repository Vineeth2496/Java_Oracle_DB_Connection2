package com.SecurtyDB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.properties.jdbcCon;

public class connection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vine96");
		
		System.out.println(con);
	
		Statement st=con.createStatement();
		// 	int i=st.executeUpdate("insert into book values(Srno int,bookname varchar2(15), genres varchar2(15), price int, no_of_selling int)");
		// 	int i=st.executeUpdate("insert into book values(02,'The Power', 'Revolution', 250, 12)");
		int i=st.executeUpdate("");
		//	int i=st.executeUpdate("update book set no_of_selling=14 where no_of_selling=12");
		System.out.println("Updated: "+i);
/*
 			jdbcCon c=new jdbcCon();
			Connection con=c.con();
			System.out.println(con);
			
			con.setAutoCommit(false);
			
			Statement st1=con.createStatement();
		//	String qr1="create table movie(cenima varchar2(15), hero varchar2(15), heroine varchar2(15), Director varchar2(15))";
		//	st1.addBatch(qr1);

			String qr2="insert into movie values('Major', 'Adivi sesh', 'Saiee', 'Venampalli')";
			st1.addBatch(qr2);

			String qr3="insert into movie values('Badri', 'Pawan kalyan', 'Renu, Ameesha', 'Puri Jagan')";
			st1.addBatch(qr3);

			String qr4="insert into movie values('Darling', 'Prabhas', 'Kajol', 'Karunakaran')";
			st1.addBatch(qr4);

			int i[]=st1.executeBatch();
			
			for(int x:i)
			{
				con.commit();
				System.out.println("Updated qurries: "+x);
			}
 */
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
