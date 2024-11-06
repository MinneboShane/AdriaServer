package be.howest.adria.application.taskly;

import be.howest.adria.domain.NotificationType;

public class CreateUserInput {
    public final String nationalRegistryNumber;
    public final String firstName;
    public final String lastName;
    public final String email;
    public final String phoneNumber;
    public final NotificationType notificationType;

    public CreateUserInput(String firstName, String nationalRegistryNumber, String lastName, String email,  String phoneNumber, NotificationType notificationType) {
        this.nationalRegistryNumber = nationalRegistryNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.notificationType = notificationType;
    }


}
