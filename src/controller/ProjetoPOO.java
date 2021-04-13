/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Otavio
 */
public class ProjetoPOO extends Application {
    
    private static Stage stage;
    private static Scene cenaPrincipal;
    private static Scene cenaCadastroGerente;
    private static Scene cenaInicialGerente;
    private static Scene cenaGerenciarFuncionarios;
    
    @Override
    public void start(Stage primaryStage) throws Exception {        
        stage = primaryStage;
        primaryStage.setTitle("Assistência Social - APAE");
        
        Parent raiz;
        raiz = FXMLLoader.load(getClass().getResource("/view/TelaLogin.fxml"));
        cenaPrincipal = new Scene(raiz);
        
        Parent telaCadastroGerente;
        telaCadastroGerente = FXMLLoader.load(getClass().getResource("/view/TelaCadastroGerente.fxml"));
        cenaCadastroGerente = new Scene(telaCadastroGerente);
        
        Parent telaInicialGerente;
        telaInicialGerente = FXMLLoader.load(getClass().getResource("/view/TelaGerente.fxml"));
        cenaInicialGerente = new Scene(telaInicialGerente);
        
        Parent telaGerenciarFuncionarios;
        telaGerenciarFuncionarios = FXMLLoader.load(getClass().getResource("/view/TelaGerenciarFuncionario.fxml"));
        cenaGerenciarFuncionarios = new Scene(telaGerenciarFuncionarios);
        
        primaryStage.setScene(cenaCadastroGerente);
        primaryStage.show();
    }
    
    public static void TrocaTela(String nomeCena) {
        switch (nomeCena) {
            case "login":
                stage.setScene(cenaPrincipal);
                stage.centerOnScreen();
                break;
            case "cadastroGerente":
                stage.setScene(cenaCadastroGerente);
                stage.centerOnScreen();
                break;
            case "inicialGerente":
                stage.setScene(cenaInicialGerente);
                stage.centerOnScreen();
                break;
            case "gerenciarFuncionarios":
                stage.setScene(cenaGerenciarFuncionarios);
                stage.centerOnScreen();
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
