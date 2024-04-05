/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.softdev.pokedex;

/**
 *
 * @author university
 */
import com.softdev.pokedex.modelos.PokedexCreator;
import com.softdev.pokedex.modelos.Pokemon;
import java.util.Map;

public class Pokedex {

    private static final Map<Integer, Pokemon> pokedex = PokedexCreator.crearPokedex();

    public static void main(String[] args) {

        // Ejemplo de uso de los métodos
        int pokemonId = 29;

        // Obtener ruta de la imagen del Pokémon por ID
        String imagenRuta = obtenerRutaImagenPorId(pokemonId);
        System.out.println("Ruta de la imagen del Pokémon " + pokemonId + ": " + imagenRuta);

        // Obtener todos los datos del Pokémon por ID
        Pokemon pokemon = obtenerPokemonPorId(pokemonId);
        System.out.println("Datos del Pokémon " + pokemonId + ":");
        System.out.println(pokemon);
    }

    // Método para obtener la ruta de la imagen del Pokémon por ID
    public static String obtenerRutaImagenPorId(int pokemonId) {
        if (pokedex.containsKey(pokemonId)) {
            return pokedex.get(pokemonId).getRutaImagen();
        } else {
            return "Pokémon no encontrado";
        }
    }

    // Método para obtener todos los datos del Pokémon por ID
    public static Pokemon obtenerPokemonPorId(int pokemonId) {
        return pokedex.getOrDefault(pokemonId, null);
    }

    // Puedes agregar más métodos según tus necesidades
}

