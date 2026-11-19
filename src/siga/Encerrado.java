package siga;

public class Encerrado implements SituacaoEmprestimo {

    @Override
    public void emprestar(Emprestimo emprestimo) {
        throw new IllegalStateException("Emprestimo ja encerrado.");
    }

    @Override
    public void restituir(Emprestimo emprestimo) {
        throw new IllegalStateException("Emprestimo ja encerrado.");
    }

    @Override
    public void anular(Emprestimo emprestimo) {
        throw new IllegalStateException("Emprestimo ja encerrado.");
    }

    @Override
    public String getSituacao() {
        return "ENCERRADO";
    }
}
