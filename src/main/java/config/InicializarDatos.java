package config;

import DAO.impl.LibroDAO;
import Model.DetalleLibro;
import Model.Libro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class InicializarDatos {

    public static void main(String[] args) {
        
        MongoClientProvider.INSTANCE.init();

        
        LibroDAO libroDAO = new LibroDAO();

        
        List<Libro> libros = new ArrayList<>();

        // --- CATEGORÍA: FANTASÍA ---
        libros.add(crearLibro(
            "978-8498387087", "Harry Potter y la Piedra Filosofal", "J.K. Rowling", 450.00, 50,
            "/img/harryPotter.jpg", Arrays.asList("Fantasia"),
            "El inicio de la saga mágica más famosa.", 1997
        ));
        libros.add(crearLibro(
            "978-8427202122", "Los Juegos del Hambre", "Suzanne Collins", 380.00, 40,
            "/img/losJuegosDelHambre1.jpg", Arrays.asList("Fantasia", "Ciencia Ficcion"),
            "Doce chicos y doce chicas se ven obligados a participar en un reality show mortal.", 2008
        ));
        libros.add(crearLibro(
            "978-8427202139", "Divergente", "Veronica Roth", 390.00, 35,
            "/img/divergente1.jpg", Arrays.asList("Fantasia", "Distopia"),
            "Una sociedad dividida en facciones. Tris debe elegir su destino.", 2011
        ));
        libros.add(crearLibro(
            "978-8490430001", "Las Pruebas del Sol", "Rick Riordan", 420.00, 30,
            "/img/LasPruebasDelSol1.jpg", Arrays.asList("Fantasia"),
            "Apolo ha sido castigado por Zeus y convertido en un adolescente mortal.", 2016
        ));
        libros.add(crearLibro(
            "978-8492918170", "La Chica de Gris", "Antonio Runa", 350.00, 20,
            "/img/laChicaDeGris1.jpg", Arrays.asList("Fantasia", "Misterio"),
            "Una historia urbana llena de misterios y sombras.", 2020
        ));

        // --- CATEGORÍA: TERROR ---
        libros.add(crearLibro(
            "978-8401352126", "IT (Eso)", "Stephen King", 550.00, 25,
            "/img/IT.jpg", Arrays.asList("Terror"),
            "Una fuerza malévola amenaza un pequeño pueblo de Estados Unidos.", 1986
        ));
        libros.add(crearLibro(
            "978-8497593601", "El Resplandor", "Stephen King", 480.00, 30,
            "/img/elResplandor1.jpg", Arrays.asList("Terror"),
            "Jack Torrance acepta un trabajo en un hotel aislado con un oscuro pasado.", 1977
        ));
        libros.add(crearLibro(
            "978-8416858125", "Amigo Imaginario", "Stephen Chbosky", 460.00, 15,
            "/img/amigoImaginario1.jpg", Arrays.asList("Terror"),
            "Kate Reese huye con su hijo Christopher, pero algo los persigue.", 2019
        ));
        libros.add(crearLibro(
            "978-6073190001", "La Casa de las Sombras", "Adam Nevill", 320.00, 18,
            "/img/casaSombra.jpg", Arrays.asList("Terror"),
            "Una casa antigua guarda secretos que nadie debería descubrir.", 2015
        ));
        libros.add(crearLibro(
            "978-8411111111", "El Chico de la Piel de Cerdo", "Raoul Monnes", 290.00, 10,
            "/img/ElChicoDeLaPielDeCerdo.jpg", Arrays.asList("Terror"),
            "Una leyenda local cobra vida de la forma más aterradora.", 2021
        ));

        // --- CATEGORÍA: COCINA ---
        libros.add(crearLibro(
            "978-8412345678", "El Gran Libro de la Repostería", "Varios Autores", 600.00, 20,
            "/img/ElGranLibroDeLaReposteria.jpg", Arrays.asList("Cocina"),
            "Recetas maestras para los amantes del dulce.", 2018
        ));
        libros.add(crearLibro(
            "978-0000000001", "Stardew Valley: The Cookbook", "ConcernedApe", 500.00, 50,
            "/img/StardewCookbook.jpg", Arrays.asList("Cocina", "Videojuegos"),
            "Recetas oficiales del famoso videojuego.", 2023
        ));
        libros.add(crearLibro(
            "978-1111111111", "Cocinología", "Dr. Stuart Farrimond", 450.00, 25,
            "/img/cocinologia.jpg", Arrays.asList("Cocina", "Ciencia"),
            "La ciencia de cocinar explicada de forma sencilla.", 2017
        ));
        libros.add(crearLibro(
            "978-2222222222", "La Ciencia de la Repostería", "Dra. Food", 470.00, 22,
            "/img/laCienciaDeLaReposteria.jpg", Arrays.asList("Cocina"),
            "Entiende el porqué detrás de cada pastel perfecto.", 2019
        ));
        libros.add(crearLibro(
            "978-3333333333", "Masa Madre", "Ramon Garriga", 300.00, 15,
            "/img/masaMadre.jpg", Arrays.asList("Cocina"),
            "Guía paso a paso para hacer pan artesanal en casa.", 2020
        ));
        libros.add(crearLibro(
            "978-4444444444", "Oh My Cookie!", "Webos Fritos", 320.00, 28,
            "/img/ohMyCookie.jpg", Arrays.asList("Cocina"),
            "Las mejores galletas que probarás en tu vida.", 2022
        ));

        // --- CATEGORÍA: EDUCACIÓN ---
        libros.add(crearLibro(
            "978-5555555555", "Aprendiendo a Aprender", "Barbara Oakley", 350.00, 40,
            "/img/aprendiendoAprender.jpg", Arrays.asList("Educacion"),
            "Técnicas de aprendizaje efectivas para estudiantes.", 2014
        ));
        libros.add(crearLibro(
            "978-6666666666", "EducaFakes", "Daniel Arias", 280.00, 20,
            "/img/educaFakes.jpg", Arrays.asList("Educacion"),
            "Desmintiendo mitos sobre la educación actual.", 2021
        ));
        libros.add(crearLibro(
            "978-7777777777", "Educar en la Naturaleza", "Katia Hueso", 310.00, 15,
            "/img/educarNaturaleza.jpg", Arrays.asList("Educacion"),
            "La importancia del aire libre en el desarrollo infantil.", 2017
        ));
        libros.add(crearLibro(
            "978-8888888888", "El Arte de Educar", "Antonio Beltrán", 290.00, 25,
            "/img/elArteDeEducar.jpg", Arrays.asList("Educacion"),
            "Educar con corazón y paciencia.", 2015
        ));
        libros.add(crearLibro(
            "978-9999999999", "El Valor de Educar", "Fernando Savater", 250.00, 30,
            "/img/elValorDeEducar.jpg", Arrays.asList("Educacion"),
            "Un ensayo clásico sobre la labor docente.", 1997
        ));
        libros.add(crearLibro(
            "978-1010101010", "Enseñar a Transgredir", "bell hooks", 330.00, 12,
            "/img/enseñarTransgredir.jpg", Arrays.asList("Educacion"),
            "La educación como práctica de la libertad.", 1994
        ));

        // --- INSERTAR EN BASE DE DATOS ---
        for (Libro libro : libros) {
            try {
                libroDAO.crearLibro(libro);
                System.out.println("Insertado: " + libro.getTitulo());
            } catch (Exception e) {
                System.out.println("Error al insertar " + libro.getTitulo() + ": " + e.getMessage());
            }
        }
    }

    private static Libro crearLibro(String isbn, String titulo, String autor, double precio, int stock, String url, List<String> categorias, String sipnosis, int anio) {
        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setPrecio(precio);
        libro.setStock(stock);
        libro.setPortadaUrl(url);
        libro.setCategorias(categorias);
        libro.setSipnosis(sipnosis);
        
       
        libro.setFechaLanzamiento(new Date(anio - 1900, 0, 1)); 
        
        DetalleLibro detalle = new DetalleLibro();
        detalle.setEditorial("Editorial Genérica");
        detalle.setIdioma("Español");
        detalle.setNumeroPaginas(300);
        libro.setDetalles(detalle);
        
        libro.setResenas(new ArrayList<>()); 
        
        return libro;
    }
}