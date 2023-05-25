package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userService = new UserDaoJDBCImpl();

        // Создание таблицы User(ов)
        userService.createUsersTable();

        // Добавление 4 User(ов) в таблицу
        userService.saveUser("John", "Doe", (byte) 25);
        System.out.println("User с именем John добавлен в базу данных");

        userService.saveUser("Jane", "Smith", (byte) 30);
        System.out.println("User с именем Jane добавлен в базу данных");

        userService.saveUser("Mike", "Johnson", (byte) 35);
        System.out.println("User с именем Mike добавлен в базу данных");

        userService.saveUser("Emily", "Williams", (byte) 28);
        System.out.println("User с именем Emily добавлен в базу данных");

        // Получение всех User из базы и вывод в консоль
        System.out.println("Список всех пользователей:");
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        // Очистка таблицы User(ов)
        userService.cleanUsersTable();
        System.out.println("Таблица пользователей очищена");

        // Удаление таблицы User(ов)
        userService.dropUsersTable();
        System.out.println("Таблица пользователей удалена");
    }
}
