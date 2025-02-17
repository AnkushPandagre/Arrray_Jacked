import java.util.Scanner;

class TwoDJackedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c, i, j;
        System.out.print("Enter the number of School : ");
         r = sc.nextInt();
          
         int a[][] = new int [r][];
         for(i=0 ; i<=r-1; i++){
            System.out.print("Enter the number of School in class "+ (i + 1) + " : ");
                
            c = sc.nextInt();
            a[i] = new int[c];
         }
        for( i = 0 ; i<=r-1; i++){
               System.out.print("Enter marks of the student of class " + (i+1)+ " :");
               for(j=0 ; j<=a[i].length-1; j++){
                a[i][j] = sc.nextInt();
               }

               }
               System.out.println("Details of the student Are : ");

               for( i = 0 ; i<=r-1; i++){
                for(j=0 ; j<=a[i].length-1; j++){
                   System.out.println(a[i][j]);
                }
                System.out.println();
 
                }
                System.out.println(" - --- -- -----------");
 
    }}