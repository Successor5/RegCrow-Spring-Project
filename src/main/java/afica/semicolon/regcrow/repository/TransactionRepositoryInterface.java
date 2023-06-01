package afica.semicolon.regcrow.repository;

import jakarta.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepositoryInterface extends JpaRepository<Transaction,Long> {
}
