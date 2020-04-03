package de.gfn.java.ocp.jdbc.crud;

import de.gfn.java.ocp.jdbc.crud.DBConnectionFactory;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class CustomerCRUD extends AbstractCRUD<Customer> {

    public CustomerCRUD() {
        super("customers");
    }
    
    @Override
    public boolean insert(Customer obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> find(int start, int num) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Customer obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Customer obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public Customer create(ResultSet rs) throws SQLException {
        // ID hinzufügen
        return new Customer(rs.getString("firstname"), rs.getString("lastname"), rs.getString("email"));
    }
    
}
