package com.marriage.entity;

import java.util.List;

/**
 * 用来封装分页信息
 */
public class Page<T> {
		private String Path;

		/**
		 * 当前页码， 由用户传过来的
		 */

		private int pageNumber;
		/**
		 * 每页显示的条数, 在Servlet 中指定
		 */
		private int pageSize;
		/**
		 * 总页数, 通过计算获得
		 */
		// private int totalPage;
		/**
		 * 总记录，通过查询数据库获得
		 */
		private int totalRecord;
		/**
		 * 分页的数据，通过查询数据库获得
		 */
		private List<T> data;

		/**
		 * 分页开始的索引，通过计算获得
		 */
		// private int index;

		public int getPageNumber() {
			// 如果pageNumber <1 则返回1
			if (pageNumber < 1) {
				return 1;
			}
			// 如果当前页大于总页数，则返回总页数
			if (pageNumber > getTotalPage()) {
				return getTotalPage();
			}

			return pageNumber;
		}

		public String getPath() {
			return Path;
		}

		public void setPath(String path) {
			Path = path;
		}

		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}

		public int getPageSize() {
			return pageSize;
		}

		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}

		public int getTotalPage() {
			/*
			 * 在这里计算总页数 总记录数 每页的条数 总页数 10 2 5 9 2 5 8 2 4 7 2 4
			 * 
			 * 当可以整除时 totalRecord/ pageSize 当有余数时 totalRecord/ pageSize +1;
			 */
			if (getTotalRecord() % getPageSize() == 0)
				return getTotalRecord() / getPageSize();
			else
				return getTotalRecord() / getPageSize() + 1;
		}

		/*
		 * public void setTotalPage(int totalPage) {
		 * 
		 * }
		 */

		public int getTotalRecord() {
			return totalRecord;
		}

		public void setTotalRecord(int totalRecord) {
			this.totalRecord = totalRecord;
		}

		public List<T> getData() {
			return data;
		}

		public void setData(List<T> data) {
			this.data = data;
		}

		public int getIndex() {

			return (getPageNumber() - 1) * pageSize;
		}
	}

