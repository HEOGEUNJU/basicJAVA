package chapter08;

public class DaoExample {
	public static void main(String[] arg) {
		DataAccessObject dao = new OracleDao();
		dbWork(dao);
		
		dao = new MySqlDao();
		dbWork(dao);
	}

	
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
}
