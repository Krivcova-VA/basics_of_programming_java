package Data.sql.demo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class RepositoryImp {
    private Connection connection;

    public RepositoryImp(Connection connection) {
        this.connection = connection;
    }

    public HashSet find(Long id) {
        try (Statement statement =
                     connection.createStatement()) {
            ResultSet resultSet =
                    statement.executeQuery("select * from department.departments where id = " + id);
            HashSet department = new HashSet();
            while (resultSet.next()) {
                long uid = resultSet.getLong("id");
                String title = resultSet.getString("depName");
                department.add(title);
            }
            return department;
        } catch (SQLException e) {
            throw new RuntimeException("Error while statement executing");
        }
    }


    public HashSet list() {
        try (Statement statement =
                     connection.createStatement()) {
            ResultSet resultSet =
                    statement.executeQuery("select * from departments.departments");
            HashSet department = new HashSet();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String title = resultSet.getString("title");
                department.add(title);
            }
            return department;
        } catch (SQLException e) {
            throw new RuntimeException("Error while statement executing");
        }
    }


    public void save(HashSet department) {
        {
            try (Statement statement =
                         connection.createStatement()) {
                ResultSet resultSet =
                        statement.executeQuery("select * from departments.departments where id = " );

                while (resultSet.next()) {
                    long uid = resultSet.getLong("id");
                    String title = resultSet.getString("depName");
                    department.add(title);
                }
                //return company.get();
            } catch (SQLException e) {
                throw new RuntimeException("Error while statement executing");
            }

        }
    }

        public void remove (HashSet department){
            {
                try (Statement statement =
                             connection.createStatement()) {
                statement.execute("delete from users where id = 1");
            } catch (SQLException e) {
                    throw new RuntimeException("Error while statement executing");
                }

            }
        }
}