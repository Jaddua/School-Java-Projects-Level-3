package view;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.ShannonsTheorem;

/**
 *Class for the Presenter part of the MVP pattern.
 * 
 * @author Jaddua Jones 040898457
 */


public class ShannonPresenter {
	private final ShannonsTheorem model;
	private final ShannonView view;
        
	private final SimpleStringProperty bandWidth = new SimpleStringProperty();
	private final SimpleStringProperty signalToNoiseRatio = new SimpleStringProperty();

        /**
         * Constructor for the ShannonPresenter class.
         * @param model The ShannonTheorem instance
         * @param view The SHannonView instance
         */
	public ShannonPresenter(ShannonsTheorem model, ShannonView view) {
		this.model = model;
		this.view = view;
		bindToModel(); 
		attachViewEvents();
	}

        /**
         * A method to bind the properties to the model.
         */
	private void bindToModel() {
		bandWidth.bindBidirectional(model.bandWidthProperty());
		signalToNoiseRatio.bindBidirectional(model.signalToNoiseRatioProperty());
               
                
	}
      
        /**
         * A method to attach the binded properties to the view and also handle input and perform calculations.
         */
	private void attachViewEvents() {
		
		view.bandWidthFld.textProperty().bindBidirectional(bandWidth);
		view.signalToNoiseRatioFld.textProperty().bindBidirectional(signalToNoiseRatio);
                
                view.calculateBtn.setOnMouseClicked((MouseEvent event) -> {
                    try{
                        view.maxDataRateFld.setText(String.valueOf(model.maxDataRate(Double.valueOf(bandWidth.get()), Double.valueOf(signalToNoiseRatio.get()))));
                    }
                    catch(Exception e) {
                        Alert alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Input Error");
                        alert.setHeaderText("Please enter valid numbers and not:");
                        alert.setContentText(String.format("Bandwidth: %s%n%nSignal to Noise Ratio: %s", bandWidth.get(), signalToNoiseRatio.get()));
                        alert.showAndWait();
                    }
        });
		
                        
	}

}
