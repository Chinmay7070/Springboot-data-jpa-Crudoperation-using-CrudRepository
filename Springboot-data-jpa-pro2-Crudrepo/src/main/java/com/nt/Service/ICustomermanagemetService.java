package com.nt.Service;

import com.nt.entity.Coustomer;

public interface ICustomermanagemetService {
    public String registerCustomer(Coustomer cust);
    public String registerCustomerGroup(Iterable<Coustomer> list);
    public boolean isCustomerAvaliable(Integer id);
}
