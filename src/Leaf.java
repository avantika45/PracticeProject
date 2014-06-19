import java.nio.file.FileSystem;


public class Leaf extends Node{

	public int size; //Size of leaf in KB
	public int[] allocations; 
	
	//Constructor - create Leaf
	
	public Leaf(String name, int size){
		this.name = name;
		allocateSpace(size);
	}
	
	private void allocateSpace(int size){
		FileSystem.fileStorage.Alloc(size, this);
	}
	
}
