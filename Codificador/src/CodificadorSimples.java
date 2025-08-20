import java.time.LocalDate;

public class CodificadorSimples implements Codificador {
    public String getNome() {
        return "CODIFICADOR SIMPLES";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 08, 20);
    }

    public int getNivelSeguranca(){
        return 1;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c + 1));
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            encoded.append((char) (c - 1));
        }
        
        return encoded.toString();
    }
}
