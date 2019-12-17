
public class Collaborator extends StoreOwner{

    public Collaborator(String userName, String password, String email) {
        super(userName, password, email);
    }

    
    private String collaboratorName;
   private String collaboratorPassword;
    
    
    
    public String getcollaboratorName (){
    return collaboratorName;
    }
    
      public String getcollaboratorPassword (){
    return collaboratorPassword;
    }
    
    
    
}
