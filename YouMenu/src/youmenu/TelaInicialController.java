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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class TelaInicialController implements Initializable {

    @FXML
    private Button btnCadastrar;
    @FXML
    private Button loginCliente;
    @FXML
    private Button loginRestaurante;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (btn == btnCadastrar) {
            try {
                YouMenu.trocatela("tipocadastro");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void logarCliente(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (btn == loginCliente) {
            try {
                YouMenu.trocatela("logincliente");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void logarRestaurante(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (btn == loginRestaurante) {
            try {
                YouMenu.trocatela("loginfuncionario");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
