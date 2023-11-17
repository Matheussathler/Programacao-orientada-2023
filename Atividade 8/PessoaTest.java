

public class PessoaTest {
    @Test
    public void testDizerOla() {
        Pessoa pessoa = new Pessoa("João");
        String resultado = pessoa.dizerOla();
        assertEquals("Olá, meu nome é João!", resultado);
    }
}