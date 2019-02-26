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
		PeriodicTableApp.setLongNameLabel(nameLong + " | (" + shortend + ")");
		PeriodicTableApp.setElementLink(nameLong);
		PeriodicTableApp.setAtomicNumLabel(atomicNum);
		PeriodicTableApp.setAtomicMassLabel(atomicNum);
		PeriodicTableApp.setAtomicRadiusLabel(atomicNum);
		PeriodicTableApp.setStandardStateLabel(atomicNum);
		PeriodicTableApp.setBondingTypeLabel(atomicNum);
		PeriodicTableApp.setMeltingPointLabel(atomicNum);
		PeriodicTableApp.setBoilingPointLabel(atomicNum);
		PeriodicTableApp.setYearDiscoveredLabel(atomicNum);
	}
}
