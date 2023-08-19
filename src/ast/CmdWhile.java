package ast;

import java.util.List;

import expressions.AbstractExpression;

public class CmdWhile extends AbstractCommand {
    private AbstractExpression expr;
    private List<AbstractCommand> cmds;

    @Override
    public String generateCode() {
        StringBuilder str = new StringBuilder();
        for (AbstractCommand cmd : cmds) {
            str.append(cmd.generateCode());
        }
        return "while (" + expr.toString() + ") {\n " + str.toString() + "}\n";
    }

    @Override
    public void run() {
        System.out.println("WHILE before");
        System.out.println(expr);
        while ((boolean) expr.eval()) {
            System.out.println("WHILE");
            for (AbstractCommand cmd : cmds) {
                cmd.run();
            }
        }
    }

    public List<AbstractCommand> getCommands() {
        return cmds;
    }

    public void setCommands(List<AbstractCommand> cmds) {
        this.cmds = cmds;
    }

    public AbstractExpression getExpr() {
        return expr;
    }

    public void setExpr(AbstractExpression expr) {
        this.expr = expr;
    }
}
