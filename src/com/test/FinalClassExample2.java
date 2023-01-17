package com.test;

import java.util.*;

public final class FinalClassExample2 {
    private final int id;
    private final String name;
    private final List<Integer> empList;
    private final Map<Integer, Integer> deptMap;
    private final Date date;
    private final Dept dept;


    public FinalClassExample2(int id, String name, List<Integer> empList, Map<Integer, Integer> deptMap, Date date, Dept dept) {
        this.id = id;
        this.name = name;

        ArrayList<Integer> tempL = new ArrayList<>();
        Iterator li = empList.iterator();
        Integer i;
        while (li.hasNext()) {
            i = (Integer) li.next();
            tempL.add(i);
        }
        this.empList = tempL;

        HashMap<Integer, Integer> tempM = new HashMap();
        Integer key;
        Iterator hi = deptMap.keySet().iterator();;
        while (hi.hasNext()) {
            key = (Integer) hi.next();
            tempM.put(key, deptMap.get(key));
        }
        this.deptMap = tempM;
        this.date = new Date(date.getTime());

        Dept d = new Dept(dept.getId(), dept.getName());
        this.dept = d;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getEmpList() {
        return new ArrayList<>(empList);
    }

    public Map<Integer, Integer> getDeptMap() {
        return deptMap;
    }

    public Date getDate() {
        return (Date) this.date.clone();
    }

    public Dept getDept() {
        return new Dept(this.dept.getId(), this.dept.getName());
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1,1);
        List<Integer> l = new ArrayList<>();
        l.add(1);
        Dept d = new Dept(1, "comp");
        FinalClassExample2 f = new FinalClassExample2(1, "dip", l, hm, new Date(), d);
        System.out.println("list:" + l);
        System.out.println("hm:" + hm);

        System.out.println(f.getDept());
        l.add(2);
        hm.put(2,2);
        d.setId(100);
        System.out.println(f.getDept());
        System.out.println("list:" + l);
        System.out.println("map:" + hm);


        Dept d1 = f.getDept();
        d1.setId(100);

        System.out.println(f.getDept());


    }
}
