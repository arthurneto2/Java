package POO.interfaces;

public interface SqlDDL {
    String create(String table);
    String alter(String table);
    String drop(String table);
}
