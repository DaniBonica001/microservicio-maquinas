package co.analisys.machineservice.API;


import co.analisys.machineservice.model.Machine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(MachineAPI.BASE_URL)
public interface MachineAPI {
    String BASE_URL = "/machines";

    @PostMapping
    Machine createMachine(@RequestBody Machine machine);

    @GetMapping("/all")
    List<Machine> getAllMachines();

}
