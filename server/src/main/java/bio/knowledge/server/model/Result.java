package bio.knowledge.server.model;

import java.util.Objects;
import bio.knowledge.server.model.ResultGraph;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * One of potentially several results or answers for a query
 */
@ApiModel(description = "One of potentially several results or answers for a query")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:43:13.676-07:00")

public class Result   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("essence")
  private String essence = null;

  @JsonProperty("row_data")
  private List<String> rowData = new ArrayList<String>();

  @JsonProperty("score")
  private Float score = null;

  @JsonProperty("score_name")
  private String scoreName = null;

  @JsonProperty("score_direction")
  private String scoreDirection = null;

  @JsonProperty("confidence")
  private Float confidence = null;

  @JsonProperty("result_type")
  private String resultType = null;

  @JsonProperty("result_group")
  private Integer resultGroup = null;

  @JsonProperty("result_group_similarity_score")
  private Float resultGroupSimilarityScore = null;

  @JsonProperty("reasoner_id")
  private String reasonerId = null;

  @JsonProperty("result_graph")
  private ResultGraph resultGraph = null;

  public Result id(String id) {
    this.id = id;
    return this;
  }

   /**
   * URI for this response
   * @return id
  **/
  @ApiModelProperty(example = "http://rtx.ncats.io/api/rtx/v1/result/2345", value = "URI for this response")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Result description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A free text description of this result answer from the reasoner
   * @return description
  **/
  @ApiModelProperty(example = "The genetic condition sickle cell anemia may provide protection from cerebral malaria via genetic alterations of proteins HBB (P68871) and HMOX1 (P09601).", value = "A free text description of this result answer from the reasoner")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Result text(String text) {
    this.text = text;
    return this;
  }

   /**
   * DEPRECATED
   * @return text
  **/
  @ApiModelProperty(example = "DEPRECATED", value = "DEPRECATED")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Result essence(String essence) {
    this.essence = essence;
    return this;
  }

   /**
   * A single string that is the terse essence of the result (useful for simple answers)
   * @return essence
  **/
  @ApiModelProperty(example = "ibuprofen", value = "A single string that is the terse essence of the result (useful for simple answers)")
  public String getEssence() {
    return essence;
  }

  public void setEssence(String essence) {
    this.essence = essence;
  }

  public Result rowData(List<String> rowData) {
    this.rowData = rowData;
    return this;
  }

  public Result addRowDataItem(String rowDataItem) {
    this.rowData.add(rowDataItem);
    return this;
  }

   /**
   * An arbitrary list of values that captures the essence of the result that can be turned into a tabular result across all answers (each result is a row) for a user that wants tabular output
   * @return rowData
  **/
  @ApiModelProperty(example = "[&quot;ibuprofen&quot;,&quot;CHEMBL:CHEMBL521&quot;]", value = "An arbitrary list of values that captures the essence of the result that can be turned into a tabular result across all answers (each result is a row) for a user that wants tabular output")
  public List<String> getRowData() {
    return rowData;
  }

  public void setRowData(List<String> rowData) {
    this.rowData = rowData;
  }

  public Result score(Float score) {
    this.score = score;
    return this;
  }

   /**
   * Any type of score associated with this result (highest confidence)
   * @return score
  **/
  @ApiModelProperty(example = "163.233", value = "Any type of score associated with this result (highest confidence)")
  public Float getScore() {
    return score;
  }

  public void setScore(Float score) {
    this.score = score;
  }

  public Result scoreName(String scoreName) {
    this.scoreName = scoreName;
    return this;
  }

   /**
   * Name for the score
   * @return scoreName
  **/
  @ApiModelProperty(example = "Jaccard distance", value = "Name for the score")
  public String getScoreName() {
    return scoreName;
  }

  public void setScoreName(String scoreName) {
    this.scoreName = scoreName;
  }

  public Result scoreDirection(String scoreDirection) {
    this.scoreDirection = scoreDirection;
    return this;
  }

   /**
   * Sorting indicator for the score: one of higher_is_better or lower_is_better
   * @return scoreDirection
  **/
  @ApiModelProperty(example = "Jaccard distance", value = "Sorting indicator for the score: one of higher_is_better or lower_is_better")
  public String getScoreDirection() {
    return scoreDirection;
  }

  public void setScoreDirection(String scoreDirection) {
    this.scoreDirection = scoreDirection;
  }

  public Result confidence(Float confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Confidence metric for this result, a value 0.0 (no confidence) and 1.0 (highest confidence)
   * @return confidence
  **/
  @ApiModelProperty(example = "0.9234", value = "Confidence metric for this result, a value 0.0 (no confidence) and 1.0 (highest confidence)")
  public Float getConfidence() {
    return confidence;
  }

  public void setConfidence(Float confidence) {
    this.confidence = confidence;
  }

  public Result resultType(String resultType) {
    this.resultType = resultType;
    return this;
  }

   /**
   * One of several possible result types: 'individual query answer', 'neighborhood graph', 'type summary graph'
   * @return resultType
  **/
  @ApiModelProperty(example = "answer", value = "One of several possible result types: 'individual query answer', 'neighborhood graph', 'type summary graph'")
  public String getResultType() {
    return resultType;
  }

  public void setResultType(String resultType) {
    this.resultType = resultType;
  }

  public Result resultGroup(Integer resultGroup) {
    this.resultGroup = resultGroup;
    return this;
  }

   /**
   * An integer group number for results for use in cases where several results should be grouped together. Also useful to control sorting ascending.
   * @return resultGroup
  **/
  @ApiModelProperty(example = "1", value = "An integer group number for results for use in cases where several results should be grouped together. Also useful to control sorting ascending.")
  public Integer getResultGroup() {
    return resultGroup;
  }

  public void setResultGroup(Integer resultGroup) {
    this.resultGroup = resultGroup;
  }

  public Result resultGroupSimilarityScore(Float resultGroupSimilarityScore) {
    this.resultGroupSimilarityScore = resultGroupSimilarityScore;
    return this;
  }

   /**
   * A score that denotes the similarity of this result to other members of the result_group
   * @return resultGroupSimilarityScore
  **/
  @ApiModelProperty(example = "0.95", value = "A score that denotes the similarity of this result to other members of the result_group")
  public Float getResultGroupSimilarityScore() {
    return resultGroupSimilarityScore;
  }

  public void setResultGroupSimilarityScore(Float resultGroupSimilarityScore) {
    this.resultGroupSimilarityScore = resultGroupSimilarityScore;
  }

  public Result reasonerId(String reasonerId) {
    this.reasonerId = reasonerId;
    return this;
  }

   /**
   * Identifier string of the reasoner that provided this result (e.g., RTX, Robokop, Indigo, Integrator)
   * @return reasonerId
  **/
  @ApiModelProperty(example = "RTX", value = "Identifier string of the reasoner that provided this result (e.g., RTX, Robokop, Indigo, Integrator)")
  public String getReasonerId() {
    return reasonerId;
  }

  public void setReasonerId(String reasonerId) {
    this.reasonerId = reasonerId;
  }

  public Result resultGraph(ResultGraph resultGraph) {
    this.resultGraph = resultGraph;
    return this;
  }

   /**
   * Get resultGraph
   * @return resultGraph
  **/
  @ApiModelProperty(value = "")
  public ResultGraph getResultGraph() {
    return resultGraph;
  }

  public void setResultGraph(ResultGraph resultGraph) {
    this.resultGraph = resultGraph;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(this.id, result.id) &&
        Objects.equals(this.description, result.description) &&
        Objects.equals(this.text, result.text) &&
        Objects.equals(this.essence, result.essence) &&
        Objects.equals(this.rowData, result.rowData) &&
        Objects.equals(this.score, result.score) &&
        Objects.equals(this.scoreName, result.scoreName) &&
        Objects.equals(this.scoreDirection, result.scoreDirection) &&
        Objects.equals(this.confidence, result.confidence) &&
        Objects.equals(this.resultType, result.resultType) &&
        Objects.equals(this.resultGroup, result.resultGroup) &&
        Objects.equals(this.resultGroupSimilarityScore, result.resultGroupSimilarityScore) &&
        Objects.equals(this.reasonerId, result.reasonerId) &&
        Objects.equals(this.resultGraph, result.resultGraph);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, text, essence, rowData, score, scoreName, scoreDirection, confidence, resultType, resultGroup, resultGroupSimilarityScore, reasonerId, resultGraph);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    essence: ").append(toIndentedString(essence)).append("\n");
    sb.append("    rowData: ").append(toIndentedString(rowData)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    scoreName: ").append(toIndentedString(scoreName)).append("\n");
    sb.append("    scoreDirection: ").append(toIndentedString(scoreDirection)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("    resultGroup: ").append(toIndentedString(resultGroup)).append("\n");
    sb.append("    resultGroupSimilarityScore: ").append(toIndentedString(resultGroupSimilarityScore)).append("\n");
    sb.append("    reasonerId: ").append(toIndentedString(reasonerId)).append("\n");
    sb.append("    resultGraph: ").append(toIndentedString(resultGraph)).append("\n");
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

