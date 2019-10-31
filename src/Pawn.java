public class Pawn extends Piece {

    private boolean promoted;
    private Piece newPiece;

    public Pawn(boolean isWhite, boolean promoted, Piece newPiece) {
        super(1, isWhite);
        this.promoted = promoted;
        if(newPiece != null) {
            this.promote(newPiece);
        }
    }

    public void promote(Piece newPiece){
        this.setValue(newPiece.getValue());
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public Piece getNewPiece() {
        return newPiece;
    }

    public void setNewPiece(Piece newPiece) {
        this.newPiece = newPiece;
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString() {
        return "Pawn{value='" + getValue() + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Piece)) return false;
        Pawn piece = (Pawn) o;
        return getValue() == piece.getValue() &&
                isWhite()== piece.isWhite() &&
                isPromoted() == piece.isPromoted();
    }
}
