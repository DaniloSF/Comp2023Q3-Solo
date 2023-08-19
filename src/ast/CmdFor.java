package ast;

import java.util.List;

import expressions.AbstractExpression;
import symbols.Identifier;

public class CmdFor extends AbstractCommand {

    private Identifier id;
    private List<AbstractCommand> cmds;
    private AbstractExpression start;
    private AbstractExpression end;

    @Override
    public String generateCode() {
        StringBuilder str = new StringBuilder();

        str.append("for(" + id.getText() + "=" + start.toString() + "; " + id.getText() + "<=" + end.toString() + "; "
                + id.getText() + "++) {\n");
        for (AbstractCommand cmd : cmds) {
            str.append(cmd.generateCode());
        }
        str.append("}\n");

        return str.toString();
    }

    @Override
    public void run() {
        for (int i = (int) start.eval(); i <= (int) end.eval(); i++) {
            id.setValue(i);
            for (AbstractCommand cmd : cmds) {
                cmd.run();
            }
        }
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public List<AbstractCommand> getCmds() {
        return cmds;
    }

    public void setCmds(List<AbstractCommand> cmds) {
        this.cmds = cmds;
    }

    public AbstractExpression getStart() {
        return start;
    }

    public void setStart(AbstractExpression start) {
        this.start = start;
    }

    public AbstractExpression getEnd() {
        return end;
    }

    public void setEnd(AbstractExpression end) {
        this.end = end;
    }
}
