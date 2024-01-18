package Shopop2;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class shoppop extends MyArrayList{

	static JFrame Shoppop;
	public JLabel YourItems;
	public static String AllItemList = "----------------------" + "<br>" 
			+ "To-Do List" +"<br>" +"----------------------"+
			"<br>";
	public static JScrollPane test;
	public static JLabel totalLabel = new JLabel("Total : ");

	/**
	 * Launch the application.
	 */
	
	public static MyArrayList allItem = new MyArrayList();
	public JButton SortName;
	public JButton RemoveName;
	public JButton SortPrice;
	public JPanel panel;

	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shoppop window = new shoppop();
					window.Shoppop.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public shoppop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		Shoppop = new JFrame();
		Shoppop.setBounds(0, 0, 2000, 2000);
		Shoppop.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		Shoppop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Shoppop.getContentPane().setLayout(null);
		
		test = new JScrollPane();
		test.setBounds(126, 176, 600,540);
		Shoppop.getContentPane().add(test);
		

		
		//title
		
		YourItems = new JLabel("Your Items.");
		YourItems.setForeground(Color.WHITE);
		YourItems.setFont(new Font("Cooper Black", Font.BOLD, 60));
		YourItems.setBounds(546, 43, 378, 70);
		Shoppop.getContentPane().add(YourItems);
		

        
		//AddButton
		
		JButton AddButton = new JButton("Add Item");
		AddButton.setForeground(new Color(255, 255, 255));
		AddButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addItem();
				panel.setVisible(true);
			}
		});
		AddButton.setBounds(936, 220, 180, 55);
		AddButton.setBackground(new Color(178, 34, 34));
		AddButton.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		Shoppop.getContentPane().add(AddButton);
		
		
		
		//RemoveNumberButton
		
		JButton RemoveNumber = new JButton(" Remove By Number");
		RemoveNumber.setForeground(new Color(255, 255, 255));
		RemoveNumber.setBackground(new Color(46, 139, 87));
		RemoveNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				removeByNumber();
				
			}
		});
		RemoveNumber.setBounds(870, 319, 309, 55);
		RemoveNumber.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		Shoppop.getContentPane().add(RemoveNumber);
		
		//RemoveNameButton
		
		RemoveName = new JButton("Remove By Name ");
		RemoveName.setForeground(new Color(255, 255, 255));
		RemoveName.setBackground(new Color(46, 139, 87));
		RemoveName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				removeByName();
				
			}
		});
		RemoveName.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		RemoveName.setBounds(1213, 319, 266, 55);
		Shoppop.getContentPane().add(RemoveName);
		
		
		
		//ClearButton
		
		JButton ClearButton = new JButton("Clear Item");
		ClearButton.setBackground(new Color(255, 248, 220));
		ClearButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clear();
				
			}
		});
		ClearButton.setBounds(1163, 220, 189, 55);
		ClearButton.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		Shoppop.getContentPane().add(ClearButton);
		
		

		//SortNameButton
		
		SortName = new JButton("Sort By Name");
		SortName.setForeground(new Color(255, 255, 224));
		SortName.setBackground(new Color(178, 34, 34));
		SortName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					sortByName();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		SortName.setBounds(1197, 419, 219, 55);
		SortName.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		Shoppop.getContentPane().add(SortName);
		
		
		//SortPriceButton
		
		SortPrice = new JButton("Sort By Price");
		SortPrice.setForeground(new Color(255, 255, 240));
		SortPrice.setBackground(new Color(178, 34, 34));
		SortPrice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					sortByPrice();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		SortPrice.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		SortPrice.setBounds(936, 419, 211, 55);
		Shoppop.getContentPane().add(SortPrice);
		
		
        
		//SearchButton
		
		JButton SearchButton = new JButton("Search Item Name");
		SearchButton.setBackground(new Color(255, 255, 224));
		SearchButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				search();
				
			}
		});
		SearchButton.setBounds(1019, 515, 275, 55);
		SearchButton.setFont(new Font("Cooper Black", Font.PLAIN, 25));
		Shoppop.getContentPane().add(SearchButton);
		
        //totalbg
		panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(1019, 650, 275, 57);
		panel.setVisible(false);
		Shoppop.getContentPane().add(panel);
        totalLabel.setForeground(new Color(255, 255, 240));
        panel.add(totalLabel);
		
		//total
        totalLabel.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        panel.setBounds(1019, 659, 275, 57);
        totalLabel.setText("");
		
	
		JLabel BG = new JLabel("");
		BG.setIcon(new ImageIcon(shoppop.class.getResource("/images/bg.jpg")));
		BG.setFont(new Font("Andalus", Font.PLAIN, 25));
		BG.setBounds(0, 0, 1540, 855);
		Shoppop.getContentPane().add(BG);
		
		
		

	
	    }
	
	public void showItem() throws Exception {
		AllItemList = "";
	   	 int number = 0;
	   	 double sum = 0;
	   	 String total;
	   	 JLabel ShowItem = new JLabel("");
	   	 ShowItem.setFont(new Font("Cooper Black", Font.PLAIN, 25));
	   	 ShowItem.setBounds(100, 100, 500, 695);
	     test.setViewportView(ShowItem);
	     for (int i = 0; i < allItem.size(); i++) {
	     AllItemList +="Number : " + ++number 
	    		 + "<br>"+"Item: "+ allItem.get(i).getName()  
	    		 + "<br>"+"Price: "+ allItem.get(i).getPrice()  
	    		 + "<br>"+"Amount: "+ allItem.get(i).getAmount()  
	    		 + "<br>"+"---------------------------------------"
	    		 + "------------------------------------------"+"<br>";
	     ShowItem.setText("<html>"+AllItemList+"<html>");
	        
	        sum += allItem.get(i).getTotal();
	        
	        }
	        total = "";
	        total = String.valueOf(sum);
	        
	        totalLabel.setText("Total : " + total);
	        
	 
	   }
	   

	   public void addItem() {
	   	AllItemList = "";
	   	
	   	   String name = JOptionPane.showInputDialog(null,"Enter an item: ");

	       String price = JOptionPane.showInputDialog(null,"Enter a price: ");

	       String amount = JOptionPane.showInputDialog(null,"Enter an amount: ");

	   	try{
	       
	       
	       if(name.matches("[^a-zA-Z]") || name.matches("") || !price.matches("[0-9]+") 
	    	|| price.matches("")|| !amount.matches("[0-9]+") || amount.matches(""))  {
				
	       	
	           throw new Exception("is wrong input!");
	           
			} else {
				Item item = new Item(name, price, amount);
		        allItem.add(item);
		        
		       
		        showItem();
	       }
	   	}catch(Exception e) {
	   		JOptionPane.showMessageDialog(null, "Please Enter the Input!");
	   		
	   	}

	   }
	   
	  
	   public void removeByNumber() {
		 	AllItemList = "";
		 	String removeItem = JOptionPane.showInputDialog(null,"Enter a remove item: ");
		 	try{
		         
		 	if(!removeItem.matches("[0-9]+") || removeItem.matches("")) {
		 		 throw new Exception("is wrong input!");
		          
				} else {
					 int index = Integer.parseInt(removeItem);
				        if((index-1)<0 || index>allItem.size()) {
				        	JOptionPane.showMessageDialog(null, "Please Enter the correct Input!");
				        }else {
				        	
				            allItem.remove(index-1);
				        }
		
				        //System.out.println("----------------------");
				        //showList();
				        
				        showItem();
					
				}
		 
		 	}catch(Exception e) {
		 		JOptionPane.showMessageDialog(null, "Please Enter the correct Input!");
		 		
		 	}
		 		
		 }

		 public void removeByName() {
			 	AllItemList = "";
			 	boolean founded = false;

			     int y = 0;
			     String rmName = JOptionPane.showInputDialog(null,"Enter a remove item: ");
			     try{
			         
			     	if(rmName.matches("[^a-zA-Z]") || rmName.matches("")) {
			     		
			     		 throw new Exception("is wrong input!");
			              
			 		} else {
			     for(int i = 0; i < allItem.size(); i++){
			
			         if(allItem.get(i).getName().contains(rmName)) {
			             founded = true;
			             y = i;
			             break;
			         }
			     }
			     if(founded){
			      
			     	allItem.remove(y);
			     }
			     else{

			         JOptionPane.showMessageDialog(null, "Don't has " + rmName + " in the list.");
			     }
			     showItem();
			 		}
			     }catch(Exception e) {
			     		JOptionPane.showMessageDialog(null, "Please Enter correct the Input!");
			     		
			     	}
			     
			 }
		
		    
	   
		 public void clear() {
			allItem.clear();
			AllItemList = "";
				
			try {
				showItem();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	   public void sortByName() throws Exception {
	   	AllItemList = "";
	   
	   	for (int i = 0; i < allItem.size(); i++)   
	   	{  
	   	for (int j = i + 1; j < allItem.size(); j++)   
	   	{  
	   	
	   	Item tmpi;
	   	Item tmpj;
	   	
	   	
	   	if (allItem.get(i).getName().compareTo(allItem.get(j).getName()) > 0)
	   	{  
	   	tmpi = allItem.get(i); 
	   	tmpj = allItem.get(j);
	   	allItem.set(i, tmpj);
	   	allItem.set(j, tmpi);
	   	
	   	
	   	}  
	   	}
	   	
	   	}

	   	

	       //currentList.sort(String.CASE_INSENSITIVE_ORDER);

	       //allItem.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
	      // System.out.print("sort");
	       showItem();

	   }
	   

	   
	   public void sortByPrice() throws Exception{
	   	for (int i = 0; i < allItem.size(); i++)   
	   	{  
	   	for (int j = i + 1; j < allItem.size(); j++)   
	   	{  
	   	
	   	Item tmpi;
	   	Item tmpj;
	   	double pricei = Double.parseDouble(allItem.get(i).getPrice());
	   	double pricej = Double.parseDouble(allItem.get(j).getPrice());
	   	
	   	if (pricei > pricej)   
	   	{  
	   	tmpi = allItem.get(i); 
	   	tmpj = allItem.get(j);
	   	allItem.set(i, tmpj);
	   	allItem.set(j, tmpi);
	   	
	   	
	   	}  
	   	}
	   	
	   	}
	   	AllItemList = "";
	   	showItem();
	   }

	   public void search(){
	   	 boolean found = false;
	        int x = 0;
	        String searchItem = JOptionPane.showInputDialog(null,"Enter a search item: ");
	        try{
	            
	        	if(searchItem.matches("")) {
	        		 throw new Exception("is wrong input!");
	                 
	    		} else {
	        for(int i = 0; i < allItem.size(); i++){

	            if(allItem.get(i).getName().contains(searchItem)) {
	                found = true;
	                x = i;
	                break;
	            }
	        }
	        if(found) {
	        	JOptionPane.showMessageDialog(null, "Item : " + allItem.get(x).getName() 
	        			+ "\s" +"\s"+"\s" +"\s" + "Price : " + allItem.get(x).getPrice()
	        			+ "\s" +"\s"+"\s" +"\s" +"Amount : " + allItem.get(x).getAmount());
	        }
	        else{
	            JOptionPane.showMessageDialog(null, searchItem +" is not Found.");
	        }
	    		
	    }
	        }catch(Exception e) {
	    		JOptionPane.showMessageDialog(null, "Please Enter the Input!");
	    		
	    	}
	
	   }
	
	   
}



	
	 