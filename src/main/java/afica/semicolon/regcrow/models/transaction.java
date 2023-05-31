package afica.semicolon.regcrow.models;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class transaction {
    @Id
    @OneToOne
    private payment payment;
    private long sellerId;
}
