public class Person {
    // write code
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String a){
        this.firstName = a;
    }
    public void setLastName(String b){
        this.lastName = b;
    }
    public void setAge(int age){
        if(age<0||age>100){
            this.age = 0;
        }else
            this.age = age;
    }

    public boolean isTeen(){
        if(age>12 && age<20){
            return true;
        }
        return false;
    }
    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (lastName.isEmpty()) {
            return firstName;
        } else if (firstName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
