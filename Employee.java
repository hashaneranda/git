/* ************FOR PRACTICAL 3 ,EXERCISE 3-1 *****************
INDEX-NO: BSC-UCD-CSC-16.2-009
*/

public class Employee{
  private String name;
  private int age;
  private double salary;

  public Employee(String name,int age,double salary){
    this.name=name;
    this.age=age;
    this.salary=salary;
  }



  //set value for variable name
  public void setName(String n){
    this.name=n;
  }
  //set value for variable age
  public void setAge(int a){
    this.age=a;
  }
  //set value for variable salary
  public void setSalary(double s){
    this.salary=s;
  }

  //get the value stored in variable name
  public String getName(){
    return name;
  }
  //get the value stored in variable age
  public int getAge(){
    return age;
  }
  //get the value stored in variable salary
  public double getSalary(){
    return salary;
  }


}
