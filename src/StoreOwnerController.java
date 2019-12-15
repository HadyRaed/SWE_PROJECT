
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * @author 
 */
public class StoreOwnerController {

    public void validateRegister(StoreOwner x, StoreOwnerDatabase sdb) {

        if (sdb.addStoreOwner(x) == true) {
            System.out.println("Registered Successfully");
        } else {
            System.out.println("This Username already exists");
        }
    }

    public boolean validateLogin(StoreOwner x, StoreOwnerDatabase sdb) {

        if (sdb.searchStoreOwner(x) == true) {
            System.out.println("Logged in successfully");
            return true;
        } else {
            System.out.println("Login failed");
            return false;
        }
    }

    public boolean validateStore(StoreOwner x, String storeName) {
        if (x.storesOfStoreOwner.size() == 0) {
            System.out.println("Don't exists");

            return false;
        } else {
            for (int i = 0; i < x.storesOfStoreOwner.size(); i++) {
                if (storeName.contentEquals(x.storesOfStoreOwner.get(i).getStoreName())) {
                    System.out.println("Exists");

                    return true;

                }

            }
        }
        System.out.println("Don't exists");
        return false;
    }

    public void addStore(Store x,ArrayList<Store> storesOfStoreOwner) {
        boolean flag = false;

        if (storesOfStoreOwner.size() == 0) {
            storesOfStoreOwner.add(x);
            flag = true;
            System.out.println("Your Store has been added successfully");

        } else {
            for (int i = 0; i < storesOfStoreOwner.size(); i++) {
                if (storesOfStoreOwner.get(i).getStoreName().contentEquals(x.getStoreName())) {
                    flag = true;
                    System.out.println("You have a store with the same name");
                    break;

                }

            }
        }
        if (flag == false) {
            storesOfStoreOwner.add(x);
            System.out.println("Your Store has been added successfully");
            for (int i = 0; i < storesOfStoreOwner.size(); i++) {
                System.out.println(storesOfStoreOwner.get(i));
            }
        }

    }
/*public boolean CheckStore (String storename,ArrayList <Store>StoreChecking)
{   int j=0;
    for(int i=0;i<StoreChecking.size();i++)
    {
        if(storename==StoreChecking.get(i).getStoreName());
        j=1;
        
    }
    if (j==1){
        return true;
    }
    else
    {
       return false;
    }
}
        */
    public void addPdsInStore (String x,ArrayList <Store> stores,Product z,ProductDatabase px)
    {
    for (int i=0;i<stores.size();i++)
    {
    if (x.contentEquals(stores.get(i).getStoreName()))
    {
    stores.get(i).addProductInStore(z, px);
    
    }
    }}

   public void addcollabs(String s,ArrayList <Store> stores,Collaborator c)
{
    for (int i=0;i<stores.size();i++)
    {
    if (s.contentEquals(stores.get(i).getStoreName()))
    {
    stores.get(i).collabs.add(c);
    
    }
    }

}













}
