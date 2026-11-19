package siga;

import java.util.List;

// Interface simples para nao deixar as telas dependentes do legado.
public interface ProvedorAcervo {

    List<Exemplar> listarExemplares();
}
