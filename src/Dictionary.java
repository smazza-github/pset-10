import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.google.gson.Gson;

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
		    });
		  }

private static DefaultListModel<String> getWords() throws FileNotFoundException{
	
        Gson gson = new Gson();
        String classpathDirectory = Utils.getClasspathDir();
        BufferedReader br = new BufferedReader(new FileReader(classpathDirectory + "words.json"));
        Words[] words = gson.fromJson(br, Words[].class);
        System.out.println(words.length + " words added");
        DefaultListModel<String> listOfWords = new DefaultListModel<String>();
        for (Words word : words) {
          listOfWords.addElement(word.getWord().toLowerCase());
        }
       ;
        return  Utils.sortWordsAsc(listOfWords);
  }
        
        