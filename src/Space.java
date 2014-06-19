import java.util.LinkedList;

/*
 * Implement file storage. 
 * Provide methods for allocating and deallocating files on disk.
 */
public class Space {

	private Leaf[] blocks;
	private LinkedList<Integer> freeBlocks;
	
	// Constructor - create \c size blank filesystem blocks. 
	
	public Space(int size){
		blocks = new Leaf[size];
		freeBlocks = new LinkedList<Integer>();
		
		for(int i = 0; i < size; i++){
			freeBlocks.add(i);
		}
	}
	
	/*
	 * Allocate \c size blocks to store \c file. 
	 */
	
	public void Alloc(int size, Leaf file){
		file.allocations = new int[size];
		for(int i = 0; i < size; i++){
			file.allocations[i] = freeBlocks.poll();
			blocks[file.allocations[i]] = file; 
			
		}
	}
}
