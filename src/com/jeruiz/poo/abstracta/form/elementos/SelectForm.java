package com.jeruiz.poo.abstracta.form.elementos;

import com.jeruiz.poo.abstracta.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends FormElement{

    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        opciones = new ArrayList<>();
    }
    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion){
        opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(nombre)
                .append("'>");

        for (Opcion opcion : opciones){
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()){
                sb.append(" selected");
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
