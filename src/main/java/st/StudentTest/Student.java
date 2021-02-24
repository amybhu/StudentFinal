package st.StudentTest;

public class Student {

	private String roll;
	private String name;
	private String stream;
	private String grade;
	private String type;
	
	

	public Student(String roll, String name, String stream, String grade, String type) {
		super();
		this.roll = roll;
		this.name = name;
		this.stream = stream;
		this.grade = grade;
		this.type=type;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", type=" + type +", stream=" + stream + ", grade=" + grade + "]";
	}
	
}
