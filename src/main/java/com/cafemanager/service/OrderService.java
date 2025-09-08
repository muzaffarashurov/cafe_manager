package com.cafemanager.service;

import com.cafemanager.repository.MenuItemRepository;
import com.cafemanager.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    private final MenuItemRepository menuItemRepository;

}
