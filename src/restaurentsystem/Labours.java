package restaurentsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Labours implements ManageTarget{
	private int index=1;
	private Scanner scan;
	private String ID;
	private String Name;
	private String Salary;
	private StringBuilder fullnames;
	private String itemName[];
	private String srchID;
	
	public Labours() {
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
			scan = new Scanner(new File("labour.txt"));
			System.out.println("File found!");
		}

		catch (Exception e) {
			System.out.println("File not found");
		}
	}

	private void readFile() {
		try {
			while (scan.hasNextLine()) {
				ID = scan.nextLine();
				Name = scan.nextLine();
				Salary = scan.nextLine();
				fullnames.append(index+"  "+ ID + "  " + Name + "  " + Salary + "\n");
				index++;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void closeFile() {
		scan.close();
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	

	public void setSrchID(String srchID) {
		this.srchID = srchID;
	}
	
	public String getSrchID() {
        return srchID;
    }

	public void setName(String Name) {
        this.Name = Name;
    }
    
    public void setSalary(String Salary) {
        this.Salary = Salary;
    }
    
    public String getName() {
        return Name;
    }
    
    public String getSalary() {
        return Salary;
    }
    
    @Override
	public void modify(int index, String ID, String Name, String Salary) {

		int srcKey = (index - 1) * 3;
		//int srcKey = index;
		//int dlt = (index - 1) * 3;
		System.out.println(srcKey + "will be modified");

		int c = 0, track, cnt = 0, temp = 0;

		try {
			Scanner sc = new Scanner(new FileInputStream("labour.txt"));
			while (sc.hasNextLine()) {
				cnt++;
				sc.nextLine();

			}
			itemName = new String[cnt];
			sc.close();
			sc = new Scanner(new FileInputStream("labour.txt"));
			while (sc.hasNextLine()) {
				itemName[c] = sc.nextLine();
				if (c==srcKey) {
					System.out.println("Index "+ c + " will be deleted" );
				}
				c++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream("labour.txt"));
			for (int i = 0; i < c; i++) {
				if (i == srcKey || i == srcKey + 1 || i == srcKey + 2) {
					pw.println(ID);
					pw.println(Name);
					pw.println(Salary);
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

	@Override
	public void insert(String ID, String Name, String Salary) {
			try {
				PrintWriter pw = new PrintWriter(new FileOutputStream("labour.txt",true));
			
				pw.println(ID);
				pw.println(Name);
				pw.println(Salary);
				pw.close();

			} catch (Exception e) {

			}

    
}

	@Override
	public void delete(int index) {
		int dlt = (index - 1) * 3;
		//String dlt = dltID;
		System.out.println(dlt + "will be deleted");
		int c = 0, track, cnt = 0, temp = 0;

		try {
			Scanner sc = new Scanner(new FileInputStream("labour.txt"));
			while (sc.hasNextLine()) {
				cnt++;
				sc.nextLine();

			}
			itemName = new String[cnt];
			sc.close();
			sc = new Scanner(new FileInputStream("labour.txt"));
			while (sc.hasNextLine()) {
				itemName[c] = sc.nextLine();
				if (c==dlt) {
					System.out.println("Index "+c+" will be deleted " );
				}
				c++;
			}
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream("labour.txt"));
			for (int i = 0; i < c; i++) {
				if (i == dlt || i == dlt + 1 || i == dlt + 2) {
				} else {
					pw.println(itemName[i]);
				}

			}
			System.out.println("Your item has been deleted.");
			pw.close();
		} catch (Exception e) {
		}

	}
}