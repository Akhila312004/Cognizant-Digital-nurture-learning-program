import java.sql.*;

public class JDBCInsertUpdate {  // Class name matches filename (JDBCInsertUpdate.java)
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
             PreparedStatement ps = conn.prepareStatement("INSERT INTO students(name) VALUES(?)")) {
            
            ps.setString(1, "New Student");
            int rowsAffected = ps.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
            
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}
