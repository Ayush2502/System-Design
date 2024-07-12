package org.example.Splitwise.Expense;

import org.example.Splitwise.Expense.Split.EqualExpenseSplit;
import org.example.Splitwise.Expense.Split.ExpenseSplit;
import org.example.Splitwise.Expense.Split.PercentExpenseSplit;
import org.example.Splitwise.Expense.Split.UnequalExpenseSplit;
import org.example.Splitwise.Expense.SplitType;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(SplitType splitType){

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENT:
                return new PercentExpenseSplit();
            default:
                return null;
        }

    }
}
