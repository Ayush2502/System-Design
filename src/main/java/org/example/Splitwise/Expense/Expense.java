package org.example.Splitwise.Expense;

import org.example.Splitwise.Expense.Split.Split;
import org.example.Splitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Expense {
    String expenseId;
    String description;
    double amount;
    User user;
    SplitType splitType;
    List<Split> splitDetails = new ArrayList<>();

    public Expense(String expenseId, String description, double amount, User user, SplitType splitType, List<Split> splitDetails) {
        this.expenseId = expenseId;
        this.description = description;
        this.amount = amount;
        this.user = user;
        this.splitType = splitType;
        this.splitDetails = splitDetails;
    }
}
