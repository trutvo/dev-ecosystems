import java.lang.reflect.Method;

public class LoadDriverExample {
  public static void main(String[] args) {
    try {
      // Load the JDBC driver class dynamically
      //Class<?> driverClass = Class.forName("com.mysql.cj.jdbc.Driver");
      Class<?> driverClass = Class.forName("java.sql.Driver");
      Method method = driverClass.getMethod("connect", String.class, java.util.Properties.class);
      System.out.println("Driver class loaded: " + driverClass.getName());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
