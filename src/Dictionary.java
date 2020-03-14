import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.StyledDocument;

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

private static DefaultListModel<String> getWords() throws FileNotFoundException {
	
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

private static ArrayList<Words> getWordClass() throws FileNotFoundException {
	
        Gson gson = new Gson();
        String classpathDirectory = Utils.getClasspathDir();
        BufferedReader br = new BufferedReader(new FileReader(classpathDirectory + "words.json"));
        
        Words[] words = gson.fromJson(br, Words[].class);
        ArrayList<Words> listOfWords = new ArrayList<Words>();
        for (Words word : words) {
          listOfWords.add(word);
          
        }
       ;
       
        return listOfWords;
        
  }

public Dictionary() throws FileNotFoundException, BadLocationException {
	
	initialize(); 
	
}

private void initialize() throws FileNotFoundException, BadLocationException {
	
    frmDictionary = new JFrame();
    frmDictionary.setResizable(false);
    frmDictionary.setTitle("Dictionary");
    frmDictionary.setBounds(100, 100, 800, 600);
    frmDictionary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmDictionary.getContentPane().setLayout(null);
        
    JPanel panel = new JPanel();
    panel.setBounds(207, 11, 566, 549);
    frmDictionary.getContentPane().add(panel);
    panel.setLayout(new CardLayout(0, 0));
    
    JScrollPane scrollPane_3 = new JScrollPane();
    panel.add(scrollPane_3, "addWord");
    
    JPanel panel_1 = new JPanel();
    panel_1.setToolTipText("");
    panel_1.setBackground(Color.WHITE);
    scrollPane_3.setViewportView(panel_1);
    panel_1.setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Word*");
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
    lblNewLabel.setBounds(10, 11, 117, 54);
    panel_1.add(lblNewLabel);
    
    textField = new JTextField();
    textField.setToolTipText("word");
    textField.setBounds(20, 76, 286, 20);
    panel_1.add(textField);
    textField.setColumns(10);
    
    JButton btnNewButton_2 = new JButton("Add");
    btnNewButton_2.setBounds(465, 513, 89, 23);
    panel_1.add(btnNewButton_2);
    
    JLabel lblDefinitions = new JLabel("Definitions*");
    lblDefinitions.setFont(new Font("Tahoma", Font.BOLD, 32));
    lblDefinitions.setBounds(10, 107, 199, 54);
    panel_1.add(lblDefinitions);
    
    txtDefinitions = new JTextField();
    txtDefinitions.setToolTipText("Definitions");
    txtDefinitions.setColumns(10);
    txtDefinitions.setBounds(20, 182, 286, 20);
    panel_1.add(txtDefinitions);
    
    textField_2 = new JTextField();
    textField_2.setToolTipText("Part of Speech");
    textField_2.setColumns(10);
    textField_2.setBounds(346, 182, 147, 20);
    panel_1.add(textField_2);
    
    JLabel lblPartOfSpech = new JLabel("Parts of Speech*");
    lblPartOfSpech.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblPartOfSpech.setBounds(336, 130, 157, 20);
    panel_1.add(lblPartOfSpech);
    
    JLabel lblSynonyms = new JLabel("Synonyms");
    lblSynonyms.setFont(new Font("Tahoma", Font.BOLD, 32));
    lblSynonyms.setBounds(10, 213, 184, 54);
    panel_1.add(lblSynonyms);
    
    textField_1 = new JTextField();
    textField_1.setToolTipText("synonym");
    textField_1.setColumns(10);
    textField_1.setBounds(20, 287, 286, 20);
    panel_1.add(textField_1);
    
    JLabel lblSeperateByComma = new JLabel("Seperate by comma");
    lblSeperateByComma.setFont(new Font("Tahoma", Font.PLAIN, 12));
    lblSeperateByComma.setBounds(20, 264, 137, 20);
    panel_1.add(lblSeperateByComma);
    
    JLabel label = new JLabel("Seperate by comma");
    label.setFont(new Font("Tahoma", Font.PLAIN, 12));
    label.setBounds(20, 157, 137, 20);
    panel_1.add(label);
    
    JLabel label_1 = new JLabel("Seperate by comma");
    label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
    label_1.setBounds(346, 161, 137, 20);
    panel_1.add(label_1);
    
    JLabel label_2 = new JLabel("Seperate by comma");
    label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
    label_2.setBounds(20, 369, 137, 20);
    panel_1.add(label_2);
    
    JLabel lblAntonyms = new JLabel("Antonyms");
    lblAntonyms.setFont(new Font("Tahoma", Font.BOLD, 32));
    lblAntonyms.setBounds(10, 318, 184, 54);
    panel_1.add(lblAntonyms);
    
    textField_3 = new JTextField();
    textField_3.setToolTipText("antonyms");
    textField_3.setColumns(10);
    textField_3.setBounds(20, 400, 286, 20);
    panel_1.add(textField_3);
    
    JLabel lblRequred = new JLabel("* = required");
    lblRequred.setFont(new Font("Tahoma", Font.PLAIN, 12));
    lblRequred.setBounds(20, 513, 137, 20);
    panel_1.add(lblRequred);
    
    JScrollPane scrollPane_2 = new JScrollPane();
    panel.add(scrollPane_2, "defintions");
    
    CardLayout cardLayout = (CardLayout) panel.getLayout();
    cardLayout.show(panel, "defintions");
    
    JTextPane textPane = new JTextPane();
    textPane.setEditable(false);
    scrollPane_2.setViewportView(textPane);

    StyledDocument doc = textPane.getStyledDocument();
    DefaultCaret caret = (DefaultCaret) textPane.getCaret();
    caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
    textPane.setBorder(BorderFactory.createCompoundBorder(
        textPane.getBorder(),
            BorderFactory.createEmptyBorder(10, 10 ,10 , 10)));
     