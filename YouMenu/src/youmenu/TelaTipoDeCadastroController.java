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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class TelaTipoDeCadastroController implements Initializable {

    @FXML
    private Button btnCliente;
    
    @FXML
    private Button btnRestaurante;   
    @FXML
    private ImageView btnVoltar;

    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    private void btnClienteClicked(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (btn == btnCliente) {
            try {
                YouMenu.trocatela("cadastrocliente");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void btnRestauranteClicked(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (btn == btnRestaurante) {
            try {
                YouMenu.trocatela("validafuncionario");
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
                YouMenu.trocatela("principal");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
}
