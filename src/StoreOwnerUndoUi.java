
import java.util.ArrayList;
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
public class StoreOwnerUndoUi {

    simpleControl remote = new simpleControl();
    StoreOwnerUndoController souc = new StoreOwnerUndoController();

    public void UndoAdd(Store store, StoreOwnerController s, String storename, String productname, StoreOwner so, History history) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product Name You want to undo the add of");

        String productName = scanner.nextLine();

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
        String productCategory = scanner.nextLine();

        System.out.println("Enter brand name");
        String brandName = scanner.nextLine();
       
        Product p = new Product(productname,SerialNum,0,productCategory,0,brandName);

        ObjectCollector obj = new ObjectCollector();
        obj.setHistory(history);
        obj.setProductname(productname);
        obj.setS(s);
        obj.setStorename(storename);
        obj.setStores(so.storesOfStoreOwner);
        obj.setZ(p);
        remote.setSlot(new UndoAddCommand(souc, obj));
    }

    public void UndoEdit(Store store, StoreOwnerController s, String storename, String productname, StoreOwner so, History history) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product Name You want to undo edit");

        String productName = scanner.nextLine();

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
        String productCategory = scanner.nextLine();

        System.out.println("Enter brand name");
        String brandName = scanner.nextLine();
       
        Product p = new Product(productname,SerialNum,0,productCategory,0,brandName);

        ObjectCollector obj = new ObjectCollector();
        obj.setHistory(history);
        obj.setProductname(productname);
        obj.setS(s);
        obj.setStorename(storename);
        obj.setStores(so.storesOfStoreOwner);
        obj.setZ(p);
        remote.setSlot(new UndoEditCommand(souc, obj));
    }
}
