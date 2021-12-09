package minitest.Human.service;

import minitest.Human.model.Human;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IManagement {
    List<Human> readFile() throws IOException;

    void writeFile() throws IOException;

    void addHuman (Human human);

    int findIndexByName(String name);

    void editHuman (String name, Human human);

    void deleteHuman (String name);

}
