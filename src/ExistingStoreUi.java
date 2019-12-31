
import java.util.Scanner;

public class ExistingStoreUi {

    Scanner x = new Scanner(System.in);
    ExistingStoreProductUi ExStoreProduct = new ExistingStoreProductUi();

    public void ExistingStore(StoreOwner storeOwnerii, StoreOwnerController ss, AdminController ac, BrandDatabase bdb, ProductDatabase pdb) {
        System.out.println("Enter Store Name");
        String storname = x.next();
        if (ss.validateStore(storeOwnerii, storname) == true) {
            System.out.println("Welcome StoreOwner!");
            System.out.println("Welcome to " + storname);
            System.out.println("1-Do you like to add products to your store?\n2-Add Collaborator\n3-logout");
            int u = x.nextInt();

            if (u == 1) {
                ExStoreProduct.AddStoreProducts(storeOwnerii, ss, ac, bdb, pdb,storname);

            } else if (u == 2) {
             
                Collaborator collaborator = new Collaborator ("Hady","1234","ee@yahoo.com");
                CollaboratorController collabcontroller = new CollaboratorController();
                CollaboratorAddProductUI cui= new CollaboratorAddProductUI();
                CollaboratorEditProductUI eui= new CollaboratorEditProductUI();

                History history = new History();
                storeOwnerii.addcollab(ss,storname,collaborator);
               
                 System.out.println("1-Do you like to add products to the store?\n2-edit products");
                int choice = x.nextInt();
               if (choice==1)
               {cui.AddStoreProductsByCollab(storeOwnerii, ss, ac, bdb, pdb, storname,collabcontroller,history);
               }
               else if(choice==2)
               {eui.EditStoreProductsByCollab(storeOwnerii, ss, ac, bdb, pdb, storname, collabcontroller, history);}
            }
            
            else if (u == 3) {
                System.exit(0);
            } else {
                System.out.println("Store doesn't exist");
            }

        }

    }
}
