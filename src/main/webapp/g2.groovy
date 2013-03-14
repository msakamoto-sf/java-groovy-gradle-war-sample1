import net.glamenvseptzen.quickstart.*

ToolKit tk = new ToolKit()
def log = tk.logger()
log.trace 'trace2'
log.debug 'debug1'
log.info  'info1'
log.warn  'warn1'
log.error 'error1'
def config = tk.config
println """
<html>
<head><title>Log Output</title></head>
<body>
<h2>${config.app.name}</h2>
<p>
Log output test and Return test in groovy servlet.
</p>
<p>
defaultEncoding = ${config.app.defaultEncoding}<br>
defaultContentType = ${config.app.defaultContentType}<br>
</p>
</body>
</html>
"""

return

println """
This 'print' must not be displayed.
"""
