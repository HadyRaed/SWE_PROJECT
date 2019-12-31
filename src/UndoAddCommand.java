
public class UndoAddCommand implements Command {
    StoreOwnerUndoController souc;
    ObjectCollector obj;
   public UndoAddCommand (StoreOwnerUndoController souc,ObjectCollector obj)
   {
       this.souc=souc;
       this.obj=obj;
   }
    
    @Override
    public void execute(){
    souc.UndoAdd(obj.store, obj.s, obj.storename, obj.productname, obj.stores, obj.z, obj.history );
    }
}
