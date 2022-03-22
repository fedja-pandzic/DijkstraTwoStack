package ibu.edu;


import java.util.Arrays;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Stack<String> operators = new Stack<>();
        Stack<Double> values = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        for(int i=0; i<tokens.length;i++){
            if(tokens[i].equals("("));
            else if(tokens[i].equals("+")) operators.push(tokens[i]);
            else if(tokens[i].equals("-")) operators.push(tokens[i]);
            else if(tokens[i].equals("*")) operators.push(tokens[i]);
            else if(tokens[i].equals("/")) operators.push(tokens[i]);
            else if(tokens[i].equals(")")){
                operators.push(tokens[i]);
                String op = operators.pop();
                double v = values.pop();
                double newV;
                if(op.equals("+")) {
                    newV = values.pop() + v;
                    values.push(newV);
                    values.displayStack();
                }
                else if(op.equals("-")) {
                    newV = values.pop() - v;
                    values.push(newV);
                    values.displayStack();
                }
                else if(op.equals("*")) {
                    newV = values.pop() * v;
                    values.push(newV);
                    values.displayStack();
                }
                else if(op.equals("/")) {
                    newV = values.pop() / v;
                    values.push(newV);
                    values.displayStack();
                }

            }
            else {
                values.push(Double.parseDouble(tokens[i]));

            }
//            System.out.println("-------------------");
//            operators.displayStack();
//            System.out.println();
//            values.displayStack();
//            System.out.println();
//            System.out.println("------------------");

        }
        values.displayStack();
    }
}
