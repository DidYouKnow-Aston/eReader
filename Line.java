package eReader;

public class Line {
	
	private String content;
	private String[] words;
	
	public Line(String content){
		this.content = content;
		process();
	}
	
	private void process(){
		words = content.split("\\s");
	} 
	
	public int lookFor(String key){
		int result = 0;
		for (String a : words){
			if (a.equals(key)){
				result++;
			}
		}
		return result;
	}
	
	public String toString(){
		return content;
	}	
}