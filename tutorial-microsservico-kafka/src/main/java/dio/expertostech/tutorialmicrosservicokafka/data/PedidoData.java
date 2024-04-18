package dio.expertostech.tutorialmicrosservicokafka.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoData {
    private String id;
    private String nomeProduto;
    private BigDecimal valor;

}
