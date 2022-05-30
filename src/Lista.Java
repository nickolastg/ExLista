import java.util.List;
import java.util.ArrayList;

public class Lista {
    private List<Object> items;

    public Lista() {
        this.items = new ArrayList<Object>();
    }

    public Object firstItem() {
    	return this.items.get(0);
    } 
    
    public Object middleItem() {
    	
    	if (items.size() % 2 == 0) {
    		throw new IllegalArgumentException("Lista com tamanho par não possui elemento do meio"); 
    		
    	// Object item = items.get((items.size()/2) - 1);
    	// return item;
    		
    	}else {
    	Object item = items.get(items.size()/2);
    	return item;
    	}
    	
    }
    
    public Object lastItem() {
    	return this.items.get(this.items.size() - 1);
    }
    
    public void addItem(Object item) {
        this.items.add(item);
    }

    public void delItemByIndex(int index) {
        this.items.remove(index);
    }

    public void sortItems() {
        this.items.sort(null);
    }
    
    public List<Object> listItems() {
        return this.items;
    }

}