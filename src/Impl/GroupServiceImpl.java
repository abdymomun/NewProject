package Impl;

import Model.Group;
import Model.Student;
import db.DataBase;
import service.GroupService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupServiceImpl implements GroupService {

    DataBase dataBase = new DataBase();
    @Override
    public String addNewGroup(Group group) {
        dataBase.getGroups().add(group);
        return group.toString();
    }


    @Override
    public String getGroupById(int id) {
        for (Group a:dataBase.getGroups()) {
            if (a.getId() == id){
                System.out.println(a.toString());
            }else {
                System.out.println("invalit");
            }
        }
        return toString();
    }

    @Override
    public List<Group> getAllGroups() {
        List<Group>groups=new ArrayList<>();
        groups.stream().forEach(group -> System.out.println(groups));

        return groups;
    }


    @Override
    public String updateGroupName(int id, String groupName) {
        return null;
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        return null;
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        return null;
    }

    @Override
    public void deleteGroupById(int id) {

    }
}
