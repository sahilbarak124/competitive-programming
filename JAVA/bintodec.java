public class bintodec {
    public static void binaryToDecimal(int binNum) {
        int Mynum =binNum;
        int pow =0;
        int decNum =0;
        while(binNum>0){
            int lastdigit=binNum%10;
            decNum= decNum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimalof"+binNum+" ="+decNum);
        System.out.println("binary num="+Mynum);
    }    
    public static void main(String args[]){
        binaryToDecimal(101);
    }
    
}
