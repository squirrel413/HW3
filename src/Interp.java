import java.util.List;
import java.util.Arrays;
import java.util.Scanner;


public class Interp {

    private final String PROMPT = "> ";
    Scanner instruction;
    private String user_input;


    public Interp() {
        this.instruction = read_Input();
    }

    private Scanner read_Input(){
        instruction = new Scanner(System.in);
        instruction.nextLine();
        return instruction;
    }

    private int helper(Scanner instruction){
        Expression operation = null;
        Expression left;
        Expression right;

        if (instruction.hasNextInt()) { //needed
            int x = instruction.nextInt();
            left = new IntExp(x);
            return left.evaluate(); //needed
        } else {
            switch (instruction.next().trim()) {
                case "+":
                    left = new IntExp(helper(instruction));
                    right = new IntExp(helper(instruction));
                    operation = new AddExp(left, right);
                    //return operation.evaluate();
                    break;
                case "-":
                    left = new IntExp(helper(instruction));
                    right = new IntExp(helper(instruction));
                    operation = new SubExp(left, right);
                    //return operation.evaluate();
                    break;
                case "*":
                    left = new IntExp(helper(instruction));
                    right = new IntExp(helper(instruction));
                    operation = new MulExp(left, right);
                    //return operation.evaluate();
                    break;
                case "/":
                    left = new IntExp(helper(instruction));
                    right = new IntExp(helper(instruction));
                    operation = new DivExp(left, right);
                    //return operation.evaluate();
                    break;
                case "%":
                    left = new IntExp(helper(instruction));
                    right = new IntExp(helper(instruction));
                    operation = new ModExp(left, right);
                    //return operation.evaluate();
                    break;
            }
        }
        return operation.evaluate();
    }

    public static void main(String[] args) {
        Interp interp = new Interp();
    }
}