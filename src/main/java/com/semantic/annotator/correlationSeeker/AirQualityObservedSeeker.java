package com.semantic.annotator.correlationSeeker;

import com.semantic.annotator.resource.AirQualityObserved;
import com.semantic.annotator.resourceDTO.AirQualityObservedDTO;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class AirQualityObservedSeeker {

    private MapperFactory mapperFactory;

    public AirQualityObservedSeeker() {
        this.mapperFactory = new DefaultMapperFactory.Builder().build();
        this.mapperFactory.classMap(AirQualityObserved.class, AirQualityObservedDTO.class).
                mapNulls(false).
                mapNullsInReverse(false).
                byDefault().
                field("location.type", "locationType").
                field("location.value.coordinates[0].latitude", "locationLatitute").
                field("location.value.coordinates[0].longitude", "locationLongitude").
                field("address.value.addressCountry", "addressCountry").
                field("address.value.addressRegion", "addressRegion").
                field("address.value.addressLocality", "addressLocality").
                field("address.value.streetAddress", "streetAddress").
                field("address.value.addressTown", "addressTown").

                field("airQualityObservation.airQualityObservation", "observedValue1").
                field("airQualityIndexObservation.airQualityIndexObservation", "observedValue2").
                field("indexRef.value", "indexRef").
                field("airQualityObservation.observedAt","observedAt1").
                field("airQualityIndexObservation.observedAt","observedAt2").
                register();
        
       // CHECK
       // DTO : evaluationValue1, evaluationValue2
    }

    public <S, D> D map(S s, Class<D> type) {
        return this.mapperFactory.getMapperFacade().map(s, type);
    }
}
