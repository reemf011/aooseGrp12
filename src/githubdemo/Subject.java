/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package githubdemo;

/**
 *
 * @author reemf011
 */
public interface Subject {
    //methods to register and unregister observers
	public void addObserver(Observer observer);
	public void RemoveObserver(Observer observer);
	
	//method to notify observers of change
	public void notifyObservers(Message M);
	/*
	//method to get updates from subject
	public Object getUpdate(Observer obj);
*/

}



	
}