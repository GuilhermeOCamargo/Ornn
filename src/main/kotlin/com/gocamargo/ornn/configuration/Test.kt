package com.gocamargo.ornn.configuration

import com.gocamargo.ornn.dsl.OrnnSpec
import com.gocamargo.ornn.model.enums.Type
import com.gocamargo.ornn.repository.ComponentSpecRepository
import com.gocamargo.ornn.service.ComponentService
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration

@Configuration
class Test(private val componentSpecRepository: ComponentSpecRepository, private val componentService: ComponentService): CommandLineRunner {
    override fun run(vararg args: String?) {
        /*var test = OrnnSpec(ComponentType.CAROUSEL_ROW){
            description = "Component carrossel"
            contents {
                contentSpec {
                    name = "title"
                    optional = true
                    type = Type.STRING
                    minVersion = 1
                    description = "Título do conteúdo"
                }
                contentSpec {
                    name = "image"
                    optional = false
                    type = Type.STRING
                    minVersion = 1
                    description = "Imagem que aparecerá no fundo do conteúdo"
                }
                contentSpec {
                    name = "subtitle"
                    optional = true
                    type = Type.STRING
                    minVersion = 2
                    description = "Subtitulo do conteúdo"
                }
            }
            minVersion = 1
        }
        componentSpecRepository.save(test).block()*/
    }
}