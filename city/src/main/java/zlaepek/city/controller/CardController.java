package zlaepek.city.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zlaepek.city.dto.CardListResponseDto;
import zlaepek.city.service.CardService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@ResponseBody
public class CardController {
    @Autowired
    private final CardService cardService;

    @GetMapping("/card")
    public List<CardListResponseDto> findAllCard() {
        return cardService.findAll();
    }

}
