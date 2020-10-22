package com.baeldung.mapper;

import static org.junit.Assert.assertEquals;

import com.baeldung.dto.AutoType;
import com.baeldung.entity.CarType;
import org.junit.Test;

import com.baeldung.dto.CarDTO;
import com.baeldung.entity.Car;

public class CarMapperUnitTest {

    @Test
    public void givenCarEntitytoCar_whenMaps_thenCorrect() {
        
        Car entity  = new Car();
        entity.setId(1);
        entity.setName("Toyota");
        entity.setType(CarType.HADBAGE);
        
        CarDTO carDto = CarMapper.INSTANCE.carToCarDTO(entity);

        assertEquals(carDto.getId(), entity.getId());
        assertEquals(carDto.getName(), entity.getName());
        assertEquals(AutoType.ROLNY, carDto.getType());
    }
}
