package employeee;

public class Emp {
	private String name;
	private String city;
	private double salary;
	
	public Emp() {
	}
	   public Emp( String name, String city,double salary) {
			
			this.name = name;
			this.city = city;
			this.salary= salary;
		}
	    public String getDetails() {
			return  name + " " + city+"salary" ;
		}

		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		public int getsalary() {
			return (int) salary ;
		}

		public void setsalary(double salary) {
			this.salary = salary;
		}
		public Object getEmpId() {
			// TODO Auto-generated method stub
			return null;
		}
	}






