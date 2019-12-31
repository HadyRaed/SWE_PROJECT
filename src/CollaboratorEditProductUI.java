
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hady
 */
public class CollaboratorEditProductUI { Scanner x = new Scanner(System.in);

    public void EditStoreProductsByCollab(StoreOwner storeOwnerii, StoreOwnerController ss, AdminController ac, BrandDatabase bdb, ProductDatabase pdb,String storename,CollaboratorController cc,History history) {
        System.out.println("Welcome Collaborator!");
      
        System.out.println("Enter product Name");
        String prdctName = x.next();
        
        System.out.println("Enter NEW price");
        int price = x.nextInt();
        
        System.out.println ("Enter store Name");
        String storeName = x.next();
        
           

        
           if (cc.editProductsCollab(ss, storename, prdctName, price, storeOwnerii, history)!=null)
           {System.out.println ("Product is edited");}
           else System.out.println("Can't be edited!");
         
       }
    
}
