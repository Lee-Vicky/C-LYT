import java.sql.*;
public class Task6 {
    public static void main(String args[]) throws SQLException {
        ResultSet ans = null;
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "12345678";
            Connection con = DriverManager.getConnection(url,user,password);
            Statement stmt = con.createStatement();
            String insert = "insert into  student(sno,name,age,College)values('s001','老大',20,'计算机学院'),('s002','老二',19,'计算机学院'),('s003','老三',18,'计算机学院'),('s004','老四',17,'计算机学院')";
            stmt.executeUpdate(insert);
            String query1 = "select * from student";
            ans = stmt.executeQuery(query1);
            while(ans.next()){
                String sno = ans.getString(1);
                String name =ans.getString(2);
                String age = ans.getString(3);
                String College = ans.getString(4);
                System.out.println(sno+','+name+','+age+','+College);
            }
            String delete = "delete  from student where sno='s004'";
            stmt.executeUpdate(delete);
            String query2 = "select * from student where sno='s003'";
            ans = stmt.executeQuery(query2);
            while(ans.next()){
                String sno = ans.getString(1);
                String name =ans.getString(2);
                String age = ans.getString(3);
                String College = ans.getString(4);
                System.out.println(sno+','+name+','+age+','+College);
            }
            String update ="update student set sno='s001',name='老大',age = 20,College='通信学院' where sno='s001'";
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

