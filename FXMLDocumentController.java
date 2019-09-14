/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package take.jo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author MARSEC DEVELOPER
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private ImageView one;
    @FXML
    private ImageView two;
    @FXML
    private ImageView four;
    @FXML
    private ImageView five;
    @FXML
    private ImageView three;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void One(MouseEvent event) {
   Image cd = one.getImage();
    one.setImage(two.getImage());
    two.setImage(three.getImage());
    }

    @FXML
    private void Two(MouseEvent event) {
      Image ct = two.getImage();
    one.setImage(three.getImage());
    three.setImage(four.getImage());}

    @FXML
    private void Four(MouseEvent event) {
         Image ct = three.getImage();
    one.setImage(two.getImage());
    four.setImage(two.getImage()); }

    @FXML
    private void Five(MouseEvent event) {
          Image ct = two.getImage();
    one.setImage(three.getImage());
    five.setImage(two.getImage());}

    @FXML
    private void Three(MouseEvent event) {
   Image ct = five.getImage();
    one.setImage(three.getImage());
    two.setImage(four.getImage()); }
    
}
