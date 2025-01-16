

package task6;

public class Person {
	
	private	String name;
	private	int age;


public Person(String name, int age) //created constructor for the class
	{
	this.name=name;
	this.age=age;

}
public String getName() //Get method is used to get name
{
	return name;
	
}
public int getage() //get method is used to get age
{
	return age;
	
}
public void setname(String name) //set the name
{
	this.name=name;
}
public void setage(int age) //set the age
{
	this.age=age;
}
}
