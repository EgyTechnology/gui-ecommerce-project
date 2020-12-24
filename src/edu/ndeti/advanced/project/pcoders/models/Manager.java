package edu.ndeti.advanced.project.pcoders.models;

import edu.ndeti.advanced.project.pcoders.exceptions.DuplicatedUsernameException;
import edu.ndeti.advanced.project.pcoders.repositories.ProductsRepository;
import edu.ndeti.advanced.project.pcoders.repositories.UsersRepository;

public class Manager extends User {

    public void addUser(User user) throws DuplicatedUsernameException {
        UsersRepository.getInstance().addUser(user);
    }

    public void addProduct(Product product) {
        ProductsRepository.getInstance().addProduct(product);
    }
}
