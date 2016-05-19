package com.jfcorugedo.mobile;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class Mobile {

	private String name;
	private String brand;
	private String color;
	private double price;
	private Plan plan;
}
