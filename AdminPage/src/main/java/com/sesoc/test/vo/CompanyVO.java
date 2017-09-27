package com.sesoc.test.vo;

/**
 * ITR_COMPANY 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class CompanyVO {

	/** COMPANY 회사명. */
	private String coName;

	/** COMPANY 아이디. */
	private String coId;

	/** COMPANY 비밀번호. */
	private String coPwd;

	/** COMPANY 전화번호. */
	private String coTel;

	/** COMPANY 담당자이름. */
	private String coManagerName;

	/** COMPANY 담당자의 소속 부서. */
	private String coManagerDept;

	/** CO_MANAGER_EMAIL. */
	private String coManagerEmail;

	/** COMPANY 승인여부. */
	private int coAuthority;

	public CompanyVO() {
	}

	public CompanyVO(String coName, String coId, String coPwd, String coTel, String coManagerName, String coManagerDept,
			String coManagerEmail, int coAuthority) {
		super();
		this.coName = coName;
		this.coId = coId;
		this.coPwd = coPwd;
		this.coTel = coTel;
		this.coManagerName = coManagerName;
		this.coManagerDept = coManagerDept;
		this.coManagerEmail = coManagerEmail;
		this.coAuthority = coAuthority;
	}

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getCoId() {
		return coId;
	}

	public void setCoId(String coId) {
		this.coId = coId;
	}

	public String getCoPwd() {
		return coPwd;
	}

	public void setCoPwd(String coPwd) {
		this.coPwd = coPwd;
	}

	public String getCoTel() {
		return coTel;
	}

	public void setCoTel(String coTel) {
		this.coTel = coTel;
	}

	public String getCoManagerName() {
		return coManagerName;
	}

	public void setCoManagerName(String coManagerName) {
		this.coManagerName = coManagerName;
	}

	public String getCoManagerDept() {
		return coManagerDept;
	}

	public void setCoManagerDept(String coManagerDept) {
		this.coManagerDept = coManagerDept;
	}

	public String getCoManagerEmail() {
		return coManagerEmail;
	}

	public void setCoManagerEmail(String coManagerEmail) {
		this.coManagerEmail = coManagerEmail;
	}

	public int getCoAuthority() {
		return coAuthority;
	}

	public void setCoAuthority(int coAuthority) {
		this.coAuthority = coAuthority;
	}

	@Override
	public String toString() {
		return "CompanyVO [coName=" + coName + ", coId=" + coId + ", coPwd=" + coPwd + ", coTel=" + coTel
				+ ", coManagerName=" + coManagerName + ", coManagerDept=" + coManagerDept + ", coManagerEmail="
				+ coManagerEmail + ", coAuthority=" + coAuthority + "]";
	}

}