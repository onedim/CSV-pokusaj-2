
public class User<T> implements CSVInterface{
	
	private String name;
	private int age;
	private boolean isJavaProgramer;
	
	public User(String nameInp,int ageInp,boolean isJavaProgramerInp ){
		nameInp=name;
		ageInp=age;
		isJavaProgramerInp=isJavaProgramer;
		
	
	}
	public User	(String nameInp,int ageInp,boolean isJavaProgramerInp){
		nameInp=name;
		ageInp=age;
		isJavaProgramerInp=isJavaProgramer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isJavaProgramer() {
		return isJavaProgramer;
	}
	public void setJavaProgramer(boolean isJavaProgramer) {
		this.isJavaProgramer = isJavaProgramer;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (isJavaProgramer != other.isJavaProgramer)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String objectToCSV() {
		String str=name+", "+age+", "+isJavaProgramer;
		return str;
	}

	@Override
	public void csvToObject(String csv) {
		String[] parts=csv.split(", ");
		this.name=parts[0];
		this.age=Integer.parseInt(parts[1]);
		this.isJavaProgramer=Boolean.parseBoolean(parts[2]);
		
		
	}

	
	
}

