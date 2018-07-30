/*public class Person {

    private String name;

    public Person(){}

    public Person(String personName) {
        name = personName;
    }

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name = name;


    }

    public void sayHello(){
        System.out.println("Hello" + " " + name);

    }

    public static void main(String[] args){

        Person person = new Person();

        /*Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
*/

      /*  Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);
*/
     /* Person person1 = new Person("John");
      Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
*/

/*

        System.out.println(person.getName());
        person.setName("Jim");
        System.out.println(person.getName());
        person.sayHello();

        //Person person2 = new Person("Ted");

        //System.out.println(person2.getName());
        System.out.println(person.getName());
    }

*/

//Solution//

/*public class Person {

    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello" + " " + this.name);
    }

    public static void main(String[] args){

        Person person = new Person();
        person.setName("Gabrielle");
        person.sayHello();

        Person employee = new Person();
        employee.setName("Jennifer");
        employee.sayHello();




    }
}
*/

