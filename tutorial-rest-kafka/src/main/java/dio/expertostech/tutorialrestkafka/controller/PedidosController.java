package dio.expertostech.tutorialrestkafka.controller;

import dio.expertostech.tutorialrestkafka.data.PedidoData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import dio.expertostech.tutorialrestkafka.service.RegistraEventoService;

@RestController
public class PedidosController {
 private final RegistraEventoService eventoService;

    public PedidosController(RegistraEventoService eventoService) {
        this.eventoService = eventoService;
    }

    @PostMapping(path = "/api/salva-pedido")
    public ResponseEntity<String> SalvarPedido(@RequestBody PedidoData pedido){
        System.out.println("Entrei");
        eventoService.adicionarEvento("SalvarPedido", pedido);
        return ResponseEntity.ok("Sucesso");
    }

}
