package siga;

public class Emprestado implements SituacaoEmprestimo {

    @Override
    public void emprestar(Emprestimo emprestimo) {
        throw new IllegalStateException("Nao e possivel emprestar em EMPRESTADO.");
    }

    @Override
    public void restituir(Emprestimo emprestimo) {
        emprestimo.setEstado(new Encerrado());
    }

    @Override
    public void anular(Emprestimo emprestimo) {
        throw new IllegalStateException("Nao e possivel anular em EMPRESTADO.");
    }

    @Override
    public String getSituacao() {
        return "EMPRESTADO";
    }
}
