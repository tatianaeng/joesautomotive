/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joe.sautomotive;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

/**
 *
 * @author tatianaeng
 */

/*
Joe's Automotive performs the following routine maintenance services:

Oil change: $35.00
Lube job: $25.00
Radiator flush: $50.00
Transmission flush: $120.00
Inspection: $35.00
Muffler replacement: $200.00
Tire rotation: $20.00

Create a GUI application that displays the total for a customer's visit to Joe's.
*/

public class JoeSAutomotive extends Application
{
    
    // variables
    double customerTotal = 0.00;
    final double oilChangePrice = 35.00;
    final double lubeJobPrice = 25.00;
    final double radiatorFlushPrice = 50.00;
    final double transmissionFlushPrice = 120.00;
    final double inspectionPrice = 35.00;
    final double mufflerReplacementPrice = 200.00;
    final double tireRotationPrice = 20.00;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // launch the application
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage)
    {
        // set the stage title
        primaryStage.setTitle("Joe's Automotive Check-in");
        
        // create a Label control
        Label welcomeLabel = new Label("Welcome to Joe's Automotive! Please select the maintenance services you'd like to get today.");
        
        // create the buttons
        Button oilChangeButton = new Button(String.format("Oil change: $%,.2f", oilChangePrice));
        Button lubeJobButton = new Button(String.format("Lube job: $%,.2f", lubeJobPrice));
        Button radiatorFlushButton = new Button(String.format("Radiator flush: $%,.2f", radiatorFlushPrice));
        Button transmissionFlushButton = new Button(String.format("Transmission flush: $%,.2f", transmissionFlushPrice));
        Button inspectionButton = new Button(String.format("Inspection: $%,.2f", inspectionPrice));
        Button mufflerReplacementButton = new Button(String.format("Muffler replacement: $%,.2f", mufflerReplacementPrice));
        Button tireRotationButton = new Button(String.format("Tire rotation: $%,.2f", tireRotationPrice));
        
        // create a layout container for the buttons representing maintenance services
        GridPane gridpane = new GridPane();
        
        // add the controls to the layout container
        gridpane.add(oilChangeButton, 1, 0); // column, row
        gridpane.add(lubeJobButton, 0, 1);
        gridpane.add(radiatorFlushButton, 1, 1);
        gridpane.add(transmissionFlushButton, 2, 1);
        gridpane.add(inspectionButton, 0, 2);
        gridpane.add(mufflerReplacementButton, 1, 2);
        gridpane.add(tireRotationButton, 2, 2);
        
        // set gap sizes
        gridpane.setVgap(20);
        gridpane.setHgap(40);
        
        // create "calculate" and "clear all" buttons
        Button calculateButton = new Button("Calculate total");
        Button clearAllButton = new Button("Clear all");
        
        // put the "calculate" and "clear all" buttons in an hbox
        HBox hbox = new HBox(30, calculateButton, clearAllButton);
        
        // create a label that will provide the total
        Label totalLabel = new Label("Your total will be displayed here.");
        
        // create an event handler for when the oilChangeButton is clicked
        oilChangeButton.setOnAction(event ->
        {
            // get the total
            customerTotal += oilChangePrice;
        }
        );
        
        // create an event handler for when the lubeJobButton is clicked
        lubeJobButton.setOnAction(event ->
        {
            // get the total
            customerTotal += lubeJobPrice;
        }
        );
        
        // create an event handler for when the radiatorFlushButton is clicked
        radiatorFlushButton.setOnAction(event ->
        {
            // get the total
            customerTotal += radiatorFlushPrice;
        }
        );
        
        // create an event handler for when the transmissionFlushButton is clicked
        transmissionFlushButton.setOnAction(event ->
        {
            // get the total
            customerTotal += transmissionFlushPrice;
        }
        );
        
        // create an event handler for when the inspectionButton is clicked
        inspectionButton.setOnAction(event ->
        {
            // get the total
            customerTotal += inspectionPrice;
        }
        );
        
        // create an event handler for when the mufflerReplacementButton is clicked
        mufflerReplacementButton.setOnAction(event ->
        {
            // get the total
            customerTotal += mufflerReplacementPrice;
        }
        );
        
        // create an event handler for when the tireRotationButton is clicked
        tireRotationButton.setOnAction(event ->
        {
            // get the total
            customerTotal += tireRotationPrice;
        }
        );
        
        // create an event handler for when the calculate total button is clicked
        calculateButton.setOnAction(event ->
        {
            // display the total
            totalLabel.setText(String.format("Thanks, Tatiana Eng! Your estimated total for today is $%,.2f", customerTotal));
        }
        );
        
        // create an event handler for when the clear all button is clicked
        clearAllButton.setOnAction(event ->
        {
            
            // reset customerTotal
            customerTotal = 0;
            
            // reset the totalLabel to its original message
            totalLabel.setText(String.format("Your total will be displayed here."));
        }
        );
        
        //create a layout container, which will be the broader format of the scene
        VBox vbox = new VBox(60, welcomeLabel, gridpane, hbox, totalLabel);
        
        // create a Scene object and add the layout container to the Scene object
        Scene scene = new Scene(vbox, 1000, 500);
        
        // put padding around the vbox
        vbox.setPadding(new Insets(50));
        
        // set alignments
        vbox.setAlignment(Pos.TOP_CENTER);
        gridpane.setAlignment(Pos.CENTER);
        hbox.setAlignment(Pos.CENTER);
        
        // add the Scene object to the stage
        primaryStage.setScene(scene);
        
        // show the window
        primaryStage.show();
    }
    
}
