package application;

import java.io.File;

import javafx.scene.control.TreeItem;

public class Explorer_Files {

	private File file ;
	private TreeItem<String> item ;
	
	public Explorer_Files() {
		
	}
	
	public Explorer_Files ( File file , TreeItem<String>item ) {
		this.file = file ;
		this.item = item ;
	}
	
	public File getFile () { 
		return file ;
	}
	
	public TreeItem<String> getItem () {
		return item ;
	}
	
	public void SetFile ( File file ) { 
		this.file = file  ;
	}
	
	public void SetItem ( TreeItem<String> item2 ) {
		this.item = item2 ;
	}
}
