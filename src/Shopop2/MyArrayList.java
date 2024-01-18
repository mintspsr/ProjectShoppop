package Shopop2;



public class MyArrayList implements MyArrayListADT{
		
		private int total;
	    private Item s[];
	    int current,size;
	    
	    public MyArrayList() {
	        List();
	        
	    }
	    
	    public void List() {
	        current = -1;
	        total = 50;
	        s = new Item[total];
	        size = 0;
	    }
	    
	    public void add(Item item) throws Exception {
	        if(isFull()){
	            //throw new Exception("List is full");
	        }else{
	            size++;
	            if(size==1){
	                current++;
	                s[current]=item;
	            }else{
	                for(int i=size-1;i>current+1;i--)
	                    s[i]=s[i-1];
	                current++;
	                s[current]=item;
	            }
	        }

	    }
	    
	   
	    
	    public boolean isEmpty() {
	        return size == 0;
	    }
	    
	   
	    public boolean isFull() {

	        return size>=total;
	    }

		public Item set(int i, Item tmpj) throws Exception  {
			if(isEmpty()){
	            throw new Exception("List is empty");
	        }else{
	            s[i]=tmpj;
	        }
			return tmpj;
			
		}

		public Item get(int i) throws Exception {
			if(isEmpty()){
	            throw new Exception("List is empty");
	        }else{
	            return s[i];
	        }
			
			
		}

		public int size() {
			return size;
		}

		

		public void clear() {
			List();
		}

		public void remove(int y) throws Exception {
			if(isEmpty()){
	            throw new Exception("List is empty");
	        }else{
	        	current = y;
	            if(size==1){
	                current = -1;
	            }else if(current==size-1){
	                current = 0;
	            }else{
	                for(int i = current;i<size-1;i++)
	                    s[i]=s[i+1];
	                    current=0;
	                }
	              size--; 
	              current = size-1;
	            }
	            
	        

					
		}
		

	}