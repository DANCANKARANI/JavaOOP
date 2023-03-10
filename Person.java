public class Person {
     String name;
     int age;
     /*Constructor of class person*/
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    /*declaring GetName methonds */
    public void GetName(String name){
        this.name=name;
    }
    /*Declaring GetAge methods */
    public void GetAge(int age){
        this.age=age;
    }
    /*declaring the setName Method */
    public String SetName(String name){
        return name;
    }
    /*Declaring the SetAge Method */
    public int SetAge(int age){
        return age;
    }
    public static void main(String[] args) {
        Person person=new Person("Dancan", 40);
        System.out.println(person.name);
        /*this modifies the value of the age */
        person.GetAge(20);
        System.out.println(person.age);
        /*This modifies the value fo age */
        person.GetAge(56);
        System.out.println(person.age);
        /*Sets new name */
        int Age=person.SetAge(21);
        System.out.println(Age);
    }
}
