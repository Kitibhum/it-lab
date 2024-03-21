package src;

public class Context {
    //Addiontal context info , if needed
    private ContextType _isReverse;

    public Context(ContextType isReverse){
       this._isReverse = isReverse;
    }
    public Context() {
        this(ContextType.NORMAL);
    }
    public ContextType isReverse(){
        return _isReverse;
    }
}
