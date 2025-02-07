import java.util.List;

public class MulExp implements Expression{
    private Expression left;
    private Expression right;


    public MulExp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(){
        return left.evaluate() * right.evaluate();
    }

    @Override
    public String emit(){
        return "nah";
    }
}
