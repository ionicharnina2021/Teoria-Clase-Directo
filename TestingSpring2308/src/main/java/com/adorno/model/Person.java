package com.adorno.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Person {
    
	public Person(@NonNull String name, @NonNull int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@NonNull
    private int id;
    @NonNull
    private String name;
    @NonNull
    private int age;
	public String getName() {
		return name;
	}
    

}
