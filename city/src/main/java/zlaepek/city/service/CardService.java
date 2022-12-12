package zlaepek.city.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import zlaepek.city.dto.CardListResponseDto;
import zlaepek.city.dto.CardMakeRequestDto;
import zlaepek.city.repository.CardRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CardService {
    @Autowired
    CardRepository cardRepository;

    @Transactional(readOnly = true) // 트랜젝션을 읽기 전용으로 함
    public List<CardListResponseDto> findAll() {
        return cardRepository.findAll().stream()
                .map(CardListResponseDto::new)
                .collect(Collectors.toList());
    }
}
