/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

import java.util.ArrayList;
import java.util.Observer;

/**
 *
 * @author DeS
 */
public class Admin implements Subject {
    Admin instance;
    ArrayList<Observer> observers = new ArrayList<Observer>();
    public Admin getInstance(){return null;}
    public void generatereport(){}
    public void sendcopun(){}
    public void displayreportedbooking(){}
    public void addobserver(){}
    public void removeobserver(){}
    public void SpecialOffers(){}
    public void NotifyObservers(){}
    public void generateSalesReport(){}
   
    
}
