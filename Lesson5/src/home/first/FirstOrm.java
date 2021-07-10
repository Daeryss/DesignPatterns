package home.first;

import home.DbEntity;

public interface FirstOrm<T extends DbEntity>{

    void create (T entity);

    T read(int id);

    void update(T entity);

    void delete(T entity);
}
