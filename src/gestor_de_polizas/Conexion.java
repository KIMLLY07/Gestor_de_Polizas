package gestor_de_polizas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    Connection cx;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gestor_de_Polizas", "root", "");
            System.out.println("CONEXION EXITOSA A LA BASE DE DATOS Gestor_de_Polizas");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR DE CONEXION: " + e);
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION: " + e);
        }
        return cx;
    }

    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.conectar();
    }
}
