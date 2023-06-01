package afica.semicolon.regcrow.repository;

import afica.semicolon.regcrow.models.Customer;
import jakarta.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositoryInterface extends JpaRepository<Transaction, Long> {
}
