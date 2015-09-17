package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class TestCMySql {
	



	public static void main(String[] args){
		String url = "jdbc:mysql://10.25.86.89:3306/test";
		String name = "com.mysql.jdbc.Driver";
		String user = "root";
		String password = "root";

		Connection conn = null;
		PreparedStatement pst = null;

		
			try {
				Class.forName(name);//指定连接类型
				conn = DriverManager.getConnection(url, user, password);//获取连接
				System.out.println("conect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		

		
	}

}
