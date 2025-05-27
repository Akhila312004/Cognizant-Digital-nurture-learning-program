import java.sql.*;

public class Transaction {
    public static void main(String[] args) {
        // Use try-with-resources for auto-closing Connection
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db")) {
            conn.setAutoCommit(false); // Start transaction
            
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate("UPDATE accounts SET balance = balance - 100 WHERE id = 1");
                stmt.executeUpdate("UPDATE accounts SET balance = balance + 100 WHERE id = 2");
                conn.commit(); // Commit if both updates succeed
                System.out.println("Transaction successful");
            } catch (SQLException e) {
                conn.rollback(); // Rollback on error
                System.out.println("Transaction failed: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
        }
    }
}