package restaurentsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Labours {
	private Scanner scan;
	private String ID;
	private String Name;
	private String Salary;
	private StringBuilder fullnames;
	private String itemName[];
	private String srchName;
	
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
				fullnames.append(ID + " \t" + Name + " \t" + Salary + "\n");
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

	public void deleteLabour(String dltID) {

		String dlt = dltID;
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
			PrintWriter pw = new PrintWriter(new FileOutputStream("labour.txt"));
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

	public String getSrchName() {
        return srchName;
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
    
	public void ModifyItem() {

		String srcKey = getSrchName();

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
			PrintWriter pw = new PrintWriter(new FileOutputStream("labour.txt"));
			for (int i = 0; i < c; i++) {
				if (i == temp || i == temp + 1 || i == temp + 2) {
					pw.println(getID());
					pw.println(getName());
					pw.println(getSalary());
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
}