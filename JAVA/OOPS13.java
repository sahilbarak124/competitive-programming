public class OOPS13 {
    public static void main(String args[]){
        Queen q= new Queen();
        q.moves();

    }
}
interface chessplayer{
    void moves();
}
class Queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}
class Rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements chessplayer{
    public void moves(){
        System.out.println("one step in any direction");
    }
}
