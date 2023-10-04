package com.utn.demo.controllers;

import com.utn.demo.entities.Persona;
import com.utn.demo.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //indicamos que estamos en la capa de Controllers
@CrossOrigin(origins = "*") //permite accesos a nuestra api desde varios clientes
@RequestMapping(path = "api/v1/personas") // Nos permite que a traves de la URL podemos acceder a los metodos de persona
public class PersonaController  extends BaseControllerImpl<Persona,PersonaServiceImpl>{


}