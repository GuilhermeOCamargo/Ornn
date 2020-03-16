package com.gocamargo.ornn.configuration

import com.gocamargo.ornn.repository.ComponentSpecRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration

@Configuration
class Test(private val componentSpecRepository: ComponentSpecRepository): CommandLineRunner {
    override fun run(vararg args: String?) {
        /*var test = OrnnSpec(ComponentType.CAROUSEL_ROW){
            description = "Component carrossel"
            contents {
                contentSpec {
                    name = "title"
                    optional = true
                    type = Type.STRING
                    minVersion = 1
                }
                contentSpec {
                    name = "image"
                    optional = false
                    type = Type.STRING
                    minVersion = 1
                }
                contentSpec {
                    name = "subtitle"
                    optional = true
                    type = Type.STRING
                    minVersion = 2
                }
            }
            minVersion = 1
        }
        componentRepository.save(test).block()*/
    }
}