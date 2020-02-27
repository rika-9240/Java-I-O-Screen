import javafx.application.Application;
import javafx.stage.Stage;

public class Screen_main{

    public class ScreenApplication extends Application{
        public void start(Stage stage){
            stage.setTitle("Java I/O Screen");
            stage.setWidth(400);
            stage.setHeight(500);
            stage.show();
        }
    }
    public static void main(String[] args) {
            ScreenApplication.launch(args);
    }
}
