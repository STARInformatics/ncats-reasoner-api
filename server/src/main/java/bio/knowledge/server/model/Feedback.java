package bio.knowledge.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * A single unit of Feedback
 */
@ApiModel(description = "A single unit of Feedback")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:43:13.676-07:00")

public class Feedback   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("result_id")
  private String resultId = null;

  @JsonProperty("expertise_level_id")
  private Integer expertiseLevelId = null;

  @JsonProperty("rating_id")
  private Integer ratingId = null;

  @JsonProperty("commenter_id")
  private Integer commenterId = null;

  @JsonProperty("commenter_full_name")
  private String commenterFullName = null;

  @JsonProperty("datetime")
  private String datetime = null;

  @JsonProperty("comment")
  private String comment = null;

  public Feedback id(String id) {
    this.id = id;
    return this;
  }

   /**
   * URI for this feedback item
   * @return id
  **/
  @ApiModelProperty(example = "http://rtx.ncats.io/api/rtx/v1/result/2345/feedback/4567", value = "URI for this feedback item")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Feedback resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

   /**
   * URI for the result that this feedback corresponds to
   * @return resultId
  **/
  @ApiModelProperty(example = "http://rtx.ncats.io/api/rtx/v1/result/2345", value = "URI for the result that this feedback corresponds to")
  public String getResultId() {
    return resultId;
  }

  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  public Feedback expertiseLevelId(Integer expertiseLevelId) {
    this.expertiseLevelId = expertiseLevelId;
    return this;
  }

   /**
   * Integer identifier of the claimed expertise level
   * @return expertiseLevelId
  **/
  @ApiModelProperty(example = "1", value = "Integer identifier of the claimed expertise level")
  public Integer getExpertiseLevelId() {
    return expertiseLevelId;
  }

  public void setExpertiseLevelId(Integer expertiseLevelId) {
    this.expertiseLevelId = expertiseLevelId;
  }

  public Feedback ratingId(Integer ratingId) {
    this.ratingId = ratingId;
    return this;
  }

   /**
   * Integer identifier of the applied rating
   * @return ratingId
  **/
  @ApiModelProperty(example = "1", value = "Integer identifier of the applied rating")
  public Integer getRatingId() {
    return ratingId;
  }

  public void setRatingId(Integer ratingId) {
    this.ratingId = ratingId;
  }

  public Feedback commenterId(Integer commenterId) {
    this.commenterId = commenterId;
    return this;
  }

   /**
   * Integer identifier of the commenter
   * @return commenterId
  **/
  @ApiModelProperty(example = "1", value = "Integer identifier of the commenter")
  public Integer getCommenterId() {
    return commenterId;
  }

  public void setCommenterId(Integer commenterId) {
    this.commenterId = commenterId;
  }

  public Feedback commenterFullName(String commenterFullName) {
    this.commenterFullName = commenterFullName;
    return this;
  }

   /**
   * Full name of the commenter
   * @return commenterFullName
  **/
  @ApiModelProperty(example = "John Smith", value = "Full name of the commenter")
  public String getCommenterFullName() {
    return commenterFullName;
  }

  public void setCommenterFullName(String commenterFullName) {
    this.commenterFullName = commenterFullName;
  }

  public Feedback datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

   /**
   * Datetime when the feedback was provided
   * @return datetime
  **/
  @ApiModelProperty(example = "2018-05-08 12:00", value = "Datetime when the feedback was provided")
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public Feedback comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * A free text comment about this result
   * @return comment
  **/
  @ApiModelProperty(example = "This is a great result because...", value = "A free text comment about this result")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feedback feedback = (Feedback) o;
    return Objects.equals(this.id, feedback.id) &&
        Objects.equals(this.resultId, feedback.resultId) &&
        Objects.equals(this.expertiseLevelId, feedback.expertiseLevelId) &&
        Objects.equals(this.ratingId, feedback.ratingId) &&
        Objects.equals(this.commenterId, feedback.commenterId) &&
        Objects.equals(this.commenterFullName, feedback.commenterFullName) &&
        Objects.equals(this.datetime, feedback.datetime) &&
        Objects.equals(this.comment, feedback.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resultId, expertiseLevelId, ratingId, commenterId, commenterFullName, datetime, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    expertiseLevelId: ").append(toIndentedString(expertiseLevelId)).append("\n");
    sb.append("    ratingId: ").append(toIndentedString(ratingId)).append("\n");
    sb.append("    commenterId: ").append(toIndentedString(commenterId)).append("\n");
    sb.append("    commenterFullName: ").append(toIndentedString(commenterFullName)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

