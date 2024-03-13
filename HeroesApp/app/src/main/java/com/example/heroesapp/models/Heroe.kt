package com.example.heroesapp.models

import com.example.heroesapp.R

data class Heroe(val id: Int, val name: String, val description: String, val image: String, val itemId: Int){ companion object {
        val heroes = mutableListOf<Heroe>(
            Heroe(1,"Spider man","La historia de Spider-Man se centra en Peter Parker, un joven brillante y tímido que adquiere habilidades sobrehumanas después de ser picado por una araña radiactiva en una demostración científica. Con el tiempo, Peter descubre que posee una agilidad extraordinaria, una fuerza sobrehumana y la capacidad de trepar paredes.\n" +
                    "\n" +
                    "Tras la trágica muerte de su tío Ben debido a un crimen que Peter pudo haber evitado, adopta la filosofía de que \"con un gran poder viene una gran responsabilidad\". Inspirado por este mantra, Peter decide usar sus poderes para luchar contra el crimen y proteger a los inocentes como Spider-Man.","https://www.superherodb.com/pictures2/portraits/10/100/133.jpg",1),
            Heroe(2, "Capitan america", "Su historia comienza durante la Segunda Guerra Mundial, cuando Steve, un joven frágil y débil, es rechazado repetidamente al intentar alistarse en el ejército de los Estados Unidos. Sin embargo, su determinación y espíritu valiente llaman la atención del científico Dr. Abraham Erskine, quien recluta a Steve para un programa secreto conocido como el Proyecto Súper Soldado.", "https://www.superherodb.com/pictures2/portraits/10/100/274.jpg",1),
            Heroe(3, "Ironman", "Su historia comienza como la de un genio multimillonario, playboy y filántropo, que hereda la empresa Stark Industries, líder en tecnología armamentística.\n" +
                    "\n" +
                    "La vida de Tony Stark cambia drásticamente cuando es capturado por terroristas durante una visita a una zona de conflicto en el extranjero. Obligado a construir armas para sus captores, en secreto desarrolla un traje de alta tecnología para escapar, convirtiéndose así en Iron Man.", "https://www.superherodb.com/pictures2/portraits/10/100/85.jpg",1),
            Heroe(4, "Thor", "Hijo del Rey Odin y miembro de la poderosa raza de los Asgardianos, Thor es conocido por su fuerza sobrehumana, su habilidad para controlar el clima y su poderoso martillo, Mjolnir.\n" +
                    "\n" +
                    "La historia de Thor se desarrolla en el reino de Asgard, donde es un príncipe arrogante y beligerante. Sin embargo, su padre, Odin, lo destierra a la Tierra como castigo por sus acciones imprudentes, despojándolo de su poder y su martillo, y lo convierte en el mortal llamado Donald Blake.", "https://www.superherodb.com/pictures2/portraits/10/100/140.jpg",1),
            Heroe(5, "Hulk", "La historia de Hulk se centra en Bruce Banner, un brillante científico que se convierte en una criatura gigantesca y de piel verde cuando experimenta emociones intensas como la ira o el miedo, debido a la exposición a la radiación gamma.", "https://www.superherodb.com/pictures2/portraits/10/100/83.jpg",1),
            //DC
            Heroe(6, "Superman", "Nacido como Kal-El en el planeta moribundo Krypton, es enviado a la Tierra por sus padres poco antes de la destrucción de su mundo natal. Criado por una pareja de granjeros en Smallville, Kansas, Clark descubre gradualmente sus increíbles poderes debido a la radiación solar amarilla de la Tierra, que le otorgan fuerza sobrehumana, velocidad, visión de rayos X, visión telescópica, aliento gélido y la capacidad de volar.", "https://www.superherodb.com/pictures2/portraits/10/100/791.jpg",2),
            Heroe(7, "Batman", "Su verdadero nombre es Bruce Wayne, un multimillonario huérfano que, tras presenciar el asesinato de sus padres en un violento incidente cuando era niño, jura vengar su muerte combatiendo el crimen en Gotham City.", "https://www.superherodb.com/pictures2/portraits/10/100/639.jpg",2),
            Heroe(8, "Shazam", "Su historia se centra en un joven llamado Billy Batson. Billy es un huérfano que, tras ser elegido por el antiguo mago Shazam, obtiene el poder de transformarse en un poderoso superhéroe simplemente diciendo la palabra \"Shazam\".\n" +
                    "\n" +
                    "Cuando Billy pronuncia esta palabra mágica, se convierte en un héroe adulto con habilidades sobrehumanas que incluyen fuerza, velocidad, resistencia, invulnerabilidad, vuelo y la capacidad de lanzar rayos de energía.", "https://www.superherodb.com/gallery2/075/786/78628.webp",2),
            Heroe(9, "Wonder Woman", "Nacida y criada en la isla paradisíaca de Themyscira, hogar de las Amazonas, Diana es la princesa de las Amazonas y fue criada bajo la tutela de la Reina Hipólita.\n" +
                    "\n" +
                    "Dotada con habilidades sobrehumanas otorgadas por los dioses griegos, Wonder Woman posee una fuerza extraordinaria, velocidad, agilidad, resistencia y reflejos mejorados, además de poseer habilidades de vuelo y una amplia variedad de armas y artefactos místicos.", "https://www.superherodb.com/pictures2/portraits/10/050/33094.jpg",2),
            Heroe(10, "Flash", "El personaje principal que ha asumido el manto de Flash es Barry Allen, un científico forense que adquirió sus poderes después de ser alcanzado por un rayo mientras trabajaba en su laboratorio con productos químicos.\n" +
                    "\n" +
                    "Barry Allen posee la habilidad de correr a velocidades increíbles, lo que le permite realizar hazañas como correr sobre el agua, atravesar objetos sólidos e incluso viajar en el tiempo. ", "https://www.superherodb.com/pictures2/portraits/10/100/892.jpg",2),

            )
    }
}
