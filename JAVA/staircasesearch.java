import java.util.*;
public class staircasesearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][] ={{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}
                        };
        int key=sc.nextInt();
        search(matrix,key);
    }
    public static boolean search(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key found at index: "+row+","+col);
                return true;
            }
            else if(key>matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.println("key not found");
        return false;
    }
    
}
