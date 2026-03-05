import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void DepositarValorPositivo() {
        // arranjo
        ContaBancaria conta = new ContaBancaria();

        // agir
        conta.depositar(100.0);

        // afirmar
        assertEquals(100.0, conta.getSaldo(), "O saldo deve ser 100.0 após o depósito");
    }

    @Test
    void naoPermitirDepositoNegativoOuZero() {

        ContaBancaria conta = new ContaBancaria();

        assertThrows(IllegalArgumentException.class, () -> {
            conta.depositar(-50.0);
        }, "Deve lançar exceção ao tentar depositar valor negativo");
    }

    @Test
    void deveRealizarSaqueComSucessoQuandoHouverSaldo() {

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(200.0);

        conta.sacar(50.0);

        assertEquals(150.0, conta.getSaldo(), "O saldo deve ser 150.0 após sacar 50.0");
    }

    @Test
    void naoDevePermitirSaqueMaiorQueOSaldo() {

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.0);

        assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(150.0);
        }, "Deve lançar exceção ao tentar sacar valor maior que o saldo");
    }

    @Test
    void ManterOSaldoCorretoAposOperacoes() {

        ContaBancaria conta = new ContaBancaria();

        conta.depositar(500.0);
        conta.sacar(100.0);
        conta.depositar(50.0);
        conta.sacar(450.0);

        assertEquals(0.0, conta.getSaldo(), "O saldo deve zerar após todas as operações");
    }

    @Test
    void RetornarSaldoZeroACriarNovaConta() {

        ContaBancaria conta = new ContaBancaria();

        double saldoAtual = conta.getSaldo();

        assertEquals(0.0, saldoAtual, "Uma conta recém-criada deve ter sempre o saldo inicial de 0.0");
    }
}