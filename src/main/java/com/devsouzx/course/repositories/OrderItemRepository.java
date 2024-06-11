package com.devsouzx.course.repositories;

import com.devsouzx.course.entities.OrderItem;
import com.devsouzx.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
