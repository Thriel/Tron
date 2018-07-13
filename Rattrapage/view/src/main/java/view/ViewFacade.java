package view;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

/**

 */
public class ViewFacade extends JFrame  implements IView {

	private static final long serialVersionUID = 1L;
	private final JPanel game;
	
	public ViewFacade() {
		super();
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game = new JPanel();
		game.setBorder(new EmptyBorder(5, 5, 5, 5));
		game.setBackground(Color.BLACK);
		game.setFocusable(true);
		setVisible(true);
		
	}

    public JPanel() {
    	
		setBackground(Color.BLACK);
		setLayout(new BorderLayout());
		setSize(getW(),getH());
		

    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
