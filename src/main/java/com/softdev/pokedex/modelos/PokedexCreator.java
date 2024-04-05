package com.softdev.pokedex.modelos;

import com.softdev.pokedex.modelos.Pokemon;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class PokedexCreator {

    public static Map<Integer, Pokemon> crearPokedex() {
        Map<Integer, Pokemon> pokedex = new HashMap<>();

        pokedex.put(1, crearBulbasaur());
        pokedex.put(2, crearIvysaur());
        pokedex.put(3, crearVenusaur());
        pokedex.put(4, crearCharmander());
        pokedex.put(5, crearCharmeleon());
        pokedex.put(6, crearCharizard());
        pokedex.put(7, crearSquirtle());
        pokedex.put(8, crearWartortle());
        pokedex.put(9, crearBlastoise());
        pokedex.put(10, crearCaterpie());
        pokedex.put(11, crearMetapod());
        pokedex.put(12, crearButterfree());
        pokedex.put(13, crearWeedle());
        pokedex.put(14, crearKakuna());
        pokedex.put(15, crearBeedrill());
        pokedex.put(16, crearPidgey());
        pokedex.put(17, crearPidgeotto());
        pokedex.put(18, crearPidgeot());
        pokedex.put(19, crearRattata());
        pokedex.put(20, crearRaticate());
        pokedex.put(21, crearSpearow());
        pokedex.put(22, crearFearow());
        pokedex.put(23, crearEkans());
        pokedex.put(24, crearArbok());
        pokedex.put(25, crearPikachu());
        pokedex.put(26, crearRaichu());
        pokedex.put(27, crearSandshrew());
        pokedex.put(28, crearSandslash());
        pokedex.put(29, crearNidoranF());
        pokedex.put(30, crearNidorina());
        pokedex.put(31, crearNidoqueen());
        pokedex.put(32, crearNidoranMacho());
        pokedex.put(33, crearNidorino());
        pokedex.put(34, crearNidoking());
        pokedex.put(35, crearClefairy());
        pokedex.put(36, crearClefable());
        pokedex.put(37, crearVulpix());
        pokedex.put(38, crearNinetales());
        pokedex.put(39, crearJigglypuff());
        pokedex.put(40, crearWigglytuff());
        pokedex.put(41, crearZubat());
        pokedex.put(42, crearGolbat());
        pokedex.put(43, crearOddish());
        pokedex.put(44, crearGloom());
        pokedex.put(45, crearVileplume());
        pokedex.put(46, crearParas());
        pokedex.put(47, crearParasect());
        pokedex.put(48, crearVenonat());
        pokedex.put(49, crearVenomoth());
        pokedex.put(50, crearDiglett());
        pokedex.put(51, crearDugtrio());
        pokedex.put(52, crearMeowth());
        pokedex.put(53, crearPersian());
        pokedex.put(54, crearPsyduck());
        pokedex.put(55, crearGolduck());
        pokedex.put(56, crearMankey());
        pokedex.put(57, crearPrimeape());
        pokedex.put(58, crearGrowlithe());
        pokedex.put(59, crearArcanine());
        pokedex.put(60, crearPoliwag());
        pokedex.put(61, crearPoliwhirl());
        pokedex.put(62, crearPoliwrath());
        pokedex.put(63, crearAbra());
        pokedex.put(64, crearKadabra());
        pokedex.put(65, crearAlakazam());
        pokedex.put(66, crearMachop());
        pokedex.put(67, crearMachoke());
        pokedex.put(68, crearMachamp());
        pokedex.put(69, crearBellsprout());
        pokedex.put(70, crearWeepinbell());
        pokedex.put(71, crearVictreebel());
        pokedex.put(72, crearTentacool());
        pokedex.put(73, crearTentacruel());
        pokedex.put(74, crearGeodude());
        pokedex.put(75, crearGraveler());
        pokedex.put(76, crearGolem());
        pokedex.put(77, crearPonyta());
        pokedex.put(78, crearRapidash());
        pokedex.put(79, crearSlowpoke());
        pokedex.put(80, crearSlowbro());
        pokedex.put(81, crearMagnemite());
        pokedex.put(82, crearMagneton());
        pokedex.put(83, crearFarfetchd());
        pokedex.put(84, crearDoduo());
        pokedex.put(85, crearDodrio());
        pokedex.put(86, crearSeel());
        pokedex.put(87, crearDewgong());
        pokedex.put(88, crearGrimer());
        pokedex.put(89, crearMuk());
        pokedex.put(90, crearShellder());
        pokedex.put(91, crearCloyster());
        pokedex.put(92, crearGastly());
        pokedex.put(93, crearHaunter());
        pokedex.put(94, crearGengar());
        pokedex.put(95, crearOnix());
        pokedex.put(96, crearDrowzee());
        pokedex.put(97, crearHypno());
        pokedex.put(98, crearKrabby());
        pokedex.put(99, crearKingler());
        pokedex.put(100, crearVoltorb());
        pokedex.put(101, crearElectrode());
        pokedex.put(102, crearExeggcute());
        pokedex.put(103, crearExeggutor());
        pokedex.put(104, crearCubone());
        pokedex.put(105, crearMarowak());
        pokedex.put(106, crearHitmonlee());
        pokedex.put(107, crearHitmonchan());
        pokedex.put(108, crearLickitung());
        pokedex.put(109, crearKoffing());
        pokedex.put(110, crearWeezing());
        pokedex.put(111, crearRhyhorn());
        pokedex.put(112, crearRhydon());
        pokedex.put(113, crearChansey());
        pokedex.put(114, crearTangela());
        pokedex.put(115, crearKangaskhan());
        pokedex.put(116, crearHorsea());
        pokedex.put(117, crearSeadra());
        pokedex.put(118, crearGoldeen());
        pokedex.put(119, crearSeaking());
        pokedex.put(120, crearStaryu());
        pokedex.put(121, crearStarmie());
        pokedex.put(122, crearMrMime());
        pokedex.put(123, crearScyther());
        pokedex.put(124, crearJynx());
        pokedex.put(125, crearElectabuzz());
        pokedex.put(126, crearMagmar());
        pokedex.put(127, crearPinsir());
        pokedex.put(128, crearTauros());
        pokedex.put(129, crearMagikarp());
        pokedex.put(130, crearGyarados());
        pokedex.put(131, crearLapras());
        pokedex.put(132, crearDitto());
        pokedex.put(133, crearEevee());
        pokedex.put(134, crearVaporeon());
        pokedex.put(135, crearJolteon());
        pokedex.put(136, crearFlareon());
        pokedex.put(137, crearPorygon());
        pokedex.put(138, crearOmanyte());
        pokedex.put(139, crearOmastar());
        pokedex.put(140, crearKabuto());
        pokedex.put(141, crearKabutops());
        pokedex.put(142, crearAerodactyl());
        pokedex.put(143, crearSnorlax());
        pokedex.put(144, crearArticuno());
        pokedex.put(145, crearZapdos());
        pokedex.put(146, crearMoltres());
        pokedex.put(147, crearDratini());
        pokedex.put(148, crearDragonair());
        pokedex.put(149, crearDragonite());
        pokedex.put(150, crearMewtwo());
        pokedex.put(151, crearMew());

        return pokedex;
    }

    private static Pokemon crearBulbasaur() {
        return new Pokemon(1, "Bulbasaur", 0.7, "Pokémon Semilla", 6.9, "Espesura", "Macho",
                List.of("Planta", "Veneno"), List.of("Psíquico", "Tierra"), 45, 49, 49, 65, 65, 45, "001.png",
                "Bulbasaur es un pequeño Pokémon con aspecto de dinosaurio que lleva una planta en su espalda desde el momento de su nacimiento.");
    }

    private static Pokemon crearIvysaur() {
        return new Pokemon(2, "Ivysaur", 1.0, "Pokémon Semilla", 13.0, "Espesura", "Macho",
                List.of("Planta", "Veneno"), List.of("Psíquico", "Tierra"), 60, 62, 63, 80, 80, 60, "002.png",
                "Ivysaur es la evolución de Bulbasaur. Su planta en la espalda crece más grande y desarrolla una flor.");
    }

    private static Pokemon crearVenusaur() {
        return new Pokemon(3, "Venusaur", 2.0, "Pokémon Semilla", 100.0, "Espesura", "Macho",
                List.of("Planta", "Veneno"), List.of("Psíquico", "Tierra"), 80, 82, 83, 100, 100, 80, "003.png",
                "Venusaur es la forma final de la línea evolutiva de Bulbasaur. Su flor en la espalda está en plena floración.");
    }

    private static Pokemon crearCharmander() {
        return new Pokemon(4, "Charmander", 0.6, "Pokémon Lagartija", 8.5, "Mar llamas", "Macho",
                List.of("Fuego"), List.of("Agua", "Tierra", "Roca"), 39, 52, 43, 60, 50, 65, "004.png",
                "Charmander es un Pokémon de tipo fuego que se caracteriza por tener una llama en la punta de su cola.");
    }

    private static Pokemon crearCharmeleon() {
        return new Pokemon(5, "Charmeleon", 1.1, "Pokémon Llama", 19.0, "Mar llamas", "Macho",
                List.of("Fuego"), List.of("Agua", "Tierra", "Roca"), 58, 64, 58, 80, 65, 80, "005.png",
                "Charmeleon es la evolución de Charmander. A medida que evoluciona, su temperamento se vuelve más fuerte y desafiante.");
    }

    private static Pokemon crearCharizard() {
        return new Pokemon(6, "Charizard", 1.7, "Pokémon Llama", 90.5, "Mar llamas", "Macho",
                List.of("Fuego", "Volador"), List.of("Agua", "Roca", "Eléctrico"), 78, 84, 78, 109, 85, 100, "006.png",
                "Charizard es la forma final de la línea evolutiva de Charmander. Es un dragón que puede lanzar intensas llamas desde su boca.");
    }

    private static Pokemon crearSquirtle() {
        return new Pokemon(7, "Squirtle", 0.5, "Pokémon Tortuga", 9.0, "Torrente", "Macho",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 44, 48, 65, 50, 64, 43, "007.png",
                "Squirtle es un Pokémon de tipo agua con forma de tortuga. Puede esconderse dentro de su caparazón para protegerse.");
    }

    private static Pokemon crearWartortle() {
        return new Pokemon(8, "Wartortle", 1.0, "Pokémon Tortuga", 22.5, "Torrente", "Macho",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 59, 63, 80, 65, 80, 58, "008.png",
                "Wartortle es la evolución de Squirtle. Su cola se divide en dos y su caparazón se vuelve más robusto.");
    }

    private static Pokemon crearBlastoise() {
        return new Pokemon(9, "Blastoise", 1.6, "Pokémon Marisco", 85.5, "Torrente", "Macho",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 79, 83, 100, 85, 105, 78, "009.png",
                "Blastoise es la forma final de la línea evolutiva de Squirtle. Sus cañones de agua en el caparazón pueden disparar chorros poderosos.");
    }

    private static Pokemon crearCaterpie() {
        return new Pokemon(10, "Caterpie", 0.3, "Pokémon Gusano", 2.9, "Polvo escudo", "Hembra",
                List.of("Bicho"), List.of("Fuego", "Volador"), 45, 30, 35, 20, 20, 45, "010.png",
                "Caterpie es un pequeño Pokémon gusano que se camufla en la vegetación. Tiene la habilidad de soltar un polvo que repele a los enemigos.");
    }

    private static Pokemon crearMetapod() {
        return new Pokemon(11, "Metapod", 0.7, "Pokémon Capullo", 9.9, "Mudar", "Sin género",
                List.of("Bicho"), List.of("Fuego", "Volador"), 50, 20, 55, 25, 25, 30, "011.png",
                "Metapod es la evolución de Caterpie. Durante esta etapa, se endurece para protegerse mientras se transforma en un Pokémon adulto.");
    }

    private static Pokemon crearButterfree() {
        return new Pokemon(12, "Butterfree", 1.1, "Pokémon Mariposa", 32.0, "Polvo escudo", "Hembra",
                List.of("Bicho", "Volador"), List.of("Fuego", "Eléctrico", "Hielo", "Roca", "Volador"), 60, 45, 50, 90, 80, 70, "012.png",
                "Butterfree es la forma final de la línea evolutiva de Caterpie. Puede esparcir polvo que induce el sueño.");
    }

    private static Pokemon crearWeedle() {
        return new Pokemon(13, "Weedle", 0.3, "Pokémon Gusano", 3.2, "Polvo escudo", "Macho",
                List.of("Bicho", "Veneno"), List.of("Fuego", "Volador"), 40, 35, 30, 20, 20, 50, "013.png",
                "Weedle es un pequeño Pokémon gusano con un aguijón venenoso en la cabeza. Se camufla entre la hierba para atacar a sus presas.");
    }

    private static Pokemon crearKakuna() {
        return new Pokemon(14, "Kakuna", 0.6, "Pokémon Capullo", 10.0, "Mudar", "Sin género",
                List.of("Bicho", "Veneno"), List.of("Fuego", "Volador"), 45, 25, 50, 25, 25, 35, "014.png",
                "Kakuna es la evolución de Weedle. Durante esta fase, su aguijón se vuelve más afilado y está listo para evolucionar.");
    }

    private static Pokemon crearBeedrill() {
        return new Pokemon(15, "Beedrill", 1.0, "Pokémon Abeja", 29.5, "Enjambre", "Macho",
                List.of("Bicho", "Veneno"), List.of("Fuego", "Volador"), 65, 90, 40, 45, 80, 75, "015.png",
                "Beedrill es la forma final de la línea evolutiva de Weedle. Sus aguijones venenosos son peligrosos y suelen atacar en enjambres.");
    }

    private static Pokemon crearPidgey() {
        return new Pokemon(16, "Pidgey", 0.3, "Pokémon Pajarito", 1.8, "Vista lince", "Hembra",
                List.of("Normal", "Volador"), List.of("Eléctrico", "Hielo", "Roca"), 40, 45, 40, 35, 35, 56, "016.png",
                "Pidgey es un pequeño Pokémon pájaro que vuela a baja altitud. Puede detectar peligros y suele vivir cerca de las ciudades.");
    }

    private static Pokemon crearPidgeotto() {
        return new Pokemon(17, "Pidgeotto", 1.1, "Pokémon Pájaro", 30.0, "Vista lince", "Hembra",
                List.of("Normal", "Volador"), List.of("Eléctrico", "Hielo", "Roca"), 63, 60, 55, 50, 50, 71, "017.png",
                "Pidgeotto es la evolución de Pidgey. Sus habilidades de vuelo mejoran, y puede volar más alto y más rápido.");
    }

    private static Pokemon crearPidgeot() {
        return new Pokemon(18, "Pidgeot", 1.5, "Pokémon Pájaro", 39.5, "Vista lince", "Hembra",
                List.of("Normal", "Volador"), List.of("Eléctrico", "Hielo", "Roca"), 83, 80, 75, 70, 70, 101, "018.png",
                "Pidgeot es la forma final de la línea evolutiva de Pidgey. Su plumaje es majestuoso y puede volar a gran velocidad.");
    }

    private static Pokemon crearRattata() {
        return new Pokemon(19, "Rattata", 0.3, "Pokémon Ratón", 3.5, "Fuga", "Macho",
                List.of("Normal"), List.of("Lucha"), 30, 56, 35, 25, 35, 72, "019.png",
                "Rattata es un pequeño Pokémon roedor que es conocido por su rápida reproducción. Suele vivir en lugares urbanos.");
    }

    private static Pokemon crearRaticate() {
        return new Pokemon(20, "Raticate", 0.7, "Pokémon Ratón", 18.5, "Fuga", "Macho",
                List.of("Normal"), List.of("Lucha"), 55, 81, 60, 50, 70, 97, "020.png",
                "Raticate es la evolución de Rattata. Sus incisivos son afilados y puede morder con fuerza. Es territorial y protector de su nido.");
    }

    private static Pokemon crearSpearow() {
        return new Pokemon(21, "Spearow", 0.3, "Pokémon Pájaro Pico", 2.0, "Vista lince", "Macho",
                List.of("Normal", "Volador"), List.of("Eléctrico", "Hielo", "Roca"), 40, 60, 30, 31, 31, 70, "021.png",
                "Spearow es un pequeño Pokémon pájaro con un pico afilado. Suele cazar insectos y es muy ágil en el vuelo.");
    }

    private static Pokemon crearFearow() {
        return new Pokemon(22, "Fearow", 1.2, "Pokémon Pájaro Pico", 38.0, "Vista lince", "Macho",
                List.of("Normal", "Volador"), List.of("Eléctrico", "Hielo", "Roca"), 65, 90, 65, 61, 61, 100, "022.png",
                "Fearow es la forma evolucionada de Spearow. Su pico es aún más fuerte, y puede atacar con gran precisión desde el aire.");
    }

    private static Pokemon crearEkans() {
        return new Pokemon(23, "Ekans", 2.0, "Pokémon Serpiente", 6.9, "Intimidación", "Hembra",
                List.of("Veneno"), List.of("Psíquico", "Tierra"), 35, 60, 44, 40, 54, 55, "023.png",
                "Ekans es una serpiente venenosa que ataca a sus presas con mordeduras rápidas. Puede camuflarse entre la hierba alta.");
    }

    private static Pokemon crearArbok() {
        return new Pokemon(24, "Arbok", 3.5, "Pokémon Cobra", 65.0, "Intimidación", "Hembra",
                List.of("Veneno"), List.of("Psíquico", "Tierra"), 60, 85, 69, 65, 79, 80, "024.png",
                "Arbok es la forma evolucionada de Ekans. Su capucha en forma de cara es a menudo utilizada para intimidar a los enemigos.");
    }

    private static Pokemon crearPikachu() {
        return new Pokemon(25, "Pikachu", 0.4, "Pokémon Ratón", 6.0, "Electrogénesis", "Hembra",
                List.of("Eléctrico"), List.of("Tierra"), 35, 55, 40, 50, 50, 90, "025.png",
                "Pikachu es uno de los Pokémon más icónicos. Es conocido por su cola en forma de rayo y su habilidad para generar electricidad.");
    }

    private static Pokemon crearRaichu() {
        return new Pokemon(26, "Raichu", 0.8, "Pokémon Ratón", 30.0, "Electrogénesis", "Hembra",
                List.of("Eléctrico"), List.of("Tierra"), 60, 90, 55, 90, 80, 110, "026.png",
                "Raichu es la forma evolucionada de Pikachu. Su cola y orejas son más grandes, y puede generar descargas eléctricas poderosas.");
    }

    private static Pokemon crearSandshrew() {
        return new Pokemon(27, "Sandshrew", 0.6, "Pokémon Ratón", 12.0, "Velo arena", "Macho",
                List.of("Tierra"), List.of("Agua", "Hielo", "Planta"), 50, 75, 85, 20, 30, 40, "027.png",
                "Sandshrew es un Pokémon roedor con piel dura que lo protege de la arena. Se enrolla en una bola para defenderse.");
    }

    private static Pokemon crearSandslash() {
        return new Pokemon(28, "Sandslash", 1.0, "Pokémon Ratón", 29.5, "Velo arena", "Macho",
                List.of("Tierra"), List.of("Agua", "Hielo", "Planta"), 75, 100, 110, 45, 55, 65, "028.png",
                "Sandslash es la forma evolucionada de Sandshrew. Sus garras son afiladas y puede cavar rápidamente en la tierra.");
    }

    private static Pokemon crearNidoranF() {
        return new Pokemon(29, "Nidoran♀", 0.4, "Pokémon Veneno", 7.0, "Punto tóxico", "Hembra",
                List.of("Veneno"), List.of("Tierra", "Psíquico"), 55, 47, 52, 40, 40, 41, "029.png",
                "Nidoran♀ es un Pokémon venenoso que ataca a los enemigos con su cuerno tóxico. Suele vivir en áreas herbosas.");
    }

    private static Pokemon crearNidorina() {
        return new Pokemon(30, "Nidorina", 0.8, "Pokémon Veneno", 20.0, "Punto tóxico", "Hembra",
                List.of("Veneno"), List.of("Tierra", "Psíquico"), 70, 62, 67, 55, 55, 56, "030.png",
                "Nidorina es la forma evolucionada de Nidoran♀. Su veneno es más potente, y puede ser peligrosa si se siente amenazada.");
    }

    private static Pokemon crearNidoqueen() {
        return new Pokemon(31, "Nidoqueen", 1.3, "Pokémon Brota", 60.0, "Punto tóxico", "Hembra",
                List.of("Veneno", "Tierra"), List.of("Agua", "Tierra, Hielo, Planta", "Lucha"), 90, 82, 87, 75, 85, 76, "031.png",
                "Nidoqueen es la forma evolucionada de Nidorina. Su caparazón duro la protege en la batalla, y es fuerte tanto en ataques físicos como especiales.");
    }

    private static Pokemon crearNidoranMacho() {
        return new Pokemon(32, "Nidoran♂", 0.5, "Pokémon Venenoso", 9.0, "Punto tóxico", "Macho",
                List.of("Veneno"), List.of("Tierra", "Psíquico"), 46, 57, 40, 40, 40, 50, "032.png",
                "Nidoran♂ es la versión masculina de Nidoran♀. Tiene un cuerno venenoso que utiliza para defenderse de los enemigos.");
    }

    private static Pokemon crearNidorino() {
        return new Pokemon(33, "Nidorino", 0.9, "Pokémon Venenoso", 19.5, "Punto tóxico", "Macho",
                List.of("Veneno"), List.of("Tierra", "Psíquico"), 61, 72, 57, 55, 55, 65, "033.png",
                "Nidorino es la forma evolucionada de Nidoran♂. Sus cuernos son más grandes y afilados, y su agresividad aumenta.");
    }

    private static Pokemon crearNidoking() {
        return new Pokemon(34, "Nidoking", 1.4, "Pokémon Brota", 62.0, "Punto tóxico", "Macho",
                List.of("Veneno", "Tierra"), List.of("Agua", "Tierra, Hielo, Planta", "Lucha"), 81, 92, 77, 85, 75, 85, "034.png",
                "Nidoking es la forma evolucionada de Nidorino. Sus habilidades venenosas son aún más letales, y puede utilizar poderosos ataques físicos.");
    }

    private static Pokemon crearClefairy() {
        return new Pokemon(35, "Clefairy", 0.6, "Pokémon Hada", 7.5, "Gran encanto", "Hembra",
                List.of("Hada"), List.of("Acero", "Veneno"), 70, 45, 48, 60, 65, 35, "035.png",
                "Clefairy es conocida por su ternura y habilidades mágicas. Su presencia puede traer buena suerte y felicidad a quienes la rodean.");
    }

    private static Pokemon crearClefable() {
        return new Pokemon(36, "Clefable", 1.3, "Pokémon Hada", 40.0, "Gran encanto", "Hembra",
                List.of("Hada"), List.of("Acero", "Veneno"), 95, 70, 73, 95, 90, 60, "036.png",
                "Clefable es la forma evolucionada de Clefairy. Su pelaje es suave y es conocida por su capacidad para alegrar cualquier ambiente.");
    }

    private static Pokemon crearVulpix() {
        return new Pokemon(37, "Vulpix", 0.6, "Pokémon Zorro", 9.9, "Absorbe fuego", "Hembra",
                List.of("Fuego"), List.of("Agua", "Tierra", "Roca"), 38, 41, 40, 50, 65, 65, "037.png",
                "Vulpix es un Pokémon de fuego con una cola en llamas. Puede controlar el fuego y es conocida por su gracia y elegancia.");
    }

    private static Pokemon crearNinetales() {
        return new Pokemon(38, "Ninetales", 1.1, "Pokémon Zorro", 19.9, "Absorbe fuego", "Hembra",
                List.of("Fuego"), List.of("Agua", "Tierra", "Roca"), 73, 76, 75, 81, 100, 100, "038.png",
                "Ninetales es la forma evolucionada de Vulpix. Tiene nueve colas y es capaz de controlar las llamas con gran destreza.");
    }

    private static Pokemon crearJigglypuff() {
        return new Pokemon(39, "Jigglypuff", 0.5, "Pokémon Globo", 5.5, "Gran encanto", "Hembra",
                List.of("Normal", "Hada"), List.of("Acero", "Veneno"), 115, 45, 20, 45, 25, 20, "039.png",
                "Jigglypuff es conocida por su habilidad para cantar melodías hipnóticas. Puede hacer que sus enemigos se duerman con su canto.");
    }

    private static Pokemon crearWigglytuff() {
        return new Pokemon(40, "Wigglytuff", 1.0, "Pokémon Globo", 12.0, "Gran encanto", "Hembra",
                List.of("Normal", "Hada"), List.of("Acero", "Veneno"), 140, 70, 45, 85, 50, 45, "040.png",
                "Wigglytuff es la forma evolucionada de Jigglypuff. A pesar de su aspecto tierno, puede ser muy resistente en la batalla.");
    }

    private static Pokemon crearZubat() {
        return new Pokemon(41, "Zubat", 0.8, "Pokémon Murciélago", 7.5, "Fuga", "Sin género",
                List.of("Veneno", "Volador"), List.of("Eléctrico", "Hielo", "Roca", "Psíquico"), 40, 45, 35, 30, 40, 55, "041.png",
                "Zubat es un Pokémon murciélago conocido por su agilidad en el aire. Se guía por ultrasonidos y es difícil de detectar.");
    }

    private static Pokemon crearGolbat() {
        return new Pokemon(42, "Golbat", 1.6, "Pokémon Murciélago", 55.0, "Fuga", "Sin género",
                List.of("Veneno", "Volador"), List.of("Eléctrico", "Hielo", "Roca", "Psíquico"), 75, 80, 70, 65, 75, 90, "042.png",
                "Golbat es la evolución de Zubat. Sus colmillos son afilados y puede volar rápidamente para sorprender a sus presas.");
    }

    private static Pokemon crearOddish() {
        return new Pokemon(43, "Oddish", 0.5, "Pokémon Hierba", 5.4, "Clorofila", "Sin género",
                List.of("Planta", "Veneno"), List.of("Fuego", "Hielo", "Volador", "Psíquico"), 45, 50, 55, 75, 65, 30, "043.png",
                "Oddish es un Pokémon de tipo planta con forma de planta pequeña. Su aroma embriagador puede afectar a otros Pokémon.");
    }

    private static Pokemon crearGloom() {
        return new Pokemon(44, "Gloom", 0.8, "Pokémon Hierba", 8.6, "Clorofila", "Sin género",
                List.of("Planta", "Veneno"), List.of("Fuego", "Hielo", "Volador", "Psíquico"), 60, 65, 70, 85, 75, 40, "044.png",
                "Gloom es la evolución de Oddish. A pesar de su apariencia sombría, libera un olor embriagador cuando florece.");
    }

    private static Pokemon crearVileplume() {
        return new Pokemon(45, "Vileplume", 1.2, "Pokémon Flor", 18.6, "Clorofila", "Sin género",
                List.of("Planta", "Veneno"), List.of("Fuego", "Hielo", "Volador", "Psíquico"), 75, 80, 85, 110, 90, 50, "045.png",
                "Vileplume es la evolución de Gloom. Su aroma es tan potente que puede inducir sueño o paralizar a sus oponentes.");
    }

    private static Pokemon crearParas() {
        return new Pokemon(46, "Paras", 0.3, "Pokémon Honguito", 5.4, "Cuerpo seco", "Sin género",
                List.of("Bicho", "Planta"), List.of("Fuego", "Hielo", "Volador", "Veneno"), 35, 70, 55, 45, 55, 25, "046.png",
                "Paras es un Pokémon parásito con hongos en la espalda. Puede absorber nutrientes de los árboles a través de sus patas.");
    }

    private static Pokemon crearParasect() {
        return new Pokemon(47, "Parasect", 1.0, "Pokémon Honguito", 29.5, "Cuerpo seco", "Sin género",
                List.of("Bicho", "Planta"), List.of("Fuego", "Hielo", "Volador", "Veneno"), 60, 95, 80, 60, 80, 30, "047.png",
                "Parasect es la evolución de Paras. Sus hongos crecen más y controlan completamente al Pokémon, convirtiéndolo en un ser pasivo.");
    }

    private static Pokemon crearVenonat() {
        return new Pokemon(48, "Venonat", 1.0, "Pokémon Venenoso", 30.0, "Ojo compuesto", "Sin género",
                List.of("Bicho", "Veneno"), List.of("Fuego", "Volador", "Psíquico"), 60, 55, 50, 40, 55, 45, "048.png",
                "Venonat tiene grandes ojos compuestos y antenas que liberan sustancias adormecedoras. Se guía por la luz de la luna.");
    }

    private static Pokemon crearVenomoth() {
        return new Pokemon(49, "Venomoth", 1.5, "Pokémon Polvo", 12.5, "Ojo compuesto", "Sin género",
                List.of("Bicho", "Veneno"), List.of("Fuego", "Volador", "Psíquico"), 70, 65, 60, 90, 75, 90, "049.png",
                "Venomoth es la evolución de Venonat. Sus polvos venenosos pueden desorientar a los oponentes y facilitar su escape.");
    }

    private static Pokemon crearDiglett() {
        return new Pokemon(50, "Diglett", 0.2, "Pokémon Topo", 0.8, "Velo arena", "Sin género",
                List.of("Tierra"), List.of("Agua", "Hielo", "Planta"), 10, 55, 25, 35, 45, 95, "050.png",
                "Diglett es un Pokémon topo que vive bajo tierra. Puede cavar rápidamente y es difícil de ver cuando asoma solo su cabeza.");
    }

    private static Pokemon crearDugtrio() {
        return new Pokemon(51, "Dugtrio", 0.7, "Pokémon Topo", 33.3, "Velo arena", "Sin género",
                List.of("Tierra"), List.of("Agua", "Hielo", "Planta"), 35, 100, 50, 50, 70, 120, "051.png",
                "Dugtrio es la evolución de Diglett. Tres topos forman un equipo y cavan a gran velocidad para desplazarse bajo tierra.");
    }

    private static Pokemon crearMeowth() {
        return new Pokemon(52, "Meowth", 0.4, "Pokémon Gatito", 4.2, "Recogida", "Macho",
                List.of("Normal"), List.of("Lucha"), 40, 45, 35, 40, 40, 90, "052.png",
                "Meowth es conocido por su amor por las monedas brillantes. Es capaz de recoger objetos de valor que encuentra.");
    }

    private static Pokemon crearPersian() {
        return new Pokemon(53, "Persian", 1.0, "Pokémon Gato Clase", 32.0, "Limber", "Macho",
                List.of("Normal"), List.of("Lucha"), 65, 70, 60, 65, 65, 115, "053.png",
                "Persian es la evolución de Meowth. Su pelaje es suave y brillante, y es muy apreciado en el mercado.");
    }

    private static Pokemon crearPsyduck() {
        return new Pokemon(54, "Psyduck", 0.8, "Pokémon Pato", 19.6, "Humedad", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 50, 52, 48, 65, 50, 55, "054.png",
                "Psyduck sufre fuertes dolores de cabeza, lo que provoca que su poder psíquico se desate de manera involuntaria.");
    }

    private static Pokemon crearGolduck() {
        return new Pokemon(55, "Golduck", 1.7, "Pokémon Pato", 76.6, "Humedad", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 80, 82, 78, 95, 80, 85, "055.png",
                "Golduck es la evolución de Psyduck. Tiene una habilidad psíquica más desarrollada que utiliza para nadar.");
    }

    private static Pokemon crearMankey() {
        return new Pokemon(56, "Mankey", 0.5, "Pokémon Mono", 28.0, "Fuga", "Macho",
                List.of("Lucha"), List.of("Volador", "Psíquico"), 40, 80, 35, 35, 45, 70, "056.png",
                "Mankey se enfurece con facilidad y ataca a todo lo que le molesta. Puede volverse peligroso cuando está furioso.");
    }

    private static Pokemon crearPrimeape() {
        return new Pokemon(57, "Primeape", 1.0, "Pokémon Mono", 32.0, "Fuga", "Macho",
                List.of("Lucha"), List.of("Volador", "Psíquico"), 65, 105, 60, 60, 70, 95, "057.png",
                "Primeape es la evolución de Mankey. Se enfurece rápidamente y su furia aumenta su fuerza y velocidad.");
    }

    private static Pokemon crearGrowlithe() {
        return new Pokemon(58, "Growlithe", 0.7, "Pokémon Cachorro", 19.0, "Intimidación", "Macho",
                List.of("Fuego"), List.of("Agua", "Roca", "Tierra"), 55, 70, 45, 70, 50, 60, "058.png",
                "Growlithe es un cachorro leal y protector. Su pelaje es suave y se utiliza para hacer mantas.");
    }

    private static Pokemon crearArcanine() {
        return new Pokemon(59, "Arcanine", 1.9, "Pokémon Leyenda", 155.0, "Intimidación", "Macho",
                List.of("Fuego"), List.of("Agua", "Roca", "Tierra"), 90, 110, 80, 100, 80, 95, "059.png",
                "Arcanine es la evolución de Growlithe. Es conocido por su velocidad y es considerado un Pokémon legendario.");
    }

    private static Pokemon crearPoliwag() {
        return new Pokemon(60, "Poliwag", 0.6, "Pokémon Renacuajo", 12.4, "Absorbe agua", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 40, 50, 40, 40, 40, 90, "060.png",
                "Poliwag tiene una espiral en el abdomen que funciona como brújula. Suele nadar siguiendo el flujo de los ríos.");
    }

    private static Pokemon crearPoliwhirl() {
        return new Pokemon(61, "Poliwhirl", 1.0, "Pokémon Renacuajo", 20.0, "Absorbe agua", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 65, 65, 65, 50, 50, 90, "061.png",
                "Poliwhirl es la evolución de Poliwag. La espiral en su abdomen gira en direcciones opuestas cuando nada.");
    }

    private static Pokemon crearPoliwrath() {
        return new Pokemon(62, "Poliwrath", 1.3, "Pokémon Renacuajo", 54.0, "Absorbe agua", "Sin género",
                List.of("Agua", "Lucha"), List.of("Eléctrico", "Planta", "Volador", "Psíquico"), 90, 95, 95, 70, 90, 70, "062.png",
                "Poliwrath es la evolución de Poliwhirl. Su cuerpo está diseñado para la natación, y es muy hábil en combate.");
    }

    private static Pokemon crearAbra() {
        return new Pokemon(63, "Abra", 0.9, "Pokémon Psi", 19.5, "Fuga", "Sin género",
                List.of("Psíquico"), List.of("Bicho", "Fantasma", "Siniestro"), 25, 20, 15, 105, 55, 90, "063.png",
                "Abra es capaz de leer mentes y predecir el futuro. A menudo se teletransporta para evitar el peligro.");
    }

    private static Pokemon crearKadabra() {
        return new Pokemon(64, "Kadabra", 1.3, "Pokémon Psi", 56.5, "Sincronía", "Sin género",
                List.of("Psíquico"), List.of("Bicho", "Fantasma", "Siniestro"), 40, 35, 30, 120, 70, 105, "064.png",
                "Kadabra es la evolución de Abra. Su cerebro se desarrolla rápidamente, lo que le permite realizar poderosas telequinesias.");
    }

    private static Pokemon crearAlakazam() {
        return new Pokemon(65, "Alakazam", 1.5, "Pokémon Psi", 48.0, "Sincronía", "Sin género",
                List.of("Psíquico"), List.of("Bicho", "Fantasma", "Siniestro"), 55, 50, 45, 135, 95, 120, "065.png",
                "Alakazam es la evolución de Kadabra. Su inteligencia es tan alta que puede recordar todo lo que ha vivido.");
    }

    private static Pokemon crearMachop() {
        return new Pokemon(66, "Machop", 0.8, "Pokémon Súper Poder", 19.5, "Guts", "Macho",
                List.of("Lucha"), List.of("Psíquico", "Volador", "Hada"), 70, 80, 50, 35, 35, 35, "066.png",
                "Machop entrena levantando piedras. Su cuerpo robusto le permite realizar hazañas de fuerza impresionantes.");
    }

    private static Pokemon crearMachoke() {
        return new Pokemon(67, "Machoke", 1.5, "Pokémon Súper Poder", 70.5, "Guts", "Macho",
                List.of("Lucha"), List.of("Psíquico", "Volador", "Hada"), 80, 100, 70, 50, 60, 45, "067.png",
                "Machoke es la evolución de Machop. Sus músculos se hinchan, aumentando su fuerza y resistencia.");
    }

    private static Pokemon crearMachamp() {
        return new Pokemon(68, "Machamp", 1.6, "Pokémon Súper Poder", 130.0, "Guts", "Macho",
                List.of("Lucha"), List.of("Psíquico", "Volador", "Hada"), 90, 130, 80, 65, 85, 55, "068.png",
                "Machamp es la evolución de Machoke. Puede realizar movimientos de artes marciales a una velocidad asombrosa.");
    }

    private static Pokemon crearBellsprout() {
        return new Pokemon(69, "Bellsprout", 0.7, "Pokémon Campana", 4.0, "Clorofila", "Sin género",
                List.of("Planta", "Veneno"), List.of("Fuego", "Hielo", "Volador", "Psíquico"), 50, 75, 35, 70, 30, 40, "069.png",
                "Bellsprout es capaz de atraer presas con su aroma dulce. Se balancea para atrapar insectos en su boca.");
    }

    private static Pokemon crearWeepinbell() {
        return new Pokemon(70, "Weepinbell", 1.0, "Pokémon Planta Piraña", 6.4, "Clorofila", "Sin género",
                List.of("Planta", "Veneno"), List.of("Fuego", "Hielo", "Volador", "Psíquico"), 65, 90, 50, 85, 45, 55, "070.png",
                "Weepinbell es la evolución de Bellsprout. Su aroma es más fuerte y puede atraer a presas desde mayores distancias.");
    }

    private static Pokemon crearVictreebel() {
        return new Pokemon(71, "Victreebel", 1.7, "Pokémon Planta Piraña", 15.5, "Clorofila", "Sin género",
                List.of("Planta", "Veneno"), List.of("Fuego", "Hielo", "Volador", "Psíquico"), 80, 105, 65, 100, 70, 70, "071.png",
                "Victreebel tiene una trampa mortal: su boca ancha y hojas afiladas atrapan presas desprevenidas.");
    }

    private static Pokemon crearTentacool() {
        return new Pokemon(72, "Tentacool", 0.9, "Pokémon Medusa", 45.5, "Cuerpo puro", "Sin género",
                List.of("Agua", "Veneno"), List.of("Eléctrico", "Tierra", "Psíquico"), 40, 40, 35, 50, 100, 70, "072.png",
                "Tentacool flota en océanos cálidos. Sus tentáculos venenosos son peligrosos y pueden paralizar a los enemigos.");
    }

    private static Pokemon crearTentacruel() {
        return new Pokemon(73, "Tentacruel", 1.6, "Pokémon Medusa", 55.0, "Cuerpo puro", "Sin género",
                List.of("Agua", "Veneno"), List.of("Eléctrico", "Tierra", "Psíquico"), 80, 70, 65, 80, 120, 100, "073.png",
                "Tentacruel es conocido por sus tentáculos largos y venenosos. Puede atrapar presas a gran profundidad en el mar.");
    }

    private static Pokemon crearGeodude() {
        return new Pokemon(74, "Geodude", 0.4, "Pokémon Roca", 20.0, "Cabeza roca", "Sin género",
                List.of("Roca", "Tierra"), List.of("Agua", "Planta", "Hielo", "Lucha", "Acero"), 40, 80, 100, 30, 30, 20, "074.png",
                "Geodude se encuentra comúnmente en montañas y cuevas. Su cuerpo rocoso resiste incluso los ataques más fuertes.");
    }

    private static Pokemon crearGraveler() {
        return new Pokemon(75, "Graveler", 1.0, "Pokémon Roca", 105.0, "Cabeza roca", "Sin género",
                List.of("Roca", "Tierra"), List.of("Agua", "Planta", "Hielo", "Lucha", "Acero"), 55, 95, 115, 45, 45, 35, "075.png",
                "Graveler evoluciona de Geodude. Su cuerpo se carga de electricidad cuando se acerca una tormenta.");
    }

    private static Pokemon crearGolem() {
        return new Pokemon(76, "Golem", 1.4, "Pokémon Roca", 300.0, "Cabeza roca", "Sin género",
                List.of("Roca", "Tierra"), List.of("Agua", "Planta", "Hielo", "Lucha", "Acero"), 80, 120, 130, 55, 65, 45, "076.png",
                "Golem es la evolución de Graveler. Puede lanzar rocas que pesan más de una tonelada para defenderse.");
    }

    private static Pokemon crearPonyta() {
        return new Pokemon(77, "Ponyta", 1.0, "Pokémon Potro", 30.0, "Absorbe fuego", "Sin género",
                List.of("Fuego"), List.of("Agua", "Roca", "Tierra"), 50, 85, 55, 65, 65, 90, "077.png",
                "Ponyta tiene una crin que arde con llamas brillantes. Puede correr a velocidades increíbles.");
    }

    private static Pokemon crearRapidash() {
        return new Pokemon(78, "Rapidash", 1.7, "Pokémon Fuego", 95.0, "Absorbe fuego", "Sin género",
                List.of("Fuego"), List.of("Agua", "Roca", "Tierra"), 65, 100, 70, 80, 80, 105, "078.png",
                "Rapidash es la evolución de Ponyta. Su velocidad es legendaria y es conocido por su majestuoso aspecto.");
    }

    private static Pokemon crearSlowpoke() {
        return new Pokemon(79, "Slowpoke", 1.2, "Pokémon Relajado", 36.0, "Cabeza roca", "Sin género",
                List.of("Agua", "Psíquico"), List.of("Fantasma", "Eléctrico", "Bicho", "Planta"), 90, 65, 65, 40, 40, 15, "079.png",
                "Slowpoke es muy relajado y a menudo se queda quieto en la orilla del agua. Su cola se agita cuando algo lo molesta.");
    }

    private static Pokemon crearSlowbro() {
        return new Pokemon(80, "Slowbro", 1.6, "Pokémon Ermitaño", 78.5, "Cabeza roca", "Sin género",
                List.of("Agua", "Psíquico"), List.of("Fantasma", "Eléctrico", "Bicho", "Planta"), 95, 75, 110, 100, 80, 30, "080.png",
                "Slowbro es la evolución de Slowpoke. Su cola está unida a su brazo y se vuelve más poderoso en este estado.");
    }

    private static Pokemon crearMagnemite() {
        return new Pokemon(81, "Magnemite", 0.3, "Pokémon Imán", 6.0, "Imán", "Sin género",
                List.of("Eléctrico", "Acero"), List.of("Fuego", "Lucha", "Tierra"), 25, 35, 70, 95, 55, 45, "081.png",
                "Magnemite emite ondas magnéticas constantemente. Es atraído por los objetos de metal y se adhiere a ellos.");
    }

    private static Pokemon crearMagneton() {
        return new Pokemon(82, "Magneton", 1.0, "Pokémon Imán", 60.0, "Imán", "Sin género",
                List.of("Eléctrico", "Acero"), List.of("Fuego", "Lucha", "Tierra"), 50, 60, 95, 120, 70, 70, "082.png",
                "Magneton es la evolución de Magnemite. Tres Magnemite se combinan para formar un solo cuerpo Magneton.");
    }

    private static Pokemon crearFarfetchd() {
        return new Pokemon(83, "Farfetch'd", 0.8, "Pokémon Pato Salvaje", 15.0, "Indefenso", "Macho",
                List.of("Normal", "Volador"), List.of("Eléctrico", "Hielo", "Roca", "Psíquico"), 52, 65, 55, 58, 62, 60, "083.png",
                "Farfetch'd es conocido por llevar un puerro como si fuera una espada. Es hábil en el combate con su puerro.");
    }

    private static Pokemon crearDoduo() {
        return new Pokemon(84, "Doduo", 1.4, "Pokémon Avestruz", 39.2, "Fuga", "Sin género",
                List.of("Normal", "Volador"), List.of("Eléctrico", "Hielo", "Roca", "Psíquico"), 35, 85, 45, 35, 35, 75, "084.png",
                "Doduo tiene dos cabezas que comparten un solo cuerpo. Es veloz y puede correr a altas velocidades.");
    }

    private static Pokemon crearDodrio() {
        return new Pokemon(85, "Dodrio", 1.8, "Pokémon Avestruz", 85.2, "Fuga", "Sin género",
                List.of("Normal", "Volador"), List.of("Eléctrico", "Hielo", "Roca", "Psíquico"), 60, 110, 70, 60, 60, 100, "085.png",
                "Dodrio es la evolución de Doduo. Puede correr más rápido que Doduo y es un experto en pelear con sus tres cabezas.");
    }

    private static Pokemon crearSeel() {
        return new Pokemon(86, "Seel", 1.1, "Pokémon León Marino", 90.0, "Gélido", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 65, 45, 55, 45, 70, 45, "086.png",
                "Seel tiene una piel gruesa y pelaje que lo protege del frío. Puede nadar y bucear expertamente.");
    }

    private static Pokemon crearDewgong() {
        return new Pokemon(87, "Dewgong", 1.7, "Pokémon León Marino", 120.0, "Sebo", "Hembra",
                List.of("Agua", "Hielo"), List.of("Eléctrico", "Planta", "Lucha", "Roca"), 90, 70, 80, 70, 95, 70, "087.png",
                "Dewgong es la evolución de Seel. Su piel es más gruesa y su cola le permite nadar a través de aguas frías.");
    }

    private static Pokemon crearGrimer() {
        return new Pokemon(88, "Grimer", 0.9, "Pokémon Lodo", 30.0, "Hedor", "Sin género",
                List.of("Veneno"), List.of("Tierra", "Psíquico"), 80, 80, 50, 40, 50, 25, "088.png",
                "Grimer se reproduce en desagües y vertederos. Emiten un olor horrible y pueden ser peligrosos de cerca.");
    }

    private static Pokemon crearMuk() {
        return new Pokemon(89, "Muk", 1.2, "Pokémon Lodo", 30.0, "Hedor", "Sin género",
                List.of("Veneno"), List.of("Tierra", "Psíquico"), 105, 105, 75, 65, 100, 50, "089.png",
                "Muk es la evolución de Grimer. Su cuerpo viscoso puede derretir cualquier cosa con la que entre en contacto.");
    }

    private static Pokemon crearShellder() {
        return new Pokemon(90, "Shellder", 0.3, "Pokémon Concha", 4.0, "Cáscara frágil", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 30, 65, 100, 45, 25, 40, "090.png",
                "Shellder se adhiere a las rocas en el fondo del océano con su lengua. Su concha es dura y difícil de abrir.");
    }

    private static Pokemon crearCloyster() {
        return new Pokemon(91, "Cloyster", 1.5, "Pokémon Bivalvo", 132.5, "Caparazón", "Sin género",
                List.of("Agua", "Hielo"), List.of("Eléctrico", "Planta", "Lucha", "Roca"), 50, 95, 180, 85, 45, 70, "091.png",
                "Cloyster es la evolución de Shellder. Su caparazón es tan resistente que puede soportar incluso ataques fuertes.");
    }

    private static Pokemon crearGastly() {
        return new Pokemon(92, "Gastly", 1.3, "Pokémon Gas", 0.1, "Levitón", "Sin género",
                List.of("Fantasma", "Veneno"), List.of("Siniestro", "Psíquico"), 30, 35, 30, 100, 35, 80, "092.png",
                "Gastly es un Pokémon hecho de gas. Puede esconderse en las sombras y pasar desapercibido.");
    }

    private static Pokemon crearHaunter() {
        return new Pokemon(93, "Haunter", 1.6, "Pokémon Gas", 0.1, "Levitón", "Sin género",
                List.of("Fantasma", "Veneno"), List.of("Siniestro", "Psíquico"), 45, 50, 45, 115, 55, 95, "093.png",
                "Haunter es la evolución de Gastly. Puede pasar a través de paredes y disfruta asustando a las personas.");
    }

    private static Pokemon crearGengar() {
        return new Pokemon(94, "Gengar", 1.5, "Pokémon Sombra", 40.5, "Levitón", "Sin género",
                List.of("Fantasma", "Veneno"), List.of("Siniestro", "Psíquico"), 60, 65, 60, 130, 75, 110, "094.png",
                "Gengar es la evolución de Haunter. Se dice que este Pokémon es el alma de las personas fallecidas.");
    }

    private static Pokemon crearOnix() {
        return new Pokemon(95, "Onix", 8.8, "Pokémon Serpiente Roca", 210.0, "Cabeza roca", "Sin género",
                List.of("Roca", "Tierra"), List.of("Agua", "Planta", "Hielo", "Lucha", "Acero", "Tierra"), 35, 45, 160, 30, 45, 70, "095.png",
                "Onix es una serpiente de roca gigante que vive en cuevas subterráneas. Puede excavar túneles.");
    }

    private static Pokemon crearDrowzee() {
        return new Pokemon(96, "Drowzee", 1.0, "Pokémon Hipnosis", 32.4, "Insomnio", "Sin género",
                List.of("Psíquico"), List.of("Bicho", "Siniestro"), 60, 48, 45, 43, 90, 42, "096.png",
                "Drowzee se alimenta de los sueños de las personas. Puede hipnotizar a sus enemigos para controlarlos.");
    }

    private static Pokemon crearHypno() {
        return new Pokemon(97, "Hypno", 1.6, "Pokémon Hipnosis", 75.6, "Insomnio", "Sin género",
                List.of("Psíquico"), List.of("Bicho", "Siniestro"), 85, 73, 70, 73, 115, 67, "097.png",
                "Hypno es la evolución de Drowzee. Utiliza ondas hipnóticas para controlar y llevar a las personas a dormir.");
    }

    private static Pokemon crearKrabby() {
        return new Pokemon(98, "Krabby", 0.4, "Pokémon Cangrejo", 6.5, "Corte fuerte", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 30, 105, 90, 25, 25, 50, "098.png",
                "Krabby tiene una pinza fuerte que usa para defenderse y cazar alimentos en el fondo del mar.");
    }

    private static Pokemon crearKingler() {
        return new Pokemon(99, "Kingler", 1.3, "Pokémon Pinza", 60.0, "Corte fuerte", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 55, 130, 115, 50, 50, 75, "099.png",
                "Kingler es la evolución de Krabby. Su pinza es tan poderosa que puede triturar conchas y hasta metal.");
    }

    private static Pokemon crearVoltorb() {
        return new Pokemon(100, "Voltorb", 0.5, "Pokémon Bola", 10.4, "Explosión", "Sin género",
                List.of("Eléctrico"), List.of("Tierra"), 40, 30, 50, 55, 55, 100, "100.png",
                "Voltorb es conocido por explotar sin previo aviso. Su cuerpo es una esfera cargada de electricidad.");
    }

    private static Pokemon crearElectrode() {
        return new Pokemon(101, "Electrode", 1.2, "Pokémon Bola", 66.6, "Explosión", "Sin género",
                List.of("Eléctrico"), List.of("Tierra"), 60, 50, 70, 80, 80, 140, "101.png",
                "Electrode es conocido por su capacidad de explotar en situaciones de peligro. Su cuerpo es una esfera cargada de electricidad.");
    }

    private static Pokemon crearExeggcute() {
        return new Pokemon(102, "Exeggcute", 0.4, "Pokémon Huevo Planta", 2.5, "Clorofila", "Sin género",
                List.of("Planta", "Psíquico"), List.of("Fuego", "Hielo", "Veneno", "Volador", "Bicho"), 60, 40, 80, 60, 45, 40, "102.png",
                "Exeggcute es un grupo de huevos de planta. Pueden comunicarse telepáticamente entre ellos.");
    }

    private static Pokemon crearExeggutor() {
        return new Pokemon(103, "Exeggutor", 2.0, "Pokémon Cocotero", 120.0, "Clorofila", "Sin género",
                List.of("Planta", "Psíquico"), List.of("Fuego", "Hielo", "Veneno", "Volador", "Bicho"), 95, 95, 85, 125, 75, 55, "103.png",
                "Exeggutor es la evolución de Exeggcute. Tiene tres cabezas y cada una tiene su propia personalidad.");
    }

    private static Pokemon crearCubone() {
        return new Pokemon(104, "Cubone", 0.4, "Pokémon Solitario", 6.5, "Cabeza roca", "Sin género",
                List.of("Tierra"), List.of("Agua", "Hielo", "Planta", "Lucha", "Acero", "Tierra"), 50, 50, 95, 40, 50, 35, "104.png",
                "Cubone lleva siempre consigo el hueso de su madre fallecida. Se dice que llora al mirar la luna llena.");
    }

    private static Pokemon crearMarowak() {
        return new Pokemon(105, "Marowak", 1.0, "Pokémon Hueso", 45.0, "Cabeza roca", "Sin género",
                List.of("Tierra"), List.of("Agua", "Hielo", "Planta", "Lucha", "Acero", "Tierra"), 60, 80, 110, 50, 80, 45, "105.png",
                "Marowak es la evolución de Cubone. Lucha fuertemente para proteger a sus crías y el hueso que lleva consigo.");
    }

    private static Pokemon crearHitmonlee() {
        return new Pokemon(106, "Hitmonlee", 1.5, "Pokémon Patada Alta", 49.8, "Flexibilidad", "Sin género",
                List.of("Lucha"), List.of("Volador", "Psíquico"), 50, 120, 53, 35, 110, 87, "106.png",
                "Hitmonlee es conocido por su habilidad en las patadas. Puede girar sus piernas rápidamente para realizar patadas de alta velocidad.");
    }

    private static Pokemon crearHitmonchan() {
        return new Pokemon(107, "Hitmonchan", 1.4, "Pokémon Puñetazo", 50.2, "Iron Fist", "Sin género",
                List.of("Lucha"), List.of("Volador", "Psíquico"), 50, 105, 79, 35, 110, 76, "107.png",
                "Hitmonchan es experto en los puñetazos y ganchos. Se mueve con gran velocidad y precisión en el combate.");
    }

    private static Pokemon crearLickitung() {
        return new Pokemon(108, "Lickitung", 1.2, "Pokémon Lengua", 65.5, "Fuga", "Sin género",
                List.of("Normal"), List.of("Lucha"), 90, 55, 75, 60, 75, 30, "108.png",
                "Lickitung puede estirar su lengua para alcanzar objetos distantes. Su lengua es áspera y está llena de papilas gustativas.");
    }

    private static Pokemon crearKoffing() {
        return new Pokemon(109, "Koffing", 0.6, "Pokémon Gas Venenoso", 1.0, "Levitón", "Sin género",
                List.of("Veneno"), List.of("Tierra", "Psíquico"), 40, 65, 95, 60, 45, 35, "109.png",
                "Koffing es un Pokémon lleno de gas tóxico. Se infla para intimidar a los enemigos y luego explota liberando su gas venenoso.");
    }

    private static Pokemon crearWeezing() {
        return new Pokemon(110, "Weezing", 1.2, "Pokémon Gas Venenoso", 9.5, "Levitón", "Sin género",
                List.of("Veneno"), List.of("Tierra", "Psíquico"), 65, 90, 120, 85, 70, 60, "110.png",
                "Weezing es la evolución de Koffing. Tiene dos cabezas y emite gases tóxicos por los poros de su piel.");
    }

    private static Pokemon crearRhyhorn() {
        return new Pokemon(111, "Rhyhorn", 1.0, "Pokémon Taladro", 115.0, "Pararrayos", "Sin género",
                List.of("Tierra", "Roca"), List.of("Agua", "Planta", "Hielo", "Lucha", "Acero", "Tierra"), 80, 85, 95, 30, 30, 25, "111.png",
                "Rhyhorn es conocido por su resistencia. Puede cargar a través de terrenos rocosos sin problemas.");
    }

    private static Pokemon crearRhydon() {
        return new Pokemon(112, "Rhydon", 1.9, "Pokémon Taladro", 120.0, "Pararrayos", "Sin género",
                List.of("Tierra", "Roca"), List.of("Agua", "Planta", "Hielo", "Lucha", "Acero", "Tierra"), 105, 130, 120, 45, 45, 40, "112.png",
                "Rhydon es la evolución de Rhyhorn. Su piel es muy resistente y sus cuernos pueden perforar rocas.");
    }

    private static Pokemon crearChansey() {
        return new Pokemon(113, "Chansey", 1.1, "Pokémon Huevo", 34.6, "Cura natural", "Hembra",
                List.of("Normal"), List.of("Lucha"), 250, 5, 5, 35, 105, 50, "113.png",
                "Chansey es conocido por su habilidad de curación natural. Siempre lleva un huevo en su bolsa.");
    }

    private static Pokemon crearTangela() {
        return new Pokemon(114, "Tangela", 1.0, "Pokémon Enredadera", 35.0, "Clorofila", "Sin género",
                List.of("Planta"), List.of("Fuego", "Hielo", "Veneno", "Volador", "Bicho"), 65, 55, 115, 100, 40, 60, "114.png",
                "Tangela tiene enredaderas que crecen rápidamente y atrapan a sus presas. Es difícil ver su cuerpo bajo la maraña de enredaderas.");
    }

    private static Pokemon crearKangaskhan() {
        return new Pokemon(115, "Kangaskhan", 2.2, "Pokémon Bolsa", 80.0, "Madreselva", "Hembra",
                List.of("Normal"), List.of("Lucha"), 105, 95, 80, 40, 80, 90, "115.png",
                "Kangaskhan es muy protectora de sus crías. Puede usar la bolsa en su abdomen para golpear a sus enemigos.");
    }

    private static Pokemon crearHorsea() {
        return new Pokemon(116, "Horsea", 0.4, "Pokémon Dragón", 8.0, "Nado rápido", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 30, 40, 70, 70, 25, 60, "116.png",
                "Horsea es un pequeño Pokémon dragón. Puede nadar rápidamente en el agua gracias a sus aletas.");
    }

    private static Pokemon crearSeadra() {
        return new Pokemon(117, "Seadra", 1.2, "Pokémon Dragón", 25.0, "Nado rápido", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 55, 65, 95, 95, 45, 85, "117.png",
                "Seadra es la evolución de Horsea. Sus aletas están más desarrolladas y le permiten nadar a gran velocidad.");
    }

    private static Pokemon crearGoldeen() {
        return new Pokemon(118, "Goldeen", 0.6, "Pokémon Pez", 15.0, "Nado rápido", "Hembra",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 45, 67, 60, 35, 50, 63, "118.png",
                "Goldeen es conocido por su elegante forma de nadar. Los entrenadores lo valoran por su belleza.");
    }

    private static Pokemon crearSeaking() {
        return new Pokemon(119, "Seaking", 1.3, "Pokémon Pez Espada", 39.0, "Nado rápido", "Hembra",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 80, 92, 65, 65, 80, 68, "119.png",
                "Seaking es la evolución de Goldeen. Su cuerno es muy afilado y puede perforar rocas en el agua.");
    }

    private static Pokemon crearStaryu() {
        return new Pokemon(120, "Staryu", 0.8, "Pokémon Estrella", 34.5, "Cuerpo puro", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 30, 45, 55, 70, 55, 85, "120.png",
                "Staryu tiene un núcleo central que brilla en diferentes colores. Puede regenerar sus extremidades si se cortan.");
    }

    private static Pokemon crearStarmie() {
        return new Pokemon(121, "Starmie", 1.1, "Pokémon Místico", 80.0, "Cuerpo puro", "Sin género",
                List.of("Agua", "Psíquico"), List.of("Eléctrico", "Planta", "Bicho", "Fantasma", "Siniestro"), 60, 75, 85, 100, 85, 115, "121.png",
                "Starmie es conocido por sus habilidades psíquicas. Su joya central puede brillar con luz mística.");
    }

    private static Pokemon crearMrMime() {
        return new Pokemon(122, "Mr. Mime", 1.3, "Pokémon Barrera", 54.5, "Filtro", "Sin género",
                List.of("Psíquico", "Hada"), List.of("Siniestro", "Fantasma"), 40, 45, 65, 100, 120, 90, "122.png",
                "Mr. Mime es hábil en la creación de barreras psíquicas. Puede atrapar a sus enemigos en ilusiones.");
    }

    private static Pokemon crearScyther() {
        return new Pokemon(123, "Scyther", 1.5, "Pokémon Mantis", 56.0, "Enjambre", "Sin género",
                List.of("Bicho", "Volador"), List.of("Roca", "Eléctrico", "Hielo", "Planta"), 70, 110, 80, 55, 80, 105, "123.png",
                "Scyther es conocido por su velocidad y agilidad en el aire. Sus cuchillas son afiladas y peligrosas.");
    }

    private static Pokemon crearJynx() {
        return new Pokemon(124, "Jynx", 1.4, "Pokémon Human Form", 40.6, "Punto hielo", "Hembra",
                List.of("Hielo", "Psíquico"), List.of("Lucha", "Bicho", "Fuego", "Fantasma", "Acero"), 65, 50, 35, 115, 95, 95, "124.png",
                "Jynx utiliza sus movimientos elegantes y su canto hipnótico para cautivar a sus oponentes.");
    }

    private static Pokemon crearElectabuzz() {
        return new Pokemon(125, "Electabuzz", 1.1, "Pokémon Electricidad", 30.0, "Pararrayos", "Sin género",
                List.of("Eléctrico"), List.of("Tierra"), 65, 83, 57, 95, 85, 105, "125.png",
                "Electabuzz es conocido por su velocidad eléctrica. Puede generar grandes descargas de energía.");
    }

    private static Pokemon crearMagmar() {
        return new Pokemon(126, "Magmar", 1.3, "Pokémon Llama", 44.5, "Cuerpo llama", "Sin género",
                List.of("Fuego"), List.of("Agua", "Roca", "Tierra"), 65, 95, 57, 100, 85, 93, "126.png",
                "Magmar está envuelto en llamas. Su cuerpo ardiente asusta a los enemigos que se acercan.");
    }

    private static Pokemon crearPinsir() {
        return new Pokemon(127, "Pinsir", 1.5, "Pokémon Insecto", 55.0, "Enjambre", "Sin género",
                List.of("Bicho"), List.of("Fuego", "Volador", "Roca"), 65, 125, 100, 55, 70, 85, "127.png",
                "Pinsir es fuerte y resistente. Sus pinzas pueden triturar cualquier cosa que se interponga en su camino.");
    }

    private static Pokemon crearTauros() {
        return new Pokemon(128, "Tauros", 1.4, "Pokémon Salvaje", 88.4, "Intimidación", "Macho",
                List.of("Normal"), List.of("Lucha"), 75, 100, 95, 40, 70, 110, "128.png",
                "Tauros es conocido por su naturaleza salvaje y su capacidad para cargar a gran velocidad.");
    }

    private static Pokemon crearMagikarp() {
        return new Pokemon(129, "Magikarp", 0.9, "Pokémon Pez", 10.0, "Nado rápido", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 20, 10, 55, 15, 20, 80, "129.png",
                "Magikarp es débil y no tiene movimientos fuertes, pero puede evolucionar en un Pokémon poderoso.");
    }

    private static Pokemon crearGyarados() {
        return new Pokemon(130, "Gyarados", 6.5, "Pokémon Atrocidad", 235.0, "Intimidación", "Sin género",
                List.of("Agua", "Volador"), List.of("Eléctrico", "Roca"), 95, 125, 79, 60, 100, 81, "130.png",
                "Gyarados es conocido por su furia y su poder. Puede destruir ciudades enteras con sus movimientos.");
    }

    private static Pokemon crearLapras() {
        return new Pokemon(131, "Lapras", 2.5, "Pokémon Transporte", 220.0, "Absorbe agua", "Sin género",
                List.of("Agua", "Hielo"), List.of("Eléctrico", "Planta", "Lucha", "Roca"), 130, 85, 80, 85, 95, 60, "131.png",
                "Lapras es conocido por su capacidad de transporte acuático. Es amable y se lleva bien con los entrenadores.");
    }

    private static Pokemon crearDitto() {
        return new Pokemon(132, "Ditto", 0.3, "Pokémon Transformación", 4.0, "Cuerpo flexible", "Sin género",
                List.of("Normal"), List.of("Lucha"), 48, 48, 48, 48, 48, 48, "132.png",
                "Ditto tiene la capacidad única de transformarse en cualquier otro Pokémon. Su forma es simple y adaptable.");
    }

    private static Pokemon crearEevee() {
        return new Pokemon(133, "Eevee", 0.3, "Pokémon Evolución", 6.5, "Fuga", "Sin género",
                List.of("Normal"), List.of("Lucha"), 55, 55, 50, 45, 65, 55, "133.png",
                "Eevee es conocido por su capacidad de evolucionar en varias formas diferentes, dependiendo de diversos factores.");
    }

    private static Pokemon crearVaporeon() {
        return new Pokemon(134, "Vaporeon", 1.0, "Pokémon Burbuja", 29.0, "Absorbe agua", "Sin género",
                List.of("Agua"), List.of("Eléctrico", "Planta"), 130, 65, 60, 110, 95, 65, "134.png",
                "Vaporeon tiene una afinidad natural con el agua. Su piel es capaz de absorber agua para mantenerse hidratado.");
    }

    private static Pokemon crearJolteon() {
        return new Pokemon(135, "Jolteon", 0.8, "Pokémon Relámpago", 24.5, "Pararrayos", "Sin género",
                List.of("Eléctrico"), List.of("Tierra"), 65, 65, 60, 110, 95, 130, "135.png",
                "Jolteon es rápido y ágil como un rayo. Sus espinas están cargadas eléctricamente y pueden ser peligrosas.");
    }

    private static Pokemon crearFlareon() {
        return new Pokemon(136, "Flareon", 0.9, "Pokémon Llama", 25.0, "Cuerpo llama", "Sin género",
                List.of("Fuego"), List.of("Agua", "Roca", "Tierra"), 65, 130, 60, 95, 110, 65, "136.png",
                "Flareon tiene una temperatura corporal extremadamente alta. Su pelaje puede encenderse en llamas.");
    }

    private static Pokemon crearPorygon() {
        return new Pokemon(137, "Porygon", 0.8, "Pokémon Virtual", 36.5, "Rastro", "Sin género",
                List.of("Normal"), List.of("Lucha"), 65, 60, 70, 85, 75, 40, "137.png",
                "Porygon es un Pokémon creado artificialmente. Se compone de datos virtuales y puede cambiar su forma.");
    }

    private static Pokemon crearOmanyte() {
        return new Pokemon(138, "Omanyte", 0.4, "Pokémon Espiral", 7.5, "Cabeza roca", "Sin género",
                List.of("Roca", "Agua"), List.of("Eléctrico", "Planta"), 35, 40, 100, 90, 55, 35, "138.png",
                "Omanyte es un Pokémon antiguo que vivió en mares prehistóricos. Tiene una concha espiral distintiva.");
    }

    private static Pokemon crearOmastar() {
        return new Pokemon(139, "Omastar", 1.0, "Pokémon Espiral", 35.0, "Cabeza roca", "Sin género",
                List.of("Roca", "Agua"), List.of("Eléctrico", "Planta"), 70, 60, 125, 115, 70, 55, "139.png",
                "Omastar tiene una concha robusta y afilada. Era un depredador ágil en los antiguos océanos.");
    }

    private static Pokemon crearKabuto() {
        return new Pokemon(140, "Kabuto", 0.5, "Pokémon Caparazón", 11.5, "Cabeza roca", "Sin género",
                List.of("Roca", "Agua"), List.of("Eléctrico", "Planta"), 30, 80, 90, 55, 45, 55, "140.png",
                "Kabuto es un Pokémon con un caparazón resistente. Se cree que es una forma restaurada de vida prehistórica.");
    }

    private static Pokemon crearKabutops() {
        return new Pokemon(141, "Kabutops", 1.3, "Pokémon Caparazón", 40.5, "Cabeza roca", "Sin género",
                List.of("Roca", "Agua"), List.of("Eléctrico", "Planta"), 60, 115, 105, 65, 70, 80, "141.png",
                "Kabutops es un Pokémon ágil y feroz con cuchillas afiladas en sus extremidades. Es un depredador experto.");
    }

    private static Pokemon crearAerodactyl() {
        return new Pokemon(142, "Aerodactyl", 1.8, "Pokémon Fósil", 59.0, "Cabeza roca", "Sin género",
                List.of("Roca", "Volador"), List.of("Eléctrico", "Hielo", "Roca", "Acero"), 80, 105, 65, 60, 75, 130, "142.png",
                "Aerodactyl es un antiguo Pokémon volador. Su velocidad en el aire y sus garras afiladas lo hacen formidable.");
    }

    private static Pokemon crearSnorlax() {
        return new Pokemon(143, "Snorlax", 2.1, "Pokémon Dormilón", 460.0, "Inmunidad", "Sin género",
                List.of("Normal"), List.of("Lucha"), 160, 110, 65, 65, 110, 30, "143.png",
                "Snorlax es conocido por dormir profundamente en cualquier lugar después de comer en exceso. Es imponente en batalla.");
    }

    private static Pokemon crearArticuno() {
        return new Pokemon(144, "Articuno", 1.7, "Pokémon Congelación", 55.4, "Presión", "Sin género",
                List.of("Hielo", "Volador"), List.of("Eléctrico", "Roca", "Acero", "Fuego"), 90, 85, 100, 95, 125, 85, "144.png",
                "Articuno controla el hielo y puede generar fuertes nevadas. Es un guardián majestuoso de las regiones frías.");
    }

    private static Pokemon crearZapdos() {
        return new Pokemon(145, "Zapdos", 1.6, "Pokémon Eléctrico", 52.6, "Presión", "Sin género",
                List.of("Eléctrico", "Volador"), List.of("Hielo", "Roca"), 90, 90, 85, 125, 90, 100, "145.png",
                "Zapdos es un Pokémon eléctrico con control sobre los truenos. Puede generar tormentas eléctricas poderosas.");
    }

    private static Pokemon crearMoltres() {
        return new Pokemon(146, "Moltres", 2.0, "Pokémon Llama", 60.0, "Presión", "Sin género",
                List.of("Fuego", "Volador"), List.of("Agua", "Eléctrico", "Roca"), 90, 100, 90, 125, 85, 90, "146.png",
                "Moltres es un majestuoso Pokémon de fuego que surca los cielos. Su presencia enciende llamas a su alrededor.");
    }

    private static Pokemon crearDratini() {
        return new Pokemon(147, "Dratini", 1.8, "Pokémon Dragón", 3.3, "Cuerpo puro", "Sin género",
                List.of("Dragón"), List.of("Hielo", "Dragón"), 41, 64, 45, 50, 50, 50, "147.png",
                "Dratini es un pequeño Pokémon dragón que vive en cuerpos de agua. Su forma es serpentina y elegante.");
    }

    private static Pokemon crearDragonair() {
        return new Pokemon(148, "Dragonair", 4.0, "Pokémon Dragón", 16.5, "Cuerpo puro", "Sin género",
                List.of("Dragón"), List.of("Hielo", "Dragón"), 61, 84, 65, 70, 70, 70, "148.png",
                "Dragonair es un Pokémon dragón más grande y serpenteante. Su hermosa apariencia deja a muchos admirados.");
    }

    private static Pokemon crearDragonite() {
        return new Pokemon(149, "Dragonite", 2.2, "Pokémon Dragón", 210.0, "Cuerpo puro", "Sin género",
                List.of("Dragón", "Volador"), List.of("Hielo", "Roca", "Dragón", "Hada"), 91, 134, 95, 100, 100, 80, "149.png",
                "Dragonite es un majestuoso Pokémon dragón volador. Es conocido por su naturaleza amistosa y su poder en combate.");
    }

    private static Pokemon crearMewtwo() {
        return new Pokemon(150, "Mewtwo", 2.0, "Pokémon Genético", 122.0, "Presión", "Sin género",
                List.of("Psíquico"), List.of("Bicho", "Fantasma", "Siniestro"), 106, 110, 90, 154, 90, 130, "150.png",
                "Mewtwo es un poderoso Pokémon psíquico creado en laboratorio. Su inteligencia y poder son asombrosos.");
    }

    private static Pokemon crearMew() {
        return new Pokemon(151, "Mew", 0.4, "Pokémon Genético", 4.0, "Sincronía", "Sin género",
                List.of("Psíquico"), List.of("Bicho", "Fantasma", "Siniestro"), 100, 100, 100, 100, 100, 100, "151.png",
                "Mew es un Pokémon mítico con la capacidad de aprender todos los movimientos. Es un ser curioso y juguetón.");
    }
}
