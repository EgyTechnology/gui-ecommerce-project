package edu.ndeti.advanced.project.pcoders.exceptions;

public class DuplicatedUsernameException extends Exception {
    public DuplicatedUsernameException() {
        super("There is already a user with same username");
    }
}
