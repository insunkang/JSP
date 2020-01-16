package fw;

import java.util.ArrayList;

import exam.MemberDTO;

public interface DeptDAO {
	int insert(DeptDTO member);//사원등록
	ArrayList<DeptDTO> DeptList();
	int delete(String deptNo);
}
