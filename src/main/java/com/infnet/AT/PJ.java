package com.infnet.AT;

public class PJ extends Contas{
    public String nomeDaEmpresa;
    public String cnpj;

    public PJ(int numeroDaConta, String nomeDaEmpresa, String cnpj, float saldo) {
        super(numeroDaConta, saldo);
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.cnpj = cnpj;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void debito(float valor){
        saldo -= valor;
    }

    @Override
    public String toString() {
        String[] divisoes = nomeDaEmpresa.split(" ");
        StringBuilder nomeCompleto = new StringBuilder();
        
        nomeDaEmpresa = nomeCompleto.append(divisoes[0].substring(0, 1).toUpperCase())
                    .append(divisoes[0].substring(1))
                    .append(" ")
                    .append(divisoes[1].substring(0, 1).toUpperCase())
                    .append(divisoes[1].substring(1)).toString();

        return super.toString() + "\nNome da empresa: " + nomeDaEmpresa + "\nCNPJ: " + cnpj;
    }
    
    
}
