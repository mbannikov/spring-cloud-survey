package ru.mbannikov.springcloudsurvey

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudSurveyApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudSurveyApplication>(*args)
}
