// Place your Spring DSL code here
beans = {
    specialDoubleConverter(demo.CurrencyStringToDoubleConverter) {
        formatService = ref('formatService')

        // instead of the above you could do this...

        // it.autowire = 'byName'
    }
}
