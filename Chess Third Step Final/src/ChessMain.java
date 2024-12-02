import javax.swing.*;

/**
 * Shows the GUI for the Chess game.

 */
public class ChessMain{
   
    /**
     * Creates the GUI for Chess.
     * 
     * @param args
     *            command line arguments, not used
     */
    public static void main( String[] args ){
        JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( new ChessPanel() );
        frame.pack();
        frame.setVisible( true );
    }
}
