package youmenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class TelaMenuClienteController implements Initializable {

    @FXML
    private Button btnHistoricoPedidos;
    @FXML
    private Button btnFazerPedido;
    @FXML
    private ImageView btnVoltar;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnVoltarClicked(MouseEvent event) {
        ImageView btn = (ImageView) event.getSource();
        if (btn == btnVoltar) {
            try {
                YouMenu.trocatela("logincliente");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void btnHistoricoPedidosClicked(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (btn == btnHistoricoPedidos) {
            try {
                YouMenu.trocatela("historicopedidos");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void btnFazerPedidoClicked(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (btn == btnFazerPedido) {
            try {
                YouMenu.trocatela("realizarpedido");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
