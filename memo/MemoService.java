package memo;

import java.util.List;

public class MemoService {
	MemoDao dao = new MemoDao();

	public List<MemoVO> getMemos() throws Exception {
		return dao.getMemos();
	}

	public int insertMemo(MemoVO vo) throws Exception {
		return dao.insertMemo(vo);
	}

	public int updateMemo(MemoVO vo) throws Exception {
		return dao.updateMemo(vo);
	}

	public int deleteMemo(MemoVO vo) throws Exception {
		return dao.updateMemo(vo);
	}
}