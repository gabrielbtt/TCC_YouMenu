/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youmenu;

import DAO.CadastroClienteDAO;
import DAO.CadastroFuncionarioDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Funcionario;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class TelaValidaFuncionarioController implements Initializable {

    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtSenha;
    @FXML
    private Button btnEntrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void btnEntrar(ActionEvent event) {
        Button btn = (Button) event.getSource();
        try {
            String emailUser, senhaUser;

            emailUser = txtEmail.getText();
            senhaUser = txtSenha.getText();

            Funcionario funcionario = new Funcionario();
            funcionario.setNome(emailUser);
            funcionario.setSenha(senhaUser);
            
            CadastroFuncionarioDAO funcionariodao = new CadastroFuncionarioDAO();
            
            if(funcionariodao.loginRestaurante(funcionario)){
                YouMenu.trocatela("cadastrofuncionario");
            }else {
                JOptionPane.showMessageDialog(null, "Nome ou senha inválida");
            }
              
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "TelaLogin" +erro);
            
        }
    }
    
}