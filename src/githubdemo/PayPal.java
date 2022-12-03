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
public class PayPal implements PaymentStrategy{
    
    private String email;
    private String password;
 
    public PayPal(String emaill, String pwd){
        this.email=emaill;
        this.password=pwd;
    }

    @Override
    public void pay(String amount) {
         System.out.println(amount + "$ paid using Paypal.");
    }
 
}
