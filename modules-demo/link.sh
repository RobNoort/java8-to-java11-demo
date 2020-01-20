##!/bin/sh

#rmdir -rf robnoort

jlink --module-path "%JAVA_HOME%/jmods":\
application/target/application-1.0.0.jar:\
provider/target/provider-1.0.0.jar:\
fruits-provider/target/fruits-provider-1.0.0.jar:\
vegetables-provider/target/vegetables-provider-1.0.0.jar \
  --add-modules nl.robnoort.application \
  --add-modules nl.robnoort.fruits \
  --add-modules nl.robnoort.vegetables \
  --output robnoort \
  --compress 2 \
  --launcher application=com.checho.application/com.checho.application.Application
