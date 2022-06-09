package br.com.projectSpring.projeto.dio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

//    @GetMapping("/")
//    public String mensagem(){
//        return "Spring Boot Web";
//    }
    @GetMapping("/test")
        public String mensagem1(@RequestParam(name = "nome", defaultValue = "DIO") String nome) {
            return String.format("Bem Vindo, %s", nome);
    }
//    public String mensagem1(String nome){
//        return String.format("Spring Test, %s", nome);
//    }
}
