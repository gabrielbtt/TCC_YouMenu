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
 * @author Matheus
 */
public class TelaMenuRestauranteController implements Initializable {

    @FXML
    private Button btnCadastrarComida;
    @FXML
    private Button btnPedidosAFazer;
    @FXML
    private Button btnConta;
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
    private void btnVoltarClicked(MouseEvent event) {
        ImageView btn = (ImageView) event.getSource();
        if (btn == btnVoltar) {
            try {
                YouMenu.trocatela("loginrestaurante");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void btnCadastrarComidaClicked(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (btn == btnCadastrarComida) {
            try {
                YouMenu.trocatela("cadastrocomida");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void btnPedidosAFazerClicked(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (btn == btnPedidosAFazer) {
            try {
                YouMenu.trocatela("pedidosafazer");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void btnContaClicked(ActionEvent event) {
    }
    
}
