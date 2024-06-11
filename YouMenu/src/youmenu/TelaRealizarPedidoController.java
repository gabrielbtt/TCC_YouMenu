/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youmenu;

import DAO.CadastroComidaControle;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.Cliente;
import model.Comida;
import model.Resumo;

/**
 * FXML Controller class
 *
 * @author Matheus
 */
public class TelaRealizarPedidoController implements Initializable {

    @FXML
    private ImageView btnVoltar;
    @FXML
    private Button btnContinuar;
    @FXML
    private ImageView btnCategoriaPizza;
    @FXML
    private ImageView btnCategoriaPorcao;
    @FXML
    private ImageView btnCategoriaSanduiche;
    @FXML
    private ImageView btnCategoriaBebida;
    @FXML
    private TableView<Comida> tblProdutos;
    @FXML
    private TableColumn<Comida, String> clnCodigo;
    @FXML
    private TableColumn<Comida, String> clnNomeProduto;
    @FXML
    private TableColumn<Comida, String> clnPrecoProduto;
    @FXML
    private Button btnAdicionar;
    @FXML
    private Spinner<Integer> spinQuantidade;
    
    private ObservableList<Comida> obsComida;
    private List<Comida> lstComida = new ArrayList<>();
    
    @FXML
    private ListView<Comida> lvResumo;
    private ObservableList<Comida> obsResumo;
    private List<Comida> lstResumo = new ArrayList<>();
    
    

    int quantidade;
    float precoTotal;
    float preco;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        SpinnerValueFactory<Integer> valueFactory
                = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100);

        valueFactory.setValue(1);
        spinQuantidade.setValueFactory(valueFactory);
        

    }
    
    public void carregarProdutos(){
        Comida comida = new Comida();
        
        
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
    private void btnContinuar(ActionEvent event) {
        
        
    }

    @FXML
    private void btnCategoriaPizzaClicked(MouseEvent event) {
        ImageView btn = (ImageView) event.getSource();
        if (btn == btnCategoriaPizza) {
            try {
                CadastroComidaControle controle = new CadastroComidaControle();
                lstComida = controle.listarPizza();
                obsComida = FXCollections.observableArrayList(lstComida);
                tblProdutos.setItems(obsComida);
                System.out.println("Listei as Pizzas");
            } catch (Exception ex) {
                Logger.getLogger(TelaRealizarPedidoController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void btnCategoriaPorcaoClicked(MouseEvent event) {
        ImageView btn = (ImageView) event.getSource();
        if (btn == btnCategoriaPorcao) {
            try {
                CadastroComidaControle controle = new CadastroComidaControle();
                lstComida = controle.listarPorcao();
                obsComida = FXCollections.observableArrayList(lstComida);
                tblProdutos.setItems(obsComida);
                System.out.println("Listei as Porções");
            } catch (Exception ex) {
                Logger.getLogger(TelaRealizarPedidoController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void btnCategoriaSanduicheClicked(MouseEvent event) {
        ImageView btn = (ImageView) event.getSource();
        if (btn == btnCategoriaSanduiche) {
            try {
                CadastroComidaControle controle = new CadastroComidaControle();
                lstComida = controle.listarSanduiche();
                obsComida = FXCollections.observableArrayList(lstComida);
                tblProdutos.setItems(obsComida);
                System.out.println("Listei os sanduiches");
            } catch (Exception ex) {
                Logger.getLogger(TelaRealizarPedidoController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void btnCategoriaBebidaClicked(MouseEvent event) {
        ImageView btn = (ImageView) event.getSource();
        if (btn == btnCategoriaBebida) {
            try {
                CadastroComidaControle controle = new CadastroComidaControle();
                lstComida = controle.listarBebida();
                obsComida = FXCollections.observableArrayList(lstComida);
                tblProdutos.setItems(obsComida);
                System.out.println("Listei as bebidas");
            } catch (Exception ex) {
                Logger.getLogger(TelaRealizarPedidoController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void btnAdicionar(ActionEvent event) {
        Comida produtos = tblProdutos.getSelectionModel().getSelectedItem();
        
        Comida comida = new Comida();
        quantidade = spinQuantidade.getValue();
        preco = comida.getPreco();
        precoTotal = quantidade * preco;
        
        Comida resumo = new Comida(comida.getNome(), "", precoTotal, comida.getIdCategoria(), comida.getIdProduto());
        /*lstResumo.add(produtos.getIdProduto());*/
        /*lstResumo.add(produtos.getNome());*/
        /*lstResumo.add(produtos.getPreco());*/
        
        
        obsResumo = FXCollections.observableArrayList(lstResumo);
        lvResumo.setItems(obsResumo);
    }

    /*public void listarComidas() {
        try {
            CadastroComidaControle controle = new CadastroComidaControle();
            lstComida = controle.listarComidas();
            obsComida = FXCollections.observableArrayList(lstComida);
            tblFazerPedido.setItems(obsComida);
            System.out.println("Listei");
        } catch (Exception ex) {
            Logger.getLogger(TelaRealizarPedidoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
}
