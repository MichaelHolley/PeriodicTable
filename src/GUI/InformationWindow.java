package GUI;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class InformationWindow {

	private static InformationWindow unique = null;
	private String elementLinkBase = "https://en.wikipedia.org/wiki/";
	private String elementLink;
	private Label longNameLabel;
	private Hyperlink wikiLink;
	
	private InformationWindow() {
		Stage window = new Stage();
		
		window.setTitle("Element-Information");
		window.setMinWidth(300);
		window.initStyle(StageStyle.UNDECORATED);
		window.setX(1435);
		window.setY(110);
		
		VBox root = new VBox();
		root.setSpacing(15);
		root.setAlignment(Pos. TOP_CENTER);
		longNameLabel = new Label("Select a Element");
		longNameLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		root.getChildren().add(longNameLabel);
		root.getChildren().add(new Separator());
		
		wikiLink = new Hyperlink();
		wikiLink.setText("WikipediaPage");
		setElementLink("List_of_chemical_elements");
		wikiLink.setOnAction(e -> {
			try {
				Desktop.getDesktop().browse(new URI((elementLink)));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				
			}
		});
		root.getChildren().add(wikiLink);
		root.getChildren().add(new Separator());
		
		Scene scene = new Scene(root, 300, 750);
		window.setScene(scene);
		window.show();
	}

	public  void setElementLink(String s) {
			elementLink = elementLinkBase + s;
			wikiLink.setVisited(false);
	}
	
	public void setLongNameLabel(String s) {
		longNameLabel.setText(s);
	}
	
	public static InformationWindow instance() {
		if(unique == null)
			unique = new InformationWindow();
		return unique;
	}
}
