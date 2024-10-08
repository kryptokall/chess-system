package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[j][j] = (ChessPiece) board.piece(j, j);
            }
        }
        return mat;
    }

}
