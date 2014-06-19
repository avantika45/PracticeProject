import java.util.HashMap;

/*
 * Tree Data Structure - Tree can have arbitrarily many children.
 */
public class Tree extends Node{

    // Children of current node	
	public HashMap<String, Node> children = new HashMap<String, Node>();
	
	//Constructor: Create a tree
	public Tree(String name){
		this.name = name;
	}
	
	/*
	 * Get a child from \c or create one if non-existant
	 * 
	 */
	
	public Tree GetChildByName(String name){
		if(this.children.containsKey(name)){
			return (Tree) this.children.get(name);
		}
		
		//not found - create
		
		Tree newTree = new Tree(name);
		newTree.parent = this;
		newTree.depth = newTree.parent.depth + 1;
		
		this.children.put(name, newTree);
		return newTree;
	}
}
