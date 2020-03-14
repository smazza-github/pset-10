import java.awt.EventQueue;
import java.io.FileNotFoundException;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Dictionary {
	
	  private JFrame frmDictionary;
	  private JTextField txtSearch;
	  private final ButtonGroup buttonGroup = new ButtonGroup();
	  private JTextField textField;
	  private JTextField txtDefinitions;
	  private JTextField textField_2;
	  private JTextField textField_1;
	  private JTextField textField_3;
	  
	  public static void main(String[] args) throws FileNotFoundException {
		  
	  }
		    getWords();
		    
		    EventQueue.invokeLater(new Runnable() {
		    	
		      public void run() {
		    	  
		        try {
		        	
		          Dictionay window = new Dictionay();
		          window.frmDictionary.setVisible(true);
		          
		        } catch (Exception e) {
		        	
		          e.printStackTrace();
		          
		        }
		      }
		    }
		  }