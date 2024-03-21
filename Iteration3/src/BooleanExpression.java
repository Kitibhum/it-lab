package src;
class BooleanExpression implements Expression<Boolean> {
    private boolean boolvalue;

    public BooleanExpression(boolean boolvalue) {
        this.boolvalue = boolvalue;
    }

    @Override
    public Boolean interpret(Context context) {
       
        return boolvalue;
    }
}