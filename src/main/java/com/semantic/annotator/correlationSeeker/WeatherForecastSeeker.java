package com.semantic.annotator.correlationSeeker;

import com.semantic.annotator.resource.WeatherForecast;
import com.semantic.annotator.resourceDTO.WeatherForecastDTO;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class WeatherForecastSeeker {
    private MapperFactory mapperFactory;

    public WeatherForecastSeeker(MapperFactory mapperFactory) {
        this.mapperFactory = new DefaultMapperFactory.Builder().build();
        this.mapperFactory.classMap(WeatherForecast.class, WeatherForecastDTO.class).
                mapNulls(false).
                mapNullsInReverse(false).
                field("address.value.addressCountry", "addressCountry").
                field("address.value.addressRegion", "addressRegion").
                field("address.value.addressLocality", "addressLocality").
                field("address.value.streetAddress", "streetAddress").
                field("address.value.addressTown", "addressTown").
                field("location.type", "locationType").
                field("location.value.coordinates[0].latitude", "locationLatitute").
                field("location.value.coordinates[0].longitude", "locationLongitude").
                field("weatherPrediction.observedAt","observedAt").
                byDefault().
                register();

        //CHECK
        //resource : type, weatherPrediction class / estimatedValue, evaluationValue 추가
        //DTO : estimatedValue, evaluationValue, locationName1~5
        //byDefault : id,
    }

    public <S, D> D map(S s, Class<D> type) {
        return this.mapperFactory.getMapperFacade().map(s, type);
    }

}
