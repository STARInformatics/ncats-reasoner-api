package bio.knowledge.server.model;

import java.util.Objects;
import bio.knowledge.server.model.Feedback;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Feedback for one result
 */
@ApiModel(description = "Feedback for one result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:43:13.676-07:00")

public class ResultFeedback   {
  @JsonProperty("feedback_list")
  private List<Feedback> feedbackList = new ArrayList<Feedback>();

  public ResultFeedback feedbackList(List<Feedback> feedbackList) {
    this.feedbackList = feedbackList;
    return this;
  }

  public ResultFeedback addFeedbackListItem(Feedback feedbackListItem) {
    this.feedbackList.add(feedbackListItem);
    return this;
  }

   /**
   * Get feedbackList
   * @return feedbackList
  **/
  @ApiModelProperty(value = "")
  public List<Feedback> getFeedbackList() {
    return feedbackList;
  }

  public void setFeedbackList(List<Feedback> feedbackList) {
    this.feedbackList = feedbackList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultFeedback resultFeedback = (ResultFeedback) o;
    return Objects.equals(this.feedbackList, resultFeedback.feedbackList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultFeedback {\n");
    
    sb.append("    feedbackList: ").append(toIndentedString(feedbackList)).append("\n");
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

