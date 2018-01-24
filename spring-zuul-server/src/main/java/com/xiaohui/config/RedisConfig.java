package com.xiaohui.config;

import com.xiaohui.redis.converter.CustomerConverter;
import com.xiaohui.redis.converter.ServiceConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.data.redis.core.convert.CustomConversions;
import org.springframework.data.redis.core.convert.MappingRedisConverter;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2016/12/15 19:39
 * @version: 1.0.0
 */
@Configuration
@EnableRedisRepositories(basePackageClasses = RedisConfig.class)
@ComponentScan(basePackageClasses = RedisConfig.class)
public class RedisConfig {

    @Autowired
    protected MappingRedisConverter mappingRedisConverter;

    @PostConstruct
    public void initialConverter() {
        // register converter for value
        mappingRedisConverter.setCustomConversions(customConversions());
        // register converter for key
        ConversionService conversionService = mappingRedisConverter.getConversionService();
        if (conversionService instanceof GenericConversionService) {
            registryKeyConverter((GenericConversionService) conversionService);
        }

    }

    private CustomConversions customConversions() {
        List<Converter<?, ?>> converters = new ArrayList<>();
        return new CustomConversions(converters);
    }

    private void registryKeyConverter(GenericConversionService conversionService) {

        conversionService.addConverter(new CustomerConverter.UserDtoToBytesConverter());
        conversionService.addConverter(new CustomerConverter.BytesToUserDtoConverter());
        conversionService.addConverter(new CustomerConverter.UserDtoToStringConverter());
        conversionService.addConverter(new ServiceConverter.BytesToUserEConverter());
        conversionService.addConverter(new ServiceConverter.UserEToBytesConverter());
        conversionService.addConverter(new ServiceConverter.UserEToStringConverter());
    }

}
