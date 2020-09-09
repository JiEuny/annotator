package com.semantic.annotator.correlationSeeker;

import com.semantic.annotator.resource.OffStreetParking;
import com.semantic.annotator.resourceDTO.OffStreetParkingDTO;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class OffStreetParkingSeeker {

    private MapperFactory mapperFactory;

    public OffStreetParkingSeeker() {
        this.mapperFactory = new DefaultMapperFactory.Builder().build();
        this.mapperFactory.classMap(OffStreetParking.class, OffStreetParkingDTO.class).
                mapNulls(false).
                mapNullsInReverse(false).
                byDefault().
                field("name.value", "name").
                field("locationTag.value", "locationTag").
                register();
    }

    public <S, D> D map(S s, Class<D> type) {
        return this.mapperFactory.getMapperFacade().map(s, type);
    }
}
