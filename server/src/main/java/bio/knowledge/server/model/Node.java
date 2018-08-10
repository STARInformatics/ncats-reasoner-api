package bio.knowledge.server.model;

import java.util.Objects;
import bio.knowledge.server.model.NodeAttribute;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * A node in the thought subgraph
 */
@ApiModel(description = "A node in the thought subgraph")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:52:49.953-07:00")

public class Node   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("node_attributes")
  private List<NodeAttribute> nodeAttributes = new ArrayList<NodeAttribute>();

  public Node id(String id) {
    this.id = id;
    return this;
  }

   /**
   * CURIE identifier for this node
   * @return id
  **/
  @ApiModelProperty(example = "OMIM:603903", value = "CURIE identifier for this node")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Node uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * URI identifier for this node\"
   * @return uri
  **/
  @ApiModelProperty(example = "https://www.uniprot.org/uniprot/P00738", value = "URI identifier for this node\"")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Node name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Formal name of the entity
   * @return name
  **/
  @ApiModelProperty(example = "Haptoglobin", value = "Formal name of the entity")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Node type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Entity type of this node (e.g., protein, disease, etc.)
   * @return type
  **/
  @ApiModelProperty(example = "protein", value = "Entity type of this node (e.g., protein, disease, etc.)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Node description(String description) {
    this.description = description;
    return this;
  }

   /**
   * One to three sentences of description/definition of this entity
   * @return description
  **/
  @ApiModelProperty(example = "Haptoglobin captures, and combines with free plasma hemoglobin...", value = "One to three sentences of description/definition of this entity")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Node symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Short abbreviation or symbol for this entity
   * @return symbol
  **/
  @ApiModelProperty(example = "HP", value = "Short abbreviation or symbol for this entity")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Node nodeAttributes(List<NodeAttribute> nodeAttributes) {
    this.nodeAttributes = nodeAttributes;
    return this;
  }

  public Node addNodeAttributesItem(NodeAttribute nodeAttributesItem) {
    this.nodeAttributes.add(nodeAttributesItem);
    return this;
  }

   /**
   * A list of arbitrary attributes for the node
   * @return nodeAttributes
  **/
  @ApiModelProperty(value = "A list of arbitrary attributes for the node")
  public List<NodeAttribute> getNodeAttributes() {
    return nodeAttributes;
  }

  public void setNodeAttributes(List<NodeAttribute> nodeAttributes) {
    this.nodeAttributes = nodeAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.id, node.id) &&
        Objects.equals(this.uri, node.uri) &&
        Objects.equals(this.name, node.name) &&
        Objects.equals(this.type, node.type) &&
        Objects.equals(this.description, node.description) &&
        Objects.equals(this.symbol, node.symbol) &&
        Objects.equals(this.nodeAttributes, node.nodeAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, name, type, description, symbol, nodeAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    nodeAttributes: ").append(toIndentedString(nodeAttributes)).append("\n");
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

