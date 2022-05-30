public class Main {
    public static void main(String[] args) {

    	Lista l1 = new Lista();
    	
        l1.addItem(7);
        l1.addItem(3);
        l1.addItem(1);
        l1.addItem(5);
        l1.addItem(9);
 
        
        System.out.println(l1.firstItem());
        System.out.println(l1.middleItem());
        System.out.println(l1.lastItem());


        System.out.println(l1.listItems());
        l1.sortItems();
    }
}