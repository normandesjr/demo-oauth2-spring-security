package com.example.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductResource {

	@GetMapping
	public List<Product> list() {
		return Arrays.asList(new Product("Mug for Coffee", 12.99), new Product("Coffee cup", 4.21));
	}

	public static class Product {

		private String name;
		private double value;

		public Product(String name, double value) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getValue() {
			return value;
		}

		public void setValue(double value) {
			this.value = value;
		}

	}

}
