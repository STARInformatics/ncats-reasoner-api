package bio.knowledge.server.model;

import java.util.Objects;
import bio.knowledge.server.model.Edge;
import bio.knowledge.server.model.Node;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * A thought graph associated with this result. This will commonly be a linear path subgraph from one concept to another, but related items aside of the path may be included.
 */
@ApiModel(description = "A thought graph associated with this result. This will commonly be a linear path subgraph from one concept to another, but related items aside of the path may be included.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:43:13.676-07:00")

public class ResultGraph   {
  @JsonProperty("node_list")
  private List<Node> nodeList = new ArrayList<Node>();

  @JsonProperty("edge_list")
  private List<Edge> edgeList = new ArrayList<Edge>();

  public ResultGraph nodeList(List<Node> nodeList) {
    this.nodeList = nodeList;
    return this;
  }

  public ResultGraph addNodeListItem(Node nodeListItem) {
    this.nodeList.add(nodeListItem);
    return this;
  }

   /**
   * Get nodeList
   * @return nodeList
  **/
  @ApiModelProperty(value = "")
  public List<Node> getNodeList() {
    return nodeList;
  }

  public void setNodeList(List<Node> nodeList) {
    this.nodeList = nodeList;
  }

  public ResultGraph edgeList(List<Edge> edgeList) {
    this.edgeList = edgeList;
    return this;
  }

  public ResultGraph addEdgeListItem(Edge edgeListItem) {
    this.edgeList.add(edgeListItem);
    return this;
  }

   /**
   * Get edgeList
   * @return edgeList
  **/
  @ApiModelProperty(value = "")
  public List<Edge> getEdgeList() {
    return edgeList;
  }

  public void setEdgeList(List<Edge> edgeList) {
    this.edgeList = edgeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultGraph resultGraph = (ResultGraph) o;
    return Objects.equals(this.nodeList, resultGraph.nodeList) &&
        Objects.equals(this.edgeList, resultGraph.edgeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeList, edgeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultGraph {\n");
    
    sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
    sb.append("    edgeList: ").append(toIndentedString(edgeList)).append("\n");
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

