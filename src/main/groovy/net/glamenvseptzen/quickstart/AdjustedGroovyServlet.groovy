package net.glamenvseptzen.quickstart

import groovy.servlet.*

public class AdjustedGroovyServlet extends GroovyServlet {
    public URLConnection getResourceConnection(String name) throws ResourceException {
        if (name.startsWith("file:")) name = name.replaceFirst("file:", "")
        return super.getResourceConnection(name)
    }
}
