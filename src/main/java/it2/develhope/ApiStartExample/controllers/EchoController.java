package it2.develhope.ApiStartExample.controllers;

import it2.develhope.ApiStartExample.DTO_Data_Transfer_Object.UserDTO;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.http.HttpHeaders;

@RestController
@RequestMapping("/api") // posso esporre la mia API sotto un percorso comune
public class EchoController { //creiamo un rest controller

/*
    @GetMapping(value = "/echo/{id}")
    public String getRoute(@PathVariable(required = false, value = "id") String userId){
        return "Ciao io sono il GET " + userId;
    }
*/
/*
    @GetMapping(value = "/echo/{id}")
    public String getRoute(@PathVariable String id){
        return "Ciao io sono il GET " + id;
    }
*/
/*
    @GetMapping(value = "/echo")
    public String getRoute(@RequestParam(required = false) String id, @RequestParam(required = false) Integer quantity){
        return "Ciao io sono il GET " + id + " quantity is " + quantity;
    }
*/
    @GetMapping(value = "/echo/{id}") //esegue il verbo GET secondo il percorso "/echo/{id}"
    public String getRoute(@PathVariable String id, //si riferisci a "/echo/{id}" value in @GetMapping
                           @RequestParam(required = false) Integer quantity, //per inserire parametri in query String
                           @RequestHeader HttpHeaders headers){ //per interagire con gli headers
        return "Ciao io sono il GET " + id + " quantity is " + quantity;
    }
/*
    @PostMapping(value = "/echo")
    public String postRoot(){
        return "Ciao io sono il POST";
    }
*/
/*
    @PostMapping(value = "/echo")
    public String postRoot(@RequestBody UserDTO userDTO){
        return userDTO.toString();
    }
*/

    @PostMapping(value = "/echo") // verbo POST
    //si usa @RequestBody per mappare la classe UserDTO.In POSTMAN faremo una chiamata POST e inseriremo un file JSON
/* - ad esempio:
    {"name": "Angelo",
    "surname": "Zammataro",
    "id":"12345-5469daa87"}
*/
/*
    public String postRoot(@RequestBody UserDTO userDTO, HttpServletRequest request, HttpServletResponse response){
        return userDTO.toString();
    }
*/
    //effettuiamo la VALIDAZIONE con @Valid(ricordiamo di importare la dipendenza
    /*
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
     */
    
    public String postRoot(@Valid @RequestBody UserDTO userDTO, HttpServletRequest request, HttpServletResponse response){
        return userDTO.toString();
    }

    //usiamo il VERBO DELETE
    @DeleteMapping(value = "/echo")
    public String deleteRoot(){
        return "Ciao io sono il DELETE";
    }
}
