package src;
//Abstract Expression

public interface Expression<Object> {
    Object interpret(Context context);
}
