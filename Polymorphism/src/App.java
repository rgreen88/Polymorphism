
public class App {

	public static void main(String[] args) {

		Plant plant1 = new Plant();
		Tree tree = new Tree();
				
		Plant plant2 = tree;
		
		Plant plant3 = tree;
		
		//Plant obj using grow() from Plant class
		plant1.grow();
		
		//polymorphism plant obj pointing to tree subclass overriding grow() method 
		//for tree in reference to plant2 of class Plant
		plant2.grow();
		
		//Tree method shedLeaves... can't access shedLeaves from Plant obj referencing tree
		//because of polymorphism access to subclass tree
		tree.shedLeaves();
		//plant3.shedLeaves(); <-- points to type Plant so it doesn't work
		
		doGrow(tree); //polymorphism guarantees and subclass of Plant as acceptable param
		
		
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
	
}
