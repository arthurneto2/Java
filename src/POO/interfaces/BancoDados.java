package POO.interfaces;

public interface BancoDados extends SqlDDL, SqlDML, SqlDCL {
    void conectar();
    void desconectar();
}
