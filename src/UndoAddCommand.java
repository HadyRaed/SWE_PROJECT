
public class UndoAddCommand implements Command {
    StoreOwnerUndoController souc;
    ObjectCollector obj;
   public UndoAddCommand (StoreOwnerUndoController souc)
   {
       this.souc=souc;
   }
    
    @Override
    public void execute(){
    souc.UndoAdd(obj.store, obj.s, obj.storename, obj.productname, obj.stores, obj.z, obj.history );
    }
}
