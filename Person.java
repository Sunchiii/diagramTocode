public class Person{
    protected String name;
    protected int age;

    public Person(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }

    private int getAge(){
        return this.age;
    }
    public void printInformation(){
        System.out.println("name = "+ this.name);
        System.out.println("age = "+this.age);
    }
    public static void main(String[] args){
        Person obj = new Person("sun",100);
        
        obj.printInformation();
    }
}
