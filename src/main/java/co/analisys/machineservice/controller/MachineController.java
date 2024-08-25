package co.analisys.machineservice.controller;

import co.analisys.machineservice.API.MachineAPI;
import co.analisys.machineservice.model.Machine;
import co.analisys.machineservice.service.MachineService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MachineController implements MachineAPI {

    private final MachineService machineService;
    @Override
    public Machine createMachine(Machine machine) {
        return machineService.createMachine(machine);
    }

    @Override
    public List<Machine> getAllMachines() {
        return machineService.getAllMachines();
    }
}
