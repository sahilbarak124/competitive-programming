public class pattern2{
    public static void invhalfpyr(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
        System.out.println();    
        }

    }
    public static void main(String args[]){
        invhalfpyr(6);
    }

}
