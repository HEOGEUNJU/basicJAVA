package memo;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

class MemoTest {
// 테스트를 통해서 잘 만들었는지 확인하는 방법 (테스트 주도 개발에 사용)
	void selecttest() throws Exception {
		MemoDao dao = new MemoDao();
		List<MemoVO> list = dao.getMemos();
		assertEquals(1, list.size());
//		assertNotNull(list);
	}

	
	@Test
	void insertTest() throws Exception {
		MemoDao dao = new MemoDao();
		dao.insertMemo(new MemoVO(0, "두번째 메모", "안녕하세요.", "hgj", null, null));
		List<MemoVO> list = dao.getMemos();
		assertEquals(2, list.size());
		
	}
	
}
