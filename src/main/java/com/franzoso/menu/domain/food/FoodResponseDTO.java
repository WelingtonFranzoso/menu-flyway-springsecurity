package com.franzoso.menu.domain.food;

public record FoodResponseDTO(String id, String title, String image, Integer price) {
    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
