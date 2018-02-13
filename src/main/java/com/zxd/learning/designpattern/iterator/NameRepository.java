package com.zxd.learning.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.iterator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 11:18 2018/2/13.
 */
public class NameRepository implements Container{

    private List<String> names = new ArrayList<String>(10);

    public NameRepository() {
    }

    public NameRepository(List<String> names) {
        this.names = names;
    }

    public void add(String string){
        names.add(string);
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{

        int index = 0;

        @Override
        public boolean hasNext() {
            if(index < names.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
           if(this.hasNext()){
               return names.get(index++);
           }
           return null;
        }
    }

}
