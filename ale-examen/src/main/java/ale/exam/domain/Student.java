package ale.exam.domain;

public abstract class Student {

	protected Character gender;
	protected String updateDate;
	protected String name;

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(Character gender, String updateDate, String name) {
		super();
		this.gender = gender;
		this.updateDate = updateDate;
		this.name = name;
	}

	
}
