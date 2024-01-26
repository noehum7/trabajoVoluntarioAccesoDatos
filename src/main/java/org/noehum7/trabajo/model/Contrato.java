package org.noehum7.trabajo.model;

/**
 * Clase que representa un contrato con sus atributos.
 */
public class Contrato {
    private Long id;
    private String nif;
    private String adjudicatario;
    private String fechaAdjudicacion;
    private String objetoGenerico;
    private String objeto;
    private String importe;
    private String tipoContrato;

    /**
     * Constructor por defecto de la clase Contrato.
     */
    public Contrato() {
    }

    /**
     * Constructor que inicializa un objeto Contrato con todos sus atributos.
     *
     * @param nif               NIF asociado al contrato.
     * @param adjudicatario     Adjudicatario del contrato.
     * @param fechaAdjudicacion Fecha de adjudicación del contrato.
     * @param objetoGenerico    Descripción genérica del objeto del contrato.
     * @param objeto            Objeto específico del contrato.
     * @param importe           Importe asociado al contrato.
     * @param tipoContrato      Tipo de contrato.
     */
    public Contrato(String nif, String adjudicatario, String fechaAdjudicacion, String objetoGenerico, String objeto, String importe, String tipoContrato) {
        this.nif = nif;
        this.adjudicatario = adjudicatario;
        this.fechaAdjudicacion = fechaAdjudicacion;
        this.objetoGenerico = objetoGenerico;
        this.objeto = objeto;
        this.importe = importe;
        this.tipoContrato = tipoContrato;
    }

    /**
     * Obtiene el ID del contrato.
     *
     * @return El ID del contrato.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del contrato.
     *
     * @param id El ID del contrato.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el NIF asociado al contrato.
     *
     * @return El NIF asociado al contrato.
     */
    public String getNif() {
        return nif;
    }

    /**
     * Establece el NIF asociado al contrato.
     *
     * @param nif El NIF asociado al contrato.
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Obtiene el adjudicatario del contrato.
     *
     * @return El adjudicatario del contrato.
     */
    public String getAdjudicatario() {
        return adjudicatario;
    }

    /**
     * Establece el adjudicatario del contrato.
     *
     * @param adjudicatario El adjudicatario del contrato.
     */
    public void setAdjudicatario(String adjudicatario) {
        this.adjudicatario = adjudicatario;
    }

    /**
     * Obtiene la fecha de adjudicación del contrato.
     *
     * @return La fecha de adjudicación del contrato.
     */
    public String getFechaAdjudicacion() {
        return fechaAdjudicacion;
    }

    /**
     * Establece la fecha de adjudicación del contrato.
     *
     * @param fechaAdjudicacion La fecha de adjudicación del contrato.
     */
    public void setFechaAdjudicacion(String fechaAdjudicacion) {
        this.fechaAdjudicacion = fechaAdjudicacion;
    }

    /**
     * Obtiene la descripción genérica del objeto del contrato.
     *
     * @return La descripción genérica del objeto del contrato.
     */
    public String getObjetoGenerico() {
        return objetoGenerico;
    }

    /**
     * Establece la descripción genérica del objeto del contrato.
     *
     * @param objetoGenerico La descripción genérica del objeto del contrato.
     */
    public void setObjetoGenerico(String objetoGenerico) {
        this.objetoGenerico = objetoGenerico;
    }

    /**
     * Obtiene el objeto específico del contrato.
     *
     * @return El objeto específico del contrato.
     */
    public String getObjeto() {
        return objeto;
    }

    /**
     * Establece el objeto específico del contrato.
     *
     * @param objeto El objeto específico del contrato.
     */
    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    /**
     * Obtiene el importe asociado al contrato.
     *
     * @return El importe asociado al contrato.
     */
    public String getImporte() {
        return importe;
    }

    /**
     * Establece el importe asociado al contrato.
     *
     * @param importe El importe asociado al contrato.
     */
    public void setImporte(String importe) {
        this.importe = importe;
    }

    /**
     * Obtiene el tipo de contrato.
     *
     * @return El tipo de contrato.
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * Establece el tipo de contrato.
     *
     * @param tipoContrato El tipo de contrato.
     */
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
