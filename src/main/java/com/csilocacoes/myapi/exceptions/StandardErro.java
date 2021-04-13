package com.csilocacoes.myapi.exceptions;

public class StandardErro {

	private Integer status;
	private Long timestamp;
	private String error;

	public StandardErro(Integer status, Long timestamp, String error) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.error = error;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
