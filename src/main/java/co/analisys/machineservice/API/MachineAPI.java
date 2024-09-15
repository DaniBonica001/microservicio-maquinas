package co.analisys.machineservice.API;


import co.analisys.machineservice.model.Machine;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(MachineAPI.BASE_URL)
public interface MachineAPI {
    String BASE_URL = "/machines";

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_TRAINER')")
    @Operation(
            summary = "Crear una nueva máquina",
            description = "Este endpoint permite crear una nueva máquina proporcionando los detalles de la misma."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Máquina creada exitosamente"),
            @ApiResponse(responseCode = "400", description = "Datos de entrada no válidos"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    Machine createMachine(@RequestBody Machine machine);

    @GetMapping("/all")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_TRAINER', 'ROLE_MEMBER')")
    @Operation(
            summary = "Obtener todas las máquinas",
            description = "Este endpoint permite obtener una lista de todas las máquinas registradas."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Máquinas recuperadas exitosamente"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    List<Machine> getAllMachines();

}
