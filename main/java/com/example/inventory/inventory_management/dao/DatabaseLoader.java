package com.example.inventory.inventory_management.dao;

import com.example.inventory.inventory_management.model.Customer;
import com.example.inventory.inventory_management.model.Location;
import com.example.inventory.inventory_management.model.Member;
import com.example.inventory.inventory_management.model.Order;
import com.example.inventory.inventory_management.model.Product;
import com.example.inventory.inventory_management.model.Warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private WarehouseRepository warehouseRepository;
    @Autowired
    private LocationRepository locationRepository;

    public DatabaseLoader() {
    }

    @Override
    public void run(String... args) throws Exception {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        int d = (int) (Math.random() * 10);
        int e = (int) (Math.random() * 10);
        int f = (int) (Math.random() * 10);
        Member member = new Member(a + "" + b + "" + c + "" + d + "" + e + "" + f + "" + "@gmail.com",
                "00" + a + b + c + d + e + f,
                "Michael" + a + b + c + d + e + f, "Jordan" + a + b + c + d + e + f);
        memberRepository.save(member);
        Product product = new Product(a + "" + b + "" + c + "" + d + "" + e + "" + f + "", a + b + c + d + e + f + "",
                "XXX", "YYY");
        productRepository.save(product);
        // Order order = new Order("XXX-XXXXX", a + b + c + d + e + f);
        // orderRepository.save(order);
        Warehouse warehouse = new Warehouse("W-" + a + "" + b + "" + c, "XXX", "YYY-YYY-YYY",
                "02-" + a + "" + b + "" + c + "" + d + "" + e + "" + f + "");
        warehouseRepository.save(warehouse);
        Location location = new Location("L-" + a + "" + b + "" + c + "" + d + "" + e + "" + f + "", "Locked", 100,
                "Package");
        locationRepository.save(location);
        Customer customer = new Customer(a + "" + b + "" + c + "" + d + "" + e + "" + f + "", "XXXXX",
                "Xinyi distrinct");
        customerRepository.save(customer);

    }
}