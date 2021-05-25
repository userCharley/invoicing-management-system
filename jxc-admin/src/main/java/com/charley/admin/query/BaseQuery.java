package com.charley.admin.query;


import lombok.Data;

/**
 *
 * @author charley
 * @version 1.0
 */
@Data
public class BaseQuery {
    private Integer page=1;
    private Integer limit=10;

}
