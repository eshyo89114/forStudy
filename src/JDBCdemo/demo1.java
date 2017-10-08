package JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class demo1 {
    //mysql地址以及账户密码
    static String url = "jdbc:mysql://localhost:3306/mysql_test";
    static String root = "root";
    static String passwd = "root";

    public static void main(String[] args){
        try{
            //调用驱动
            Class.forName("com.mysql.jdbc.Driver");
            //将数据库地址，用户，密码传入connection
            Connection connection = DriverManager.getConnection(url,root,passwd);
            //通过connection获得statement对象，写入SQL语句
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM TEST_table");
            //执行SQL语句，并且获得结果集对象
            ResultSet rs = pst.executeQuery();

            //将结果显示在控制台上
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t"+
                                    rs.getString(2)+"\t"+
                                    rs.getString(3));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
