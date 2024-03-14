package com.example.heroesapp.models

import com.example.heroesapp.R

data class Heroe(
    val id: Int,
    val name: String,
    val description: String,
    val image: Int,
    val itemId: Int
) {
    companion object {
        val heroes = mutableListOf<Heroe>(
            // DC
            Heroe(
                1,
                "Batman",
                "Un justiciero enmascarado que lucha contra el crimen en Ciudad Gótica.",
                R.drawable.superhero1,
                1
            ),
            Heroe(
                2,
                "Superman",
                "Un alienígena con poderes sobrehumanos que protege a la Tierra.",
                R.drawable.superhero2,
                1
            ),
            Heroe(
                3,
                "Wonder Woman",
                "Una guerrera amazona con fuerza y habilidades sobrehumanas.",
                R.drawable.superhero3,
                1
            ),
            Heroe(
                4,
                "Flash",
                "Un velocista que puede viajar a través del tiempo y el espacio.",
                R.drawable.superhero4,
                1
            ),
            Heroe(
                5,
                "Linterna Verde",
                "Un humano que utiliza un anillo de poder para controlar la energía verde.",
                R.drawable.superhero5,
                1
            ),
            Heroe(
                6,
                "Aquaman",
                "El rey de Atlantis que posee habilidades acuáticas y telepatía con los animales marinos.",
                R.drawable.superhero6,
                1
            ),
            Heroe(
                7,
                "Martian Manhunter",
                "Un marciano con poderes telepáticos, telequinéticos y de cambio de forma.",
                R.drawable.superhero7,
                1
            ),
            Heroe(
                8,
                "Hawkman",
                "Un guerrero alado con fuerza sobrehumana y habilidades de vuelo.",
                R.drawable.superhero8,
                1
            ),
            Heroe(
                9,
                "Supergirl",
                "La prima de Superman que también posee poderes sobrehumanos.",
                R.drawable.superhero9,
                1
            ),
            Heroe(
                10,
                "Shazam",
                "Un niño que se convierte en un poderoso adulto al decir la palabra \"Shazam\".",
                R.drawable.superhero10,
                1
            ),
            // Marvel
            Heroe(
                11,
                "Spider-Man",
                "Un adolescente que adquiere poderes arácnidos después de ser picado por una araña radiactiva.",
                R.drawable.superhero11,
                2
            ),
            Heroe(
                12,
                "Capitán América",
                "Un supersoldado que lucha por la libertad y la justicia.",
                R.drawable.superhero12,
                2
            ),
            Heroe(
                13,
                "Iron Man",
                "Un genio multimillonario que crea una armadura tecnológica para combatir el crimen.",
                R.drawable.superhero13,
                2
            ),
            Heroe(
                14,
                "Thor",
                "Un dios nórdico con un poderoso martillo que controla el clima.",
                R.drawable.superhero14,
                2
            ),
            Heroe(
                15,
                "Hulk",
                "Un científico que se convierte en una criatura verde gigante cuando se enfada.",
                R.drawable.superhero15,
                2
            ),
            Heroe(
                16,
                "Wolverine",
                "Un mutante con un esqueleto de adamantium y garras retráctiles.",
                R.drawable.superhero16,
                2
            ),
            Heroe(
                17,
                "Deadpool",
                "Un mercenario antihéroe con un factor de curación acelerado y un humor irreverente.",
                R.drawable.superhero17,
                2
            ),
            Heroe(
                18,
                "Los Vengadores",
                "Un equipo de superhéroes que se unen para proteger al mundo.",
                R.drawable.superhero18,
                2
            ),
            Heroe(
                19,
                "Guardianes de la Galaxia",
                "Un grupo de inadaptados espaciales que se convierten en héroes.",
                R.drawable.superhero19,
                2
            ),
            Heroe(
                20,
                "Doctor Strange",
                "Un hechicero supremo que protege la Tierra de amenazas místicas.",
                R.drawable.superhero20,
                2
            )
        )
    }
}
