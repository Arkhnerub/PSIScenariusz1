package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Controller {
	private Main mainApp;
	private List<Neuron> Neurons = new ArrayList<Neuron>();
	Random rand = new Random();

	@FXML
	private AnchorPane myAnchorPane;
	@FXML
	private Button button;
	@FXML
	private Text WX;
	@FXML
	private Text WY;
	@FXML
	private Text WXnumber;
	@FXML
	private Text WYnumber;
	@FXML
	private Canvas canvas;
	@FXML
	private void initialize(){
	}
	
	
	public void setMainApp(Main main) {
		// TODO Auto-generated method stub
		this.mainApp=main;
	}
	
	@FXML
	public void onButtonClick(){
		GraphicsContext gc = canvas.getGraphicsContext2D();
		for(int i=0;i<10000;i++){
			Neuron neuron = new Neuron();
			neuron.createNeuron();
			Neurons.add(neuron);
			if(neuron.checkPotential() == 1){
				gc.setFill(Color.BLUE);
			}else{
				gc.setFill(Color.RED);
			}
			gc.fillRect(150-neuron.getX()*300,150-neuron.getY()*300,4,4);
			System.out.println("Added a neuron with potential of: "+neuron.checkPotential()+" and X of: "+neuron.getX()+" and Y of: "+neuron.getY());
		}
		System.out.println("Added 10000 neurons to the brain");
	}
}
