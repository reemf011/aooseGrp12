/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author reemf011
 */
public class GithubDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        try{
         MongoClient mongoClient = new MongoClient("localhost",27017);
         DB db = mongoClient.getDB("test");
         System.out.println("connected to Database");
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Server is ready");
             Customer onlineMedia = new Customer();
              Admin personalLoan = new Admin("Special Offer Discount", 12.5f, "Perecent");
              personalLoan.registerObserver(onlineMedia);
              personalLoan.setSpecialOffers(20f);
              personalLoan.setSpecialOffers(30f);
              personalLoan.setSpecialOffers(50f);
         }
    
    }
    

