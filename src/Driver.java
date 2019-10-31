import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Piece> pieceList = new ArrayList<Piece>();
        pieceList.add(new Pawn(true, false, null));
        pieceList.add(new Knight(true));
        pieceList.add(new Bishop(true));
        pieceList.add(new Rook(false));
        pieceList.add(new Queen(false));
        pieceList.add(new King(false));

        for(Piece piece: pieceList){
            piece.move();
        }

        Piece p1 = new Pawn(true, true, new Queen(false));
        Piece p2 = new Pawn(true, false, null);
        Piece p3 = new Pawn(false, false, null);
        Piece p4 = new Pawn(false, true, new Queen(false));
        Piece p5 = new Pawn(true, true, new Knight(true));

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));

    }
}
