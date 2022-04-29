package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args)  throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o código: ");
        int codigo = entrada.nextInt();
        entrada.close();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        if(stmt.executeUpdate() > 0) {
            System.out.println("Pessoa(s) excluída(s)!");
        } else {
            System.out.println("Nenhuma pessoa encontrada");
        }

        conexao.close();
    }
}
