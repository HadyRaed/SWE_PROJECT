
public class UndoEditCommand extends Command {

    StoreOwnerUndoController souc;
    ObjectCollector obj;

    public UndoEditCommand(StoreOwnerUndoController souc, ObjectCollector obj) {
        this.souc = souc;
        this.obj = obj;
    }

    @Override
    public void execute() {
        souc.UndoEdit(obj.store, obj.s, obj.storename, obj.productname, obj.stores, obj.z, obj.history);
    }

}
