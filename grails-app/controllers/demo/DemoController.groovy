package demo

class DemoController {

    def test(UpdateThresholdsCommand utc) {
        render "1: ${utc.threshold_1}, 2: ${utc.threshold_2}"
    }
}

class UpdateThresholdsCommand {
    Double threshold_1
    Double threshold_2
}
