package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Neuron {
	private List<Double> dendrites= new ArrayList<Double>(); 
	private List<Double> synapses= new ArrayList<Double>(); 
	private Random generator = new Random();
	public void createNeuron() {
		// TODO Auto-generated method stub
		dendrites.add(generator.nextDouble()%180);
		synapses.add(generator.nextDouble());
		dendrites.add(generator.nextDouble()%180);
		synapses.add(generator.nextDouble());
	}
	public double checkPotential() {
		// TODO Auto-generated method stub
		double potential=0;
		for(int i=0;i<dendrites.size();i++){
			potential=potential+(dendrites.get(i)*synapses.get(i));
		}
		//return potential;
		if(potential>0.7){
			return 1;
		}else{
			return -1;
		}
	}
	public double getX(){
		return dendrites.get(0)*synapses.get(0);
	}
	public double getY(){
		return dendrites.get(1)*synapses.get(1);
	}
}
