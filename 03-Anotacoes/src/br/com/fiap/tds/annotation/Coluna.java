package br.com.fiap.tds.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Teste.java - compilar -> Testee.class (bytecode) - > Interpretar (JVM)

//Definbe onde a anota��o pode ser utilizada
@Target({ ElementType.FIELD, ElementType.METHOD })

@Retention(RetentionPolicy.RUNTIME)
//SOURCE -> at� o c�digo
//CLASS - > at�  compila��o
//RUNTIME -> at� a execu��o

public @interface Coluna {

	String nome(); // par�metro da anota��o

	int tamanho() default 255;

	boolean unico() default false;

}
