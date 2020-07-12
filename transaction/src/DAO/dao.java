package DAO;

import DAOexception.nomoneyinaccount;
import model.bank;

public interface dao {
abstract void credit(bank fromacc,bank toacc,double amount);
abstract void debit(bank fromacc,bank toacc,double amount) throws nomoneyinaccount;
}
