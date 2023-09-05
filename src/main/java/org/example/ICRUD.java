package org.example;

public interface ICRUD {
    public Object add();
    public int update(Object o);
    public  int delete(Object o);
    public void selectOne(int id);


}