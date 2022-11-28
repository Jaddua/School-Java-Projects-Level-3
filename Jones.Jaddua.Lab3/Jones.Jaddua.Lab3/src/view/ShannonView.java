package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 * Class for the View part of the MVP pattern
 * @author Jaddua Jones 040898457
 */
public class ShannonView extends GridPane {

	// Labels
	Label bandWidthLbl = new Label("Bandwidth:");
	Label signalToNoiseRatioLbl = new Label("Signal to Noise Ratio:");
        Label maxDataRateLbl = new Label("Max Data Rate:");

	// Fields
	TextField bandWidthFld = new TextField();
	TextField signalToNoiseRatioFld = new TextField();
        public TextField maxDataRateFld = new TextField();
        
	
	// Buttons
	Button calculateBtn = new Button("Calculate");

        /**
         * no-arg constructor for the ShannonView class
         */
	public ShannonView() {
		layoutForm();
	}

        /**
         * Method to set the layout form.
         */
	private void layoutForm() {
		this.setHgap(5);
		this.setVgap(5);

		this.add(bandWidthLbl, 1, 2);
		this.add(signalToNoiseRatioLbl, 1, 3);
                this.add(maxDataRateLbl, 1, 4);
                
		this.add(bandWidthFld, 2, 2);
		this.add(signalToNoiseRatioFld, 2, 3);
                this.add(maxDataRateFld, 2, 4);
                
               

		// Add buttons and make them the same width
		VBox buttonBox = new VBox(calculateBtn);
		calculateBtn.setMaxWidth(Double.MAX_VALUE);

		this.add(buttonBox, 3, 1, 1, 5);
	}

}
