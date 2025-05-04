package Homework16.Task3;

import java.util.List;

interface Component {
    void execute();
    List<Component> getChildren();
}
