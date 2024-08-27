test:
	mvn -B package --no-transfer-progress --file pom.xml
android:
	rm -rf src/main/kotlin && \
	rm -rf docs && \
	docker run --rm \
	 -v ${PWD}:/local openapitools/openapi-generator-cli:v7.6.0 generate \
	 -i https://raw.githubusercontent.com/conekta/openapi/main/_build/api.yaml \
	 -g kotlin \
	 -o /local \
	 -c /local/config.json  \
	 --global-property apiDocs=true  --global-property apiTests=true 
