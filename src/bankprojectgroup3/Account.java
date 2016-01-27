/*
 * Program:Account.java
 * This bankprojectgroup3
 * Date:1/27/2016
 * Author: Nicholas Johnston, Tim Ryan, Brice Habets, Thomas Kweram
 * Purpose: To hold balances, then anems of account holders, and savings checkings and loans
 */
package bankprojectgroup3;
//==========================================class body: ==========================
/**
 *
 * @author Nick
 */

public class Account {
    //=====Class member variables=====================================
    private double checking;
    private double savings;
    private double debt;
    private String name;
    private double balance;
    //==================Defualt constructor===========================
    public Account()
    {
        
    }
    //=====================Parameterized contructor================
    public Account(double checking, double savings, double loans, String name) {
        this.checking = checking;
        this.savings = savings;
        this.debt = loans;
        this.name = name;
    }
    //====================account methods===============================
    
    //======================getter setter block========================
    //========================Checking=================================

    public double getChecking() {
        return checking;
    }

    public void setChecking(double checking) {
        this.checking = checking;
    }
    //=========================savings=======================================

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }
    //======================Debt==============================================

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }
    //===============Name====================================================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //================== balance===============================================

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //============end of getter setter block====================================
    
}
