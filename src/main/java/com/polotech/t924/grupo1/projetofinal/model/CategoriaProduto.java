<<<<<<< HEAD
package com.polotech.t924.grupo1.projetofinal.model;

public class CategoriaProduto {

    ELETRONICO("eletronico"), ELETRODOMESTICO("eletrodomestico"),INFORMATICA("informatica"),SMARTPHONE("smartphone");
    private String value;
    private CategoriaProduto(String value){
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

=======
package com.polotech.t924.grupo1.projetofinal.model;

public enum CategoriaProduto {
    ELETRONICO("eletronico"), ELETRODOMESTICO("eletrodomestico"),INFORMATICA("informatica"),SMARTPHONE("smartphone");
    private String value;
    private CategoriaProduto(String value){
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
>>>>>>> 21f07f63398b29611fe1bbdb3a8edf7f685d7e59
