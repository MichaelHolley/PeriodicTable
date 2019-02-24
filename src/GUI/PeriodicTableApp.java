package GUI;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class PeriodicTableApp extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	private Stage window;
	private BorderPane layout;
	private GridPane elementsPane;
	private Scene scene;
	public static InformationWindow infoWindow;
	
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
		
		infoWindow = InformationWindow.instance();
		
		scene = new Scene(layout, 1318, 750);
		scene.getStylesheets().add("GUI/PeriodicTable.css");
		window.setScene(scene);
		window.show();
	}
}
