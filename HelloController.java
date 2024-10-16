package org.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
   private Label  myLabel1;
    @FXML
    private Label myLabel2;
    @FXML
   private TextField myText1;
    @FXML
    private TextField myText2;


@FXML
    private void calculate_BMI (){
    // Check  input field is empty
        if(myText2.getText().trim().isEmpty() ||myText1.getText().trim().isEmpty()){
            // Show an error alert if input is missing
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setContentText("enter your height and weight correctly!");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }else {
            // Parse height and weight from input fields
            float a = Float.parseFloat(myText1.getText());// Height in meters
            float b = Float.parseFloat(myText2.getText());// Weight in kilograms

           // Parse height and weight from input fields
            float bmi = b/(a*a);
            myLabel1.setText(""+bmi);

            // Determine BMI category and update label
            if(bmi<18.5){
                myLabel2.setText("underweight");// BMI less than 18.5
            } else if (bmi>=18.5 && bmi<=24.9) {
                myLabel2.setText("normal");// BMI between 18.5 and 24.9
            }else if (bmi>=25 && bmi<=29.9){
                myLabel2.setText("overweight");// BMI between 25 and 29.9
            }else{
                myLabel2.setText("obese");// BMI greater than 29.9
            }
        }
    }


    }


