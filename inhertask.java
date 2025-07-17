class animal{
    String name ;
    int age;

    void makesound(){
        System.out.println("Animal makes a sound");
    } 
}
class dog extends animal{
    String breed;

    @Override
    void makesound() {
        System.out.println("Dog barks");
    }
    
    void fetch(){
        System.out.println("Dog is fetching");
    }

    
}
class cat extends animal{
    String color;

    void makesound(){
        System.out.println("cat meows");
    }
    void climb(){
        System.out.println("cat is climbing");
    }
}
public class inhertask{
    public static void main(String[] args){
        animal a1 = new animal();
        dog d1 = new dog();
        a1.name = "deepak";
        a1.age = 50;
        a1.makesound();
        d1.makesound();
    
    }
}
