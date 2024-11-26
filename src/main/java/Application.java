import javafx.stage.Stage;
import org.wetalk.wetalk.view.Login;

public class Application extends javafx.application.Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Login login = new Login();
        login.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
