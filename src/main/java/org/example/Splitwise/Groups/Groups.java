package org.example.Splitwise.Groups;

import org.example.Splitwise.Expense.Expense;
import org.example.Splitwise.Expense.ExpenseController;
import org.example.Splitwise.Expense.Split.Split;
import org.example.Splitwise.Expense.SplitType;
import org.example.Splitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Groups {
    String GroupId;
    String GroupName;
    List<User> userList;
    List<Expense> expenseList;
    ExpenseController expenseController;

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void setExpenseList(List<Expense> expenseList) {
        this.expenseList = expenseList;
    }

    public ExpenseController getExpenseController() {
        return expenseController;
    }

    public void setExpenseController(ExpenseController expenseController) {
        this.expenseController = expenseController;
    }
    public void addMember(User user){
        userList.add(user);
    }
    Groups(){
        userList = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    public Groups(String groupId, String groupName, List<User> userList, List<Expense> expenseList, ExpenseController expenseController) {
        GroupId = groupId;
        GroupName = groupName;
        this.userList = userList;
        this.expenseList = expenseList;
        this.expenseController = expenseController;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, SplitType splitType, User paidByUser) {

        Expense expense = expenseController.createExpense(expenseId, description, expenseAmount, splitDetails, splitType, paidByUser);
        expenseList.add(expense);
        return expense;
    }

}
