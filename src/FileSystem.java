
public class FileSystem {

	private Tree fileSystemTree;
	public static Space fileStorage;
	
	//Constructor - Initialize filesystem with empty root directory and \c m KB of space
	
	public FileSystem(int m){
		fileSystemTree = new Tree("root");
		fileStorage = new Space(m);
	}
	
}
