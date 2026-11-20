/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant;

/**
 *
 * @author Utilizador
 */
public class GestorEmentas {

 
    public static final int MAX_EMENTAS = 20;

    private Ementa[] ementas;
    private int numEmentas;


    public GestorEmentas() {
        this.ementas = new Ementa[MAX_EMENTAS];
        this.numEmentas = 0;
    }

        public int getNumEmentas() {
        return this.numEmentas;
    }

   
    public boolean adicionarEmenta(Ementa ementa) {
        if (ementa == null || this.numEmentas >= MAX_EMENTAS
                || this.encontrarEmenta(ementa.getCodigo()) != null) {
            return false;
        }
        if (ementa.isAtivo() && this.getEmentaAtiva() != null) {
            ementa.setAtivo(false);
        }
        this.ementas[this.numEmentas] = ementa;
        this.numEmentas++;
        return true;
    }

  

    public Ementa encontrarEmenta(String codigo) {
        for (int i = 0; i < this.numEmentas; i++) {
            if (this.ementas[i].getCodigo().equals(codigo)) {
                return this.ementas[i];
            }
        }
        return null;
    }

    public Ementa getEmentaAtiva() {
        for (int i = 0; i < this.numEmentas; i++) {
            if (this.ementas[i].isAtivo()) {
                return this.ementas[i];
            }
        }
        return null;
    }

  
    public boolean ativarEmenta(String codigo) {
        Ementa alvo = this.encontrarEmenta(codigo);
        if (alvo == null) {
            return false;
        }
        for (int i = 0; i < this.numEmentas; i++) {
            this.ementas[i].setAtivo(false);
        }
        alvo.setAtivo(true);
        return true;
    }

   
    public boolean desativarEmenta(String codigo) {
        Ementa alvo = this.encontrarEmenta(codigo);
        if (alvo == null) {
            return false;
        }
        alvo.setAtivo(false);
        return true;
    }

   
    public String listar() {
        if (this.numEmentas == 0) {
            return "(sem ementas)";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.numEmentas; i++) {
            if (i > 0) {
                sb.append("\n");
            }
            sb.append(this.ementas[i]);
        }
        return sb.toString();
    }
}
