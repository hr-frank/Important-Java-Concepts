
//code1_method_overriding_basic_overriding
class Animal
{
    public void move()
    {
        System.out.println("Animals can move");
    }

}

class Dog extends Animal
{
    public void move()
    {
        System.out.println("Dogs can walk and run");
    }
}



public class code01_overriding
{
     public static void main(String args[])
     {
         Animal a =new Animal(); //Animal reference and object 
         Animal b =new Dog();   //Animal reference dog object
         a.move();
         b.move();
     }
}