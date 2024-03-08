package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAlias;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
						@JsonAlias("TotalSeasons") Integer totalTemporadas,
						@JsonProperty("imdbRating")	String avaliacao
		) { 	
	
	
}
