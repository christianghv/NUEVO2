package com.santander_tc.reglasnegociotc.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class assistance implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String id;
	private java.lang.String status;
	private java.util.Date operationdate;

	public assistance() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.util.Date getOperationdate() {
		return this.operationdate;
	}

	public void setOperationdate(java.util.Date operationdate) {
		this.operationdate = operationdate;
	}

	public assistance(java.lang.String id, java.lang.String status,
			java.util.Date operation_date) {
		this.id = id;
		this.status = status;
		this.operationdate = operation_date;
	}

}