package zlaepek.city.dto;
import lombok.Getter;
import zlaepek.city.model.Card;

public class CardListResponseDto {
    private int id;
    private String owner;
    private double limit;
    private double total_usage;

    public CardListResponseDto(Card entity) {
        this.id = entity.getId();
        this.owner = entity.getOwner();
        this.limit = entity.getLimit();
        this.total_usage = entity.getTotal_usage();
    }

}
