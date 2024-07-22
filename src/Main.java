public class Main extends Object{
    public static void main(String[] args) {
        Student max = new Student("Max",21);
        System.out.println(max);

        primarySchoolStudent jimmy = new primarySchoolStudent("Jimmy",22,"Sang");
        System.out.println(jimmy);
    }
}
class Student{
    private String name;
    private int age;


    Student(String name,int age) {
        this.name= name;
        this.age =age;
    }

    @Override
    public String toString() {
        return name + " is "+age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class primarySchoolStudent extends Student{
    private String parentName;

    primarySchoolStudent(String name ,int age ,String parentName) {
        super(name,age);
        this.parentName =parentName;

    }

    @Override
    public String toString() {
        return parentName + "'s kid ," +super.toString();
    }
}