
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
public class BuyUi {

   public void buy(ProductDatabase pdb,Customer customerii)
    { 
        System.out.print ("enter prodcut name");
    Scanner x = new Scanner(System.in);
			String prdName = x.next();
    Product z = new Product(prdName, 0, 0, null, 0, null);

    if(pdb.searchProduct (z)!=-1)
{
 customerii.buy(pdb.searchProduct(z));

    }

}}
