package com.jeruiz.poo.abstracta.form.elementos;

import com.jeruiz.poo.abstracta.form.validador.*;
import com.jeruiz.poo.abstracta.form.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class FormElement {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;


    public FormElement() {
        validadores = new ArrayList<>();
        errores = new ArrayList<>();
    }

    public FormElement(String nombre) {
        this();
        this.nombre = nombre;
    }

    public FormElement addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido(){
        for(Validador v: validadores){
            if(!v.esValido(this.valor)){
                if(v instanceof MensajeFormateable) {
                    this.errores.add(((MensajeFormateable) v).getMensajeFormateado(nombre));
                } else {
                    this.errores.add(String.format(v.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();

}
