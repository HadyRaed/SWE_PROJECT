import java.util.Scanner;

public class LoginUi {

    CAddStoreUi CAdd = new CAddStoreUi();
    AdminController ac = new AdminController();
    ExistingStoreUi ExStore = new ExistingStoreUi();
    CreateStoreUi CrStore = new CreateStoreUi();
    //StoreOwnerUndoUi undo =  new  StoreOwnerUndoUi();
    BuyUi buyUi = new BuyUi();
    Scanner x = new Scanner(System.in);

    public void showLoginFormC(CustomerDatabase cdb,ProductDatabase pdb) {
        System.out.println("Enter your name");

        String Namee = x.next();

        System.out.println("Enter your password");

        String Pass = x.next();

        System.out.println("Enter your mail");
        String Maill = x.next();

        Customer customerii = new Customer(Namee, Pass, Maill);
        CustomerController cc = new CustomerController();
        if (cc.validateLogin(customerii, cdb) == true) {
            System.out.println("1-Add a store \n2-Buy product");
            int val = x.nextInt();
            switch (val) {
                case 1:
                    CAdd.AddStore(customerii,cc);
                    break;
                case 2:
                    buyUi.buy(pdb, customerii, cc);
            }
        }
    }

    public void showLoginFormS(StoreOwnerDatabase sdb,ProductDatabase pdb,BrandDatabase bdb) {
        System.out.println("Enter your name");
        String Nameee = x.next();

        System.out.println("Enter your password");
        String Passs = x.next();

        System.out.println("Enter your mail");
        String Mailll = x.next();

        
        StoreOwner storeOwnerii = new StoreOwner(Nameee, Passs, Mailll);
        StoreOwnerController ss = new StoreOwnerController();
        StoreOwnerBuyController sob = new StoreOwnerBuyController();
        boolean check = true;
        if (ss.validateLogin(storeOwnerii, sdb))
        {   System.out.println("Logged In Successfully");
            while (check) {
                System.out.println("1-Have an existing store?\n2-Create a store \n3-Buy\n6-Logout");

                int k = x.nextInt();

                if (k == 1) {
                    ExStore.ExistingStore(storeOwnerii, ss, ac, bdb, pdb);

                } else if (k == 2) {

                    CrStore.CreateStore(storeOwnerii,ss);

                }
                else if(k == 3)
                {
                buyUi.buyS(pdb, storeOwnerii,sob);
                
                }
               // else if(k == 4)
                //{
                //undo.UndoAdd(null, ss, Nameee, Nameee, storeOwnerii, null);
                //}
                 //else if(k == 5)
                //{
                //undo.UndoEdit(null, ss, Nameee, Nameee, storeOwnerii, null);
                //}
                else if (k == 6) {
                    check = false;
                }

            }
        }
        else System.out.println("Can't login");
    }

    private void Switch(int val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
