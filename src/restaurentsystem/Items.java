package restaurentsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Items {
	private Scanner scan;
	private String name;
	private String price;
	private String quantity;
	private StringBuilder fullnames;
	private String itemName[];
	private String srchName;
	
	public Items() {
		fullnames = new StringBuilder();
		openFile();
		readFile();
		closeFile();
	}
	
	public StringBuilder getFullNames() {
		return fullnames;
	}
	private void openFile() {
		try {
			scan = new Scanner(new File("item.txt"));
			System.out.println("File found!");
		}

		catch (Exception e) {
			System.out.println("File not found");
		}
	}

	private void readFile() {
		try {
			while (scan.hasNextLine()) {
				name = scan.nextLine();
				price = scan.nextLine();
				quantity = scan.nextLine();
				fullnames.append(name + " \t" + price + " \t" + quantity + "\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private void closeFile() {
		scan.close();
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void deleteItem(String dltName) {
		
		String dlt = dltName;
		System.out.println(dlt + "will be deleted");
		int c = 0, track, cnt = 0, temp = 0;
		try {
			Scanner sc = new Scanner(new FileInputStream("item.txt"));
			while (sc.hasNextLine()) {
				cnt++;
				sc.nextLine();
			}
			itemName = new String[cnt];
			sc.close();
			sc = new Scanner(new FileInputStream("item.txt"));
			while (sc.hasNextLine()) {
				itemName[c] = sc.nextLine();
				if (itemName[c].equalsIgnoreCase(dlt)) {
					temp = c;
					System.out.println("Index will be deleted" + c);
				}
				c++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream("item.txt"));
			for (int i = 0; i < c; i++) {
				if (i == temp || i == temp + 1 || i == temp + 2) {
				} else {
					pw.println(itemName[i]);
				}
			}
			System.out.println("Your item has been deleted.");
			pw.close();
		} catch (Exception e) {
		}
	}
	
	public void setSrchName(String srchName) {
        this.srchName = srchName;
    }

	public String getSrchName() {
	        return srchName;
	    }
    public void setPrice(String price) {
        this.price = price;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    public String getPrice() {
        return price;
    }
    
    public String getQuantity() {
        return quantity;
    }

    public void modifyItem(String srcName, String modName,String modPrice,String modQuantity) {
    	
    	this.srchName=srcName;
        this.name=modName;
        this.price=modPrice;        
        this.quantity=modQuantity;
    	
		String srcKey = getSrchName();

		System.out.println(srcKey + "will be modified");

		int c = 0, track, cnt = 0, temp = 0;

		try {
			Scanner sc = new Scanner(new FileInputStream("item.txt"));
			while (sc.hasNextLine()) {
				cnt++;
				sc.nextLine();

			}
			itemName = new String[cnt];
			sc.close();
			sc = new Scanner(new FileInputStream("item.txt"));
			while (sc.hasNextLine()) {
				itemName[c] = sc.nextLine();
				if (itemName[c].equalsIgnoreCase(srcKey)) {
					temp = c;
					System.out.println("Index will be deleted" + c);
				}
				c++;

			}

		} catch (Exception e) {
			System.out.println(e);

		}

		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream("item.txt"));
			for (int i = 0; i < c; i++) {
				if (i == temp || i == temp + 1 || i == temp + 2) {
					pw.println(getName());
					pw.println(getPrice());
					pw.println(getQuantity());
					i += 2;
				} else {
					pw.println(itemName[i]);
				}

			}
			System.out.println("Your item has been deleted.");
			pw.close();
		} catch (Exception e) {
		}

	}
    
    
    //@Override
	public void insert(String Name, String Price, String Quantity) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream("item.txt", true));

			pw.println(Name);
			pw.println(Price);
			pw.println(Quantity);
			pw.close();

		} catch (Exception e) {

		}

	}
    
}
