package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLDataException;
import java.sql.DriverManager;

public class DAO {

    protected Connection conexao;
    protected PreparedStatement comandoSQL;

    public void conecta() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/testeyoumenu";
            String usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e) {

        }
    }

    public void fechaConexao() throws Exception {
        if (conexao != null) {
            conexao.close();
        }

        if (comandoSQL != null) {
            comandoSQL.close();
        }
    }
}
