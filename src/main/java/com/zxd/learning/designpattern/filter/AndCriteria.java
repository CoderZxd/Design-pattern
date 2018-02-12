package com.zxd.learning.designpattern.filter;

import java.util.List;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.filter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:34 2018/2/12.
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
