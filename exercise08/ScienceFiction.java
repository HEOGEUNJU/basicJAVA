package exercise08;

public class ScienceFiction extends Book{

	public ScienceFiction(String title, String autor) {
		super(title, autor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getLateFee(int lateDays) {
		
		return lateDays*600;
	}

}
