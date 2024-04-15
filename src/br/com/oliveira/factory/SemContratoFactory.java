package br.com.oliveira.factory;

public class SemContratoFactory extends  Factory{

    Car retriveCar(String requestedGrade) {
        if("A".equals(requestedGrade)) {
            return new BmwM3(300, "cheio", "Azul");
        } else {
            return null;
        }
    }
}
