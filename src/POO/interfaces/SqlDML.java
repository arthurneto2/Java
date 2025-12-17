package POO.interfaces;

public interface SqlDML {
    String insert(String table);
    String update(String table);
    String delete(String table);
    String select(String table);
}
