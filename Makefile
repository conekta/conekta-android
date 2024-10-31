test:
	./gradlew  test

build:
	./gradlew clean build -x lintDebug

deploy:
    ./gradlew publish

android:
	rm -rf src/main/kotlin && \
	rm -rf docs && \
	docker run --rm \
	 -v ${PWD}:/local openapitools/openapi-generator-cli:v7.9.0 generate \
	 -i https://raw.githubusercontent.com/conekta/openapi/main/_build/api.yaml \
	 -g android \
	 -o /local \
	 -c /local/config.json  \
	 --global-property apiDocs=true,apiTests=true,modelTests=false
