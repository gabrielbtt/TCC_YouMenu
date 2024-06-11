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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Funcionario;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class TelaSelecionarRestauranteController implements Initializable {

    @FXML
    private TextField txtCodigoRestaurante;
    @FXML
    private TableColumn<Funcionario, String> tblNumero;
    @FXML
    private TableColumn<Funcionario, String> tblCep;
    @FXML
    private TableColumn<Funcionario, String> tblNomeRestaurante;
    @FXML
    private Button btnContinuar;
    @FXML
    private TableView<Funcionario> tblSelecionarRestaurante;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void imgVoltar(MouseEvent event) {
    }

    @FXML
    private void btnContinuar(ActionEvent event) {
    }
    
}
