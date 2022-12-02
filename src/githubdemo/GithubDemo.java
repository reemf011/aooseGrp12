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
    Admin md=new Admin();
    Customer ac=new Customer(md);
    md.SpecialOffers(20);
    md.SpecialOffers(15);
    md.SpecialOffers(55);
  }
       
    }
    

