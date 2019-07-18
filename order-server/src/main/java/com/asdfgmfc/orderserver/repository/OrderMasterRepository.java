package com.asdfgmfc.orderserver.repository;

import com.asdfgmfc.orderserver.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
