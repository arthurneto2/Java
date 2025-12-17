package POO.interfaces;

public class BancoMySQL implements BancoDados{

    @Override
    public void conectar() {
        System.out.println("Conectando ao MySQL...");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do MySQL...");
    }

    @Override
    public String create(String table) {
        return "CREATE TABLE " + table + ";";
    }

    @Override
    public String alter(String table) {
        return "ALTER TABLE " + table + ";";
    }

    @Override
    public String drop(String table) {
        return "DROP TABLE " + table + ";";
    }

    @Override
    public String insert(String table) {
        return "INSERT INTO " + table + ";";
    }

    @Override
    public String update(String table) {
        return "UPDATE " + table + ";";
    }

    @Override
    public String delete(String table) {
        return "DELETE FROM " + table + ";";
    }

    @Override
    public String select(String table) {
        return "SELECT * FROM " + table + ";";
    }

    @Override
    public String grandte(String user) {
        return "GRANT ALL PRIVILEGES TO " + user + ";";
    }

    @Override
    public String revoke(String user) {
        return "REVOKE ALL PRIVILEGES FROM " + user + ";";
    }

}
