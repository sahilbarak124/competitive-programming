public class primeinrange {
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean primesinrange(int n){
        for(int i=2 ;i<=n;i++){
            if(isPrime(i)){//true
                System.out.print(i+" ");
            }
        }
        
        return true;
    }
    public static void main(String args[]){
        int n=10;
        primesinrange(n);
        
    }
}
