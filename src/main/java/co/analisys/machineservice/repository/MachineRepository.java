package co.analisys.machineservice.repository;

import co.analisys.machineservice.model.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MachineRepository extends JpaRepository<Machine, Long> {
}
