package com.cavapy.operaciones.controller;

import com.cavapy.operaciones.entity.Negociacion;
import com.cavapy.operaciones.util.OperacionesResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RestController
@RequestMapping(value = "/v1/negociaciones")
@Tag(name = "Negociación", description = "Endpoints para gestionar negociaciones")
public class NegociacionController {

    @Operation(summary = "Agregar Negociación",
            description = "Agrega una nueva negociación.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = OperacionesResponse.class)))
    @PostMapping(value = "/agregar", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OperacionesResponse> agregarNegociacion(@RequestBody Negociacion negociacion) {
        return new ResponseEntity<>(new OperacionesResponse("Negociación agregada correctamente."), HttpStatus.OK);
    }

    @Operation(summary = "Modificar Negociación",
            description = "Modifica una negociación existente.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = OperacionesResponse.class)))
    @PutMapping(value = "/modificar", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OperacionesResponse> modificarNegociacion(@RequestBody Negociacion negociacion) {
        return new ResponseEntity<>(new OperacionesResponse("Negociación modificada correctamente."), HttpStatus.OK);
    }

    @Operation(summary = "Eliminar Negociación",
            description = "Elimina una negociación existente.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = OperacionesResponse.class)))
    @DeleteMapping(value = "/eliminar", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OperacionesResponse> eliminarNegociacion(@RequestBody Negociacion negociacion) {
        return new ResponseEntity<>(new OperacionesResponse("Negociación eliminada correctamente."), HttpStatus.OK);
    }

    @Operation(summary = "Consultar Negociación",
            description = "Consulta una negociación existente.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa",
            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = Negociacion.class)))
    @GetMapping(value = "/consultar", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Negociacion> consultarNegociacion() {
        return new ResponseEntity<>(new Negociacion(), HttpStatus.OK);
    }
}
