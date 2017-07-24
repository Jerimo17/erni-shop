package sk.erni.shop.antal.config;

import org.glassfish.jersey.server.ResourceConfig;

import sk.erni.shop.antal.controller.CustomerController;
import sk.erni.shop.antal.controller.OrderController;


public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        register(OrderController.class);
        register(CustomerController.class);
    }
}