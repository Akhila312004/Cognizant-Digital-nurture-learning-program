import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDataJDBC{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "DELETE FROM student WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, 1);
            pst.executeUpdate();
            System.out.println("Data deleted.");
        } catch (Exception e) {
            System.out.println("Delete failed: " + e.getMessage());
        }
    }
}