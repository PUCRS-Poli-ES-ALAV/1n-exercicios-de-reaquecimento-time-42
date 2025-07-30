package aula;

public class Recursao {

    public Recursao() {
        System.out.println(inverte("abc",3));
    }

    public int multi(int a, int b) {//apenas para numeros > 0
        if(b<0 || a < 0) return 0;
        if (b==0 || a == 0){
            return 0;
        }
        if (b == 1){
            return a;
        }
        return a + multi(a,b-1);
    }

    public int soma(int a, int b) { //apenas numeros positivos
        return somaRecA(a) + somaRecB(b);
    }
    public int somaRecA(int a) {
        if (a==1) return 1;
        else return 1 + somaRecA(a-1);
    }
    public int somaRecB(int b) {
        if (b==1) return 1;
        else return 1 + somaRecB(b-1);
    }

    /**
     * Calculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
     */
    public double ex3(int a){
        if (a==1) return 1;
        return (((double) 1 )/ a)+ex3(a-1);
    }

    /**
     * Gerador da sequência dada por:
     * F(1) = 1
     * F(2) = 2
     * F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).
     */
    public int ex5(int a){
        if (a==1) return 1;
        if (a==2) return 2;
        else return (2 * ex5(a-1)) + (3 * ex5(a-2));
    }

    /**
     * Gerador de Sequência de Ackerman:
     * A(m, n) = n + 1, se m = 0
     * A(m, n) = A(m − 1, 1), se m != 0 e n = 0
     * A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0.
     */
    public int ackerman(int m, int n){
        if(m == 0) return n + 1;
        if(m != 0 && n == 0) return ackerman(m-1,1);
        if(m !=0 && n != 0){
            return ackerman(m-1,ackerman(m,n-1));
        }
        return 0;
    }

    public int somaVetor(int[] vetor, int tamanho){
        if (tamanho == 1) return vetor[0];
        return vetor[tamanho-1] + somaVetor(vetor,tamanho-1);
    }

    public int produtoVetor(int[] vetor, int tamanho){
        if (tamanho == 1) return vetor[0];
        return vetor[tamanho-1] * produtoVetor(vetor,tamanho-1);
    }

    public String inverte(String a, int tamanho){
        if (tamanho == 1) {
            return String.valueOf(a.charAt(0));
        }
        return String.valueOf(a.charAt(tamanho-1)) + inverte(a,tamanho-1);
    }

}
