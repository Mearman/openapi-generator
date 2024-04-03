/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.ComplexQuadrilateral;
import org.openapitools.client.model.SimpleQuadrilateral;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class Quadrilateral extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Quadrilateral.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Quadrilateral.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Quadrilateral' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SimpleQuadrilateral> adapterSimpleQuadrilateral = gson.getDelegateAdapter(this, TypeToken.get(SimpleQuadrilateral.class));
            final TypeAdapter<ComplexQuadrilateral> adapterComplexQuadrilateral = gson.getDelegateAdapter(this, TypeToken.get(ComplexQuadrilateral.class));

            return (TypeAdapter<T>) new TypeAdapter<Quadrilateral>() {
                @Override
                public void write(JsonWriter out, Quadrilateral value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SimpleQuadrilateral`
                    if (value.getActualInstance() instanceof SimpleQuadrilateral) {
                      JsonElement element = adapterSimpleQuadrilateral.toJsonTree((SimpleQuadrilateral)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ComplexQuadrilateral`
                    if (value.getActualInstance() instanceof ComplexQuadrilateral) {
                      JsonElement element = adapterComplexQuadrilateral.toJsonTree((ComplexQuadrilateral)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ComplexQuadrilateral, SimpleQuadrilateral");
                }

                @Override
                public Quadrilateral read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    Quadrilateral newQuadrilateral = new Quadrilateral();
                    if (jsonObject.get("quadrilateralType") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for Quadrilateral as `quadrilateralType` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `quadrilateralType`
                        switch (jsonObject.get("quadrilateralType").getAsString()) {
                            case "ComplexQuadrilateral":
                                deserialized = adapterComplexQuadrilateral.fromJsonTree(jsonObject);
                                newQuadrilateral.setActualInstance(deserialized);
                                return newQuadrilateral;
                            case "SimpleQuadrilateral":
                                deserialized = adapterSimpleQuadrilateral.fromJsonTree(jsonObject);
                                newQuadrilateral.setActualInstance(deserialized);
                                return newQuadrilateral;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for Quadrilateral. Possible values: ComplexQuadrilateral SimpleQuadrilateral", jsonObject.get("quadrilateralType").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize SimpleQuadrilateral
                    try {
                      // validate the JSON object to see if any exception is thrown
                      SimpleQuadrilateral.validateJsonElement(jsonElement);
                      actualAdapter = adapterSimpleQuadrilateral;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'SimpleQuadrilateral'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for SimpleQuadrilateral failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'SimpleQuadrilateral'", e);
                    }
                    // deserialize ComplexQuadrilateral
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ComplexQuadrilateral.validateJsonElement(jsonElement);
                      actualAdapter = adapterComplexQuadrilateral;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ComplexQuadrilateral'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ComplexQuadrilateral failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ComplexQuadrilateral'", e);
                    }

                    if (match == 1) {
                        Quadrilateral ret = new Quadrilateral();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Quadrilateral: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Quadrilateral() {
        super("oneOf", Boolean.FALSE);
    }

    public Quadrilateral(ComplexQuadrilateral o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Quadrilateral(SimpleQuadrilateral o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SimpleQuadrilateral", SimpleQuadrilateral.class);
        schemas.put("ComplexQuadrilateral", ComplexQuadrilateral.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Quadrilateral.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ComplexQuadrilateral, SimpleQuadrilateral
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SimpleQuadrilateral) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ComplexQuadrilateral) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ComplexQuadrilateral, SimpleQuadrilateral");
    }

    /**
     * Get the actual instance, which can be the following:
     * ComplexQuadrilateral, SimpleQuadrilateral
     *
     * @return The actual instance (ComplexQuadrilateral, SimpleQuadrilateral)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SimpleQuadrilateral`. If the actual instance is not `SimpleQuadrilateral`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SimpleQuadrilateral`
     * @throws ClassCastException if the instance is not `SimpleQuadrilateral`
     */
    public SimpleQuadrilateral getSimpleQuadrilateral() throws ClassCastException {
        return (SimpleQuadrilateral)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ComplexQuadrilateral`. If the actual instance is not `ComplexQuadrilateral`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ComplexQuadrilateral`
     * @throws ClassCastException if the instance is not `ComplexQuadrilateral`
     */
    public ComplexQuadrilateral getComplexQuadrilateral() throws ClassCastException {
        return (ComplexQuadrilateral)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Quadrilateral
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with SimpleQuadrilateral
    try {
      SimpleQuadrilateral.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SimpleQuadrilateral failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ComplexQuadrilateral
    try {
      ComplexQuadrilateral.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ComplexQuadrilateral failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for Quadrilateral with oneOf schemas: ComplexQuadrilateral, SimpleQuadrilateral. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of Quadrilateral given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Quadrilateral
  * @throws IOException if the JSON string is invalid with respect to Quadrilateral
  */
  public static Quadrilateral fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Quadrilateral.class);
  }

 /**
  * Convert an instance of Quadrilateral to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

