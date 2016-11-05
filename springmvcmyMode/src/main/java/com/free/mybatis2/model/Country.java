package com.free.mybatis2.model;

import javax.persistence.*;

public class Country {
    @Column(name = "ID")
    private Long id;

    
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") 时间格式化
    //@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select SEQ_COUNTRY.nextval from dual"),使用数据库序列
    
    @Column(name = "COUNTRYNAME")
    private String countryname;

    @Column(name = "COUNTRYCODE")
    private String countrycode;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return COUNTRYNAME
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * @param countryname
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    /**
     * @return COUNTRYCODE
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * @param countrycode
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}