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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class TelaHistoricoPedidosAFazerController implements Initializable {

    @FXML
    private ImageView btnVoltar;
    @FXML
    private Button btnConcluir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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

    @FXML
    private void btnConcluirClicked(ActionEvent event) {
    }
    
}
