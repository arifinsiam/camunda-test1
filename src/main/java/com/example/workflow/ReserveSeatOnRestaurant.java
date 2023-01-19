package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class ReserveSeatOnRestaurant implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String money = "0";
        String ticketType = "Ground Floor";

        money = (String) delegateExecution.getVariable("money");
        int moneyInt = Integer.parseInt(money);

        if(moneyInt >= 15000){
            ticketType = "Ninth Floor";
        } else if (moneyInt >= 5000){
            ticketType = "Third Floor";
        }
        delegateExecution.setVariable("ticketType", ticketType);
    }
}
