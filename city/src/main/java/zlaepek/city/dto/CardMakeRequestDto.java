package zlaepek.city.dto;

import lombok.Builder;
import zlaepek.city.model.Card;

import javax.persistence.Column;

public class CardMakeRequestDto {

    private String owner;
    private double limit;
    private double total_usage;

    @Builder
    public CardMakeRequestDto(String owner, double limit, double total_usage) {
        this.owner = owner;
        this.limit = limit;
        this.total_usage = total_usage;
    }

    public Card toEntity() {
        return Card.builder()
                .owner(owner)
                .limit(limit)
                .total_usage(total_usage)
                .build();
    }
}
