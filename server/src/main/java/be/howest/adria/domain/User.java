package be.howest.adria.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class User {
    private UUID userId;
    private String nationalRegisterNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private NotificationType notificationType;

    private List<Order> orders;
    private List<Review> reviews;
    private List<Wishlist> wishlists;
    private Membership membership;
    private LoyaltyProgram loyaltyProgram;
    private List<Return> returns;

    public static User create(String nationalRegisterNumber, String firstName, String lastName, String email,  String phoneNumber, NotificationType notificationType) {
        return new User(UUID.randomUUID(), nationalRegisterNumber, firstName, lastName, email,  phoneNumber, notificationType);
    }

    public static User create(UUID userId, String nationalRegisterNumber, String firstName, String lastName, String email,  String phoneNumber, NotificationType notificationType) {
        return new User(userId, nationalRegisterNumber, firstName, lastName, email,  phoneNumber, notificationType);
    }

    private User(UUID userId, String nationalRegisterNumber, String firstName, String lastName, String email,  String phoneNumber, NotificationType notificationType) {
        this.userId = userId;
        this.nationalRegisterNumber = nationalRegisterNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.notificationType = notificationType;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getNationalRegisterNumber() {
        return nationalRegisterNumber;
    }

    public void setNationalRegisterNumber(String nationalRegisterNumber) {
        this.nationalRegisterNumber = nationalRegisterNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }
}
