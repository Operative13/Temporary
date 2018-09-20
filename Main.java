import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
	public static void main(String[] args)
	{
		// Launch the application
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)
	{
		// Set the stage title
		primaryStage.setTitle( "Travel Expense Calculator");
		Label instructionLabel = new Label ("Enter the Information Requested Below");
		Label daysLabel = new Label("Number of Days on Trip");
		Label airfareLabel = new Label("Amount of Airfare, if Any");
		Label carRentalLabel = new Label("Amount of Car Rental Fees, if Any");
		Label milesDrivenLabel = new Label("Miles driven, if a Private Vehicle was Used");
		Label parkingFeesLabel = new Label ("Amount of parking fees, if Any");
		Label meetingFeesLabel = new Label("Conference or Seminar Registration Fees, if Any");
		Label lodgingChargesLabel = new Label("Lodging Charges, per Night");
		Label output = new Label("");
		
		TextField daysTextField = new TextField();
		TextField airfareTextField = new TextField();
		TextField carRentalTextField = new TextField();
		TextField milesDrivenTextField = new TextField();
		TextField parkingFeesTextField = new TextField();
		TextField meetingFeesTextField = new TextField();
		TextField lodgingChargesTextField = new TextField();
		
		HBox daysHBox = new HBox(10, daysLabel, daysTextField);
		HBox airfareHBox = new HBox(10, airfareLabel, airfareTextField);
		HBox carRentalHBox = new HBox(10, carRentalLabel, carRentalTextField);
		HBox milesDrivenHBox = new HBox(10, milesDrivenLabel, milesDrivenTextField);
		HBox parkingFeesHBox = new HBox(10, parkingFeesLabel, parkingFeesTextField);
		HBox meetingFeesHBox = new HBox(10, meetingFeesLabel, meetingFeesTextField);
		HBox lodgingChargesHBox = new HBox(10, lodgingChargesLabel, lodgingChargesTextField);
		
		daysHBox.setAlignment(Pos.CENTER);
		airfareHBox.setAlignment(Pos.CENTER);
		carRentalHBox.setAlignment(Pos.CENTER);
		milesDrivenHBox.setAlignment(Pos.CENTER);
		parkingFeesHBox.setAlignment(Pos.CENTER);
		meetingFeesHBox.setAlignment(Pos.CENTER);
		lodgingChargesHBox.setAlignment(Pos.CENTER);
		
		Button submitButton = new Button("Submit");
		
		VBox vBox = new VBox(instructionLabel, daysHBox, airfareHBox, carRentalHBox, milesDrivenHBox, 
				parkingFeesHBox, meetingFeesHBox, lodgingChargesHBox, submitButton);
		vBox.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(vBox, 500, 500);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}
}