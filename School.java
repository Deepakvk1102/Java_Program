import java.util.Scanner;
public class School {
    void passorfail(int a){
        if(a>50){
        System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }
public static void main(String[] args) {
    Scanner mark=new Scanner(System.in);
    int a=mark.nextInt();
    //access the class we need to create the object
    School demo=new School();
    //with object we can access the  method 
    demo.passorfail(a);
}
    
}
