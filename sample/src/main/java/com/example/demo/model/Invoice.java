package com.example.demo.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Invoice {
    
    // name
    @NotBlank
    @Size(max = 60)
    private String name;
    // address
    @NotBlank
    @Size(max = 254)
    private String address;
    // phoneNumber
    @NotBlank
    @Pattern(regexp = "[0-9]*")
    private String phoneNumber;
}
