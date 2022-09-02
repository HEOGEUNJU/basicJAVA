package exercise08;

public class Poet extends Book{

	public Poet(String title, String autor) {
		super(title, autor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getLateFee(int lateDays) {
		
		return lateDays*200;
	}

}
