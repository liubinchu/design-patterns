package top.ericcliu.actional.interpreter;

/**
 * @author liubi
 **/
public class Client {

    /**
     * 构建解析树
     */
    public static Expression buildInterpreterTree() {
        // Literal
        Expression a = new TerminalExpression("A");
        Expression b = new TerminalExpression("B");
        Expression c = new TerminalExpression("C");
        Expression d = new TerminalExpression("D");
        // B C
        Expression or1 = new OrExpression(b, c);
        // A Or (B C)
        Expression or2 = new OrExpression(a, or1);
        // D And (A Or (B C))
        return new AndExpression(d, or2);
    }

    public static void main(String[] args) {
        Expression define = buildInterpreterTree();
        String context1 = "D A";
        String context2 = "A B";
        System.out.println(define.interpret(context1));
        System.out.println(define.interpret(context2));
    }
}
