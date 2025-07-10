import java.util.Scanner;
public class func {
    void evenodd(int a){
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    int find=a.nextInt();
    func obj=new func();
    obj.evenodd(find);


}    
}
