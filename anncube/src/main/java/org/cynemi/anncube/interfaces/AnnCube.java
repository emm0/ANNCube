package org.cynemi.anncube.interfaces;

/**
 * An AnnCube must implement the behavior of a cube of Artificial Neural Network
 * 
 * 3D shape, pleasure and pain, growing connections
 * @author em_m0
 *
 */
public interface AnnCube {
	
	/**
	 * every cycle is a tick, in a tick we process everything
	 */
	void tick();
	
	/**
	 * Stimulate the neuron(x,y,z) with stimulus
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param z z coordinate
	 * @param stimulus value of the stimulus
	 */
	void stimulate(int x, int y, int z, int stimulus);
	
	/**
	 * Retrieve the stimulus in neuron(x,y,z)
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	int getOutputStimulus(int x, int y, int z);
	
	/**
	 * Gives to the system pleasureAmount of pleasure
	 * @param pleasureAmount
	 */
	void givesPleasure(int pleasureAmount);
	
	/**
	 * Gives to the system painAmount of pain
	 * @param painAmount
	 */
	void givesPain(int painAmount);

}
