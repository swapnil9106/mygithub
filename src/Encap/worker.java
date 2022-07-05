package Encap;

public class worker {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static void main(String[] args) {
		worker w=new worker();
		w.setName("Swapnil");
		w.setId(102);
		System.out.println(w.getName());
		System.out.println(w.getId());
	}

}
