
package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private final static String URL = "jdbc:mysql://localhost:3306/";
	private final static String USER = "root";
	private final static String PASS = "pedroviva2000";
        
        public static Connection conectaBanco() {//static
		Connection conecta = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conecta = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conectado!");
		} catch (ClassNotFoundException e) { 
			System.out.println("Classe não encontrada: "+ e.getMessage());
		} catch (SQLException e) {
			System.out.println("Usuario/senha/url não errado: "+ e.getMessage());
		}
		return conecta;
	}
}
