package DAO;

import java.util.List;

public interface GeniriqueDAOI<T>{
    public void add(T t);
    public void update(T t);
    public void delete(int id);
    public List<T> getAll();

}
