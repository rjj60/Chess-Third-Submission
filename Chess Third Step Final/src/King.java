import javax.swing.ImageIcon;
import java.util.ArrayList;

public class King
    extends ChessGamePiece{
/**
     * Initializes the King.
     *
     * @param board the chess board
     * @param row the row position
     * @param col the column position
     * @param color the piece color (WHITE, BLACK, or UNASSIGNED)
     */
    
    public King( ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color, false );
    }
   /**
     * Calculates all possible moves for the King.
     *
     * @param board the chess board
     * @return a list of possible moves
     */
    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> northEastMoves = calculateNorthEastMoves( board, 1 );
        ArrayList<String> northWestMoves = calculateNorthWestMoves( board, 1 );
        ArrayList<String> southEastMoves = calculateSouthEastMoves( board, 1 );
        ArrayList<String> southWestMoves = calculateSouthWestMoves( board, 1 );
        ArrayList<String> northMoves = calculateNorthMoves( board, 1 );
        ArrayList<String> southMoves = calculateSouthMoves( board, 1 );
        ArrayList<String> eastMoves = calculateEastMoves( board, 1 );
        ArrayList<String> westMoves = calculateWestMoves( board, 1 );
        ArrayList<String> allMoves = new ArrayList<String>();
        allMoves.addAll( northEastMoves );
        allMoves.addAll( northWestMoves );
        allMoves.addAll( southWestMoves );
        allMoves.addAll( southEastMoves );
        allMoves.addAll( northMoves );
        allMoves.addAll( southMoves );
        allMoves.addAll( westMoves );
        allMoves.addAll( eastMoves );
        return allMoves;
    }
    /**
     * Checks if the King is in check.
     *
     * @param board the chess board
     * @return true if in check, false otherwise
     */
    public boolean isChecked( ChessGameBoard board ){
        return getCurrentAttackers( board ).size() > 0;
    }
    /**
     * Creates the icon for the King.
     *
     * @return the King's icon
     */
    @Override
    public ImageIcon createImageByPieceType(){
        if ( getColorOfPiece() == ChessGamePiece.WHITE ){
            return new ImageIcon(
                getClass().getResource("chessImages/WhiteKing.gif")
            );            
        }
        else if ( getColorOfPiece() == ChessGamePiece.BLACK ){
            return new ImageIcon(
                getClass().getResource("chessImages/BlackKing.gif" )
            );            
        }
        else
        {
            return new ImageIcon(
                getClass().getResource("chessImages/default-Unassigned.gif" )
            );            
        }
    }
}
