package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {
	
	private List<T> data = new ArrayList<T>();
	
	private List<Exception> errors = new ArrayList<Exception>();
	
	private List<Object> meta = new ArrayList<Object>();
	
	private Integer total = 0;
	
	private Boolean success = true;
	
	private Integer page = 0; 
	
	
	
	public Response(List<T> records) {
		this.data = records;
		this.total = this.data.size();
	}
	
	public Response(List<T> records, List<Exception> errors) {
		this.data = records;
		this.total = this.data.size();
		this.errors = errors;
		this.success = errors.size() > 0 ? false : true;
	}
	
	
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> records) {
		this.data = records;
	}

	
	public void setErrors(List<Exception> errors) {
		this.errors = errors;
	}
	public List<Exception> getErrors() {
		return this.errors;
	}
	
	
	public Integer getCount() {
		return total;
	}
	public void setCount(Integer count) {
		this.total = count;
	}

	
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}

	
	public List<Object> getMeta() {
		return meta;
	}
	public void setMeta(List<Object> meta) {
		this.meta = meta;
	}
}
