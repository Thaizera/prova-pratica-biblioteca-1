package siga;

public class Reservado implements SituacaoEmprestimo {

    @Override
    public void emprestar(Emprestimo emprestimo) {
        emprestimo.setEstado(new Emprestado());
    }

    @Override
    public void restituir(Emprestimo emprestimo) {
        throw new IllegalStateException("Nao e possivel restituir em RESERVADO.");
    }

    @Override
    public void anular(Emprestimo emprestimo) {
        emprestimo.setEstado(new Encerrado());
    }

    @Override
    public String getSituacao() {
        return "RESERVADO";
    }
}
