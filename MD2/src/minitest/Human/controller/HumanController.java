package minitest.Human.controller;

import minitest.Human.model.Human;
import minitest.Human.service.ManagementImpl;

import java.io.IOException;
import java.util.List;

public class HumanController {
    ManagementImpl managementImpl = new ManagementImpl();

    public List<Human> readFile() throws IOException {
        return managementImpl.readFile();
    }

    public void writeFile() throws IOException {
        managementImpl.writeFile();
    }

    public void addHuman (Human human) {
        managementImpl.addHuman(human);
    }

    public void editHuman(String name, Human human){
        managementImpl.editHuman(name, human);
    }

    public void deleteHuman(String name) {
        managementImpl.deleteHuman(name);
    }

}
