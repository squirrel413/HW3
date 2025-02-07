import java.util.List;

public class IntExp implements Expression{
    private int value;

    public IntExp(int value){
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String emit() {
        return "" + value;
    }
}
