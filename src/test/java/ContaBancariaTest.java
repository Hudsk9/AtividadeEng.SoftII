import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
     void deveDepositarValorPositivoComSucesso() {
        // Arrange (Preparar) - Instanciamos a conta e preparamos o ambiente
        ContaBancaria conta = new ContaBancaria();

        // Act (Agir) - Executamos a ação que queremos testar
        conta.depositar(100.0);

        // Assert (Verificar) - Comparamos o resultado esperado com o real
        assertEquals(100.0, conta.getSaldo(), "O saldo deve ser 100.0 após o depósito");
    }
}