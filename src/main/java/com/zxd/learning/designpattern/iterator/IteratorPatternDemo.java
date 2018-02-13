package com.zxd.learning.designpattern.iterator;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.iterator
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 11:22 2018/2/13.
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        namesRepository.add("Robert");
        namesRepository.add("John");
        namesRepository.add("Lord");
        namesRepository.add("Siri");
        namesRepository.add("Lucy");
        namesRepository.add("Carry");
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
