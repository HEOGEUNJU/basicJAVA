package chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JBCBCExam {
	public static void main(String[] args) throws Exception { // throws Exception이 없으면 할 때마다 오류난다.
		//0. 드라이버 로딩(리플렉션 기법 사용)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//1. DB 접속(서버주소, 아이디, 패스워드)
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "MKJ93", "java");
		//나중에 사용할 때 그대로 복사해서 사용하면 됨
		
		//2. 연결된 DB에 요청할 쿼리 작성
		//워크시트를 만드는과정
		Statement statement = connection.createStatement();
		String sql = "";
		sql += " SELECT";
		sql += "     mem_id,";
		sql += "     mem_name,";
		sql += "     mem_hp,";
		sql += "     mem_mail";
		sql += " FROM";
		sql += "     member";
		//가장 앞이나 가장 뒤를 한칸을 띄워주고 해야한다.         
		
		//3. 쿼리 실행
		//excuteQuery : select => 결과집합(ResultSet)을 반환
		//excuteUpdate : insert, update, delete => 실행된 갯수 반환
		ResultSet resultSet = statement.executeQuery(sql);
		
		//4. 실행 결과 받기
		while (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			System.out.printf("%s \t %s \t %s \t %s\n", memId, memName, memHp, memMail);
		}
		
		//5. 접속 종료
		resultSet.close();
		statement.close();
		connection.close();
		
		
	}
}
