package DAO;

import conexao.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Comida;

public class CadastroComidaDAO extends DAO {

    public void salvar(Comida comida) {
        conecta();
        try {
            comandoSQL = conexao.prepareStatement("INSERT INTO `produtos`(`nome`, `descricao`, `preco`, `Categorias_idCategorias`) VALUES(?,?,?,?)");
            comandoSQL.setString(1, comida.getNome());
            comandoSQL.setString(2, comida.getDescricao());
            comandoSQL.setFloat(3, comida.getPreco());
            comandoSQL.setInt(4, comida.getIdCategoria());
            comandoSQL.execute();
            fechaConexao();
        } catch (Exception e) {

        }
    }

    public ArrayList<Comida> listarComidas() {
        ArrayList<Comida> lista = new ArrayList<Comida>();
        conecta();
        try {
            comandoSQL = conexao.prepareStatement("SELECT * FROM COMIDA");
            ResultSet rs = comandoSQL.executeQuery();
            while (rs.next()) {
                Comida comida = new Comida();
                comida.setIdCategoria(rs.getInt("Categorias_idCategorias"));
                comida.setNome(rs.getString("Nome"));
                comida.setDescricao(rs.getString("Descricao"));
                comida.setDescricao(rs.getString("Preco"));
                lista.add(comida);
            }
            fechaConexao();
        } catch (Exception e) {

        }
        return lista;

    }
    
    public ArrayList<Comida> listarPizza() {
        ArrayList<Comida> listaPizza = new ArrayList<Comida>();
        conecta();
        try {
            comandoSQL = conexao.prepareStatement("SELECT * FROM PRODUTOS WHERE `Categorias_idCategorias` = 1");
            ResultSet rs = comandoSQL.executeQuery();
            while (rs.next()) {
                Comida pizza = new Comida();
                pizza.setIdProduto(rs.getInt("idProdutos"));
                pizza.setNome(rs.getString("Nome"));
                pizza.setPreco(rs.getFloat("Preco"));
                listaPizza.add(pizza);
            }
            fechaConexao();
        } catch (Exception e) {

        }
        return listaPizza;

    }
    
    public ArrayList<Comida> listarSanduiche() {
        ArrayList<Comida> listaSanduiche = new ArrayList<Comida>();
        conecta();
        try {
            comandoSQL = conexao.prepareStatement("SELECT * FROM PRODUTOS WHERE `Categorias_idCategorias` = 2");
            ResultSet rs = comandoSQL.executeQuery();
            while (rs.next()) {
                Comida sanduiche = new Comida();
                sanduiche.setIdProduto(rs.getInt("idProdutos"));
                sanduiche.setNome(rs.getString("Nome"));
                sanduiche.setPreco(rs.getFloat("Preco"));
                listaSanduiche.add(sanduiche);
            }
            fechaConexao();
        } catch (Exception e) {

        }
        return listaSanduiche;

    }
    
    public ArrayList<Comida> listarPorcao() {
        ArrayList<Comida> listaPorcao = new ArrayList<Comida>();
        conecta();
        try {
            comandoSQL = conexao.prepareStatement("SELECT * FROM PRODUTOS WHERE `Categorias_idCategorias` = 3");
            ResultSet rs = comandoSQL.executeQuery();
            while (rs.next()) {
                Comida porcao = new Comida();
                porcao.setIdProduto(rs.getInt("idProdutos"));
                porcao.setNome(rs.getString("Nome"));
                porcao.setPreco(rs.getFloat("Preco"));
                listaPorcao.add(porcao);
            }
            fechaConexao();
        } catch (Exception e) {

        }
        return listaPorcao;

    }
    
    public ArrayList<Comida> listarBebida() {
        ArrayList<Comida> listaBebida = new ArrayList<Comida>();
        conecta();
        try {
            comandoSQL = conexao.prepareStatement("SELECT * FROM PRODUTOS WHERE `Categorias_idCategorias` = 4");
            ResultSet rs = comandoSQL.executeQuery();
            while (rs.next()) {
                Comida bebida = new Comida();
                bebida.setIdProduto(rs.getInt("idProdutos"));
                bebida.setNome(rs.getString("Nome"));
                bebida.setPreco(rs.getFloat("Preco"));
                listaBebida.add(bebida);
            }
            fechaConexao();
        } catch (Exception e) {

        }
        return listaBebida;

    }
    
    

}
