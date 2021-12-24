package lesson8;

import java.sql.*;

public class SqliteExamples {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Documents\\For Testers\\geekbrains.db");

            Statement statement = connection.createStatement();
            //statement.executeUpdate("update students set faculty_id = 2 where id = 1");

            ResultSet resultSet = statement.executeQuery("select * from students");

            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("faculty_id"));
            }

            /* Long time = System.currentTimeMillis();
            for(int i = 3000; i < 4000; i++) {
                statement.executeUpdate(
                        String.format("insert into students(name, score, faculty_id) values ('%s', %d, %d)", "student"+i, i, i));
            }
            System.out.println("Время выполнения с автокоммитом " + (System.currentTimeMillis() - time));

            connection.setAutoCommit(false);
            time = System.currentTimeMillis();
            for(int i = 4000; i < 5000; i++) {
                statement.executeUpdate(
                        String.format("insert into students(name, score, faculty_id) values ('%s', %d, %d)", "student"+i, i, i));
            }
            System.out.println("Время выполнения без автокоммита " + (System.currentTimeMillis() - time));
*/
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("insert into students(name, score, faculty_id) values (?, ?, ?)");

            connection.setAutoCommit(false);
            preparedStatement.setString(1, "Georgy");
            preparedStatement.setInt(2, 100);
            preparedStatement.setInt(3, 1);
            preparedStatement.addBatch();
            preparedStatement.setString(1, "Alex");
            preparedStatement.setInt(2, 150);
            preparedStatement.setInt(3, 2);
            preparedStatement.addBatch();
            preparedStatement.setString(1, "Anna");
            preparedStatement.setInt(2, 200);
            preparedStatement.setInt(3, 1);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
            connection.commit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
