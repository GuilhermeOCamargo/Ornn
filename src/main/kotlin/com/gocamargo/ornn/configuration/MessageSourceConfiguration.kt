package com.gocamargo.ornn.configuration

import java.io.InputStreamReader
import java.nio.charset.Charset
import java.util.*

/**
 * @author Guilherme Camargo
 *
 * Arquivo responsável por carregar as configurações dos properties
 * Foi criado dessa maneira para a utlização não depender da criação de um bean gerenciado do spring
 */

sealed class LoadPropertiesUtil(fileName: String) {
    private val propertiesConfig = Properties()

    private val inputStream = javaClass.classLoader.getResourceAsStream("$fileName")
    private fun load() = propertiesConfig.load(InputStreamReader(inputStream, Charset.forName("UTF-8")))

    init {
        load()
    }

    operator fun get(key: String): String = propertiesConfig.getProperty(key).format(Locale.forLanguageTag("UTF-8"))
    fun get(key: String, vararg args: Any) = String.format(get(key), args)
}

object MessageSource : LoadPropertiesUtil("messages.properties")
