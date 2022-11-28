package launch;

/**
 * Class to launch the application of Shannon's Theorem.
 * 
 * @author Jaddua Jones 040898457
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ShannonsTheorem;
import view.ShannonPresenter;
import view.ShannonView;

public class ShannonLaunch extends Application {
    
        /**
         * The main method to drive the launcher program.
         * 
         * @param args There are no command line arguments here.
         */
	public static void main(String[] args) {
		Application.launch(args);
	}

        /**
         * An overidden method from the Application class that will set the stage and launch the application with all the necessary GUI.
         * @param stage The instance of stage for launching the application
         */
	@Override
	public void start(Stage stage) {
		ShannonsTheorem model = new ShannonsTheorem();		
		ShannonView view = new ShannonView();
                view.maxDataRateFld.setEditable(false);

		Scene scene = new Scene(view);

		ShannonPresenter presenter = new ShannonPresenter(model, view);
		
		stage.setScene(scene);
		stage.setTitle("Shannon's Theorem");
		stage.show();
	}
}
