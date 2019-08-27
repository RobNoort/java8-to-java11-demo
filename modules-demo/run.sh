#!/bin/sh

  java --module-path \
application/target/application-1.0.0.jar:\
provider/target/provider-1.0.0.jar:\
fruits-provider/target/fruits-provider-1.0.0.jar:\
vegetables-provider/target/vegetables-provider-1.0.0.jar \
  -m com.checho.application/com.checho.application.Application
