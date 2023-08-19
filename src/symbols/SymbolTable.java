package symbols;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {

	private Map<String, Identifier> globalScope = new HashMap<>();
	private Stack<Map<String, Identifier>> scopeStack = new Stack<>();

	public void enterScope() {
		scopeStack.push(new HashMap<>());
	}

	public void exitScope() {
		scopeStack.pop();
	}

	public void addVariable(String name, Identifier variableInfo) {
		scopeStack.peek().put(name, variableInfo);
	}

	public Identifier getVariable(String name) {
		for (int i = scopeStack.size() - 1; i >= 0; i--) {
			Identifier variableInfo = scopeStack.get(i).get(name);
			if (variableInfo != null) {
				return variableInfo;
			}
		}
		return globalScope.get(name);
	}

	public SymbolTable() {
		this.globalScope = new HashMap<String, Identifier>();
	}

	public Identifier get(String key) {
		return this.globalScope.get(key);
	}

	public void add(String key, Identifier id) {
		this.globalScope.put(key, id);
	}

	public boolean exists(String key) {
		return this.globalScope.containsKey(key);
	}

	public Map<String, Identifier> getSymbols() {
		return this.globalScope;
	}

	public void setSymbols(HashMap<String, Identifier> symbols) {
		this.globalScope = symbols;
	}

	public String generateCode() {
		StringBuilder str = new StringBuilder();
		List<Identifier> floatList;
		List<Identifier> intList;

		floatList = this.globalScope.values().stream().filter(i -> i.getType() == DataType.REAL).toList();
		intList = this.globalScope.values().stream().filter(i -> i.getType() == DataType.INTEGER).toList();

		if (!floatList.isEmpty()) {
			str.append("float ");
			for (Identifier id : floatList) {
				str.append(id.getText() + ", ");
			}
			str.delete(str.length() - 2, str.length());
			str.append(";\n");
		}

		if (!intList.isEmpty()) {
			str.append("int ");
			for (Identifier id : intList) {
				str.append(id.getText() + ", ");
			}
			str.delete(str.length() - 2, str.length());
			str.append(";\n");
		}
		
		return str.toString();
	}

}
