package org.example.TemplateDesignPattern;

public abstract class Payment {
    public abstract void ValidateRequest();
    public abstract void CreditPayment();
    public abstract void PlatformFees();
    public abstract void Debitpayment();

    // this is a template method which will make call all the above methods in a sequence.
    //it is final so that the child classes cannot modify this function.
    public final void SendMoney(){

        ValidateRequest();
        CreditPayment();
        PlatformFees();
        Debitpayment();
    }

}
