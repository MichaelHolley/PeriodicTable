package GUI;

import javafx.scene.control.Button;

public class ElementButton extends Button {

	private int dimensions = 70;
	private int atomicNum;
	private String shortend;
	private String nameLong;
	
	public ElementButton(int atomicNum, String shortend, String nameLong) {
		super(atomicNum + "\n" + shortend + "\n" + nameLong);
		this.setOnAction(e -> {
			setInformationWindow();
		});
		this.setId("element-button");
		this.setPrefWidth(dimensions);
		this.setPrefHeight(dimensions);
		this.atomicNum = atomicNum;
		this.shortend = shortend;
		this.nameLong = nameLong;
	}
	
	private void setInformationWindow() {
		PeriodicTableApp.infoWindow.setLongNameLabel(nameLong);
		PeriodicTableApp.infoWindow.setElementLink(nameLong);
	}
}
