class Employee{
    String name="akhila";
    String role="Java dev";
    int id=205;
    float salary=78000.9f;
}
class Student{
    String name="Varma";
    String branch="EEE";
    int roll=306;
    float cgpa=8.9f;
}
class StuData{
    public static void main(String[] args){
        Employee e=new Employee();
        System.out.println("Name: " +e.name);
        System.out.println("role: " +e.role);
        System.out.println("salary: " +e.salary);
    }
}
