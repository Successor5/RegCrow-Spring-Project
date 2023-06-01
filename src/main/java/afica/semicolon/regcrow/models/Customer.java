package afica.semicolon.regcrow.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Setter;

import java.time.LocalDateTime;

public class Customer {
    @Id
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
//    public class User{
    private BioData bioData;
    private String firstname;
    private String lastname;

    private String profileImage;
    private LocalDateTime createdAt;
    @OneToOne
    private BankAccount bankAccount;


}

