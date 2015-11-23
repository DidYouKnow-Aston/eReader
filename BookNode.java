package eReader;


import java.util.LinkedList;

public class BookNode {
	
	private LinkedList<ChapterNode> chapters;
	private BookNode previous;
	private BookNode next;
	private String title;
	
	public BookNode(String title){
		this.title = title;
		chapters = new LinkedList<ChapterNode>();
	}

	public void addChapter(ChapterNode newCh){
		chapters.add(newCh);
	}
	
	public void setNextBook(BookNode a){
		next = a;
	}
	
	public void setPreviousBook(BookNode a){
		previous = a;
	}
	
	public String getTitle(){
		return title;		
	}
	
	public ChapterNode getChapter(int index){
		ChapterNode a = chapters.get(index);		
		return a;
	}
	
	public BookNode getPrevious(){
		return previous;
	}
	
	public BookNode getNext(){
		return next;
	}
	
	public int getSize(){
		return chapters.size();
	}
}
