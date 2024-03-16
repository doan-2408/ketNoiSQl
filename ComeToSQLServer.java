package cometosqlserver;
import java.sql.*;
/**
 *
 * @author TienTHM_1
 */
public class ComeToSQLServer {
    public static Connection sConn = null;
    public static void main(String[] args) {
        String strDbUrl = "jdbc:sqlserver://localhost:1433; "
                + "databaseName=demoKetNoi;"  //Cấu hình theo tên database muốn kết nối
                + "user=sa;"                
                + "password=257257;"       //Cấu hình theo mật khẩu tài khoản sa
                + "encrypt=true;trustServerCertificate=true";
        if (sConn == null) {
            try {              
                sConn = DriverManager.getConnection(strDbUrl);
                DatabaseMetaData data = (DatabaseMetaData) sConn.getMetaData();
                System.out.println("OK");
                System.out.println("Driver Name: " + data.getDriverName());
                System.out.println("Driver Version: " + data.getDriverVersion());
                System.out.println("Product Name: " + data.getDatabaseProductName());
            } 
            catch (SQLException ex) {System.out.println("Khong the ket noi den CSDL \n" + ex);
            } 
        }
    }
}
