package Service;

import DAOexception.nomoneyinaccount;
import model.bank;

public interface service {
abstract void transferfund(bank from_acc,bank to_acc,double amount) throws nomoneyinaccount;
}
