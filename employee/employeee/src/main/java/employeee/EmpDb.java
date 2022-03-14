package employeee;

import java.util.HashMap;

public class EmpDb {
static HashMap<Integer, Emp> db;
static {
		db=new HashMap<Integer, Emp>();
		db.put(100, new Emp("Shantanu", "Hyderabad", 45000));
		db.put(101, new Emp("Pavan", "Hyderabad", 45000));
		db.put(102, new Emp("Arun", "Chennai", 45000));
		db.put(103, new Emp("Raja", "Chennai", 45000));
		db.put(104, new Emp("Ranga", "Bangalore", 45000));
		db.put(105, new Emp("Pretham", "Bangalore", 45000));
		db.put(106, new Emp("Chandra", "Pune", 45000));
		db.put(107, new Emp("Vamshi", "Pune", 45000));
	}
public static HashMap<Integer, Emp> getDb() {
	return db;
}
public static void setDb(HashMap<Integer, Emp> db) {
	EmpDb.db = db;
}
public static void put(Object empId, Emp e) {
	
}


}


