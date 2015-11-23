package eReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Loader {
	
	private String a;
	private BookNode b;
	private ChapterNode c;
	private Line l;
	private LinkedList<BookNode> myBook;
	
	public Loader (String file) throws Exception{	
	//  C:\Users\alter_000\WarAndPeace.txt
		myBook = new LinkedList<BookNode>();
		readBook(file);		
	}

	public void process(){
		if (a.contains("BOOK ")){
			b = new BookNode(a);
			myBook.add(b);
			System.out.println("added a book");
		} else if (a.contains(" EPILOGUE")){
			b = new BookNode(a);
			myBook.add(b);
			System.out.println("added an epilogue");
		} else if (a.contains("CHAPTER ")){
			c = new ChapterNode(a);
			b.addChapter(c);
			System.out.println("added a chapter");
		} else if (a.equals("")){
			return;
		} else {
			l = new Line(a);
			c.addLine(l);
		}
	}
	
	public void readBook(String s) throws Exception
	{
		String fileName = s;
		String read = null;
		
		try {            
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader =  new BufferedReader(fileReader);            
            while((read = bufferedReader.readLine()) != null) {
            	a = read;
            	process();
            }
            bufferedReader.close();
            System.out.println("done");
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open fileaa '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" + fileName + "'");
        }
	}
	
	public LinkedList<BookNode> getBook(){
		return myBook;
	}
}