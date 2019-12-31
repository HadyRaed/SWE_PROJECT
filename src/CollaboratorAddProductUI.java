
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
public class CollaboratorAddProductUI {
    Scanner x = new Scanner(System.in);

    public void AddStoreProductsByCollab(StoreOwner storeOwnerii, StoreOwnerController ss, AdminController ac, BrandDatabase bdb, ProductDatabase pdb,String storename,CollaboratorController cc,History history) {
        System.out.println("Welcome Collaborator!");
        System.out.println("Enter product Name");

        String prdctName = x.next();

            int SerialNum = 0;
        boolean flag = false;
        while (flag == false) {
            System.out.println("Enter product Serial number");
            Scanner Intscanner = new Scanner(System.in);

            if (Intscanner.hasNextInt()) {
                SerialNum = Intscanner.nextInt();
                flag = true;
            } else {
                System.out.println("Please enter a Number");
            }

        }

        System.out.println("Enter product category");
        String prdctCat = x.next();

             int Stock = 0;
        boolean flag1 = false;
        
        while (flag1 == false) {
            System.out.println("Enter Stock");
            Scanner Inttscanner = new Scanner(System.in);

            if (Inttscanner.hasNextInt()) {
                SerialNum = Inttscanner.nextInt();
                flag1 = true;
            } else {
                System.out.println("Please enter a Number");
            }

        }

        System.out.println("Enter Brand Name");
        String brndName = x.next();
        Product product = new Product(prdctName, SerialNum, 0, prdctCat,Stock, brndName);

        if (ac.validateBrand(brndName, bdb)||ac.validateProduct( product, pdb)) 
        {
            cc.addProductsCollab(ss, prdctName, storeOwnerii, product, pdb, history);
            System.out.println("Product is added");
        }
         
        else if ((!ac.validateBrand(brndName, bdb)) && ac.validateProduct( product, pdb) == false) {
         System.out.println("There is a problem, pleae check your data");
        }}}
    

