package demo

import org.grails.databinding.converters.ValueConverter

class CurrencyStringToDoubleConverter implements ValueConverter {

    FormatService formatService

    @Override
    boolean canConvert(Object value) {
        value instanceof String
    }

    @Override
    Object convert(Object value) {
        formatService.parseCurrency((String) value)
    }

    @Override
    Class<?> getTargetType() {
        Double
    }
}