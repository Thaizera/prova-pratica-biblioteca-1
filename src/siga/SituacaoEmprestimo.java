package siga;

// Cada situacao sabe quais operacoes ela aceita.
public interface SituacaoEmprestimo {

    void emprestar(Emprestimo emprestimo);

    void restituir(Emprestimo emprestimo);

    void anular(Emprestimo emprestimo);

    String getSituacao();
}
