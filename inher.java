class laptop{
    String name= "bharani";
    String s = "deepak";
}
class pc extends laptop{
    int num = 15;

    pc() {
        System.out.println("harinder");
    }

    
}

public class inher{
    public static void main(String[] args) {
        pc l1 = new pc();
      
        System.out.println(l1.name);
        System.out.println(l1.num);

    }
}




