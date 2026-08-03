import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Assignment1 {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            String sql = "SELECT employee_id, first_name FROM EMPLOYEE_DETAILS";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("EMPLOYEE_ID\tFIRST_NAME");
            System.out.println("--------------------------");

            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + "\t\t" +
                        rs.getString("first_name"));

            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {

            System.out.println("Connection could not be established");
            System.out.println(e);

        }

    }
}