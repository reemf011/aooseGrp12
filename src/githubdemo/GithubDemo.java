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
public class GithubDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Customer onlineMedia = new Customer();
              Admin personalLoan = new Admin("Special Offer Discount", 12.5f, "Perecent");
              personalLoan.registerObserver(onlineMedia);
              personalLoan.setSpecialOffers(20f);
              personalLoan.setSpecialOffers(30f);
              personalLoan.setSpecialOffers(50f);
         }
    
    }
    

