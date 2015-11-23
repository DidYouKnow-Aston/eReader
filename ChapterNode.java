package eReader;

import java.util.LinkedList;

public class ChapterNode {

	private String title;
	private LinkedList<Line> lines;
	private ChapterNode previous;
	private ChapterNode next;
	
	public ChapterNode(String title){
		lines = new LinkedList<Line>();
		this.title = title;
	}
	
	public void addLine(Line newLn){
		lines.add(newLn);
	}
	public void setNext(ChapterNode a){
		next = a;
	}
	
	public void setPrevious(ChapterNode a){
		previous = a;
	}
	
	public ChapterNode getPrevious(){
		return previous;
	}
	
	public ChapterNode getNext(){
		return next;
	}
	
	public Line getLine(int index){
		Line l = lines.get(index);
		return l;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String toString(){
		String result = "";
		result += title + "\n" + "\n";
		for (Line a : lines){
			String str = a.toString() + "\n";
			result += str;
		}
		return result;
	}
}
