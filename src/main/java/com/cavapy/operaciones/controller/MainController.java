package com.cavapy.operaciones.controller;

import com.cavapy.operaciones.entity.TituloValor;
import com.cavapy.operaciones.util.ResponseApi;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/operaciones")
@Tag(name = "Operaciones de Titulo Valor", description = "Operaciones relacionadas con Titulo Valor")
public class MainController {

    @PostMapping(value = "/agregar", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Agregar Titulo Valor", description = "Registrar un nuevo titulo valor.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Titulo valor registrado correctamente",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseApi.class)))
    })
    public ResponseEntity<?> altaTituloValor(@RequestBody TituloValor tituloValor) {
        return new ResponseEntity<>(new ResponseApi("Titulo valor registrado correctamente."), HttpStatus.OK);
    }

    @GetMapping(value = "/consultar", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Consultar Titulo Valor", description = "Consultar un titulo valor existente.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Titulo valor consultado correctamente",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = TituloValor.class)))
    })
    public ResponseEntity<?> consultaTituloValor() {
        return new ResponseEntity<>(new TituloValor(), HttpStatus.OK);
    }

    @PutMapping(value = "/modificar", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Modificar Titulo Valor", description = "Modificar un titulo valor existente.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Titulo valor modificado correctamente",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseApi.class)))
    })
    public ResponseEntity<?> modificarTituloValor() {
        return new ResponseEntity<>(new ResponseApi("Titulo valor modificado correctamente."), HttpStatus.OK);
    }

    @DeleteMapping(value = "/eliminar", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Eliminar Titulo Valor", description = "Eliminar un titulo valor existente.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Titulo valor eliminado",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseApi.class)))
    })
    public ResponseEntity<?> eliminarTituloValor() {
        return new ResponseEntity<>(new ResponseApi("Titulo valor eliminado."), HttpStatus.OK);
    }

}
