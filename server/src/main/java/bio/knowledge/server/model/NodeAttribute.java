package bio.knowledge.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * A generic attribute for a node
 */
@ApiModel(description = "A generic attribute for a node")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:52:49.953-07:00")

public class NodeAttribute   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("url")
  private String url = null;

  public NodeAttribute type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Entity type of this attribute
   * @return type
  **/
  @ApiModelProperty(example = "article", value = "Entity type of this attribute")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NodeAttribute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Formal name of the attribute
   * @return name
  **/
  @ApiModelProperty(example = "Wikipedia article", value = "Formal name of the attribute")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NodeAttribute value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the attribute
   * @return value
  **/
  @ApiModelProperty(example = "7.23e-12", value = "Value of the attribute")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public NodeAttribute url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A URL corresponding to this attribute
   * @return url
  **/
  @ApiModelProperty(example = "https://en.wikipedia.org/wiki/Malaria", value = "A URL corresponding to this attribute")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeAttribute nodeAttribute = (NodeAttribute) o;
    return Objects.equals(this.type, nodeAttribute.type) &&
        Objects.equals(this.name, nodeAttribute.name) &&
        Objects.equals(this.value, nodeAttribute.value) &&
        Objects.equals(this.url, nodeAttribute.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, value, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeAttribute {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

