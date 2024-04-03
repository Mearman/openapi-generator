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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Whale
 */
@JsonPropertyOrder({
  Whale.JSON_PROPERTY_HAS_BALEEN,
  Whale.JSON_PROPERTY_HAS_TEETH,
  Whale.JSON_PROPERTY_CLASS_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class Whale {
  public static final String JSON_PROPERTY_HAS_BALEEN = "hasBaleen";
  private Boolean hasBaleen;

  public static final String JSON_PROPERTY_HAS_TEETH = "hasTeeth";
  private Boolean hasTeeth;

  public static final String JSON_PROPERTY_CLASS_NAME = "className";
  private String className;

  public Whale() { 
  }

  public Whale hasBaleen(Boolean hasBaleen) {
    this.hasBaleen = hasBaleen;
    return this;
  }

   /**
   * Get hasBaleen
   * @return hasBaleen
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_BALEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasBaleen() {
    return hasBaleen;
  }


  @JsonProperty(JSON_PROPERTY_HAS_BALEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasBaleen(Boolean hasBaleen) {
    this.hasBaleen = hasBaleen;
  }


  public Whale hasTeeth(Boolean hasTeeth) {
    this.hasTeeth = hasTeeth;
    return this;
  }

   /**
   * Get hasTeeth
   * @return hasTeeth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_TEETH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasTeeth() {
    return hasTeeth;
  }


  @JsonProperty(JSON_PROPERTY_HAS_TEETH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasTeeth(Boolean hasTeeth) {
    this.hasTeeth = hasTeeth;
  }


  public Whale className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClassName() {
    return className;
  }


  @JsonProperty(JSON_PROPERTY_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClassName(String className) {
    this.className = className;
  }


  /**
   * Return true if this whale object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Whale whale = (Whale) o;
    return Objects.equals(this.hasBaleen, whale.hasBaleen) &&
        Objects.equals(this.hasTeeth, whale.hasTeeth) &&
        Objects.equals(this.className, whale.className);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasBaleen, hasTeeth, className);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Whale {\n");
    sb.append("    hasBaleen: ").append(toIndentedString(hasBaleen)).append("\n");
    sb.append("    hasTeeth: ").append(toIndentedString(hasTeeth)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `hasBaleen` to the URL query string
    if (getHasBaleen() != null) {
      joiner.add(String.format("%shasBaleen%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasBaleen()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hasTeeth` to the URL query string
    if (getHasTeeth() != null) {
      joiner.add(String.format("%shasTeeth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasTeeth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `className` to the URL query string
    if (getClassName() != null) {
      joiner.add(String.format("%sclassName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClassName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

