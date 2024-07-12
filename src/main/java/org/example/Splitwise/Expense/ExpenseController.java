package org.example.Splitwise.Expense;

import org.example.Splitwise.Expense.Split.ExpenseSplit;
import org.example.Splitwise.Expense.Split.Split;
import org.example.Splitwise.User.User;

import java.util.List;

public class ExpenseController {

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, SplitType splitType, User paidByUser){

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        try {
            expenseSplit.validateSplitRequest(splitDetails, expenseAmount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Expense expense = new Expense(expenseId,description,expenseAmount,paidByUser,splitType,splitDetails);

        return expense;
    }

}
