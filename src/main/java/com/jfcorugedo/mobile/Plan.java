package com.jfcorugedo.mobile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@AllArgsConstructor
@NoArgsConstructor
public class Plan {

	private String id;
	private String name;
	private String description;
	private double installment;
	private int freeMB;
	private int freeMinutes;
}
