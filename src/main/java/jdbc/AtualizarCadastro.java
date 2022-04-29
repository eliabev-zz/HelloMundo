package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarCadastro{
    public static void main(String[]args) throws SQLException {
        System.out.println("Informe o id do usuário: ");
        Scanner entrada = new Scanner(System.in);
        int idDoUser = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Informe o nome para ser colocado: ");
        String novoNome = entrada.nextLine();

        String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, novoNome);
        stmt.setInt(2, idDoUser);
        stmt.execute();

        entrada.close();
        String sql2 = "SELECT * FROM pessoas WHERE nome = ?";
        stmt = conexao.prepareStatement(sql2);
        stmt.setString(1, novoNome);
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> resultados = new ArrayList<>();

        while(resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            resultados.add(new Pessoa(codigo, nome));
        }

        for(Pessoa p: resultados) {
            System.out.println(p.getCodigo()+ " ==> "+ p.getNome());
        }

        conexao.close();
        }
}
