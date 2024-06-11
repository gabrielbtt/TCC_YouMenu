package youmenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class TelaHistoricoDePedidosController implements Initializable {

    @FXML
    private ImageView btnVoltar;
    @FXML
    private Button btnExcluir;

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
                YouMenu.trocatela("menucliente");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void btnExcluirClicked(ActionEvent event) {
    }
    
}
