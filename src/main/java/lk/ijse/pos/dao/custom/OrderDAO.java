package lk.ijse.pos.dao.custom;

import lk.ijse.pos.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderDAO extends JpaRepository<Order, Integer> {

    @Query(value = "SELECT o.id FROM  `Order` o ORDER by o.id DESC limit 1",nativeQuery = true)
    int getLastOrderId()throws Exception;
}
