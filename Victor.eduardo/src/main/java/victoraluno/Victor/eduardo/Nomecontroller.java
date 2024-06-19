package victoraluno.Victor.eduardo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Nomecontroller {

    @GetMapping("/Aluno-de-kelson")
    public String getMeuNome() {
        return "Victor eduardo";
    }
}