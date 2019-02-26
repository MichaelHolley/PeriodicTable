package GUI;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import Data.InfoRetreiver;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class PeriodicTableApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private int w, h;
	private Stage window;
	private BorderPane layout;
	private GridPane elementsPane;
	private Scene scene;
	private VBox infoWindow;

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("PeriodicTable");
		window.setX(100);
		window.setY(100);
		window.setOnCloseRequest(e -> {
			Platform.exit();
			System.exit(0);
		});

		Screen screen = Screen.getPrimary();
		Rectangle2D screenBounds = screen.getVisualBounds();
		w = (int) (screenBounds.getHeight() * 1.76);
		h = (int) screenBounds.getHeight();
		layout = new BorderPane();

		VBox headerBox = new VBox();
		headerBox.setSpacing(5);
		headerBox.setAlignment(Pos.CENTER);
		Label headerLbl = new Label("PERIODIC TABLE");
		headerLbl.setFont(Font.font("Overpass Mono", FontWeight.NORMAL, 30));
		Label subHeaderLbl = new Label("Click on an Element");
		subHeaderLbl.setFont(Font.font("Overpass Mono", FontWeight.NORMAL, 10));
		headerBox.getChildren().addAll(headerLbl, subHeaderLbl);
		layout.setTop(headerBox);
		
		elementsPane = new ElementsGridPane();
		layout.setCenter(elementsPane);
		
		setupInfoBox();
		layout.setRight(infoWindow);
		scene = new Scene(layout, 1600, 750);
		scene.getStylesheets().add("GUI/PeriodicTable.css");
		window.setScene(scene);
		window.show();
	}

	
	private static String elementLinkBase = "https://en.wikipedia.org/wiki/";
	private static String elementLink;
	private static Hyperlink wikiLink;
	
	private static Label longNameLabel;
	private static Label atomicNumLabel;
	private static Label atomicMassLabel;
	private static Label atomicRadiusLabel;
	private static Label standardStateLabel;
	private static Label bondingTypeLabel;
	private static Label meltingPointLabel;
	private static Label boilingPointLabel;
	private static Label yearDiscoveredLabel;
	
	private void setupInfoBox() {
		infoWindow = new VBox();
		infoWindow.setSpacing(15);
		infoWindow.setMinWidth(280);
		infoWindow.setMaxWidth(800);
		infoWindow.setAlignment(Pos.TOP_CENTER);
		longNameLabel = new Label("Select a Element");
		longNameLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		infoWindow.getChildren().add(longNameLabel);
		infoWindow.getChildren().add(new Separator());

		wikiLink = new Hyperlink();
		wikiLink.setText("WikipediaPage");
		setElementLink("List_of_chemical_elements");
		wikiLink.setOnAction(e -> {
			try {
				Desktop.getDesktop().browse(new URI((elementLink)));
			} catch (IOException ioe) {
			} catch (URISyntaxException urise) {
			}
		});
		infoWindow.getChildren().add(wikiLink);
		infoWindow.getChildren().add(new Separator());
		
		GridPane basicInfo = new GridPane();
		basicInfo.setAlignment(Pos.TOP_LEFT);
		basicInfo.setHgap(50);
		basicInfo.setVgap(15);
		
		Label atomicNumHeader = new Label("Atomic Number:");
		atomicNumHeader.setId("info-label-header");
		atomicNumLabel = new Label();
		atomicNumLabel.setId("info-label-text");
		basicInfo.add(atomicNumHeader, 0, 0);
		basicInfo.add(atomicNumLabel, 1, 0);
		
		Label atomicMassHeader = new Label("Atomic-Mass:");
		atomicMassHeader.setId("info-label-header");
		atomicMassLabel = new Label();
		atomicMassLabel.setId("info-label-text");
		basicInfo.add(atomicMassHeader, 0, 1);
		basicInfo.add(atomicMassLabel, 1, 1);
		
		Label atomicRadiusHeader = new Label("Atomic-Radius:");
		atomicRadiusHeader.setId("info-label-header");
		atomicRadiusLabel = new Label();
		atomicRadiusLabel.setId("info-label-text");
		basicInfo.add(atomicRadiusHeader, 0, 2);
		basicInfo.add(atomicRadiusLabel, 1, 2);
		
		Label standardStateHeader = new Label("Standard-State:");
		standardStateHeader.setId("info-label-header");
		standardStateLabel = new Label();
		standardStateLabel.setId("info-label-text");
		basicInfo.add(standardStateHeader, 0, 3);
		basicInfo.add(standardStateLabel, 1, 3);
		
		Label yearDiscoveredHeader = new Label("Year discovered:");
		yearDiscoveredHeader.setId("info-label-header");
		yearDiscoveredLabel = new Label();
		yearDiscoveredLabel.setId("info-label-text");
		basicInfo.add(yearDiscoveredHeader, 0, 4);
		basicInfo.add(yearDiscoveredLabel, 1, 4);
		
		infoWindow.getChildren().add(basicInfo);
		infoWindow.getChildren().add(new Separator());
		
		GridPane materialPane = new GridPane();
		materialPane.setAlignment(Pos.TOP_LEFT);
		materialPane.setHgap(50);
		materialPane.setVgap(15);
		
		Label bondingTypeHeader = new Label("Bonding-Type:");
		bondingTypeHeader.setId("info-label-header");
		bondingTypeLabel = new Label();
		bondingTypeLabel.setId("info-label-text");
		materialPane.add(bondingTypeHeader, 0, 0);
		materialPane.add(bondingTypeLabel, 1, 0);
		
		Label meltingPointHeader = new Label("Melting-Point:");
		meltingPointHeader.setId("info-label-header");
		meltingPointLabel = new Label();
		meltingPointLabel.setId("info-label-text");
		materialPane.add(meltingPointHeader, 0, 1);
		materialPane.add(meltingPointLabel, 1, 1);
		
		Label boilingPointHeader = new Label("Boiling-Point:");
		boilingPointHeader.setId("info-label-header");
		boilingPointLabel = new Label();
		boilingPointLabel.setId("info-label-text");
		materialPane.add(boilingPointHeader, 0, 2);
		materialPane.add(boilingPointLabel, 1, 2);
		
		infoWindow.getChildren().add(materialPane);
		infoWindow.getChildren().add(new Separator());
		
	}

	public static void setElementLink(String s) {
		elementLink = elementLinkBase + s;
		wikiLink.setVisited(false);
	}

	public static void setLongNameLabel(String s) {
		longNameLabel.setText(s);
	}
	
	public static void setAtomicNumLabel(int x) {
		atomicNumLabel.setText(String.valueOf(x));
	}
	
	public static void setAtomicMassLabel(int x) {
		atomicMassLabel.setText(InfoRetreiver.instance().getAtomicMass(x));
	}
	
	public static void setAtomicRadiusLabel(int x) {
		String radius = InfoRetreiver.instance().getAtomicRadius(x);
		if(radius.equals(""))
			atomicRadiusLabel.setText("[unknown]");
		else
			atomicRadiusLabel.setText(radius);
	}
	
	public static void setStandardStateLabel(int x) {
		String state = InfoRetreiver.instance().getStandardState(x);
		if(state.equals(""))
			standardStateLabel.setText("[unknown]");
		else
			standardStateLabel.setText(state);
	}
	
	public static void setBondingTypeLabel(int x) {
		String bond = InfoRetreiver.instance().getBondingType(x);
		if(bond.equals(""))
			bondingTypeLabel.setText("[unknown]");
		else
			bondingTypeLabel.setText(bond);
	}
	
	public static void setMeltingPointLabel(int x) {
		String melt = InfoRetreiver.instance().getMeltingPoint(x);
		if(melt.equals(""))
			meltingPointLabel.setText("[unknown]");
		else
			meltingPointLabel.setText(melt);
	}
	
	public static void setBoilingPointLabel(int x) {
		String boil = InfoRetreiver.instance().getBoilingPoint(x);
		if(boil.equals(""))
			boilingPointLabel.setText("[unknown]");
		else
			boilingPointLabel.setText(boil);
	}
	
	public static void setYearDiscoveredLabel(int x) {
		yearDiscoveredLabel.setText(InfoRetreiver.instance().getYearDiscovered(x));
	}
}
