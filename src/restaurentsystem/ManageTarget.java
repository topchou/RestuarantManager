package restaurentsystem;

public interface ManageTarget {
	public abstract void insert(String TA ,String b ,String c);
	
	public abstract void modify(int index,String a ,String b ,String c);
	
	
	public abstract void delete(int index);

}
