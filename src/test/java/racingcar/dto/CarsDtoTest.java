package racingcar.dto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsDtoTest {

    @Test
    @DisplayName("라운드 결과 출력을 위한 실행 결과 DTO 생성")
    void givenRoundResults_whenCreateCarsDto_thenReturnCorrectValue() {
        List<CarDto> roundResults = List.of(new CarDto("pobi", 3), new CarDto("woni", 4));

        CarsDto carsDto = new CarsDto(roundResults);
        List<CarDto> results = carsDto.roundResults();

        assertThat(results.get(0)).extracting("name").isEqualTo("pobi");
        assertThat(results.get(0)).extracting("position").isEqualTo(3);
        assertThat(results.get(1)).extracting("name").isEqualTo("woni");
        assertThat(results.get(1)).extracting("position").isEqualTo(4);
    }

}
