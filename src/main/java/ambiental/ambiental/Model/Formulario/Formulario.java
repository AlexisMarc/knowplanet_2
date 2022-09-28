package ambiental.ambiental.Model.Formulario;

import ambiental.ambiental.Model.Categoria;
import ambiental.ambiental.Model.Descripcion;
import ambiental.ambiental.Model.Imagen;
import ambiental.ambiental.Model.Prueba;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Formulario {

    @NotEmpty
    private String titulo;

    @NotNull
    private Boolean tipo;
    private Boolean estado=true;

    @NotNull
    private Categoria categoria;

    @NotNull
    private Descripcion texto1;
    @NotNull
    private Descripcion texto2;
    private Descripcion texto3;
    private Descripcion texto4;
    private Descripcion texto5;

    @NotEmpty
    private Imagen img1;
    private Imagen img2;
    private Imagen img3;

    @NotNull
    private Boolean prueba;

    private Prueba prueba1;
    private Prueba prueba2;
    private Prueba prueba3;
    private Prueba prueba4;
    private Prueba prueba5;
    private Prueba prueba6;
    private Prueba prueba7;
    private Prueba prueba8;
    private Prueba prueba9;
    private Prueba prueba10;


    


    
    public Formulario(@NotEmpty String titulo, @NotNull Boolean tipo, Boolean estado, @NotNull Categoria categoria,
            @NotNull Descripcion texto1, @NotNull Descripcion texto2, Descripcion texto3, Descripcion texto4,
            Descripcion texto5, @NotEmpty Imagen img1, Imagen img2, Imagen img3, @NotNull Boolean prueba,
            Prueba prueba1, Prueba prueba2, Prueba prueba3, Prueba prueba4, Prueba prueba5, Prueba prueba6,
            Prueba prueba7, Prueba prueba8, Prueba prueba9, Prueba prueba10) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.estado = estado;
        this.categoria = categoria;
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.texto3 = texto3;
        this.texto4 = texto4;
        this.texto5 = texto5;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.prueba = prueba;
        this.prueba1 = prueba1;
        this.prueba2 = prueba2;
        this.prueba3 = prueba3;
        this.prueba4 = prueba4;
        this.prueba5 = prueba5;
        this.prueba6 = prueba6;
        this.prueba7 = prueba7;
        this.prueba8 = prueba8;
        this.prueba9 = prueba9;
        this.prueba10 = prueba10;


    }public Formulario() {
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Boolean getTipo() {
        return tipo;
    }
    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Descripcion getTexto1() {
        return texto1;
    }
    public void setTexto1(Descripcion texto1) {
        this.texto1 = texto1;
    }
    public Descripcion getTexto2() {
        return texto2;
    }
    public void setTexto2(Descripcion texto2) {
        this.texto2 = texto2;
    }
    public Descripcion getTexto3() {
        return texto3;
    }
    public void setTexto3(Descripcion texto3) {
        this.texto3 = texto3;
    }
    public Descripcion getTexto4() {
        return texto4;
    }
    public void setTexto4(Descripcion texto4) {
        this.texto4 = texto4;
    }
    public Descripcion getTexto5() {
        return texto5;
    }
    public void setTexto5(Descripcion texto5) {
        this.texto5 = texto5;
    }
    public Imagen getImg1() {
        return img1;
    }
    public void setImg1(Imagen img1) {
        this.img1 = img1;
    }
    public Imagen getImg2() {
        return img2;
    }
    public void setImg2(Imagen img2) {
        this.img2 = img2;
    }
    public Imagen getImg3() {
        return img3;
    }
    public void setImg3(Imagen img3) {
        this.img3 = img3;
    }
    public Boolean getPrueba() {
        return prueba;
    }
    public void setPrueba(Boolean prueba) {
        this.prueba = prueba;
    }
    public Prueba getPrueba1() {
        return prueba1;
    }
    public void setPrueba1(Prueba prueba1) {
        this.prueba1 = prueba1;
    }
    public Prueba getPrueba2() {
        return prueba2;
    }
    public void setPrueba2(Prueba prueba2) {
        this.prueba2 = prueba2;
    }
    public Prueba getPrueba3() {
        return prueba3;
    }
    public void setPrueba3(Prueba prueba3) {
        this.prueba3 = prueba3;
    }
    public Prueba getPrueba4() {
        return prueba4;
    }
    public void setPrueba4(Prueba prueba4) {
        this.prueba4 = prueba4;
    }
    public Prueba getPrueba5() {
        return prueba5;
    }
    public void setPrueba5(Prueba prueba5) {
        this.prueba5 = prueba5;
    }
    public Prueba getPrueba6() {
        return prueba6;
    }
    public void setPrueba6(Prueba prueba6) {
        this.prueba6 = prueba6;
    }
    public Prueba getPrueba7() {
        return prueba7;
    }
    public void setPrueba7(Prueba prueba7) {
        this.prueba7 = prueba7;
    }
    public Prueba getPrueba8() {
        return prueba8;
    }
    public void setPrueba8(Prueba prueba8) {
        this.prueba8 = prueba8;
    }
    public Prueba getPrueba9() {
        return prueba9;
    }
    public void setPrueba9(Prueba prueba9) {
        this.prueba9 = prueba9;
    }
    public Prueba getPrueba10() {
        return prueba10;
    }
    public void setPrueba10(Prueba prueba10) {
        this.prueba10 = prueba10;
    }


    
}
