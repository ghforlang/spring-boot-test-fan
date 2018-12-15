/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved. 
 * This software is the confidential and proprietary information of GuaHao Company. 
 * ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall use it only 
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package cn.edu.nbu.light.biz.dataobject;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author fanwenhao
 * @version V1.0
 * @since 2018-12-15 11:24
 */
@Getter
@Setter
@ToString
public class UserDO {
    private Long id;
    private String userName;
    private String roleName;
    private String noteInfo;
    private Date createTime;
    private Date updateTime;
    private Integer is_deleted;
}
