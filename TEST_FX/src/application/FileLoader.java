package application;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileLoader {

    @FXML private Button load_file;
    @FXML private TextArea text_display ;
    @FXML private TreeView package_exp ;
    
          private ArrayList < Explorer_Files > package_content = new ArrayList() ;
          private TreeItem<String> rootFile = new TreeItem("explorer") ;
          
    
          private BufferedReader reader ;
		  private String Line = null ;
    
    @FXML
    private void LoadFile()   {  

    	FileChooser filechooser = new FileChooser () ;
    	
    	filechooser.setTitle("please choose a file ");
    	
    	File file = filechooser.showOpenDialog(null) ;
    	
    	if (file == null) return  ;
    	
    	else
    	{
    		
    		Explorer_Files document = new Explorer_Files(file, new TreeItem(file.getName()));
    		package_content.add(document);
    		
    		try {
    			
    			 reader = new BufferedReader( new FileReader ( file ) )  ;
    			 StringBuilder content = new StringBuilder () ;
    			 
    			 while ( ( Line = reader.readLine() ) != null)
    			  content.append(Line).append("\n") ;
    			 
    			 text_display.setText( content.toString() );
    			
    			
    		}
    		catch ( Exception e ) {
    			e.getStackTrace() ;
    		}
    		
    		rootFile.getChildren().add(document.getItem());
    		package_exp.setRoot(rootFile);
    		
     	}
    	
    }
	
    @FXML
    private void SelectFile() throws IOException {
    	
    	
    	
    	Object item = package_exp.getSelectionModel().getSelectedItem() ;
    	
    	//int index = package_exp.getRow( (TreeItem<String> ) item ) ;
    	
    	if ( item != null ) {
    		
			 /*reader = new BufferedReader( new FileReader ( package_content.get(index).getFile() ) )  ;
			 StringBuilder content = new StringBuilder () ;
			 
			 while ( ( Line = reader.readLine() ) != null)
			  content.append(Line).append("\n") ;
			 
			 text_display.setText( content.toString() );*/
    		
    		for ( Explorer_Files item_display : package_content ) {
    			
    			    
    			   if ( item == item_display.getItem() ) {
    				   
    	    			 reader = new BufferedReader( new FileReader ( item_display.getFile() ) )  ;
    	    			 StringBuilder content = new StringBuilder () ;
    	    			 
    	    			 while ( ( Line = reader.readLine() ) != null)
    	    			  content.append(Line).append("\n") ;
    	    			 
    	    			 text_display.setText( content.toString() );
    			   }
   			
   		        }
    		
    	}
    	
    }
    
}
