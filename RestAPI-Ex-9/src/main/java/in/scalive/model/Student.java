package in.scalive.model;

public class Student {
	private Integer id;
	private String name;
	private double per;

	public Student(Integer id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}

	public Student() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}
	
}
