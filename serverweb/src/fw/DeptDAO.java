package fw;

import java.util.ArrayList;

import exam.MemberDTO;

public interface DeptDAO {
	int insert(DeptDTO member);//������
	ArrayList<DeptDTO> DeptList();
	int delete(String deptNo);
}
