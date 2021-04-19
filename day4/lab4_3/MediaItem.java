package lab4.lab4_3;

public class MediaItem extends Item{
private int runtime;
	
	public int getRuntime() {
	return runtime;
}

public void setRuntime(int runtime) {
	this.runtime = runtime;
}

	public MediaItem() {
		super();
		
	}


	
	public void additem(int uid, String title, int no_copies,int runtime) {
		super.additem(uid, title, no_copies);
		this.runtime=runtime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + runtime;
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
		MediaItem other = (MediaItem) obj;
		if (runtime != other.runtime)
			return false;
		return true;
	}

}
