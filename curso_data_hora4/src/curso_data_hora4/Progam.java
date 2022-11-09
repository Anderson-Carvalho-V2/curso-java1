package curso_data_hora4;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Progam {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate semanaPassada = d04.minusDays(7);
		LocalDate proximaSemana = d04.plusDays(7);
		
		System.out.println("semanaPassada = " + semanaPassada);
		System.out.println("proximaSemana = " + proximaSemana);
		System.out.println("-------------------------------------------");
		
		LocalDateTime semanaPassadaTime = d05.minusDays(7);
		LocalDateTime proximaSemanaTime = d05.plusDays(7);
		
		System.out.println("semanaPassadaTime = " + semanaPassadaTime);
		System.out.println("proximaSemanaTime = " + proximaSemanaTime);
		System.out.println("---------------------------------------------");
		
		Instant semanaPassadaInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant proximaSemanaInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("semanaPassadaInstant = " + semanaPassadaInstant);
		System.out.println("proximaSemanaInstant = " + proximaSemanaInstant);
		System.out.println("----------------------------------------------");
		
		Duration t1 = Duration.between(semanaPassada.atStartOfDay(), d04.atTime(0, 0));
		Duration t2 = Duration.between(semanaPassadaTime, d05);
		Duration t3 = Duration.between(semanaPassadaInstant, d06);
		Duration t4 = Duration.between(d06, semanaPassadaInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
		
		
		
	}

}
