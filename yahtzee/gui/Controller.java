package com.yahtzee.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.yahtzee.classes.*;
public class Controller {
	Player player1=new Player("you");
	Player player2=new Player("com");
	int counter=0;
	@FXML
	private ImageView imgDie1=new ImageView();
	@FXML
	private ImageView imgDie2=new ImageView();
	@FXML
	private ImageView imgDie3=new ImageView();
	@FXML
	private ImageView imgDie4=new ImageView();
	@FXML
	private ImageView imgDie5=new ImageView();
	@FXML
	private ImageView imgDie6=new ImageView();
	@FXML
	private ImageView imgDie7=new ImageView();
	@FXML
	private ImageView imgDie8=new ImageView();
	@FXML
	private ImageView imgDie9=new ImageView();
	@FXML
	private ImageView imgDie10=new ImageView();
	@FXML
	private ImageView imgDie11=new ImageView();
	@FXML
	private ImageView imgDie22=new ImageView();
	@FXML
	private ImageView imgDie33=new ImageView();
	@FXML
	private ImageView imgDie44=new ImageView();
	@FXML
	private ImageView imgDie55=new ImageView();
	@FXML
	private Image img2=new Image("com/images/Die"+player1.getCup().getDiceArray()[1].getValue()+".png");
	@FXML
	private Image img1=new Image("com/images/Die"+player1.getCup().roll()[0].getValue()+".png");
	@FXML
	private Image img3=new Image("com/images/Die"+player1.getCup().getDiceArray()[2].getValue()+".png");
	@FXML
	private Image img4=new Image("com/images/Die"+player1.getCup().getDiceArray()[3].getValue()+".png");
	@FXML
	private Image img5=new Image("com/images/Die"+player1.getCup().getDiceArray()[4].getValue()+".png");
	@FXML
	private Image img6=new Image("com/images/Die"+player2.getCup().getDiceArray()[0].getValue()+".png");
	@FXML
	private Image img7=new Image("com/images/Die"+player2.getCup().getDiceArray()[1].getValue()+".png");
	@FXML
	private Image img8=new Image("com/images/Die"+player2.getCup().getDiceArray()[2].getValue()+".png");
	@FXML
	private Image img9=new Image("com/images/Die"+player2.getCup().getDiceArray()[3].getValue()+".png");
	@FXML
	private Image img10=new Image("com/images/Die"+player2.getCup().getDiceArray()[4].getValue()+".png");
	@FXML
	private Label infoLbl=new Label();
	@FXML
	private Button rollBtn=new Button();
	
	@FXML
	public void initialize() {
		player1.getCup().roll();
		imgDie1.setImage(img1);
		imgDie2.setImage(img2);
		imgDie3.setImage(img3);
		imgDie4.setImage(img4);
		imgDie5.setImage(img5);
		infoLbl.setText("Please press Roll Dice Button");
		infoLbl.setStyle("-fx-background-color:lightgray");
		imgDie6.setImage(img6);
		imgDie7.setImage(img7);
		imgDie8.setImage(img8);
		imgDie9.setImage(img9);
		imgDie10.setImage(img10);
	}
	
	@FXML
	Image img11=new Image("com/images/Die"+player1.getCup().roll()[0].getValue()+".png");
	@FXML
	Image img22=new Image("com/images/Die"+player1.getCup().getDiceArray()[1].getValue()+".png");
	@FXML
	Image img33=new Image("com/images/Die"+player1.getCup().getDiceArray()[2].getValue()+".png");
	@FXML
	Image img44=new Image("com/images/Die"+player1.getCup().getDiceArray()[3].getValue()+".png");
	@FXML
	Image img55=new Image("com/images/Die"+player1.getCup().getDiceArray()[4].getValue()+".png");
	
	public void clicked(ActionEvent event){
		if(counter<3) {
		infoLbl.setVisible(false);
		player1.getCup().roll();
		imgDie11.setImage(img11);
		imgDie22.setImage(img22);
		imgDie33.setImage(img33);
		imgDie44.setImage(img44);
		imgDie55.setImage(img55);
		
		}
	}
	

}
