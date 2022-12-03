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
public class Customer implements  Observer  {
    String creditCardinfo;

  
       @Override
       public void update(float SpecialOffers) {
              System.out.println("ALERT!!: EXCLUSIVE DISCOUNT"+ SpecialOffers+ "%");
       }

    public String getCreditCardinfo() {
        return creditCardinfo;
    }

    public void setCreditCardinfo(String creditCardinfo) {
        this.creditCardinfo = creditCardinfo;
    }
    public void displayReportedBoookings(String oldReportedBooking, String upcomingReportedBooking){}
    public void selectFilter(){}
    public void Search(){}
    public void SendFeedback(String Feedbackdetails){}


    
}
