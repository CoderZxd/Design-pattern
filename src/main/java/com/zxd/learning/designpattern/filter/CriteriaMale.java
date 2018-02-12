package com.zxd.learning.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.filter
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 15:30 2018/2/12.
 */
public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>(10);
        for(Person person:persons){
            if("male".equalsIgnoreCase(person.getGender())){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
