package response;


import com.excelit.bean.StudentProfileBean;
import com.excelit.estudyhub.utils.EStudyHubResponse;

public class StudentRegistrationResponse extends EStudyHubResponse {
	private StudentProfileBean studentProfileBean;

	/**
	 * @return the studentProfileBean
	 */
	public StudentProfileBean getStudentProfileBean() {
		return studentProfileBean;
	}

	/**
	 * @param studentProfileBean the studentProfileBean to set
	 */
	public void setStudentProfileBean(StudentProfileBean studentProfileBean) {
		this.studentProfileBean = studentProfileBean;
	}
	
	
	

}
