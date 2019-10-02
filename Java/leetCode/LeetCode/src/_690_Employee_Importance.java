import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _690_Employee_Importance {
	
	
//	Runtime: 59 ms, faster than 5.29% of Java online submissions for Employee Importance.
//	Memory Usage: 50.8 MB, less than 9.52% of Java online submissions for Employee Importance.
    public int getImportance(List<Employee> employees, int id) {
    
    	int importance = 0;
    	if(employees == null ) return 0;
    	
    	Employee employee = findeEmployee(employees, id);
    	
    	if(employee == null) return 0;
    	
    	importance+=employee.importance;
    	
    	if(employee.subordinates != null) {
    	
	      importance+=subordinatesImportance(employee.subordinates, employees);
    	}
    	
    	return importance;
    }
    
    public int subordinatesImportance(List<Integer> sub,List<Employee> employees) {
    	
    	int imp = 0;
    	
    	for(int emp : sub) {
    		Employee aux =  findeEmployee(employees, emp);
    		
    		imp+=aux.importance;
    		
    		if(aux.subordinates != null && aux.subordinates.size() != 0) {
    			imp += subordinatesImportance(aux.subordinates, employees);
    		}
    		
    	}
    	
    	return imp;
    }
    
    
    public Employee findeEmployee(List<Employee> employees, int id) {
    	
    	return employees.stream().filter(e->e.id == id).findFirst().orElse(null);
    }
    
    
    
    @Test
    public void case1() {
    	
//    	Input: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
    	

    	Employee a = new Employee();
    	a.id = 1;
    	a.importance = 5;
    	List<Integer> aa = new ArrayList<>();
    	aa.add(2);
    	aa.add(3);
    	a.subordinates = aa; 

    	Employee b = new Employee();
    	b.id = 2;
    	b.importance = 3;
//    	List<Integer> bb = new ArrayList<>();
//    	bb.add(2);
//    	bb.add(3);
//    	b.subordinates = bb; 
    	
    	Employee c = new Employee();
    	c.id = 3;
    	c.importance = 3;
//    	List<Integer> cc = new ArrayList<>();
//    	cc.add(2);
//    	cc.add(3);
//    	c.subordinates = cc; 
    	
    	List<Employee> employees = new ArrayList<>();
    	employees.add(a);
    	employees.add(b);
    	employees.add(c);
    	
    	
    	assertEquals(11,getImportance(employees,1));
    }
    
    
    
    @Test
    public void case2() {
    	
        
//        [
	//    	  [1,5,[2,3]],
	//    	  [2,3,[4]],
	//    	  [3,4,[]],
	//    	  [4,1,[]]
//    	  ]
//        		1

    	Employee a = new Employee();
    	a.id = 1;
    	a.importance = 5;
    	List<Integer> aa = new ArrayList<>();
    	aa.add(2);
    	aa.add(3);
    	a.subordinates = aa; 

    	Employee b = new Employee();
    	b.id = 2;
    	b.importance = 3;
    	List<Integer> bb = new ArrayList<>();
    	bb.add(4);
//    	bb.add(3);
    	b.subordinates = bb; 
    	
    	Employee c = new Employee();
    	c.id = 3;
    	c.importance = 4;
//    	List<Integer> cc = new ArrayList<>();
//    	cc.add(2);
//    	cc.add(3);
//    	c.subordinates = cc; 
    	
    	Employee d = new Employee();
    	d.id = 4;
    	d.importance = 1;
    	
    	List<Employee> employees = new ArrayList<>();
    	employees.add(a);
    	employees.add(b);
    	employees.add(c);
    	employees.add(d);
    	
    	
    	assertEquals(13,getImportance(employees,1));
    }
    
    
    
    


    
    
    
    
    
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    };
}
