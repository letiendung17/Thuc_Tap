public class Java_lang extends Object {
    public static void main(String[] args) {

        Student1 student = new Student1("student",10);
        System.out.println(student.toString());

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8,
                "Carole");
        System.out.println(jimmy);
    }

}

class Student1{
    private String name;
    private int age;

    Student1(String name,int age){
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

//    @Override
//    public String toString() {
//        return "student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    @Override
    public String toString() {
        return name + " is  " + age;
//        return "Student1{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }

}
class PrimarySchoolStudent extends Student1 {

    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
