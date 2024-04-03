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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ReadOnlyFirst;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ArrayTest
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class ArrayTest {
  public static final String SERIALIZED_NAME_ARRAY_OF_STRING = "array_of_string";
  @SerializedName(SERIALIZED_NAME_ARRAY_OF_STRING)
  private List<String> arrayOfString = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARRAY_ARRAY_OF_INTEGER = "array_array_of_integer";
  @SerializedName(SERIALIZED_NAME_ARRAY_ARRAY_OF_INTEGER)
  private List<List<Long>> arrayArrayOfInteger = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARRAY_ARRAY_OF_MODEL = "array_array_of_model";
  @SerializedName(SERIALIZED_NAME_ARRAY_ARRAY_OF_MODEL)
  private List<List<ReadOnlyFirst>> arrayArrayOfModel = new ArrayList<>();

  public ArrayTest() {
  }

  public ArrayTest arrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
    return this;
  }

  public ArrayTest addArrayOfStringItem(String arrayOfStringItem) {
    if (this.arrayOfString == null) {
      this.arrayOfString = new ArrayList<>();
    }
    this.arrayOfString.add(arrayOfStringItem);
    return this;
  }

   /**
   * Get arrayOfString
   * @return arrayOfString
  **/
  @jakarta.annotation.Nullable
  public List<String> getArrayOfString() {
    return arrayOfString;
  }

  public void setArrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }


  public ArrayTest arrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
    return this;
  }

  public ArrayTest addArrayArrayOfIntegerItem(List<Long> arrayArrayOfIntegerItem) {
    if (this.arrayArrayOfInteger == null) {
      this.arrayArrayOfInteger = new ArrayList<>();
    }
    this.arrayArrayOfInteger.add(arrayArrayOfIntegerItem);
    return this;
  }

   /**
   * Get arrayArrayOfInteger
   * @return arrayArrayOfInteger
  **/
  @jakarta.annotation.Nullable
  public List<List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }

  public void setArrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }


  public ArrayTest arrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
    return this;
  }

  public ArrayTest addArrayArrayOfModelItem(List<ReadOnlyFirst> arrayArrayOfModelItem) {
    if (this.arrayArrayOfModel == null) {
      this.arrayArrayOfModel = new ArrayList<>();
    }
    this.arrayArrayOfModel.add(arrayArrayOfModelItem);
    return this;
  }

   /**
   * Get arrayArrayOfModel
   * @return arrayArrayOfModel
  **/
  @jakarta.annotation.Nullable
  public List<List<ReadOnlyFirst>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }

  public void setArrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayTest arrayTest = (ArrayTest) o;
    return Objects.equals(this.arrayOfString, arrayTest.arrayOfString) &&
        Objects.equals(this.arrayArrayOfInteger, arrayTest.arrayArrayOfInteger) &&
        Objects.equals(this.arrayArrayOfModel, arrayTest.arrayArrayOfModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayOfString, arrayArrayOfInteger, arrayArrayOfModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTest {\n");
    sb.append("    arrayOfString: ").append(toIndentedString(arrayOfString)).append("\n");
    sb.append("    arrayArrayOfInteger: ").append(toIndentedString(arrayArrayOfInteger)).append("\n");
    sb.append("    arrayArrayOfModel: ").append(toIndentedString(arrayArrayOfModel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("array_of_string");
    openapiFields.add("array_array_of_integer");
    openapiFields.add("array_array_of_model");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ArrayTest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ArrayTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArrayTest is not found in the empty JSON string", ArrayTest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ArrayTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ArrayTest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_of_string") != null && !jsonObj.get("array_of_string").isJsonNull() && !jsonObj.get("array_of_string").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_of_string` to be an array in the JSON string but got `%s`", jsonObj.get("array_of_string").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_array_of_integer") != null && !jsonObj.get("array_array_of_integer").isJsonNull() && !jsonObj.get("array_array_of_integer").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_array_of_integer` to be an array in the JSON string but got `%s`", jsonObj.get("array_array_of_integer").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_array_of_model") != null && !jsonObj.get("array_array_of_model").isJsonNull() && !jsonObj.get("array_array_of_model").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_array_of_model` to be an array in the JSON string but got `%s`", jsonObj.get("array_array_of_model").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArrayTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArrayTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArrayTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArrayTest.class));

       return (TypeAdapter<T>) new TypeAdapter<ArrayTest>() {
           @Override
           public void write(JsonWriter out, ArrayTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ArrayTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ArrayTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArrayTest
  * @throws IOException if the JSON string is invalid with respect to ArrayTest
  */
  public static ArrayTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArrayTest.class);
  }

 /**
  * Convert an instance of ArrayTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

