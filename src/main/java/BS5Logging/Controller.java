package BS5Logging;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class Controller {
  private String saludo;

  @GetMapping("/")
  public String getLogging() {
    log.info("Hola soy una informacion");
    return "Hola desde controlador!!" ;
  }
}
