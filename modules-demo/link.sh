#!/bin/sh

rm -rf checho

jlink --module-path "$JAVA_HOME/jmods":\
application/target/application-1.0.0.jar:\
provider/target/provider-1.0.0.jar:\
fruits-provider/target/fruits-provider-1.0.0.jar:\
vegetables-provider/target/vegetables-provider-1.0.0.jar \
  --add-modules com.checho.application \
  --add-modules com.checho.fruits \
  --add-modules com.checho.vegetables \
  --output checho \
  --compress 2 \
  --launcher application=com.checho.application/com.checho.application.Application
