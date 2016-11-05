package com.free.core.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.github.pagehelper.Page;


@SuppressWarnings({"rawtypes", "unchecked"})
public class BootgridPageInfoSet <T> implements Serializable {

	
	  //当前页
    private int current;
    //每页的数量
    private int rowCount;
    //当前页的数量
    private int size;
    //排序
    private String orderBy;
    //总记录数
    private long total;
    //总页数
    private int pages;
    //结果集
    
    /**
     * 包装Page对象
     *
     * @param list
     */
    public BootgridPageInfoSet(List<T> list) {
        this(list, 8);
    }

    /**
     * 包装Page对象
     *
     * @param list          page结果
     * @param navigatePages 页码数量
     */
    //使用别人的分页对象
    public BootgridPageInfoSet(List<T> list, int navigatePages) {
        if (list instanceof Page) {
            Page page = (Page) list;
            this.current = page.getPageNum();
            this.rowCount = page.getPageSize();
            this.orderBy = page.getOrderBy();
            this.pages = page.getPages();
            this.rows = page;
            this.size = page.size();
            this.total = page.getTotal();
        }
    }
    
  
    private List<T> rows;
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
}
