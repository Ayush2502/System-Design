

It uses both State design pattern and Chain of Responsibiltiy design pattern.

State Design Pattern will be used to change the states of the ATm machine . 

---------       STATE DESIGN PATTERN     -----------

 1.  ATM state is an interface which contains all the functionality of the ATM 
   - All the other State classes implement the ATMState.
   - All the classes override all the methods but implement only those methods which can work on that particular state
   - All the classes contains the pointer / reference to the next state. 

---------      CHAIN OF RESPONSIBILITY    -------------

 2. Chain of Responsibility is implemented in the section where we have to decide which note has and how many has to be cashed out 
    - CashWithDrawalProcesor has a withdraw method and a pointer to the starting withdrawal. 
    - The withdrawal takes places generally in a descending order. 
    - The TwoThousandWithDrawalProcessor has a pointer to fivehundredWithdrawProcessor and so on. 
    