/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youmenu;

import DAO.CadastroClienteDAO;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class TelaLoginUserController implements Initializable {

    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtSenha;
    @FXML
    private Button btnEntrar;
    private Button btnCadastrar;

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

            Cliente cliente = new Cliente();
            cliente.setEmail(emailUser);
            cliente.setSenha(senhaUser);
            
            CadastroClienteDAO clientedao = new CadastroClienteDAO();
            
            if(clientedao.loginUser(cliente)){
                YouMenu.trocatela("menucliente");
            }else {
                JOptionPane.showMessageDialog(null, "Email ou senha inválida");
            }
              
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "TelaLogin" +erro);
            
        }

    }

}
