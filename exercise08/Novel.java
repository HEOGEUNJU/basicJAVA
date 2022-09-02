package exercise08;

public class Novel extends Book{

	public Novel(String title, String autor) {
		super(title, autor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getLateFee(int lateDays) {
		
		return lateDays*300;
	}

}
