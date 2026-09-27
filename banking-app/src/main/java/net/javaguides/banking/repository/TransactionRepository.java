package net.javaguides.banking.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.banking.entity.Transaction;
public interface TransactionRepository extends JpaRepository<Transaction, Long>{
    List<Transaction> findByAccountIdOrderByTimestampDesc(Long accountId);
}
