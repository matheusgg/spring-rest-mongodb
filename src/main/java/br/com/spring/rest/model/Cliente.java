package br.com.spring.rest.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente implements Serializable {

	private static final long serialVersionUID = 8933910574738365778L;

	@Id
	private String id;
	private String nome;

	public Cliente() {

	}

}
