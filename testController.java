package eReader;

public class testController implements Controller {
	
	private Ebook myEbook;
	
	public testController(Ebook myEbook){
		this.myEbook = myEbook;
	}
	
	public String getPreviousChapter() {
		String result = myEbook.getPrevious();
		return result;
	}
	
	public String getNextChapter() {
		String result = myEbook.getNext();
		return result;
	}
	
	public String getChapter(int volumeNumber, int chapterNumber) {
		myEbook.setCurrent(volumeNumber, chapterNumber);
		String result = myEbook.getCurrent();
		return result;
	}
	
	public String getLinesWithWord(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getTotalOccurrences(String word) {
		// TODO Auto-generated method stub
		return 0;
	}
}
