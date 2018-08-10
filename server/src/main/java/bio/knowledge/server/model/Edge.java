package bio.knowledge.server.model;

import java.util.Objects;
import bio.knowledge.server.model.EdgeAttribute;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * An edge in the thought subgraph linking two nodes
 */
@ApiModel(description = "An edge in the thought subgraph linking two nodes")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:52:49.953-07:00")

public class Edge   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("relation")
  private String relation = null;

  @JsonProperty("source_id")
  private String sourceId = null;

  @JsonProperty("target_id")
  private String targetId = null;

  @JsonProperty("is_defined_by")
  private String isDefinedBy = null;

  @JsonProperty("provided_by")
  private String providedBy = null;

  @JsonProperty("confidence")
  private Float confidence = null;

  @JsonProperty("publications")
  private String publications = null;

  @JsonProperty("evidence_type")
  private String evidenceType = null;

  @JsonProperty("qualifiers")
  private String qualifiers = null;

  @JsonProperty("negated")
  private Boolean negated = null;

  @JsonProperty("attribute_list")
  private List<EdgeAttribute> attributeList = new ArrayList<EdgeAttribute>();

  public Edge type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Higher-level relationship type of this edge
   * @return type
  **/
  @ApiModelProperty(example = "affects", value = "Higher-level relationship type of this edge")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Edge relation(String relation) {
    this.relation = relation;
    return this;
  }

   /**
   * Lower-level relationship type of this edge
   * @return relation
  **/
  @ApiModelProperty(example = "affects", value = "Lower-level relationship type of this edge")
  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }

  public Edge sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Corresponds to the @id of source node of this edge
   * @return sourceId
  **/
  @ApiModelProperty(example = "http://omim.org/entry/603903", value = "Corresponds to the @id of source node of this edge")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public Edge targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * Corresponds to the @id of target node of this edge
   * @return targetId
  **/
  @ApiModelProperty(example = "https://www.uniprot.org/uniprot/P00738", value = "Corresponds to the @id of target node of this edge")
  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public Edge isDefinedBy(String isDefinedBy) {
    this.isDefinedBy = isDefinedBy;
    return this;
  }

   /**
   * A CURIE/URI for the translator group that made the KG
   * @return isDefinedBy
  **/
  @ApiModelProperty(example = "RTX", value = "A CURIE/URI for the translator group that made the KG")
  public String getIsDefinedBy() {
    return isDefinedBy;
  }

  public void setIsDefinedBy(String isDefinedBy) {
    this.isDefinedBy = isDefinedBy;
  }

  public Edge providedBy(String providedBy) {
    this.providedBy = providedBy;
    return this;
  }

   /**
   * A CURIE/URI for the knowledge source that defined this edge
   * @return providedBy
  **/
  @ApiModelProperty(example = "OMIM", value = "A CURIE/URI for the knowledge source that defined this edge")
  public String getProvidedBy() {
    return providedBy;
  }

  public void setProvidedBy(String providedBy) {
    this.providedBy = providedBy;
  }

  public Edge confidence(Float confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Confidence metric for this edge, a value 0.0 (no confidence) and 1.0 (highest confidence)
   * @return confidence
  **/
  @ApiModelProperty(example = "0.99", value = "Confidence metric for this edge, a value 0.0 (no confidence) and 1.0 (highest confidence)")
  public Float getConfidence() {
    return confidence;
  }

  public void setConfidence(Float confidence) {
    this.confidence = confidence;
  }

  public Edge publications(String publications) {
    this.publications = publications;
    return this;
  }

   /**
   * A CURIE/URI for publications associated with this edge
   * @return publications
  **/
  @ApiModelProperty(example = "PubMed:12345562", value = "A CURIE/URI for publications associated with this edge")
  public String getPublications() {
    return publications;
  }

  public void setPublications(String publications) {
    this.publications = publications;
  }

  public Edge evidenceType(String evidenceType) {
    this.evidenceType = evidenceType;
    return this;
  }

   /**
   * A CURIE/URI for class of evidence supporting the statement made in an edge - typically a class from the ECO ontology
   * @return evidenceType
  **/
  @ApiModelProperty(example = "ECO:0000220", value = "A CURIE/URI for class of evidence supporting the statement made in an edge - typically a class from the ECO ontology")
  public String getEvidenceType() {
    return evidenceType;
  }

  public void setEvidenceType(String evidenceType) {
    this.evidenceType = evidenceType;
  }

  public Edge qualifiers(String qualifiers) {
    this.qualifiers = qualifiers;
    return this;
  }

   /**
   * Terms representing qualifiers that modify or qualify the meaning of the statement made in an edge
   * @return qualifiers
  **/
  @ApiModelProperty(example = "ECO:0000220", value = "Terms representing qualifiers that modify or qualify the meaning of the statement made in an edge")
  public String getQualifiers() {
    return qualifiers;
  }

  public void setQualifiers(String qualifiers) {
    this.qualifiers = qualifiers;
  }

  public Edge negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

   /**
   * Boolean that if set to true, indicates the edge statement is negated i.e. is not true
   * @return negated
  **/
  @ApiModelProperty(example = "true", value = "Boolean that if set to true, indicates the edge statement is negated i.e. is not true")
  public Boolean getNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  public Edge attributeList(List<EdgeAttribute> attributeList) {
    this.attributeList = attributeList;
    return this;
  }

  public Edge addAttributeListItem(EdgeAttribute attributeListItem) {
    this.attributeList.add(attributeListItem);
    return this;
  }

   /**
   * A list of additional attributes for this edge
   * @return attributeList
  **/
  @ApiModelProperty(value = "A list of additional attributes for this edge")
  public List<EdgeAttribute> getAttributeList() {
    return attributeList;
  }

  public void setAttributeList(List<EdgeAttribute> attributeList) {
    this.attributeList = attributeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Edge edge = (Edge) o;
    return Objects.equals(this.type, edge.type) &&
        Objects.equals(this.relation, edge.relation) &&
        Objects.equals(this.sourceId, edge.sourceId) &&
        Objects.equals(this.targetId, edge.targetId) &&
        Objects.equals(this.isDefinedBy, edge.isDefinedBy) &&
        Objects.equals(this.providedBy, edge.providedBy) &&
        Objects.equals(this.confidence, edge.confidence) &&
        Objects.equals(this.publications, edge.publications) &&
        Objects.equals(this.evidenceType, edge.evidenceType) &&
        Objects.equals(this.qualifiers, edge.qualifiers) &&
        Objects.equals(this.negated, edge.negated) &&
        Objects.equals(this.attributeList, edge.attributeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, relation, sourceId, targetId, isDefinedBy, providedBy, confidence, publications, evidenceType, qualifiers, negated, attributeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Edge {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    isDefinedBy: ").append(toIndentedString(isDefinedBy)).append("\n");
    sb.append("    providedBy: ").append(toIndentedString(providedBy)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
    sb.append("    evidenceType: ").append(toIndentedString(evidenceType)).append("\n");
    sb.append("    qualifiers: ").append(toIndentedString(qualifiers)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("    attributeList: ").append(toIndentedString(attributeList)).append("\n");
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

