package org.example.TemplateDesignPattern;

public class MerchantPayment extends Payment{

    @Override
    public void ValidateRequest() {
        System.out.println("Request Validated");
    }

    @Override
    public void CreditPayment() {
        System.out.println("Amount Credited");
    }

    @Override
    public void PlatformFees() {
        System.out.println("2% Platform Fees Added");
    }

    @Override
    public void Debitpayment() {
        System.out.println("Amount Debited");
    }
}
