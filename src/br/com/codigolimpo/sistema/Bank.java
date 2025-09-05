package br.com.codigolimpo.sistema;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface Bank {
    Collection<Account> getAccounts();
    void setAccounts(Collection<Account> accounts);
}

/* O uso de PROXY pode dificutar em muito a criação de um código limpo.
public class BankImpl implements Bank {
    private List<Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(Collection<Account> accounts) {
        this.accounts = new ArrayList<Account>();
        for (Account account: accounts) {
            this.accounts.add(account);
        }
    }
}

public class BankProxyHandler implements InvocationHandler {
    private Bank bank;

    public BankHandler(Bank bank) {
        this.bank = bank;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (methodName.equals("getAccounts")) {
            bank.setAccounts(getAccountsFromDatabase());
            return bank.getAccounts();
        } else if (methodName.equals("setAccounts")) {
            bank.setAccounts((Collection<Account>) args[0]);
            setAccountsToDatabase(bank.getAccounts());
            return null;
        } else {
        }
    }

    protected  Collection<Account> getAccountsFromDatabase() {
    }

    protected void setAccountsToDatabase(Collection<Account> accounts) {
    }

    Bank bank = (Bank) Proxy.newProxyInstance(Bank.class.getClassLoader(), new Class[] {Bank.class}, new BankProxyHandler(new BankImpl));
}
*/




