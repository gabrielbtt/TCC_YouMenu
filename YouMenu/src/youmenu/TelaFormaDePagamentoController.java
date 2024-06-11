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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class TelaFormaDePagamentoController implements Initializable {

    @FXML
    private TextField txtNumeroMesa;
    @FXML
    private Button btnCartao;
    @FXML
    private Button btnPix;
    @FXML
    private ImageView btnVoltar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnCartao(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (btn == btnCartao) {
            try {
                YouMenu.trocatela("pagamentocartao");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void btnPix(ActionEvent event) {
        
    }

    @FXML
    private void btnVoltarClicked(MouseEvent event) {
        ImageView btn = (ImageView) event.getSource();
        if (btn == btnVoltar) {
            try {
                YouMenu.trocatela("realizarpedido");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
