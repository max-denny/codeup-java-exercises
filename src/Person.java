public class Person {

    private String name;

    public Person(String personName){
        name = personName;
    }

    public Person(){

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;

    }

    public void sayHello(){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Max");
        person.sayHello();

        Person person1 = new Person("John");  //Define person1 as a new object with the name of John//
        Person person2 = new Person("John"); //Define person2 as a new object with the name of John//
        System.out.println(person1.getName().equals(person2.getName())); //Print: name 'property' of person1 is equal to name 'property' of person2//
        System.out.println(person1 == person2);//Print person 1 is equal to person 2//

        /*Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);*/

        /*Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());*/


    }

}
