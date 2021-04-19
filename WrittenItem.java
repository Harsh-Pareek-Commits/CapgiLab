package lab4.lab4_3;

public abstract class WrittenItem extends Item{
    private String author;
	
	public WrittenItem() {
		super();
	    
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void additem(int uid, String title, int no_copies,String author) {
		super.additem(uid, title, no_copies);
		this.author=author;
	}

	@Override
	public void print(Item i) {
		super.print(i);
		System.out.println("Author:" + this.getAuthor());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrittenItem other = (WrittenItem) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}

}
