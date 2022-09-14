package memo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

// Database Access Object
public class MemoDao {
		/*눈으로 확인 하는 방법
		 * public static void main(String[] args) throws Exception{
			MemoDao dao = new MemoDao();
			List<MemoVO> list = dao.getMemos();
			System.out.println("총 갯수 :" + list.size());
		}
		*/
		public List<MemoVO> getMemos() throws Exception{
			//0. 드라이버 로딩
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.registerDriver(new OracleDriver());
			//1. 접속
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "MKJ93", "java");
			
			//2. 쿼리 작성
			Statement statement = connection.createStatement();
			//String vs <StringBuilder>-많이 사용 vs StringBuffer(Tread safe) 
			StringBuilder builder = new StringBuilder();
			builder.append(" SELECT");
			builder.append("     no,");
			builder.append("     title,");
			builder.append("     content,");
			builder.append("     writer,");
			builder.append("     register_date,");
			builder.append("     modify_date");
			builder.append(" FROM");
			builder.append("     memo");
			String sql = builder.toString(); //<==문자열로 바뀜
			                 
			//3. 쿼리 전송
			ResultSet resultSet = statement.executeQuery(sql);
			
			//4. 결과 정리
			ArrayList<MemoVO> list = new ArrayList<>();
			while (resultSet.next()) {
				int no = resultSet.getInt("no");
				String title = resultSet.getString("title");
				String content = resultSet.getString("content");
				String writer = resultSet.getString("writer");
				Date registerDate = resultSet.getDate("register_date");
				Date modifyDate = resultSet.getDate("modify_date");
				list.add(new MemoVO(no, title, content, writer, registerDate, modifyDate));
			}
			
			//5. 자원 반납
			resultSet.close();
			statement.close();
			connection.close();
			return list;
		}
		//MemoVO 테이블에 있는 필드를 사용하기 위해 하나하나 쓰는 것보다 통째로 불러오는게 좋음
		public int insertMemo(MemoVO vo) throws SQLException{
			
				//0. 드라이버 로딩
//				Class.forName("oracle.jdbc.driver.OracleDriver");
				DriverManager.registerDriver(new OracleDriver());
				//1. 접속
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "MKJ93", "java");
				
				//2. 쿼리 작성
				Statement statement = connection.createStatement();
				//String vs <StringBuilder>-많이 사용 vs StringBuffer(Tread safe) 
				StringBuilder builder = new StringBuilder();
				builder.append(" INSERT INTO memo (");
				builder.append("     no,");
				builder.append("     title,");
				builder.append("     content,");
				builder.append("     writer");
				builder.append(" ) VALUES (");
				builder.append("     seq_memo.NEXTVAL,");
				builder.append("     '" + vo.getTitle() + "',");
				builder.append("     '" + vo.getContent() + "',");
				builder.append("     '" + vo.getWriter() + "'");
				builder.append(" )");
				String sql = builder.toString(); //<==문자열로 바뀜
				                 
				//3. 쿼리 전송
				//insert, update, delete 명령문을 실행할 때 호출
				//결과값은 실행된 갯수가 반환
				int executeUpdate = statement.executeUpdate(sql);
				
				//4. 자원 반납
				statement.close();
				connection.close();;
				return executeUpdate;
		}
		
		//복사해다 쓸거면 얘를 쓸 것
		public int updateMemo(MemoVO vo) throws Exception {
			//0. 드라이버 로딩
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.registerDriver(new OracleDriver());
			//1. 접속
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "MKJ93", "java");
			//2. 쿼리 작성
			StringBuilder builder = new StringBuilder();			
			builder.append(" UPDATE memo ");
			builder.append("     SET ");
			builder.append("         title = ?, ");
			builder.append("         content = ?, ");
			builder.append("         writer = ?, ");
			builder.append("        modify_date = sysdate ");
			builder.append(" WHERE ");
			builder.append("     no = ? ");
			String sql = builder.toString(); 
			
			//3. 준비된 쿼리에 데이터 입력
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, vo.getTitle());
			statement.setString(2, vo.getContent());
			statement.setString(3, vo.getWriter());
			statement.setInt(4, vo.getNo());
			
			//4. 쿼리 실행
			int executeUpdate = statement.executeUpdate();
			
			//5. 자원 반납
			statement.close();
			connection.close();
			
			return executeUpdate;
		}
		public int deleteMemo(MemoVO vo) throws Exception {
			//0. 드라이버 로딩
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.registerDriver(new OracleDriver());
			//1. 접속
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "MKJ93", "java");
			//2. 쿼리 작성
			StringBuilder builder = new StringBuilder();			
			builder.append(" UPDATE memo ");
			builder.append("     SET ");
			builder.append("         title = ?, ");
			builder.append("         content = ?, ");
			builder.append("         writer = ?, ");
			builder.append("        modify_date = sysdate ");
			builder.append(" WHERE ");
			builder.append("     no = ? ");
			String sql = builder.toString(); 
			
			//3. 준비된 쿼리에 데이터 입력
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, null);
			statement.setString(2, null);
			statement.setString(3, null);
			statement.setInt(4, 0);
			
			//4. 쿼리 실행
			int executeUpdate = statement.executeUpdate();
			
			//5. 자원 반납
			statement.close();
			connection.close();
			
			return executeUpdate;
		}
}














