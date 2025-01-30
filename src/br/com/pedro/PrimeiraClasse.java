package br.com.pedro;

public class PrimeiraClasse {
    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equals("Dev")) {
            System.out.print(ambiente);
        }
        else {
            System.out.print("Hello Pedro");
        }
    }}
