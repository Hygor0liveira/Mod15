package br.com.oliveira.factory;

public class ContratodFactory extends Factory{

    private Car DodgeCar;

    Car retriveCar(String requestedGrade) {
        if("A".equals(requestedGrade)) {
            return new CorolaCar(100, "cheio", "preto");
        } else {
            return new DodgeCar(350, "Cheio", "Branco");
        }
    }
}
