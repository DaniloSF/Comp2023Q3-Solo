package symbols;

import java.util.HashMap;
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

}
