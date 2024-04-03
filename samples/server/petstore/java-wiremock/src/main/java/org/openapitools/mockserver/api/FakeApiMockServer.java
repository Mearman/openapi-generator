/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0-SNAPSHOT).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.mockserver.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.http.Fault;

public class FakeApiMockServer {

    public static MappingBuilder stubFakeBigDecimalMap200(String response) {
        MappingBuilder stub = get(urlPathEqualTo("/fake/BigDecimalMap"))
            .withHeader("Accept", havingExactly("*/*"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "*/*")
                .withBody(response)
            );


        return stub;
    }

    public static MappingBuilder stubFakeBigDecimalMapFault(Fault fault) {
        MappingBuilder stub = get(urlPathEqualTo("/fake/BigDecimalMap"))
            .withHeader("Accept", havingExactly("*/*"))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }

    public static String fakeBigDecimalMap200ResponseSample1() {
        return "{ \"someId\" : 0.8008281904610115, \"someMap\" : { \"key\" : 6.027456183070403 } }";
    }



    public static MappingBuilder stubFakeHealthGet200(String response) {
        MappingBuilder stub = get(urlPathEqualTo("/fake/health"))
            .withHeader("Accept", havingExactly("application/json"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );


        return stub;
    }

    public static MappingBuilder stubFakeHealthGetFault(Fault fault) {
        MappingBuilder stub = get(urlPathEqualTo("/fake/health"))
            .withHeader("Accept", havingExactly("application/json"))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }

    public static String fakeHealthGet200ResponseSample1() {
        return "{ \"NullableMessage\" : \"NullableMessage\" }";
    }



    public static MappingBuilder stubFakeHttpSignatureTest200(@jakarta.annotation.Nonnull String body, @jakarta.annotation.Nullable String query1, @jakarta.annotation.Nullable String header1) {
        MappingBuilder stub = get(urlPathEqualTo("/fake/http-signature-test"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
            );

        if(query1 != null) {
            stub = stub.withQueryParam("query1", equalTo(query1));
        }
        if(header1 != null) {
            stub = stub.withHeader("header_1", havingExactly(header1));
        }

        return stub;
    }

    public static MappingBuilder stubFakeHttpSignatureTestFault(@jakarta.annotation.Nonnull String body, @jakarta.annotation.Nullable String query1, @jakarta.annotation.Nullable String header1, Fault fault) {
        MappingBuilder stub = get(urlPathEqualTo("/fake/http-signature-test"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );

        if(query1 != null) {
            stub = stub.withQueryParam("query1", equalTo(query1));
        }
        if(header1 != null) {
            stub = stub.withHeader("header_1", havingExactly(header1));
        }

        return stub;
    }


    public static String fakeHttpSignatureTestRequestSample1() {
        return "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"default-name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }";
    }
    public static String fakeHttpSignatureTestRequestSample2() {
        return "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
    }


    public static MappingBuilder stubFakeOuterBooleanSerialize200(@jakarta.annotation.Nullable String body, String response) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/outer/boolean"))
            .withHeader("Accept", havingExactly("*/*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "*/*")
                .withBody(response)
            );


        return stub;
    }

    public static MappingBuilder stubFakeOuterBooleanSerializeFault(@jakarta.annotation.Nullable String body, Fault fault) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/outer/boolean"))
            .withHeader("Accept", havingExactly("*/*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }


    public static String fakeOuterBooleanSerializeRequestSample1() {
        return "";
    }


    public static MappingBuilder stubFakeOuterCompositeSerialize200(@jakarta.annotation.Nullable String body, String response) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/outer/composite"))
            .withHeader("Accept", havingExactly("*/*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "*/*")
                .withBody(response)
            );


        return stub;
    }

    public static MappingBuilder stubFakeOuterCompositeSerializeFault(@jakarta.annotation.Nullable String body, Fault fault) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/outer/composite"))
            .withHeader("Accept", havingExactly("*/*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }

    public static String fakeOuterCompositeSerialize200ResponseSample1() {
        return "{ \"my_string\" : \"my_string\", \"my_number\" : 0.8008281904610115, \"my_boolean\" : true }";
    }

    public static String fakeOuterCompositeSerializeRequestSample1() {
        return "{ \"my_string\" : \"my_string\", \"my_number\" : 0.8008281904610115, \"my_boolean\" : true }";
    }


    public static MappingBuilder stubFakeOuterNumberSerialize200(@jakarta.annotation.Nullable String body, String response) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/outer/number"))
            .withHeader("Accept", havingExactly("*/*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "*/*")
                .withBody(response)
            );


        return stub;
    }

    public static MappingBuilder stubFakeOuterNumberSerializeFault(@jakarta.annotation.Nullable String body, Fault fault) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/outer/number"))
            .withHeader("Accept", havingExactly("*/*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }


    public static String fakeOuterNumberSerializeRequestSample1() {
        return "";
    }


    public static MappingBuilder stubFakeOuterStringSerialize200(@jakarta.annotation.Nullable String body, String response) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/outer/string"))
            .withHeader("Accept", havingExactly("*/*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "*/*")
                .withBody(response)
            );


        return stub;
    }

    public static MappingBuilder stubFakeOuterStringSerializeFault(@jakarta.annotation.Nullable String body, Fault fault) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/outer/string"))
            .withHeader("Accept", havingExactly("*/*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }


    public static String fakeOuterStringSerializeRequestSample1() {
        return "";
    }


    public static MappingBuilder stubFakePropertyEnumIntegerSerialize200(@jakarta.annotation.Nonnull String body, String response) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/property/enum-int"))
            .withHeader("Accept", havingExactly("*/*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "*/*")
                .withBody(response)
            );


        return stub;
    }

    public static MappingBuilder stubFakePropertyEnumIntegerSerializeFault(@jakarta.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/property/enum-int"))
            .withHeader("Accept", havingExactly("*/*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }

    public static String fakePropertyEnumIntegerSerialize200ResponseSample1() {
        return "{ \"value\" : 2 }";
    }

    public static String fakePropertyEnumIntegerSerializeRequestSample1() {
        return "{ \"value\" : 2 }";
    }


    public static MappingBuilder stubTestAdditionalPropertiesReference200(@jakarta.annotation.Nonnull String body) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/additionalProperties-reference"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
            );


        return stub;
    }

    public static MappingBuilder stubTestAdditionalPropertiesReferenceFault(@jakarta.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/additionalProperties-reference"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }


    public static String testAdditionalPropertiesReferenceRequestSample1() {
        return "";
    }


    public static MappingBuilder stubTestBodyWithBinary200(@jakarta.annotation.Nullable String body) {
        MappingBuilder stub = put(urlPathEqualTo("/fake/body-with-binary"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
            );


        return stub;
    }

    public static MappingBuilder stubTestBodyWithBinaryFault(@jakarta.annotation.Nullable String body, Fault fault) {
        MappingBuilder stub = put(urlPathEqualTo("/fake/body-with-binary"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }


    public static String testBodyWithBinaryRequestSample1() {
        return "Custom MIME type example not yet supported: image/png";
    }


    public static MappingBuilder stubTestBodyWithFileSchema200(@jakarta.annotation.Nonnull String body) {
        MappingBuilder stub = put(urlPathEqualTo("/fake/body-with-file-schema"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
            );


        return stub;
    }

    public static MappingBuilder stubTestBodyWithFileSchemaFault(@jakarta.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = put(urlPathEqualTo("/fake/body-with-file-schema"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }


    public static String testBodyWithFileSchemaRequestSample1() {
        return "{ \"file\" : { \"sourceURI\" : \"sourceURI\" }, \"files\" : [ { \"sourceURI\" : \"sourceURI\" }, { \"sourceURI\" : \"sourceURI\" } ] }";
    }


    public static MappingBuilder stubTestBodyWithQueryParams200(@jakarta.annotation.Nonnull String query, @jakarta.annotation.Nonnull String body) {
        MappingBuilder stub = put(urlPathEqualTo("/fake/body-with-query-params"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
            );

        stub = stub.withQueryParam("query", equalTo(query));

        return stub;
    }

    public static MappingBuilder stubTestBodyWithQueryParamsFault(@jakarta.annotation.Nonnull String query, @jakarta.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = put(urlPathEqualTo("/fake/body-with-query-params"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withQueryParam("query", equalTo(query));

        return stub;
    }


    public static String testBodyWithQueryParamsRequestSample1() {
        return "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"userStatus\" : 6, \"phone\" : \"phone\", \"id\" : 0, \"email\" : \"email\", \"username\" : \"username\" }";
    }


    public static MappingBuilder stubTestClientModel200(@jakarta.annotation.Nonnull String body, String response) {
        MappingBuilder stub = patch(urlPathEqualTo("/fake"))
            .withHeader("Accept", havingExactly("application/json"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );


        return stub;
    }

    public static MappingBuilder stubTestClientModelFault(@jakarta.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = patch(urlPathEqualTo("/fake"))
            .withHeader("Accept", havingExactly("application/json"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }

    public static String testClientModel200ResponseSample1() {
        return "{ \"client\" : \"client\" }";
    }

    public static String testClientModelRequestSample1() {
        return "{ \"client\" : \"client\" }";
    }


    public static MappingBuilder stubTestEndpointParameters400(@jakarta.annotation.Nonnull String number, @jakarta.annotation.Nonnull String _double, @jakarta.annotation.Nonnull String patternWithoutDelimiter, @jakarta.annotation.Nonnull String _byte, @jakarta.annotation.Nullable String integer, @jakarta.annotation.Nullable String int32, @jakarta.annotation.Nullable String int64, @jakarta.annotation.Nullable String _float, @jakarta.annotation.Nullable String string, @jakarta.annotation.Nullable String binary, @jakarta.annotation.Nullable String date, @jakarta.annotation.Nullable String dateTime, @jakarta.annotation.Nullable String password, @jakarta.annotation.Nullable String paramCallback) {
        MappingBuilder stub = post(urlPathEqualTo("/fake"))
            .withHeader("Content-Type", havingExactly("application/x-www-form-urlencoded"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(400)
            );

        if(integer != null) {
            stub = stub.withFormParam("integer", havingExactly(integer));
        }
        if(int32 != null) {
            stub = stub.withFormParam("int32", havingExactly(int32));
        }
        if(int64 != null) {
            stub = stub.withFormParam("int64", havingExactly(int64));
        }
        stub = stub.withFormParam("number", havingExactly(number));
        if(_float != null) {
            stub = stub.withFormParam("float", havingExactly(_float));
        }
        stub = stub.withFormParam("double", havingExactly(_double));
        if(string != null) {
            stub = stub.withFormParam("string", havingExactly(string));
        }
        stub = stub.withFormParam("pattern_without_delimiter", havingExactly(patternWithoutDelimiter));
        stub = stub.withFormParam("byte", havingExactly(_byte));
        if(binary != null) {
            stub = stub.withFormParam("binary", havingExactly(binary));
        }
        if(date != null) {
            stub = stub.withFormParam("date", havingExactly(date));
        }
        if(dateTime != null) {
            stub = stub.withFormParam("dateTime", havingExactly(dateTime));
        }
        if(password != null) {
            stub = stub.withFormParam("password", havingExactly(password));
        }
        if(paramCallback != null) {
            stub = stub.withFormParam("callback", havingExactly(paramCallback));
        }

        return stub;
    }

    public static MappingBuilder stubTestEndpointParameters404(@jakarta.annotation.Nonnull String number, @jakarta.annotation.Nonnull String _double, @jakarta.annotation.Nonnull String patternWithoutDelimiter, @jakarta.annotation.Nonnull String _byte, @jakarta.annotation.Nullable String integer, @jakarta.annotation.Nullable String int32, @jakarta.annotation.Nullable String int64, @jakarta.annotation.Nullable String _float, @jakarta.annotation.Nullable String string, @jakarta.annotation.Nullable String binary, @jakarta.annotation.Nullable String date, @jakarta.annotation.Nullable String dateTime, @jakarta.annotation.Nullable String password, @jakarta.annotation.Nullable String paramCallback) {
        MappingBuilder stub = post(urlPathEqualTo("/fake"))
            .withHeader("Content-Type", havingExactly("application/x-www-form-urlencoded"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(404)
            );

        if(integer != null) {
            stub = stub.withFormParam("integer", havingExactly(integer));
        }
        if(int32 != null) {
            stub = stub.withFormParam("int32", havingExactly(int32));
        }
        if(int64 != null) {
            stub = stub.withFormParam("int64", havingExactly(int64));
        }
        stub = stub.withFormParam("number", havingExactly(number));
        if(_float != null) {
            stub = stub.withFormParam("float", havingExactly(_float));
        }
        stub = stub.withFormParam("double", havingExactly(_double));
        if(string != null) {
            stub = stub.withFormParam("string", havingExactly(string));
        }
        stub = stub.withFormParam("pattern_without_delimiter", havingExactly(patternWithoutDelimiter));
        stub = stub.withFormParam("byte", havingExactly(_byte));
        if(binary != null) {
            stub = stub.withFormParam("binary", havingExactly(binary));
        }
        if(date != null) {
            stub = stub.withFormParam("date", havingExactly(date));
        }
        if(dateTime != null) {
            stub = stub.withFormParam("dateTime", havingExactly(dateTime));
        }
        if(password != null) {
            stub = stub.withFormParam("password", havingExactly(password));
        }
        if(paramCallback != null) {
            stub = stub.withFormParam("callback", havingExactly(paramCallback));
        }

        return stub;
    }

    public static MappingBuilder stubTestEndpointParametersFault(@jakarta.annotation.Nonnull String number, @jakarta.annotation.Nonnull String _double, @jakarta.annotation.Nonnull String patternWithoutDelimiter, @jakarta.annotation.Nonnull String _byte, @jakarta.annotation.Nullable String integer, @jakarta.annotation.Nullable String int32, @jakarta.annotation.Nullable String int64, @jakarta.annotation.Nullable String _float, @jakarta.annotation.Nullable String string, @jakarta.annotation.Nullable String binary, @jakarta.annotation.Nullable String date, @jakarta.annotation.Nullable String dateTime, @jakarta.annotation.Nullable String password, @jakarta.annotation.Nullable String paramCallback, Fault fault) {
        MappingBuilder stub = post(urlPathEqualTo("/fake"))
            .withHeader("Content-Type", havingExactly("application/x-www-form-urlencoded"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        if(integer != null) {
            stub = stub.withFormParam("integer", havingExactly(integer));
        }
        if(int32 != null) {
            stub = stub.withFormParam("int32", havingExactly(int32));
        }
        if(int64 != null) {
            stub = stub.withFormParam("int64", havingExactly(int64));
        }
        stub = stub.withFormParam("number", havingExactly(number));
        if(_float != null) {
            stub = stub.withFormParam("float", havingExactly(_float));
        }
        stub = stub.withFormParam("double", havingExactly(_double));
        if(string != null) {
            stub = stub.withFormParam("string", havingExactly(string));
        }
        stub = stub.withFormParam("pattern_without_delimiter", havingExactly(patternWithoutDelimiter));
        stub = stub.withFormParam("byte", havingExactly(_byte));
        if(binary != null) {
            stub = stub.withFormParam("binary", havingExactly(binary));
        }
        if(date != null) {
            stub = stub.withFormParam("date", havingExactly(date));
        }
        if(dateTime != null) {
            stub = stub.withFormParam("dateTime", havingExactly(dateTime));
        }
        if(password != null) {
            stub = stub.withFormParam("password", havingExactly(password));
        }
        if(paramCallback != null) {
            stub = stub.withFormParam("callback", havingExactly(paramCallback));
        }

        return stub;
    }




    public static MappingBuilder stubTestEnumParameters400(@jakarta.annotation.Nullable String enumHeaderStringArray, @jakarta.annotation.Nullable String enumHeaderString, @jakarta.annotation.Nullable String enumQueryStringArray, @jakarta.annotation.Nullable String enumQueryString, @jakarta.annotation.Nullable String enumQueryInteger, @jakarta.annotation.Nullable String enumQueryDouble, @jakarta.annotation.Nullable String enumQueryModelArray, @jakarta.annotation.Nullable String enumFormStringArray, @jakarta.annotation.Nullable String enumFormString) {
        MappingBuilder stub = get(urlPathEqualTo("/fake"))
            .willReturn(aResponse()
                .withStatus(400)
            );

        if(enumQueryStringArray != null) {
            stub = stub.withQueryParam("enumQueryStringArray", equalTo(enumQueryStringArray));
        }
        if(enumQueryString != null) {
            stub = stub.withQueryParam("enumQueryString", equalTo(enumQueryString));
        }
        if(enumQueryInteger != null) {
            stub = stub.withQueryParam("enumQueryInteger", equalTo(enumQueryInteger));
        }
        if(enumQueryDouble != null) {
            stub = stub.withQueryParam("enumQueryDouble", equalTo(enumQueryDouble));
        }
        if(enumQueryModelArray != null) {
            stub = stub.withQueryParam("enumQueryModelArray", equalTo(enumQueryModelArray));
        }
        if(enumFormStringArray != null) {
            stub = stub.withFormParam("enum_form_string_array", havingExactly(enumFormStringArray));
        }
        if(enumFormString != null) {
            stub = stub.withFormParam("enum_form_string", havingExactly(enumFormString));
        }
        if(enumHeaderStringArray != null) {
            stub = stub.withHeader("enum_header_string_array", havingExactly(enumHeaderStringArray));
        }
        if(enumHeaderString != null) {
            stub = stub.withHeader("enum_header_string", havingExactly(enumHeaderString));
        }

        return stub;
    }

    public static MappingBuilder stubTestEnumParameters404(@jakarta.annotation.Nullable String enumHeaderStringArray, @jakarta.annotation.Nullable String enumHeaderString, @jakarta.annotation.Nullable String enumQueryStringArray, @jakarta.annotation.Nullable String enumQueryString, @jakarta.annotation.Nullable String enumQueryInteger, @jakarta.annotation.Nullable String enumQueryDouble, @jakarta.annotation.Nullable String enumQueryModelArray, @jakarta.annotation.Nullable String enumFormStringArray, @jakarta.annotation.Nullable String enumFormString) {
        MappingBuilder stub = get(urlPathEqualTo("/fake"))
            .willReturn(aResponse()
                .withStatus(404)
            );

        if(enumQueryStringArray != null) {
            stub = stub.withQueryParam("enumQueryStringArray", equalTo(enumQueryStringArray));
        }
        if(enumQueryString != null) {
            stub = stub.withQueryParam("enumQueryString", equalTo(enumQueryString));
        }
        if(enumQueryInteger != null) {
            stub = stub.withQueryParam("enumQueryInteger", equalTo(enumQueryInteger));
        }
        if(enumQueryDouble != null) {
            stub = stub.withQueryParam("enumQueryDouble", equalTo(enumQueryDouble));
        }
        if(enumQueryModelArray != null) {
            stub = stub.withQueryParam("enumQueryModelArray", equalTo(enumQueryModelArray));
        }
        if(enumFormStringArray != null) {
            stub = stub.withFormParam("enum_form_string_array", havingExactly(enumFormStringArray));
        }
        if(enumFormString != null) {
            stub = stub.withFormParam("enum_form_string", havingExactly(enumFormString));
        }
        if(enumHeaderStringArray != null) {
            stub = stub.withHeader("enum_header_string_array", havingExactly(enumHeaderStringArray));
        }
        if(enumHeaderString != null) {
            stub = stub.withHeader("enum_header_string", havingExactly(enumHeaderString));
        }

        return stub;
    }

    public static MappingBuilder stubTestEnumParametersFault(@jakarta.annotation.Nullable String enumHeaderStringArray, @jakarta.annotation.Nullable String enumHeaderString, @jakarta.annotation.Nullable String enumQueryStringArray, @jakarta.annotation.Nullable String enumQueryString, @jakarta.annotation.Nullable String enumQueryInteger, @jakarta.annotation.Nullable String enumQueryDouble, @jakarta.annotation.Nullable String enumQueryModelArray, @jakarta.annotation.Nullable String enumFormStringArray, @jakarta.annotation.Nullable String enumFormString, Fault fault) {
        MappingBuilder stub = get(urlPathEqualTo("/fake"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        if(enumQueryStringArray != null) {
            stub = stub.withQueryParam("enumQueryStringArray", equalTo(enumQueryStringArray));
        }
        if(enumQueryString != null) {
            stub = stub.withQueryParam("enumQueryString", equalTo(enumQueryString));
        }
        if(enumQueryInteger != null) {
            stub = stub.withQueryParam("enumQueryInteger", equalTo(enumQueryInteger));
        }
        if(enumQueryDouble != null) {
            stub = stub.withQueryParam("enumQueryDouble", equalTo(enumQueryDouble));
        }
        if(enumQueryModelArray != null) {
            stub = stub.withQueryParam("enumQueryModelArray", equalTo(enumQueryModelArray));
        }
        if(enumFormStringArray != null) {
            stub = stub.withFormParam("enum_form_string_array", havingExactly(enumFormStringArray));
        }
        if(enumFormString != null) {
            stub = stub.withFormParam("enum_form_string", havingExactly(enumFormString));
        }
        if(enumHeaderStringArray != null) {
            stub = stub.withHeader("enum_header_string_array", havingExactly(enumHeaderStringArray));
        }
        if(enumHeaderString != null) {
            stub = stub.withHeader("enum_header_string", havingExactly(enumHeaderString));
        }

        return stub;
    }




    public static MappingBuilder stubTestGroupParameters400(@jakarta.annotation.Nonnull String requiredStringGroup, @jakarta.annotation.Nonnull String requiredBooleanGroup, @jakarta.annotation.Nonnull String requiredInt64Group, @jakarta.annotation.Nullable String stringGroup, @jakarta.annotation.Nullable String booleanGroup, @jakarta.annotation.Nullable String int64Group) {
        MappingBuilder stub = delete(urlPathEqualTo("/fake"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withStatus(400)
            );

        stub = stub.withQueryParam("requiredStringGroup", equalTo(requiredStringGroup));
        stub = stub.withQueryParam("requiredInt64Group", equalTo(requiredInt64Group));
        if(stringGroup != null) {
            stub = stub.withQueryParam("stringGroup", equalTo(stringGroup));
        }
        if(int64Group != null) {
            stub = stub.withQueryParam("int64Group", equalTo(int64Group));
        }
        stub = stub.withHeader("required_boolean_group", havingExactly(requiredBooleanGroup));
        if(booleanGroup != null) {
            stub = stub.withHeader("boolean_group", havingExactly(booleanGroup));
        }

        return stub;
    }

    public static MappingBuilder stubTestGroupParametersFault(@jakarta.annotation.Nonnull String requiredStringGroup, @jakarta.annotation.Nonnull String requiredBooleanGroup, @jakarta.annotation.Nonnull String requiredInt64Group, @jakarta.annotation.Nullable String stringGroup, @jakarta.annotation.Nullable String booleanGroup, @jakarta.annotation.Nullable String int64Group, Fault fault) {
        MappingBuilder stub = delete(urlPathEqualTo("/fake"))
            .withHeader("Authorization", matching(".*"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withQueryParam("requiredStringGroup", equalTo(requiredStringGroup));
        stub = stub.withQueryParam("requiredInt64Group", equalTo(requiredInt64Group));
        if(stringGroup != null) {
            stub = stub.withQueryParam("stringGroup", equalTo(stringGroup));
        }
        if(int64Group != null) {
            stub = stub.withQueryParam("int64Group", equalTo(int64Group));
        }
        stub = stub.withHeader("required_boolean_group", havingExactly(requiredBooleanGroup));
        if(booleanGroup != null) {
            stub = stub.withHeader("boolean_group", havingExactly(booleanGroup));
        }

        return stub;
    }




    public static MappingBuilder stubTestInlineAdditionalProperties200(@jakarta.annotation.Nonnull String body) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/inline-additionalProperties"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
            );


        return stub;
    }

    public static MappingBuilder stubTestInlineAdditionalPropertiesFault(@jakarta.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/inline-additionalProperties"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }


    public static String testInlineAdditionalPropertiesRequestSample1() {
        return "";
    }


    public static MappingBuilder stubTestInlineFreeformAdditionalProperties200(@jakarta.annotation.Nonnull String body) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/inline-freeform-additionalProperties"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
            );


        return stub;
    }

    public static MappingBuilder stubTestInlineFreeformAdditionalPropertiesFault(@jakarta.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/inline-freeform-additionalProperties"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }


    public static String testInlineFreeformAdditionalPropertiesRequestSample1() {
        return "";
    }


    public static MappingBuilder stubTestJsonFormData200(@jakarta.annotation.Nonnull String param, @jakarta.annotation.Nonnull String param2) {
        MappingBuilder stub = get(urlPathEqualTo("/fake/jsonFormData"))
            .willReturn(aResponse()
                .withStatus(200)
            );

        stub = stub.withFormParam("param", havingExactly(param));
        stub = stub.withFormParam("param2", havingExactly(param2));

        return stub;
    }

    public static MappingBuilder stubTestJsonFormDataFault(@jakarta.annotation.Nonnull String param, @jakarta.annotation.Nonnull String param2, Fault fault) {
        MappingBuilder stub = get(urlPathEqualTo("/fake/jsonFormData"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withFormParam("param", havingExactly(param));
        stub = stub.withFormParam("param2", havingExactly(param2));

        return stub;
    }




    public static MappingBuilder stubTestNullable200(@jakarta.annotation.Nonnull String body) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/nullable"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
            );


        return stub;
    }

    public static MappingBuilder stubTestNullableFault(@jakarta.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/nullable"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }


    public static String testNullableRequestSample1() {
        return "{ \"otherProperty\" : \"otherProperty\", \"nullableProperty\" : \"nullableProperty\", \"type\" : \"ChildWithNullable\" }";
    }


    public static MappingBuilder stubTestQueryParameterCollectionFormat200(@jakarta.annotation.Nonnull String pipe, @jakarta.annotation.Nonnull String ioutil, @jakarta.annotation.Nonnull String http, @jakarta.annotation.Nonnull String url, @jakarta.annotation.Nonnull String context, @jakarta.annotation.Nonnull String allowEmpty, @jakarta.annotation.Nullable String language) {
        MappingBuilder stub = put(urlPathEqualTo("/fake/test-query-parameters"))
            .willReturn(aResponse()
                .withStatus(200)
            );

        stub = stub.withQueryParam("pipe", equalTo(pipe));
        stub = stub.withQueryParam("ioutil", equalTo(ioutil));
        stub = stub.withQueryParam("http", equalTo(http));
        stub = stub.withQueryParam("url", equalTo(url));
        stub = stub.withQueryParam("context", equalTo(context));
        if(language != null) {
            stub = stub.withQueryParam("language", equalTo(language));
        }
        stub = stub.withQueryParam("allowEmpty", equalTo(allowEmpty));

        return stub;
    }

    public static MappingBuilder stubTestQueryParameterCollectionFormatFault(@jakarta.annotation.Nonnull String pipe, @jakarta.annotation.Nonnull String ioutil, @jakarta.annotation.Nonnull String http, @jakarta.annotation.Nonnull String url, @jakarta.annotation.Nonnull String context, @jakarta.annotation.Nonnull String allowEmpty, @jakarta.annotation.Nullable String language, Fault fault) {
        MappingBuilder stub = put(urlPathEqualTo("/fake/test-query-parameters"))
            .willReturn(aResponse()
                .withFault(fault)
            );

        stub = stub.withQueryParam("pipe", equalTo(pipe));
        stub = stub.withQueryParam("ioutil", equalTo(ioutil));
        stub = stub.withQueryParam("http", equalTo(http));
        stub = stub.withQueryParam("url", equalTo(url));
        stub = stub.withQueryParam("context", equalTo(context));
        if(language != null) {
            stub = stub.withQueryParam("language", equalTo(language));
        }
        stub = stub.withQueryParam("allowEmpty", equalTo(allowEmpty));

        return stub;
    }




    public static MappingBuilder stubTestStringMapReference200(@jakarta.annotation.Nonnull String body) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/stringMap-reference"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
            );


        return stub;
    }

    public static MappingBuilder stubTestStringMapReferenceFault(@jakarta.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = post(urlPathEqualTo("/fake/stringMap-reference"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }


    public static String testStringMapReferenceRequestSample1() {
        return "";
    }


}
