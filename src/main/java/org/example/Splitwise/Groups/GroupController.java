package org.example.Splitwise.Groups;

import org.example.Splitwise.User.User;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Groups> groupList;
    public GroupController(){
        groupList = new ArrayList<>();
    }

    //create group
    public void createNewGroup(String groupId, String groupName, User createdByUser) {

        //create a new group
        Groups groups = new Groups();
        groups.setGroupId(groupId);
        groups.setGroupName(groupName);

        //add the user into the group, as it is created by the USER
        groups.addMember(createdByUser);

        //add the group in the list of overall groups
        groupList.add(groups);
    }

    public Groups getGroup(String groupId){

        for(Groups group: groupList) {

            if(group.getGroupId().equals(groupId)){
                return group;
            }
        }
        return null;
    }

}
