package ProjetoFinalParteSpring.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    public DataSource dataSource;

    public ConnectionFactory() throws ClassNotFoundException, SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        comboPooledDataSource.setUser("postgres");
        comboPooledDataSource.setPassword("root");
        comboPooledDataSource.setMaxPoolSize(30);

        this.dataSource = comboPooledDataSource;
    }

    public Connection recuperarConexao() throws SQLException {
        return this.dataSource.getConnection();

    }
}

