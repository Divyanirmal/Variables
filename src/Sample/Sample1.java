package Sample;

public class Sample1
{
public static void main(String[] args)
{
	//Variable Declaration
	//(allocating/Reserving Memory)
	String studentname; //String=datatype studentname=varible name
	String studentDept;//divya,computer,divyanirmal@gmail,xyz,A+-->multiplecharcters--.String
	int studentRoll;  //100,5,1000,50,000-->numeric+non-Decimal-->int
	float studentPer;  //1.5,2.5,50,000.2-->numeric+decimal-->float
	char studentGrade; //A,B,C,D-->single characters-->char
	
	//2.Variable Initialization(Assigning or inserting value)
	studentname="Divya";//studentname=variable name "Divya"="variable value";
	studentDept="Computer";
	studentRoll=42;
	studentPer=8.29f;
	studentGrade='A';
	//3.Variable usage
	System.out.println(studentname);
	System.out.println(studentname);//Information Reuse
	System.out.println(studentDept);
	System.out.println(studentRoll);
	System.out.println(studentPer);
	System.out.println(studentGrade);
}

}
