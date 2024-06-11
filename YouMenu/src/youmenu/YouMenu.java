/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youmenu;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Gabriel
 */
public class YouMenu extends Application {

    private static Scene principal;
    private static Scene tipocadastro;
    private static Scene cadastrocliente;
    private static Scene cadastrofuncionario;
    private static Scene cadastrocomida;
    private static Scene selecionarrestaurante;
    private static Scene realizarpedido;
    private static Scene formadepagamento;
    private static Scene pagamentocartao;
    private static Scene historicopedidos;
    private static Scene pedidosafazer;
    private static Scene menucliente;
    private static Scene menurestaurante;
    private static Scene logincliente;
    private static Scene loginfuncionario;
    private static Scene validafuncionario;
    private static Stage palco;

    @Override
    public void start(Stage stage) throws Exception {
        palco = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/view/TelaInicial.fxml"));
        principal = new Scene(root);

        Parent TipoCadastro;
        TipoCadastro = FXMLLoader.load(getClass().getResource("/view/TelaTipoDeCadastro.fxml"));
        tipocadastro = new Scene(TipoCadastro);

        Parent CadastroCliente;
        CadastroCliente = FXMLLoader.load(getClass().getResource("/view/TelaCadastroCliente.fxml"));
        cadastrocliente = new Scene(CadastroCliente);

        Parent CadastroFuncionario;
        CadastroFuncionario = FXMLLoader.load(getClass().getResource("/view/TelaCadastroFuncionario.fxml"));
        cadastrofuncionario = new Scene(CadastroFuncionario);

        Parent CadastroComida;
        CadastroComida = FXMLLoader.load(getClass().getResource("/view/TelaCadastrarComida.fxml"));
        cadastrocomida = new Scene(CadastroComida);

        Parent SelecionarRestaurante;
        SelecionarRestaurante = FXMLLoader.load(getClass().getResource("/view/TelaSelecionarRestaurante.fxml"));
        selecionarrestaurante = new Scene(SelecionarRestaurante);

        Parent RealizarPedido;
        RealizarPedido = FXMLLoader.load(getClass().getResource("/view/TelaRealizarPedido.fxml"));
        realizarpedido = new Scene(RealizarPedido);

        Parent FormaDePagamento;
        FormaDePagamento = FXMLLoader.load(getClass().getResource("/view/TelaFormaDePagamento.fxml"));
        formadepagamento = new Scene(FormaDePagamento);

        Parent PagamentoCartao;
        PagamentoCartao = FXMLLoader.load(getClass().getResource("/view/TelaPagamentoCartao.fxml"));
        pagamentocartao = new Scene(PagamentoCartao);

        Parent HistoricoPedidos;
        HistoricoPedidos = FXMLLoader.load(getClass().getResource("/view/TelaHistoricoDePedidos.fxml"));
        historicopedidos = new Scene(HistoricoPedidos);

        Parent PedidosAFazer;
        PedidosAFazer = FXMLLoader.load(getClass().getResource("/view/TelaHistoricoPedidosAFazer.fxml"));
        pedidosafazer = new Scene(PedidosAFazer);
        
        Parent MenuCliente;
        MenuCliente = FXMLLoader.load(getClass().getResource("/view/TelaMenuCliente.fxml"));
        menucliente = new Scene(MenuCliente);
        
        Parent MenuRestaurante;
        MenuRestaurante = FXMLLoader.load(getClass().getResource("/view/TelaMenuRestaurante.fxml"));
        menurestaurante = new Scene(MenuRestaurante);
        
        Parent LoginCliente;
        LoginCliente = FXMLLoader.load(getClass().getResource("/view/TelaLoginUser.fxml"));
        logincliente = new Scene(LoginCliente);
        
        Parent LoginFuncionario;
        LoginFuncionario = FXMLLoader.load(getClass().getResource("/view/TelaLoginFuncionario.fxml"));
        loginfuncionario = new Scene(LoginFuncionario);
        
        Parent ValidaFuncionario;
        ValidaFuncionario = FXMLLoader.load(getClass().getResource("/view/TelaValidaFuncionario.fxml"));
        validafuncionario = new Scene(ValidaFuncionario);

        stage.setScene(cadastrocomida);
        stage.show();
    }

    public static void trocatela(String cena) {
        switch (cena) {
            case "principal":
                palco.setScene(principal);
                break;
            case "tipocadastro":
                palco.setScene(tipocadastro);
                break;
            case "cadastrocliente":
                palco.setScene(cadastrocliente);
                break;
            case "cadastrofuncionario":
                palco.setScene(cadastrofuncionario);
                break;
            case "cadastrocomida":
                palco.setScene(cadastrocomida);
                break;
            case "selecionarrestaurante":
                palco.setScene(selecionarrestaurante);
                break;
            case "realizarpedido":
                palco.setScene(realizarpedido);
                break;
            case "formadepagamento":
                palco.setScene(formadepagamento);
                break;
            case "pagamentocartao":
                palco.setScene(pagamentocartao);
                break;
            case "historicopedidos":
                palco.setScene(historicopedidos);
                break;
            case "pedidosafazer":
                palco.setScene(pedidosafazer);
                break;
            case "menucliente":
                palco.setScene(menucliente);
                break;
            case "menurestaurante":
                palco.setScene(menurestaurante);
                 break;
            case "logincliente":
                palco.setScene(logincliente);
                 break;
            case "loginfuncionario":
                palco.setScene(loginfuncionario);
                 break;
            case "validafuncionario":
                palco.setScene(validafuncionario);    
                 break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
