package com.zxd.learning.designpattern.filter;

import java.util.List;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.filter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:29 2018/2/12.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
