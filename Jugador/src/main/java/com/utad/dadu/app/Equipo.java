package com.utad.dadu.app;

import java.util.Random;

import com.utad.dadu.model.JugadorBalonMano;

public class Equipo {

	// Método para calcular las estadísticas.
	private static void calculoEstisticas(String nombre, int dorsal, int anotaciones, int bloqueos, int tiempoJugado,
			int jornada) {
		System.out.printf(
				"%s, con dorsal %d, ha anotado %.2f goles, realizado %.2f bloqueos y jugado %.2f minutos de media\n",
				nombre, dorsal, ((double) anotaciones / jornada), ((double) bloqueos / jornada),
				((double) tiempoJugado / jornada));
	}

	public static void main(String[] args) {

		Random random = new Random();

		JugadorBalonMano jugador1 = new JugadorBalonMano("Javier", 10);
		JugadorBalonMano jugador2 = new JugadorBalonMano("Jaime", 7);

		int totalAnotJ1 = 0, totalBloqJ1 = 0, totalTJugJ1 = 0, totalAnotJ2 = 0, totalBloqJ2 = 0, totalTJugJ2 = 0;
		final int MITAD_JORNADAS = 2, NUM_JORNADAS = 10;

		// Bucle de las 10 jornadas.
		for (int jornada = 1; jornada <= NUM_JORNADAS; jornada++) {

			System.out.printf("\nJornada %d:\n", jornada);

			// Generación y suma de resultados cada jornada jugador 1
			jugador1.setAnotacion(random.nextInt(10));
			jugador1.setBloqueo(random.nextInt(4));
			jugador1.setTiempoJugado(random.nextInt(60));

			totalAnotJ1 += jugador1.getAnotacion();
			totalBloqJ1 += jugador1.getBloqueo();
			totalTJugJ1 += jugador1.getTiempoJugado();

			// Generación y suma de resultados cada jornada jugador 2
			jugador2.setAnotacion(random.nextInt(8));
			jugador2.setBloqueo(random.nextInt(6));
			jugador2.setTiempoJugado(random.nextInt(60));

			totalAnotJ2 += jugador2.getAnotacion();
			totalBloqJ2 += jugador2.getBloqueo();
			totalTJugJ2 += jugador2.getTiempoJugado();

			// Resultados jornada a jornada
			System.out.printf("%s ha anotado %d goles, ha realizado %d bloqueos y ha jugado %d minutos.\n",
					jugador1.getNombre(), jugador1.getAnotacion(), jugador1.getBloqueo(), jugador1.getTiempoJugado());

			System.out.printf("%s ha anotado %d goles, ha realizado %d bloqueos y ha jugado %d minutos.\n\n",
					jugador2.getNombre(), jugador2.getAnotacion(), jugador2.getBloqueo(), jugador2.getTiempoJugado());

			// Estadísticas final jornada 5 y 10.
			if (jornada == (NUM_JORNADAS / MITAD_JORNADAS)) {
				System.out.printf("ESTADÍSTICAS JORNADA %d:\n", jornada);
				calculoEstisticas(jugador1.getNombre(), jugador1.getDorsal(), totalAnotJ1, totalBloqJ1, totalTJugJ1,
						jornada);
				calculoEstisticas(jugador2.getNombre(), jugador2.getDorsal(), totalAnotJ2, totalBloqJ2, totalTJugJ2,
						jornada);
			} else if (jornada == NUM_JORNADAS) {
				System.out.printf("ESTADÍSTICAS JORNADA %d:\n", jornada);
				calculoEstisticas(jugador1.getNombre(), jugador1.getDorsal(), totalAnotJ1, totalBloqJ1, totalTJugJ1,
						jornada);
				calculoEstisticas(jugador2.getNombre(), jugador2.getDorsal(), totalAnotJ2, totalBloqJ2, totalTJugJ2,
						jornada);
			}
		}
	}
}
