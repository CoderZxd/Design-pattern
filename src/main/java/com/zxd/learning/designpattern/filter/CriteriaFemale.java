package com.zxd.learning.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.filter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:32 2018/2/12.
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>(10);
        for(Person person:persons){
            if("female".equalsIgnoreCase(person.getGender())){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
