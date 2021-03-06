package org.openjfx.farmacia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.openjfx.farmacia.controller.MainController;

import java.io.IOException;

public class App extends Application {
    @SuppressWarnings("exports")
	@Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("main" + ".fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);
        stage.setTitle("Gerenciador de vendas");
        stage.setResizable(false);
        stage.setOnCloseRequest(e -> ((MainController)fxmlLoader.getController()).fecharModels());
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }   
}