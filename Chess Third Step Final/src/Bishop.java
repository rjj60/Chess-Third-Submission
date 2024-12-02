import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * Represents a Bishop chess piece.
 */
public class Bishop extends ChessGamePiece {

    /**
     * Initializes the Bishop.
     *
     * @param board the chess board
     * @param row the row position
     * @param col the column position
     * @param color the piece color (WHITE, BLACK, or UNASSIGNED)
     */
    public Bishop(ChessGameBoard board, int row, int col, int color) {
        super(board, row, col, color);
    }

    /**
     * Calculates all possible moves for the Bishop.
     *
     * @param board the chess board
     * @return a list of possible moves
     */
    @Override
    protected ArrayList<String> calculatePossibleMoves(ChessGameBoard board) {
        ArrayList<String> northEastMoves = calculateNorthEastMoves(board, 8);
        ArrayList<String> northWestMoves = calculateNorthWestMoves(board, 8);
        ArrayList<String> southEastMoves = calculateSouthEastMoves(board, 8);
        ArrayList<String> southWestMoves = calculateSouthWestMoves(board, 8);
        ArrayList<String> allMoves = new ArrayList<>();
        allMoves.addAll(northEastMoves);
        allMoves.addAll(northWestMoves);
        allMoves.addAll(southEastMoves);
        allMoves.addAll(southWestMoves);
        return allMoves;
    }

    /**
     * Creates the icon for the Bishop based on its color.
     *
     * @return the Bishop's icon
     */
    @Override
    public ImageIcon createImageByPieceType() {
        if (getColorOfPiece() == ChessGamePiece.WHITE) {
            return new ImageIcon(getClass().getResource("chessImages/WhiteBishop.gif"));
        } else if (getColorOfPiece() == ChessGamePiece.BLACK) {
            return new ImageIcon(getClass().getResource("chessImages/BlackBishop.gif"));
        } else {
            return new ImageIcon(getClass().getResource("chessImages/BlackBishop.gif"));
        }
    }
}
