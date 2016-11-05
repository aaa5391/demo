package com.free.test3.model;
import java.io.Serializable;
import java.sql.Clob;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
@Table(name = "C_COMPARE_CCIC")
@XmlRootElement (name = "modes")

public class CcompareccicModel   implements Serializable {

	/**哈哈实体类，检查是否生成了主键，如没，请检查数据库表主键字段，主键是@Id标识*/
	private static final long serialVersionUID = 1L;
	/** 人员编号  不可   主键 */
	@Id
    @Column(name = "rybh")
	private String rybh;
	/** 姓名  可空    */
    @Column(name = "xm")
	private String xm;
	/**   可空    */
    @Column(name = "xm2")
	private String xm2;
	/** 性别编号  可空    */
    @Column(name = "xb")
	private String xb;
	/**   可空    */
    @Column(name = "csrq")
	private String csrq;
	/**   可空    */
    @Column(name = "csrqxx")
	private String csrqxx;
	/** 身份证号码  可空    */
    @Column(name = "sfzh")
	private String sfzh;
	/**   可空    */
    @Column(name = "hjdqh")
	private String hjdqh;
	/**   可空    */
    @Column(name = "hjdxz")
	private String hjdxz;
	/**   可空    */
    @Column(name = "xzdqh")
	private String xzdqh;
	/**   可空    */
    @Column(name = "xzdxz")
	private String xzdxz;
	/**   可空    */
    @Column(name = "c1")
	private String c1;
	/**   可空    */
    @Column(name = "c2")
	private String c2;
	/**   可空    */
    @Column(name = "c3")
	private String c3;
	/**   可空    */
    @Column(name = "c4")
	private String c4;
	/**   可空    */
    @Column(name = "c5")
	private String c5;
	/**   可空    */
    @Column(name = "c6")
	private String c6;
	/**   可空    */
    @Column(name = "c7")
	private String c7;
	/**   可空    */
    @Column(name = "c8")
	private String c8;
	/**   可空    */
    @Column(name = "c9")
	private String c9;
	/**   可空    */
    @Column(name = "c10")
	private String c10;
	/**   可空    */
    @Column(name = "c11")
	private String c11;
	/**   可空    */
    @Column(name = "c12")
	private String c12;
	/**   可空    */
    @Column(name = "c13")
	private String c13;
	/**   可空    */
    @Column(name = "c14")
	private String c14;
	/**   可空    */
    @Column(name = "c15")
	private String c15;
	/** 有效标记  可空    */
    @Column(name = "yxbj")
	private String yxbj;
	/** 入库时间  可空    */
    @Column(name = "rksj")
	private Date rksj;
	
	/**
	 * 取得人员编号
	 *@return String 人员编号
	 */
	 public String getRybh(){
		return this.rybh;
	}
	/**
	 * 设置人员编号
	 *@param String 人员编号
	 */
	 public void setRybh(String rybh){
	 this.rybh = rybh == null ? "" : rybh.trim();
	
	}
	
	/**
	 * 取得姓名
	 *@return String 姓名
	 */
	 public String getXm(){
		return this.xm;
	}
	/**
	 * 设置姓名
	 *@param String 姓名
	 */
	 public void setXm(String xm){
	 this.xm = xm == null ? "" : xm.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getXm2(){
		return this.xm2;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setXm2(String xm2){
	 this.xm2 = xm2 == null ? "" : xm2.trim();
	
	}
	
	/**
	 * 取得性别编号
	 *@return String 性别编号
	 */
	 public String getXb(){
		return this.xb;
	}
	/**
	 * 设置性别编号
	 *@param String 性别编号
	 */
	 public void setXb(String xb){
	 this.xb = xb == null ? "" : xb.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getCsrq(){
		return this.csrq;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setCsrq(String csrq){
	 this.csrq = csrq == null ? "" : csrq.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getCsrqxx(){
		return this.csrqxx;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setCsrqxx(String csrqxx){
	 this.csrqxx = csrqxx == null ? "" : csrqxx.trim();
	
	}
	
	/**
	 * 取得身份证号码
	 *@return String 身份证号码
	 */
	 public String getSfzh(){
		return this.sfzh;
	}
	/**
	 * 设置身份证号码
	 *@param String 身份证号码
	 */
	 public void setSfzh(String sfzh){
	 this.sfzh = sfzh == null ? "" : sfzh.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getHjdqh(){
		return this.hjdqh;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setHjdqh(String hjdqh){
	 this.hjdqh = hjdqh == null ? "" : hjdqh.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getHjdxz(){
		return this.hjdxz;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setHjdxz(String hjdxz){
	 this.hjdxz = hjdxz == null ? "" : hjdxz.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getXzdqh(){
		return this.xzdqh;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setXzdqh(String xzdqh){
	 this.xzdqh = xzdqh == null ? "" : xzdqh.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getXzdxz(){
		return this.xzdxz;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setXzdxz(String xzdxz){
	 this.xzdxz = xzdxz == null ? "" : xzdxz.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC1(){
		return this.c1;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC1(String c1){
	 this.c1 = c1 == null ? "" : c1.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC2(){
		return this.c2;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC2(String c2){
	 this.c2 = c2 == null ? "" : c2.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC3(){
		return this.c3;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC3(String c3){
	 this.c3 = c3 == null ? "" : c3.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC4(){
		return this.c4;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC4(String c4){
	 this.c4 = c4 == null ? "" : c4.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC5(){
		return this.c5;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC5(String c5){
	 this.c5 = c5 == null ? "" : c5.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC6(){
		return this.c6;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC6(String c6){
	 this.c6 = c6 == null ? "" : c6.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC7(){
		return this.c7;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC7(String c7){
	 this.c7 = c7 == null ? "" : c7.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC8(){
		return this.c8;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC8(String c8){
	 this.c8 = c8 == null ? "" : c8.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC9(){
		return this.c9;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC9(String c9){
	 this.c9 = c9 == null ? "" : c9.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC10(){
		return this.c10;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC10(String c10){
	 this.c10 = c10 == null ? "" : c10.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC11(){
		return this.c11;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC11(String c11){
	 this.c11 = c11 == null ? "" : c11.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC12(){
		return this.c12;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC12(String c12){
	 this.c12 = c12 == null ? "" : c12.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC13(){
		return this.c13;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC13(String c13){
	 this.c13 = c13 == null ? "" : c13.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC14(){
		return this.c14;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC14(String c14){
	 this.c14 = c14 == null ? "" : c14.trim();
	
	}
	
	/**
	 * 取得
	 *@return String 
	 */
	 public String getC15(){
		return this.c15;
	}
	/**
	 * 设置
	 *@param String 
	 */
	 public void setC15(String c15){
	 this.c15 = c15 == null ? "" : c15.trim();
	
	}
	
	/**
	 * 取得有效标记
	 *@return String 有效标记
	 */
	 public String getYxbj(){
		return this.yxbj;
	}
	/**
	 * 设置有效标记
	 *@param String 有效标记
	 */
	 public void setYxbj(String yxbj){
	 this.yxbj = yxbj == null ? "" : yxbj.trim();
	
	}
	
	/**
	 * 取得入库时间
	 *@return Date 入库时间
	 */
	 public Date getRksj(){
		return this.rksj;
	}
	/**
	 * 设置入库时间
	 *@param Date 入库时间
	 */
	 public void setRksj(Date rksj){
		 this.rksj = rksj;
	}
	
	public String toString() {
		return " CcompareccicModel [ rybh="+rybh+"xm="+xm+"xm2="+xm2+"xb="+xb+"csrq="+csrq+"csrqxx="+csrqxx+"sfzh="+sfzh+"hjdqh="+hjdqh+"hjdxz="+hjdxz+"xzdqh="+xzdqh+"xzdxz="+xzdxz+"c1="+c1+"c2="+c2+"c3="+c3+"c4="+c4+"c5="+c5+"c6="+c6+"c7="+c7+"c8="+c8+"c9="+c9+"c10="+c10+"c11="+c11+"c12="+c12+"c13="+c13+"c14="+c14+"c15="+c15+"yxbj="+yxbj+"rksj="+rksj+"]"  ;
	}
}

