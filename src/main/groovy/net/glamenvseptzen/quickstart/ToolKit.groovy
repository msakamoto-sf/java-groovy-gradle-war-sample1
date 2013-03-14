package net.glamenvseptzen.quickstart

import groovy.util.logging.*

@Slf4j
class ToolKit {
    def config = new ConfigSlurper().parse(ToolKit.class.getClassLoader().getResource('config.groovy'))
    def ToolKit() {
    }
    def logger() {
        return log
    }
}

