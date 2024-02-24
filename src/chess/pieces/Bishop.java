package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString (){
        return "B";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getCollums()];
        
        Position p = new Position(0, 0);

        //nw 
        p.setValues(position.getRow() - 1 , position.getCollum()-1);;
        
        while ( getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
            p.setValues(p.getRow()-1, p.getCollum()-1);
        }
        if ( getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        // ne
        p.setValues(position.getRow()-1, position.getCollum()+1);;
        
        while ( getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
            p.setValues(p.getRow()-1, p.getCollum()+1);;
        }
        if ( getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //se
        p.setValues(position.getRow()+1, position.getCollum()+1);;
        
        while ( getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
            p.setValues(p.getRow()+1, p.getCollum()+1);;
        }
        if ( getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }

        //sw
        p.setValues(position.getRow() + 1 , position.getCollum()-1);;
        
        while ( getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
            p.setValues(p.getRow()+1, p.getCollum()-1);;
        }
        if ( getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getCollum()] = true;
        }
        
        return mat;
    }
}