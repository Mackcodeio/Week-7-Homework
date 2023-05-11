package homework;

// NOTES : Question to big so I didn't put here.

public class Program_17_Person {

    String firstName;
    String lastname;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        if(age <= 0 || age > 100){
            this.age = 0;
        }
    }

    public boolean isTeen(){
        if(age>12 && age <20){
            return true;
        }else {
            return false;
        }
    }

    public String getFullName(){
        // First way 1
        // return getFirstName() +""+getLastName();

        // Second way

        String full_name = getFirstName()+" "+ getLastName();
        return full_name;
    }

    public static void main(String[] args) {
        Program_17_Person person = new Program_17_Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
