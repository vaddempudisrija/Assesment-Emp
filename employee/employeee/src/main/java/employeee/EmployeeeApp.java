package employeee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;



public class EmployeeeApp {
	private static final Object EmpId = null;

	public EmployeeeApp() {
	}

	public String addEmployeeApp(Emp e) {

		if (EmpDb.getDb().containsKey(e.getEmpId())) {
			return EmpDb.getDb().get(EmpId).getDetails();
		} else {
			EmpDb.put(e.getEmpId(), e);
			return "No Employeee found";
		}
	}

	

	public String findEmployeee(int empId ) {
		if(EmpDb.db.containsKey(empId())) {
			return EmpDb.getDb().get(EmpId).getDetails();
		}
		else
		{
			return "No Employee found";
			
			
		}
	}

	private Object empId() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
