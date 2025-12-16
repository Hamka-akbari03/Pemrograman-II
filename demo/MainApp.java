package demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/demo/view/order_view.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setTitle("Aplikasi Manajemen Pesanan Katering");
        stage.setScene(scene);
        stage.show();
    }
}
