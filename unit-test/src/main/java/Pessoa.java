import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDate nascimento;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getNascimento() {
        return nascimento;
    }
    public void setNascimento(LocalDate idade) {
        this.nascimento = idade;
    }

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
    
    public long getIdade() {
        long idade  = ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
        return idade;
    }

    public boolean ehMaiorDeIdade() {
        return getIdade() >=18;
    }

    public void definirMesada(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero!");
        }
    }
}
