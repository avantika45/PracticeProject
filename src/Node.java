
/*
 * Class from which Trees and Leaves are derived. 
 * Every element is actually a node. 
 */

public abstract class Node {

	String name; //Every node must have a name
	public Tree parent; // Every node must have a parent
	int depth = 0; // Store the depth
	
	/*
	 * Get the path to the current node
	 * @return : Path to the current node 
	 */
	
	public String[] getPath(){
		String[] path = new String[this.depth];
		Node workingNode = this;
		
		for(int i = this.depth-1; i >= 0; i--){
			path[i] = workingNode.name;
			workingNode = workingNode.parent;
		}
		
		return path;
	}
}
