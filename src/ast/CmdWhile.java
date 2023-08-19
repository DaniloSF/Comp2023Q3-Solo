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
        while ((boolean) expr.eval()) {
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
