package member;

import java.util.ArrayList;

import exam.MemberDTO;

public interface Member2DAO {
	int insert(Member2DTO member);//사원등록
	ArrayList<Member2DTO> DeptList();
	int delete(String id);
	Member2DTO read(String id);
}
