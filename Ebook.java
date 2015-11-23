import java.util.LinkedList;

public class Ebook {

	private LinkedList<BookNode> books;
	private int currentBook;
	private int currentChapter;
	private int maxBook;
	private int[] maxChapter;
	
	public Ebook(LinkedList <BookNode> books){
		this.books = books;
		maxBook = books.size();
		maxChapter = new int[maxBook];
		for (int i = 0; i < maxBook; i++){
			maxChapter[i] = books.get(i).getSize();
		}
	}
	
	public void setCurrent(int book, int chapter){
		currentBook = book - 1;
		currentChapter = chapter - 1;
	}
	
	public String getCurrent(){
		String str = books.get(currentBook).getChapter(currentChapter).toString();
		return str;
	}
	
	public String getNext(){
		if (currentChapter < maxChapter[currentBook]){
			currentChapter++;
			setCurrent(currentBook, currentChapter);
		} else if (currentChapter == maxChapter[currentBook] && currentBook < maxBook){
			currentChapter = 1;
			currentBook++;
			setCurrent(currentBook, currentChapter);
		}
		String str = getCurrent();
		return str;
	}
	
	public String getPrevious(){
		if (currentChapter > 1){
			currentChapter--;
			setCurrent(currentBook, currentChapter);
		} else if (currentChapter == 1 && currentBook > 1){
			currentBook--;
			currentChapter = maxChapter[currentBook];
			setCurrent(currentBook, currentChapter);
		}
		String str = getCurrent();
		return str;
	}
}