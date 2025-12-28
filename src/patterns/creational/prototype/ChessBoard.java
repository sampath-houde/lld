package patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard implements Protoype<ChessBoard> {

    List<ChessPiece> pieces = new ArrayList<>();

    void addPiece(ChessPiece piece) {
        pieces.add(piece);
    }

    void addPieces(List<ChessPiece> pieces) {
        pieces.addAll(pieces);
        System.out.println("Pieces were added " + pieces);
    }

    void getState() {
        for (ChessPiece piece: pieces) {
            System.out.println(piece);
        }
    }

    List<ChessPiece> getPieces() {
        return pieces;
    }


    @Override
    public ChessBoard clone() {
        ChessBoard chessBoard = new ChessBoard();
        for (ChessPiece piece: pieces) {
            chessBoard.addPiece(piece.clone());
        }
        return chessBoard;
    }
}
