package com.baeldung.mapper;

import com.baeldung.dto.AutoType;
import com.baeldung.entity.CarType;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import com.baeldung.dto.CarDTO;
import com.baeldung.entity.Car;

@Mapper
public interface CarMapper {
    
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

//    @Mapping(ignore = true, target = "type")
    CarDTO carToCarDTO(Car car);

    @ValueMapping(source = "SEDAN", target = "POLNY")
    @ValueMapping(source = "HADBAGE", target = "ROLNY")
    @ValueMapping(source = MappingConstants.ANY_REMAINING , target = "ROLNY")
    AutoType carTypeToAutoType(CarType carType);
}
