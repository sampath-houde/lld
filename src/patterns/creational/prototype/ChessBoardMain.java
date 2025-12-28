package patterns.creational.prototype;

public class ChessBoardMain {
    public static void main(String[] args) {

        ChessPiece piece1 = new ChessPiece("Black", 1);
        ChessPiece piece2 = new ChessPiece("White", 1);

        ChessBoard originalBoard = new ChessBoard();
        originalBoard.addPiece(piece1);
        originalBoard.addPiece(piece2);
        originalBoard.getState();

        ChessBoard duplicateBoard = originalBoard.clone();
        duplicateBoard.getState();

        originalBoard.addPiece(new ChessPiece("Red", 1));

        originalBoard.getState();
        duplicateBoard.getState();


    }
}
