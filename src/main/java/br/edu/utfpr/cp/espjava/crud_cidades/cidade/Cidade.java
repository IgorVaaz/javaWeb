package br.edu.utfpr.cp.espjava.crud_cidades.cidade;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Cidade {

    @NotBlank(message="{app.cidade.blank}")
    @Size(min=5, max=60, message="{app.cidade.size}")
    private final String nome;

    @NotBlank(message="{app.estado.blank}")
    @Size(min=2, max=2, message="{app.estado.size}")
    private final String estado;

    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    public String getNome() {
        return nome;
    }

    public CidadeEntidade clonar(){
        var CidadeEntidade = new CidadeEntidade();
        CidadeEntidade.setNome(this.nome);
        CidadeEntidade.setEstado(this.estado);
        return CidadeEntidade;
    }

    public Cidade clonar(CidadeEntidade cidade){
        return new Cidade(cidade.getNome(), cidade.getEstado());
    }

}
