// CRUD interface

package org.example;

public interface ICRUD {
    public Object add(Object obj);  // get object from parameter
    public int update(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);
}
