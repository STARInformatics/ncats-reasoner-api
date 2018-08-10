package bio.knowledge.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * A generic additional attribute for an edge
 */
@ApiModel(description = "A generic additional attribute for an edge")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:52:49.953-07:00")

public class EdgeAttribute   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("url")
  private String url = null;

  public EdgeAttribute type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Entity type of this attribute
   * @return type
  **/
  @ApiModelProperty(example = "localization", value = "Entity type of this attribute")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EdgeAttribute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Formal name of the attribute
   * @return name
  **/
  @ApiModelProperty(example = "Cell type limitation", value = "Formal name of the attribute")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EdgeAttribute value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the attribute. While all attributes should have a name, many will not have a value
   * @return value
  **/
  @ApiModelProperty(example = "MFC cells", value = "Value of the attribute. While all attributes should have a name, many will not have a value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public EdgeAttribute url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A URL corresponding to this attribute
   * @return url
  **/
  @ApiModelProperty(example = "https://www.ncbi.nlm.nih.gov/pubmed/29309293", value = "A URL corresponding to this attribute")
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
    EdgeAttribute edgeAttribute = (EdgeAttribute) o;
    return Objects.equals(this.type, edgeAttribute.type) &&
        Objects.equals(this.name, edgeAttribute.name) &&
        Objects.equals(this.value, edgeAttribute.value) &&
        Objects.equals(this.url, edgeAttribute.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, value, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeAttribute {\n");
    
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

