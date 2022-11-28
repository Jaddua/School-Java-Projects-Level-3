package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * class that implements "model" for an MVC application that calculates Shannon's Theorem
 * @author kriger
 */
public class ShannonsTheorem {
        
        private final StringProperty bandWidth =
			 new SimpleStringProperty(this, "bandWidth", null);
	private final StringProperty signalToNoiseRatio =
			 new SimpleStringProperty(this, "signalToNoiseRatio", null);
        
	/**
         * multi-argument constructor
	 * @param bandWidth the bandwidth in Hertz
	 * @param signalToNoiseRatio SNR in dB
	 */
	public ShannonsTheorem(double bandWidth, double signalToNoiseRatio) {
		this.bandWidth.set(String.valueOf(bandWidth));
		this.signalToNoiseRatio.set(String.valueOf(signalToNoiseRatio));
	}
	/**
	 * no-arg constructor sets fields to zero
	 */
	public ShannonsTheorem() {
		this.bandWidth.set("0");
		this.signalToNoiseRatio.set("0");
               
	}
	
        
        public final StringProperty bandWidthProperty() {
		return bandWidth;
	}
	
        public final StringProperty signalToNoiseRatioProperty() {
		return signalToNoiseRatio;
	}
        
        /* firstName Property */
	public final String getBandWidth() {
		return bandWidth.get();
	}

	public final void setBandWidth(String bandWidth) {
		bandWidthProperty().set(bandWidth);
	}

	public final String getSignalToNoiseRatio() {
		return signalToNoiseRatio.get();
	}

	public final void setSignalToNoiseRatio(String signalToNoiseRatio) {
		signalToNoiseRatioProperty().set(signalToNoiseRatio);
	}

	        
	private double log2(double x) {
		return Math.log(x)/Math.log(2);
	}
	
    /**
     *
     * @param BW the bandwidth
     * @param SNR the signal-to-noise-ratio
     * @return maximum data ratio
     */
    public double maxDataRate(double BW, double SNR) {
		double SN = Math.pow(10, SNR/10);
		return BW*log2(1+SN);
	}
	
    /**
     *
     * @return maximum data Rate
     */
    public double maxDataRate() {
		return maxDataRate(Double.valueOf(bandWidth.toString()), Double.valueOf(signalToNoiseRatio.toString()));
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    /**
     *
     * @return string for output
     */

	@Override
	public String toString() {
		return "ShannonsTheory [bandWidth=" + bandWidth.toString() + ", signalToNoiseRatio=" + signalToNoiseRatio.toString() + "]";
	}
	
	
	
}
