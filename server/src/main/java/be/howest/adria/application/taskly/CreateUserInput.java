package be.howest.adria.application.taskly;

import be.howest.adria.domain.NotificationType;

public class CreateUserInput {
    public final String firstName;
    public final String lastName;
    public final String email;
    public final String nationalRegistryNumber;
    public final String phoneNumber;
    public final NotificationType notificationType;

    public CreateUserInput(String firstName, String lastName, String email, String nationalRegistryNumber, String phoneNumber, NotificationType notificationType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.nationalRegistryNumber = nationalRegistryNumber;
        this.phoneNumber = phoneNumber;
        this.notificationType = notificationType;
    }


}
