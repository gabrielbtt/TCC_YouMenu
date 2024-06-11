/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youmenu;

import DAO.CadastroFuncionarioControle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.Funcionario;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class TelaCadastroFuncionarioController implements Initializable {

    @FXML
    private TextField txtNomeRestaurante;
    private TextField txtCnpj;
    private TextField txtCep;
    private TextField txtNumero;
    @FXML
    private TextField txtSenha;
    @FXML
    private Button btnCadastrar;
    @FXML
    private ImageView btnVoltar;
    @FXML
    private TextField txtConfirmarSenha;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnCadastrar(ActionEvent event) {
        Button btn = (Button) event.getSource();
        Funcionario restaurante = new Funcionario();
        restaurante.setNome(txtNomeRestaurante.getText());
        restaurante.setSenha(txtSenha.getText());
        restaurante.setConfirmarSenha(txtConfirmarSenha.getText());
        CadastroFuncionarioControle controle = new CadastroFuncionarioControle();
        controle.salvar(restaurante);
        txtNomeRestaurante.clear();
        txtSenha.clear();
        txtConfirmarSenha.clear();
        txtNomeRestaurante.requestFocus();
        if (btn == btnCadastrar) {
            try {
                YouMenu.trocatela("loginfuncionario");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void btnVoltarClicked(MouseEvent event) {
        ImageView btn = (ImageView) event.getSource();
        if (btn == btnVoltar) {
            try {
                YouMenu.trocatela("tipocadastro");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
