package Shopop2;


public interface MyArrayListADT {
    
    public void List();
    
    public void add(Item item) throws Exception ;
       
    public boolean isEmpty();
   
    public boolean isFull();

	public Item set(int i, Item tmpj) throws Exception ;

	public Item get(int i) throws Exception;

	public int size();

	public void clear();

	public void remove(int y) throws Exception;

}
