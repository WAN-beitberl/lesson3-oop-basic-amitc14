
public class BookChapter {

	String chapName;
	int page;
	
	public BookChapter(String chapName, int page) {
		this.chapName = chapName;
		this.page = page;
	}
	public String getName() {
		return this.chapName;
	}
	public int getPage() {
		return this.page;
	}
	public void setName(String name){
		this.chapName = name;
	}
	public void setPage(int page) {
		this.page = page;
	}
}
