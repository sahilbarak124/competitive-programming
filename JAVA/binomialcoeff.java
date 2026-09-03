public class binomialcoeff {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binocoeff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_n_r=factorial(n-r);
        int binocoeff=fact_n/(fact_r*fact_n_r);
        return binocoeff;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int binocoeff=binocoeff(n,r);
        System.out.println(binocoeff);
    }
    
}
