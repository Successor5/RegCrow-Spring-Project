package afica.semicolon.regcrow.repository;

import afica.semicolon.regcrow.models.BioData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BioDataRepositoryInterface extends JpaRepository<BioData, Long> {
}
