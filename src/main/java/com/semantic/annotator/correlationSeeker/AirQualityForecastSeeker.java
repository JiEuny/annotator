package com.semantic.annotator.correlationSeeker;

import com.semantic.annotator.resource.AirQualityForecast;
import com.semantic.annotator.resourceDTO.AirQualityForecastDTO;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class AirQualityForecastSeeker {

    private MapperFactory mapperFactory;

    public AirQualityForecastSeeker() {
        this.mapperFactory = new DefaultMapperFactory.Builder().build();
        this.mapperFactory.classMap(AirQualityForecast.class, AirQualityForecastDTO.class).
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

                field("airQualityPrediction.airQualityPrediction", "estimatedValue1").
                field("airQualityIndexPrediction.airQualityIndexPrediction", "estimatedValue2").

                field("airQualityPrediction.airQualityPrediction", "evaluationValue1").
                field("airQualityIndexPrediction.airQualityIndexPrediction", "evaluationValue2").

                field("airQualityPrediction.observedAt","observedAt1").
                field("airQualityIndexPrediction.observedAt","observedAt2").
                register();

                // CHECK : mapping string type , estimatedValue1, estimatedValue2, evaluationValue1, evaluationValue2

    }

    public <S, D> D map(S s, Class<D> type) {
        return this.mapperFactory.getMapperFacade().map(s, type);
    }
}
