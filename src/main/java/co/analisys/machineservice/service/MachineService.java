package co.analisys.machineservice.service;

import co.analisys.machineservice.model.Machine;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import co.analisys.machineservice.repository.MachineRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MachineService {

    private final MachineRepository machineRepository;

    public Machine createMachine(Machine machine){
        return machineRepository.save(machine);
    }

    public List<Machine> getAllMachines(){
        return machineRepository.findAll();
    }

}
