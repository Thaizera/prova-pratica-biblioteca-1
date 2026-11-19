package siga;

import java.util.ArrayList;
import java.util.List;

// Faz a traducao do formato usado pelo sistema antigo.
public class AcervoAdapter implements ProvedorAcervo {

    private final AcervoLegadoWS legado;

    public AcervoAdapter(AcervoLegadoWS legado) {
        this.legado = legado;
    }

    @Override
    public List<Exemplar> listarExemplares() {
        List<Exemplar> lista = new ArrayList<>();

        for (String[] linha : legado.consultarExemplares()) {
            Exemplar item = new Exemplar(linha[0], linha[1]);
            String situacao = linha[2].trim().toUpperCase();
            item.setDisponivel("D".equals(situacao));
            lista.add(item);
        }
        return lista;
    }
}
