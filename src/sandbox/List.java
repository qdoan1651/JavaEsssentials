package sandbox;

public interface List<Item> extends Iterable<Item> {
	void 			List(); 				// create an empty list
	Boolean 		isEmpty(); 				// Is the list empty?
	int				size();					// number of items
	void 			add(Item item);			// append item to end
	Item			get(int index);			// return item at given index
	Item			remove(int index);		// return and delete item at given index
	Boolean			contains(Item item);	// Does the list contain the given item?
	Iterator<Item>	iterator();				// iterator over all items in the list	
}
