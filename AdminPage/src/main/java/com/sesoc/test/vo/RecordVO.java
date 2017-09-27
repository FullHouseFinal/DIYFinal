package com.sesoc.test.vo;

/**
 * ITR_RECORD 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class RecordVO {

	/** FURNITURE 번호. */
	private int furnitureNum;

	/** USER 아이디. */
	private String id;

	/** USER가 가구를 사용한 횟수. */
	private int pick;

	public RecordVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecordVO(int furnitureNum, String id, int pick) {
		super();
		this.furnitureNum = furnitureNum;
		this.id = id;
		this.pick = pick;
	}

	public int getFurnitureNum() {
		return furnitureNum;
	}

	public void setFurnitureNum(int furnitureNum) {
		this.furnitureNum = furnitureNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPick() {
		return pick;
	}

	public void setPick(int pick) {
		this.pick = pick;
	}

}