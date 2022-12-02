/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;


/**
 *
 * @author DeS
 */
 
import java.util.ArrayList;

public abstract class Admin implements Subject {
  private float SpecialOffers;
  private ArrayList observers;

  public Admin(){
    observers = new ArrayList();
  }
  public void addObserver(Observer observer){
    observers.add(observer);
  }
  public void deleteObserver(Observer observer){
    int i = observers.indexOf(observer);
    if(i>=0){
      observers.remove(i);
    }
  }
  public void notifyObservers(){
    for (int i=0;i<observers.size();i++){
      Observer o = (Observer)observers.get(i);
      o.update(SpecialOffers);
    }
  }
  public void SpecialOffers(float s){
    this.SpecialOffers = s;
    update();
  }
  public void update(){
    notifyObservers();
  }
    Admin instance;
    public Admin getInstance(){return null;}
    public void generatereport(){}
    public void sendcopun(){}
    public void displayreportedbooking(){}

    public void generateSalesReport(){}
}



