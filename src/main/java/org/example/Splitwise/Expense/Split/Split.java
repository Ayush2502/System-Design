package org.example.Splitwise.Expense.Split;

import org.example.Splitwise.User.User;

public class Split {
    double AmountOwe;
    User user;

    public Split(User user,double AmountOwe) {
        this.user = user;
        this.AmountOwe = AmountOwe;
    }

    public double getAmountOwe() {
        return AmountOwe;
    }

    public void setAmountOwe(double amountOwe) {
        AmountOwe = amountOwe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
