import java.util.Scanner;

public class threeDJackedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,i,j, b, r,c;
        System.out.print("Enter the number of School");
        b = sc.nextInt();
        int a[][][] = new int[b][][];
        for(k = 0 ; k<=b-1; k++){
            System.out.println("Enter the number of class in School : " + (k+1));
            r = sc.nextInt();
            a[k] = new int[r][];
        }
        for(k = 0 ; k<=b-1; k++){
            // System.out.print("Enter the nuumbe of ");
            for(i= 0 ; i<=a[k].length-1; i++){
                System.out.println("Enter the student in school "+ (k+1) + " and clases" + (i+1));
                c = sc.nextInt();
                a[k][i] = new int[c];
            }
        }
        for(k = 0 ; k<=b-1; k++){
            // System.out.print("Enter the nuumbe of ");
            for(i= 0 ; i<=a[k].length-1; i++){
                System.out.println("Enter the marks of student of school "+ (k+1) + " and clases" + (i+1) + " : ");
                for(j= 0 ; j<=a[k][i].length-1;j++){
                    a[k][i][j] = sc.nextInt();
                }
                

    }
}
 
System.out.print("Details of the student ");
for(k = 0 ; k<=b-1; k++){
    // System.out.print("Enter the nuumbe of ");
    for(i= 0 ; i<=a[k].length-1; i++){
        for(j= 0 ; j<=a[k][i].length-1;j++){
            System.out.println(a[k][i][j]);
        }
        System.out.println();

}
System.out.println("-------------------------");
}
}
}
