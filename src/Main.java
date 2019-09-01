import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner sc=new Scanner(System.in);
	static ArrayList<Employee> list=new ArrayList<>();
	
	public static void main(String[] args) 
	{
		
		// By overriding equals and hashcode methods in employee and project class, map overwrites the previous 
		//common data otherwise it will insert the same copy of object
		
		Employee e1=new Employee(111,"AAA",1000,"TL");
		Employee e2=new Employee(111,"AAA",1000,"TL");
		Employee e3=new Employee(333,"CCC",3000,"manager");
		Employee e4=new Employee(444,"DDD",4000,"hr");
		Employee e5=new Employee(555,"EEE",5000,"accountant");
		
		Project p1=new Project(501, "SecApp", 4, "IBM");
		Project p2=new Project(502, "BankApp", 7, "SBI");
		
		Map<Employee, Project> map=new HashMap<>();
		map.put(e1, p1);
		map.put(e2, p2);
		map.put(e3, p1);
		map.put(e4, p2);
		map.put(e5, p1);
		
		for(Map.Entry<Employee, Project> m:map.entrySet())
		{
			System.out.println("Emp Details= "+m.getKey());
			System.out.println(" And Project Details= "+m.getValue());
			System.out.println();
		}
		
		
	}

	
}


/*
 					before overriding output is 
 
 Emp Details= Employee [eno=333, ename=CCC, salary=3000.0, designation=manager]
 And Project Details= Project [pcode=501, pname=SecApp, teamMembers=4, client=IBM]

Emp Details= Employee [eno=444, ename=DDD, salary=4000.0, designation=hr]
 And Project Details= Project [pcode=502, pname=BankApp, teamMembers=7, client=SBI]

Emp Details= Employee [eno=555, ename=EEE, salary=5000.0, designation=accountant]
 And Project Details= Project [pcode=501, pname=SecApp, teamMembers=4, client=IBM]

Emp Details= Employee [eno=111, ename=AAA, salary=1000.0, designation=TL]
 And Project Details= Project [pcode=501, pname=SecApp, teamMembers=4, client=IBM]

Emp Details= Employee [eno=111, ename=AAA, salary=1000.0, designation=TL]
 And Project Details= Project [pcode=502, pname=BankApp, teamMembers=7, client=SBI]


 
						after overriding output is


Emp Details= Employee [eno=555, ename=EEE, salary=5000.0, designation=accountant]
		 And Project Details= Project [pcode=501, pname=SecApp, teamMembers=4, client=IBM]

		Emp Details= Employee [eno=333, ename=CCC, salary=3000.0, designation=manager]
		 And Project Details= Project [pcode=501, pname=SecApp, teamMembers=4, client=IBM]

		Emp Details= Employee [eno=444, ename=DDD, salary=4000.0, designation=hr]
		 And Project Details= Project [pcode=502, pname=BankApp, teamMembers=7, client=SBI]

		Emp Details= Employee [eno=111, ename=AAA, salary=1000.0, designation=TL]
		 And Project Details= Project [pcode=502, pname=BankApp, teamMembers=7, client=SBI]





*/

