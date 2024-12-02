import javax.swing.ImageIcon;
import java.util.ArrayList;
/**
 * Represents the Pawn chess piece.
 */
public class Pawn extends ChessGamePiece {
    private boolean notMoved;

    /**
     * Initializes the Pawn.
     * @param board the board
     * @param row the row position
     * @param col the column position
     * @param color the color
     */
    public Pawn(ChessGameBoard board, int row, int col, int color) {
        super(board, row, col, color, true);
        notMoved = true;
        possibleMoves = calculatePossibleMoves(board);
    }
    /**
     * Moves the Pawn.
     * @param board the board
     * @param row the new row
     * @param col the new column
     * @return true if successful
     */
    @Override
    public boolean move( ChessGameBoard board, int row, int col ){
        if ( super.move( board, row, col ) ){
            notMoved = false;
            possibleMoves = calculatePossibleMoves( board );
            if ( ( getColorOfPiece() == ChessGamePiece.BLACK && row == 7 )
                || ( getColorOfPiece() == ChessGamePiece.WHITE && row == 0 ) ){ // pawn has reached the end of the board, promote it to queen
                board.getCell( row, col ).setPieceOnSquare( new Queen(
                    board,
                    row,
                    col,
                    getColorOfPiece() ) );
            }
            return true;
        }
        return false;
    }
    /**
     * Calculates possible moves.
     * @param board the board
     * @return list of moves
     */
    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> moves = new ArrayList<String>();
        if ( isPieceOnScreen() ){
            int currRow =
                getColorOfPiece() == ChessGamePiece.WHITE
                    ? ( pieceRow - 1 )
                    : ( pieceRow + 1 );
            int count = 1;
            int maxIter = notMoved ? 2 : 1;
            // check for normal moves
            while ( count <= maxIter ){ // only loop while we have open slots and have not passed our
              // limit
                if ( isOnScreen( currRow, pieceColumn )
                    && board.getCell( currRow,
                        pieceColumn ).getPieceOnSquare() == null ){
                    moves.add( currRow + "," + pieceColumn );
                }
                else
                {
                    break;
                }
                currRow =
                    ( getColorOfPiece() == ChessGamePiece.WHITE )
                        ? ( currRow - 1 )
                        : ( currRow + 1 );
                count++;
            }
            // check for enemy capture points
            if ( getColorOfPiece() == ChessGamePiece.WHITE ){
                if ( isEnemy( board, pieceRow - 1, pieceColumn - 1 ) ){
                    moves.add( ( pieceRow - 1 ) + "," + ( pieceColumn - 1 ) );
                }
                if ( isEnemy( board, pieceRow - 1, pieceColumn + 1 ) ){
                    moves.add( ( pieceRow - 1 ) + "," + ( pieceColumn + 1 ) );
                }
            }
            else
            {
                if ( isEnemy( board, pieceRow + 1, pieceColumn - 1 ) ){
                    moves.add( ( pieceRow + 1 ) + "," + ( pieceColumn - 1 ) );
                }
                if ( isEnemy( board, pieceRow + 1, pieceColumn + 1 ) ){
                    moves.add( ( pieceRow + 1 ) + "," + ( pieceColumn + 1 ) );
                }
            }
        }
        return moves;
    }
    /**
     * Creates the Pawn's icon.
     * @return the icon
     */
    @Override
    public ImageIcon createImageByPieceType(){
        if ( getColorOfPiece() == ChessGamePiece.WHITE ){
            return new ImageIcon(
                getClass().getResource("chessImages/WhitePawn.gif")
            );            
        }
        else if ( getColorOfPiece() == ChessGamePiece.BLACK ){
            return new ImageIcon(
                getClass().getResource("chessImages/BlackPawn.gif")
            );            
        }
        else
        {
            return new ImageIcon(
                getClass().getResource("chessImages/default-Unassigned.gif")
            );           
        }
    }
}
