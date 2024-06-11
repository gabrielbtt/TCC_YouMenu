package youmenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import model.Cliente;
import DAO.CadastroClienteDAO;
import DAO.CadastroClienteControle;
import conexao.DAO;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class TelaCadastroClienteController implements Initializable {

    @FXML
    private TextField txtNomeCliente;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtSenha;
    @FXML
    private TextField txtConfirmarSenha;
    @FXML
    private Button btnCadastrarCliente;
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
    private void btnCadastrarCliente(ActionEvent event) {
        Cliente cliente = new Cliente();
        cliente.setNome(txtNomeCliente.getText());
        cliente.setCPF(txtCpf.getText());
        cliente.setEmail(txtEmail.getText());
        cliente.setSenha(txtSenha.getText());
        cliente.setConfirmarSenha(txtConfirmarSenha.getText());
        CadastroClienteControle controle = new CadastroClienteControle();
        controle.salvar(cliente);
        txtNomeCliente.clear();
        txtCpf.clear();
        txtEmail.clear();
        txtSenha.clear();
        txtConfirmarSenha.clear();
        txtNomeCliente.requestFocus();
        Button btn = (Button) event.getSource();
        if (btn == btnCadastrarCliente) {
            try {
                YouMenu.trocatela("logincliente");
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
                YouMenu.trocatela("tipocadastro");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
