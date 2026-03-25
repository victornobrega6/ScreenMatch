package br.com.alura.screenmatch.calculo;

public class Recomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassficacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        }else if (classificavel.getClassficacao() >= 2) {
            System.out.println("muito bem avaliado no momento!");
        }else{
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}
