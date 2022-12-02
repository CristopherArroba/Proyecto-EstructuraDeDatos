/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espol.model;

import ec.edu.espol.util.ArrayList;
import ec.edu.espol.util.List;

/**
 *
 * @author USER
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ArrayList<Resena> r=Resena.leerResena();
//        for(Resena re: r){
//            System.out.println(re);
 //       }
    
     //Collections.sort(juegos, AnioComparator);
     
     
     ArrayList<Resena> resenas=new ArrayList<>();
         //ArrayList<Resena> ListaRese=Resena.leerResena();
        ArrayList<Juego> ListaJuego=new ArrayList<>();
        
        
//      
//        for(Resena r: ListaRese){
//            System.out.println(r);
//        }
        
        
        ArrayList<Resena> r1=new ArrayList<>();
        r1.addLast(new Resena("Julian Castro","NBA Jam",5,"El juego me agrada mucho debido a la complejidad de su interacción"));
        r1.addLast(new Resena("Jose Delgado","NBA Jam",4,"Es un juego interacctivo y con un diseño en 4k me agrada mucho"));
        r1.addLast(new Resena("Andrea Litardo","NBA Jam",3,"No me gustó mucho el juego debido a que algunos controles no funcionaron"));
        r1.addLast(new Resena("Rock Paper","NBA Jam",3,"Scum has a rare crafting system, a wonder of the modern age perhaps, that doesn’t force players to jump through hoops or spend hours engaged in busywork. And it does this all while maintaining an air of realism"));
        r1.addLast(new Resena("Polygon","NBA Jam",2,"The developers say that they’ve created the most realistic simulation of the human metabolic system ever made, the end result of which is a fairly regular requirement that my avatar urinate and empty his bowels"));
        Juego juego1 = new Juego("NBA Jam", "2010", "hagamos un 2 contra 2, a híper velocidad, con las mejores parejas de cada equipo. No estaba Michael Jordan, OK. Pero sí estaban Reggie Miller, Isiah Thomas, Pippen, Ewing, Larry Johnson, Charles Barkley, Kemp, Mutombo, Olajuwon, Divac y la dupla Stockton-Malone.", 10, r1, "deporte", "Sega");
        
        
        ArrayList<Resena> r2=new ArrayList<>();
        r2.addLast(new Resena("Krauser","Mortal Kombat II",4,"Very Good Game 10/10"));
        r2.addLast(new Resena("Karameta","Mortal Kombat II",4,"Lo compre a 200 cuando 2 horas despues estaba 150 xd pero no quita el juegaso que es"));
        r2.addLast(new Resena("Exilos","Mortal Kombat II",2,"Habiendo podido probarlo en la PS4 en su momento me dejo impresionado, y como fan que soy del héroe ame el juego. Sigue la tradición de los juegos de Batman Arkham y le queda perfecto, sistema de balanceo es increíble y te podes pasar un buen rato solo paseando ya que es super satisfactorio.Trajes iconos, villanos y personajes emblemáticos, buena historia y trama aparte de un apartado gráfico impecable, sin lugar a dudas un juego que todo fan de Spider Man disfrutara en su totalidad tanto como si no lo son. Denle una oportunidad, juego que debes jugar SI o SI, no lo digo como fan de Spider Man, si no como fan de los videojuegos."));
        r2.addLast(new Resena("Fabricio Luque","Mortal Kombat II",3,"Este titulo representa todo lo espectacular que puede ser un juego de superhéroes, hicieron una historia increíble con personajes super icónicos y que ademas podes saber mas de sus historias buscando los coleccionables, una jugabilidad y movilidad super divertida y fluidad de moverte por toda la ciudad de New York, banda sonoras muy fieles al personaje & emotivas y unos graficos super lindos y bien optimizados."));
        r2.addLast(new Resena("AndresDanielCC","Mortal Kmobat II",3,"Le metería 100 horas si tuviera tiempo de meterle 100 horas."));
        Juego juego2 = new Juego("Mortal Kombat II", "2011", "Más violencia, más sangre (bastante más sangre), más personajes, más escenarios. Nuevos modos de fatalities (la Babality o la Friendship, por ejemplo). Baraka, Mileena, Kitana, Kung Lao, entre otros, se suman al repertorio de luchadores.", 0, r2, "pelea", "Sega");
        
        
        ArrayList<Resena> r3=new ArrayList<>();
        r3.addLast(new Resena("ByLeog","Dragon ball z",4,"Dragon ball,Alto juego, lo compre hace 5 dias y me uni a un server argentino, las primeras hora tuve mi primer PvP y me putie con un hincha de velez 10/10"));
        r3.addLast(new Resena("gaboguason","Dragon ball z",2,"Una lastima, lo compre en su salida todo iba relativamente bien, con el tiempo fue perdiendo rendimiento y hoy en día no puedo jugar el juego en bajos a 60fps estables, me lo corre a 40fps entiendo que sea un acceso anticipado, pero con ese rendimiento llama poco la atención al querer comprarlo."));
        r3.addLast(new Resena("Nake","Dragon ball z",5,"Hasta ahora el mejor survival PVP/PVE que he encontrado."));
        r3.addLast(new Resena("OneTwo","Dragon ball z",4,"mmm esta pasable para jugar con amigos, no como el mariconasooo de Fedel q no entra nunca el analizador de trabas, mmmm nose si lo compraria de nuevo esperaria otro juego, igual desde Argentina ya no se si volveriamos a comprar otro juego esta carisimo, me voy a zzz aca esta nevando y se me congelan las manos"));
        r3.addLast(new Resena("Rock Paper","Dragon ball z",2,"Scum has a rare crafting system, a wonder of the modern age perhaps, that doesn’t force players to jump through hoops or spend hours engaged in busywork. And it does this all while maintaining an air of realism."));
        r3.addLast(new Resena("Polygon","Dragon ball z",5,"The developers say that they’ve created the most realistic simulation of the human metabolic system ever made, the end result of which is a fairly regular requirement that my avatar urinate and empty his bowels."));
        r3.addLast(new Resena("PC Gamer","Dragon ball z",3,"Owners of the Scum Supporters Pack will get an additional two inches on their unit, which they can swing around as a badge of honor or sacrifice for bonus points elsewhere. Not even kidding."));
        Juego juego3 = new Juego("Dragon ball z", "2012", "modo historia o al modo vs y elegir entre los once guerreros: Goku, Vegeta, Trunks, Gohan, Piccoro, Nro 18, Freezer, Cell, el Capitán Ginyu y Reecome y Krillin.", 20, r3, "pelea", "Sega");
        
        
        ArrayList<Resena> r4=new ArrayList<>();
        r4.addLast(new Resena("IGN","Out-run",5,"Hearts of Iron 4 wields complexity like a swift armor division during the blitzkrieg, allowing it to serve the idea of layered, cerebral, strategic warfare instead of letting it needlessly bog down the experience."));
        r4.addLast(new Resena("PC Gamer","Out-run",4,"It captivates me because—imperfectly, impressionistically, and perhaps a little amorally—it lets me orchestrate the most titanic armed struggles in history, from the fussy economic details to the cut-and-thrust of mechanized warfare. There are other great strategic-level wargames out there. But I have never played anything like Hearts of Iron 4"));
        r4.addLast(new Resena("Polygon","Out-run",3,"For now, after many dozens of hours, I'm taking a break from Hearts of Iron 4. Not because I'm sick of it; quite the contrary, in fact. What I need to do is some serious reading, some careful planning on what my vision for the United States should be in 1936. And when I've done that planning"));
        r4.addLast(new Resena("Coco Legrand","Out-run",3,"Podi matar comunistas y fascistas por igual, que mejor"));
        r4.addLast(new Resena("Kaiser","Out-run",4,"Podés ser Luxemburgo y conquistar el mundo 10/10"));
        r4.addLast(new Resena("Max","Out-run",4,"Podes conquistar el mundo con Luxemburgo. "));
        r4.addLast(new Resena("gcainero","Out-run",3,"asé demasiado tiempo en este juego, mas de lo que un juego de estrategia debería merecer, sin embargo, con la rejugabilidad que otorga, especialmente los mods, me veo de vuelta en los distintos escenarios de este RTS. Cada partida es distinta a la anterior, y los camino a la dominación mundial son varios"));
        r4.addLast(new Resena("Indric","Out-run",2,"Best Alternative history simulator"));
        r4.addLast(new Resena("PCGamesN","Out-run",3,"El nuevo juego 4X de Soren Johnson, diseñador principal de Civilization IV combina el diseño 4X con una narrativa similar a la saga de Crusader Kings"));
        Juego juego4 = new Juego("Out-run", "2013", "El camino se dividía en dos y dependiendo de la elección se modificaba la ruta, el nivel de dificultad de las carreras y la secuencia del final.", 30, r4, "carrera", "Sega");
        
        
        ArrayList<Resena> r5=new ArrayList<>();
        r5.addLast(new Resena("IGN","VirtualBart",2,"Old World se acerca en el tiempo y el espacio contando historias de la sociedad humana de manera más íntima y menos abstracta que sus predecesores en la saga Civilization."));
        r5.addLast(new Resena("PCGamer","VirtualBart",4,"Old World es un 4X brillante, lo recomendaría antes que Civilization ahora mismo. Es un auténtico paso adelante para el género gracias a su elegante diseño de toma de decisiones tan inventivo."));
        r5.addLast(new Resena("Gonzalove","VirtualBart",3,"A very fun roguelite city builder. It is in Early Access but doesn't feel unfinished."));
        r5.addLast(new Resena("Weed","VirtualBart",3,"buena mezcla de roguelite y simulador de colonia. Bastante contenido por lo que vale la pena el precio."));
        r5.addLast(new Resena("priest","VirtualBart",4,"Construir al principio y descubrir como sustentarse es lo mas divertido en los simuladores de colonia y este juego aprovecha eso al 100%"));
        r5.addLast(new Resena("Aniski","VirtualBart",2,"Muy viciante y difícil, pensé que lo iba a tener como juego casual facilito pero me equivoqué xd 10/10 por el momento."));
        r5.addLast(new Resena("Krispe","VirtualBart",2,"This game proves Triple A titles now a days are an absolute joke. This game is a masterpiece and it's still in EA and it's only $20. Absolutely incredible."));
        Juego juego5 = new Juego("VirtualBart", "2000", "Seis minijuegos. El esquizoide Dino-Bart. El Baby-Bart saltando entre ramas. El Chancho-Bart en el matadero de Krusty. El tobogán acuático. La carrera en pleno holocausto nuclear. Y el más divertido de todos: Tomato Doom. ", 5, r5, "accion", "Sega");
        
        ArrayList<Resena> r6=new ArrayList<>();
        r6.addLast(new Resena("Hatsu","Monster Hunter",4,"Esta bueno para pasar el rato"));
        r6.addLast(new Resena("TheJunder","Monster Hunter",3,"Esta god si esta en oferta es un sacrilegio no comprarlo"));
        r6.addLast(new Resena("Don Ansioso","Monster Hunter",2,"Tenía la mejor partida hecha, la mejor colonia que había hecho, luego me atacaron unas máquinas y me destruyeron todo, 100% recomendado."));
        r6.addLast(new Resena("Tortois","Monster Hunter",4,"Si fuera astronauta y viajara en misión suicida hacia el sol, y solo pudiera jugar un último juego en toooodo el viaje probablemente sería este."));
        r6.addLast(new Resena("Noir","Monster Hunter",3,"Cometer crímenes contra la humanidad, el juego."));
        r6.addLast(new Resena("IGN","Monster Hunter",4,"Full underground base, chemfuel stored in a granite room with no cables in the walls so I figured it was safe, a Zzzt event set a colonist on fire who fled into the chemfuel stockpile, the stockpile exploded destroying the wall between it and the hallway."));
        Juego juego6 = new Juego("Monster Hunter", "2018", "Monster Hunter por fin evolucionaba, pulía su jugabilidad, las criaturas resultaban tan impactantes como deberían y no perdía la exigencia o profundidad característica de las sagas anteriores", 25, r6, "aventura", "Capcom");
        
        
        
        ArrayList<Resena> r7=new ArrayList<>();
        r7.addLast(new Resena("Tortuga Maritima","Resident evil",4,"Esta va para los mercenarios que luego se metían a molestar en los objetivos xd"));
        r7.addLast(new Resena("Master Byte","Resident evil",3,"Esta maravilla de juego ha sido aprobada"));
        r7.addLast(new Resena("Pizza Mozzarella","Resident evil",3,"tengo bronquitis"));
        r7.addLast(new Resena("Jose45","Resident evil",4,"Es mi primer juego AAA que e jugado y que es mio, resien estoy entrando en este mundo del juego y tampoco soy crítico pero el juego me parece una maravilla y tanto en historia como gráficos y Gameplay,"));
        r7.addLast(new Resena("WilcoxG","Resident evil",3,"Espectacular, no entiendo como gente critica a esta saga. Recomendadisimo!!"));
        r7.addLast(new Resena("messi","Resident evil",2,"Es buen juego, pero ya no tiene que ver con los assasins creed viejos."));
        r7.addLast(new Resena("VictorS","Resident evil",4,"vale 100% la pena este juego, un mapa grande, lleno de misiones , se me paso el tiempo en hacer misiones secundarias"));
        r7.addLast(new Resena("mau","Resident evil",5,"El juego es bueno, se nota mucho la influencia de The Witcher 3 en este juego, una lastima las politicas de mierda que tiene Ubisoft de poner micropagos en un juego singleplayer, pero mas alla de eso el juego es bueno, una historia normal no es ni buena ni mala, lo negativo es que alargan tanto la historia principal que llega un punto que se vuelve pesado, pero hay muchas cosas por hacer como en el Origins, es pracitcamente el mismo juego reciclado con algunos cambios en la jugabilidad, ahora el personaje tiene skills, una mejora graficamente y mas estable que el anterior. Agarraron lo mejor del Black Flag, Origins y mezcla con The Witcher y así nació este Odyssey."));
        r7.addLast(new Resena("IGN","Resident evil",5,"Un juego largo pero divertido. Como siempre el equipo creativo de Assassin' Creed tiene los mejores historiadores y recplican los lugares importantes de la antigua peninsula Griega. El persona de Kasandra me encanta, muy buena jugabilidad y buenas dinámicas lo jugaría nuevamente."));
        r7.addLast(new Resena("PC Gamer","Resident evil",2,"I am saying I have not had this much fun since the Witcher"));
        r7.addLast(new Resena("Polygon","Resident evil",2,"Unsurprisingly, the game world is beautifully designed. I loved Origins' game world, but I have to say that Odyssey's game world is a lot better. It is a lot more vibrant, and it is incredibly easy to get lost in it. There are plenty of things to do and plenty of places to explore."));
        r7.addLast(new Resena("brake","Resident evil",3,"bought the Gold Edition, which seems to have a better value."));
        Juego juego7 = new Juego("Resident evil", "2019", "es solo un civil con pocas habilidades especiales de lucha, y sin ningún entrenamiento de combate policial o militar, aun así es capaz de usar un considerable repertorio de armas", 35, r7, "terror", "Capcom");
        
        
        
        ArrayList<Resena> r8=new ArrayList<>();
        
        r8.addLast(new Resena("Polygon","Dragon's Dogma",3,"Dead Cells may be the most fun I've had in a game all year"));
        r8.addLast(new Resena("Katuk","Dragon's Dogma",4,"The game smartly dissects what’s so exciting about Metroidvanias (exploring labyrinthine levels packed with variety, unlocking new abilities that re-contextualize areas you already passed through) and reassembles those things around a compulsive roguelike core"));
        r8.addLast(new Resena("Rock Paper","Dragon's Dogma",2,"reassembles those things around a compulsive roguelike core"));
        r8.addLast(new Resena("Santylo","Dragon's Dogma",4,"It's hard to imagine anyone other than Supergiant pulling off this Herculean feat with such style."));
        r8.addLast(new Resena("Originalnicodr","Dragon's Dogma",5,"Muy muy muy buen juego, la pase excelente."));
        r8.addLast(new Resena("Papachasama","Dragon's Dogma",3,"Normalmente, esperaría más tiempo para escribir la reseña de un juego, pero ante la increíble recepción que ha tenido este juego y mi experiencia propia, escribiré mi opinión ahora mismo."));
        r8.addLast(new Resena("Aldebaran20","Dragon's Dogma",2,"Ya sabía que el buen IGA no decepcionaría"));
        r8.addLast(new Resena("Polygon","Dragon's Dogma",4,"Metroidvania de dificultad general media (posteriormente ajustable)"));
        r8.addLast(new Resena("IGN","Dragon's Dogma",2,"Apenas llevo menos de 2 horas de juego pero y quizas me este apurando un poco con lo que voy a decir pero el juego es lo que prometio Igarashi"));
        r8.addLast(new Resena("Escapist","Dragon's Dogma",5,"the most accessible the franchise has ever been and remains mechanically brilliant"));
        r8.addLast(new Resena("IGN","Dragon's Dogma",4,"deep, endlessly fun an immensely inviting"));
        r8.addLast(new Resena("Polygon","Dragon's Dogma",3,"excellent fighting game"));        
        Juego juego8 = new Juego("Dragon's Dogma", "2012", "nos permite explorar un mundo abierto, resolver misiones y derrotar bestias fantásticas acompañados de Peones, unos personajes que se pueden compartir con las funciones online.", 15, r8, "accion", "Capcom");
        
        ArrayList<Resena> r9=new ArrayList<>();
        r9.addLast(new Resena("LMDT","Street Fighter",4,"tuve que vender mi casa, mi perro y mi gato para poder comprar todo el contenido y DLCs, se pasan realmennte fuera de eso me está gustando mucho y la ando tryhardeando una banda en el multi."));
        r9.addLast(new Resena("Angela","Street Fighter",5,"un jueguito entrete la verda c:"));
        r9.addLast(new Resena("Link4D","Street Fighter",3,"Ya pero en serio, SFV ha tenido un montón de altibajos. Empecemos por el principio."));
        r9.addLast(new Resena("Jisito","Street Fighter",2,"No comprar si no cuentas con un buen proveedor de Internet, si lo que buscas es jugar Online."));
        r9.addLast(new Resena("Evo Loco","Street Fighte",1,"sinceramente no me gustó el juego,es mi opinión personal y es el primer juego que juego de la saga, no digo que el juego sea malo,sino que no es lo que yo me esperaba."));
        r9.addLast(new Resena("DartBlade","Street Fighter",5,"Yo probé este juego en su lanzamiento durante 2016-2017 y el juego fue horrible a nivel general, con este juego mataron la Saga de Street Fighters"));
        r9.addLast(new Resena("TecnoDash","Street Fighter",3,"Es un juegazo, es el primer fighting game al que le dedico tantas horas y que me hizo interesarme competitivamente en el género, estoy seguro que le meteré más horas y para mi no debe faltar en ninguna biblioteca de Steam."));
        r9.addLast(new Resena("GMK","Street Fighter",4,"no tengo todos los champs asi que masomeno"));
        Juego juego9 = new Juego("Street Fighter", "2009", "¡Un nuevo rival ha subido al ring! Controla a los mejores 32 guerreros del planeta y pon a prueba tu coraje enfrentándote a jugadores de todo el mundo.", 28, r9, "pelea", "Capcom");
        
        ArrayList<Resena> r10=new ArrayList<>();
        r10.addLast(new Resena("Polygon","Zack y Wiki",2,"Amazing!"));
        r10.addLast(new Resena("PCGamesN","Zack y Wiki",4,"Creative Assembly’s most maximalist, chaotic, and arguably best game to date"));
        r10.addLast(new Resena("Eurogamer","Zack y Wiki",4,"The ambition and the attention to detail is palpable with every click, and proof that Warhammer has surpassed history to become Creative Assembly’s premier product"));
        r10.addLast(new Resena("Aemond","Zack y Wiki",2,"Una buena forma de terminar una trilogía. La verdad Total War Warhammer 3 no es para todo fan de la saga por ahora, la campaña principal es demandante"));
        r10.addLast(new Resena("Mayorpolo","Zack y Wiki",1,"Es un juego inferior a total war warhammer II, así de simple, tiene serios problemas de optimización y en mi opinion es un juego menos divertido que su antecesor."));
        r10.addLast(new Resena("DonOmar","Zack y Wiki",2,"Juego incompleto (Esto ya es normal en las AAA). Empecemos primero por lo malo:Las unidades se quedan pilladas, no acatan ordenes o se ponen a dormir en medio de la batalla."));
        r10.addLast(new Resena("feliperocca","Zack y Wiki",4,"j u e g a z o y con el futuro mortal empires cuando lo agreguen, vas a tener HORAS Y HORAS Y HORAS de juego"));
        r10.addLast(new Resena("Visho","Zack y Will",5,"El mejor de la trilogia"));
        r10.addLast(new Resena("Maxi","Zack y Will",8,"Imperios inmortales"));
        
        
        Juego juego10 = new Juego("Zack y Wiki", "2008", "un juego inspirado en las aventuras gráficas clásicas que utilizó los sensores de movimiento para la resolución de puzles.", 19, r10, "aventura", "Capcom");        
        
        
        ListaJuego.addLast(juego1);
        ListaJuego.addLast(juego2);
        ListaJuego.addLast(juego3);
        ListaJuego.addLast(juego4);
        ListaJuego.addLast(juego5);
        ListaJuego.addLast(juego6);
        ListaJuego.addLast(juego7);
        ListaJuego.addLast(juego8);
        ListaJuego.addLast(juego9);
        ListaJuego.addLast(juego10);

//        
//        for(Juego j: ListaJuego){
//            for(Resena r: resenas){
//                if(j.getTitulo().equals(r.getJuego())){
//                    ArrayList<Resena> nueva=new ArrayList<>();
//                    nueva.addLast(r);
//                    j.setResena(nueva);
//                    System.out.println(j);                    
//                }
//            }
//        }

//    for(Juego j: ListaJuego){
//        System.out.println(j);
//        Juego.escribirJuego(j);
//    }
        
        
    
        
        
        
    }
    
}
