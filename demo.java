public class demo {
    public static void main(String[] args) {

//-------------------1D ARRAY---------------------
    // String[] name= new String[3];
    // name[0]="deepz";
    // name[1]="bharani";
    // name[2]="gokul";
    // System.out.println(name[2]);

    // String[] name={"deepz","bharani","gokul","dhachu"};
    // System.out.println(name[2]);


//-----------------2D ARRAY----------------
    int[][] matrix=new int[5][2];
    matrix[0][0]=1;
    matrix[0][1]=2;
    matrix[4][0]=5;

    for(int i=0;i<5;i++){
        for(int j=0;j<2;j++){
            System.out.print(matrix[i][j]);
        }
        System.out.println( );
    }


    }
    
}
