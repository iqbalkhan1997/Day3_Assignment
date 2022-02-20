public class Empwage {
	public static void main(String args[]){
		System.out.println("Welcome");

			int Emp_Hr=0,Wage_Per_Hr=20,Max_Working_days=20,Total_salary=0;
			for(int day=1;day<=Max_Working_days;day++)
				{

					double Emp_check = Math.floor(Math.random() * 10) % 3;
				int Availability=(int)(Emp_check);

			switch (Availability){
						case 1:
							System.out.println("Employee is working Full Time");
							Emp_Hr=8;
						break;
						case 2:
							System.out.println("Employee is working Part Time");
							Emp_Hr=4;
						break;
						default:
					 		System.out.println("Employee is absent");
							Emp_Hr=0;
						break;
			}
		int Salary=(int)(Wage_Per_Hr * Emp_Hr);
			Total_salary =+Total_salary+Salary;
		}
				System.out.println("Employee's monthly wage is : "+Total_salary+"");
	}
}
