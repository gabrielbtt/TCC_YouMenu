/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youmenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import model.Comida;
import DAO.CadastroComidaDAO;
import DAO.CadastroComidaControle;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import conexao.DAO;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class TelaCadastrarComidaController implements Initializable {

    @FXML
    private TextField txtNomeComida;
    @FXML
    private TextField txtDescricao;
    @FXML
    private TextField txtPreco;
    @FXML
    private Button btnCadastrarComida;
    @FXML
    private ImageView btnVoltar;
    @FXML
    private ChoiceBox<String> cbTipo;

    private String[] tipo = {"Pizza", "Sanduiche", "Porção", "Bebidas"};

    int idcategoria;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbTipo.getItems().addAll(tipo);
    }

    @FXML
    private void btnCadastrarComida(ActionEvent event) {
        
        String tipo = cbTipo.getValue();
        if (tipo == "Pizza") {
            idcategoria = 1;
        }
        if (tipo == "Sanduiche") {
            idcategoria = 2;
        }
        if (tipo == "Porção") {
            idcategoria = 3;
        }
        if (tipo == "Bebidas") {
            idcategoria = 4;
        }

        float preco = Float.parseFloat(txtPreco.getText());
        Comida comida = new Comida();
        comida.setIdCategoria(idcategoria);
        comida.setNome(txtNomeComida.getText());
        comida.setDescricao(txtDescricao.getText());
        comida.setPreco(preco);
        CadastroComidaControle controle = new CadastroComidaControle();
        controle.salvar(comida);
        txtNomeComida.clear();
        txtDescricao.clear();
        txtPreco.clear();
        txtNomeComida.requestFocus();
    }

    @FXML
    private void btnVoltarClicked(MouseEvent event) {
        ImageView btn = (ImageView) event.getSource();
        if (btn == btnVoltar) {
            try {
                YouMenu.trocatela("menurestaurante");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
