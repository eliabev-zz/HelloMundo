package jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection getConexao(){
        try {
            Properties prop = getProperties();
            String url = prop.getProperty("banco.url");
            String usuario = prop.getProperty("banco.usuario");
            String senha = prop.getProperty("banco.senha");
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String caminho = "src/conexao.properties";
        prop.load(new FileReader(caminho));
        return prop;
    }
}
