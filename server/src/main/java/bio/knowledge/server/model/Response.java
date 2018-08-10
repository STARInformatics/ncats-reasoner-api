package bio.knowledge.server.model;

import java.util.Objects;
import bio.knowledge.server.model.Result;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:43:13.676-07:00")

public class Response   {
  @JsonProperty("context")
  private String context = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("reasoner_id")
  private String reasonerId = null;

  @JsonProperty("tool_version")
  private String toolVersion = null;

  @JsonProperty("schema_version")
  private String schemaVersion = null;

  @JsonProperty("datetime")
  private String datetime = null;

  @JsonProperty("original_question_text")
  private String originalQuestionText = null;

  @JsonProperty("restated_question_text")
  private String restatedQuestionText = null;

  @JsonProperty("known_query_type_id")
  private String knownQueryTypeId = null;

  @JsonProperty("query_type_id")
  private String queryTypeId = null;

  @JsonProperty("terms")
  private Object terms = null;

  @JsonProperty("n_results")
  private Integer nResults = null;

  @JsonProperty("response_code")
  private String responseCode = null;

  @JsonProperty("result_code")
  private String resultCode = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("table_column_names")
  private List<String> tableColumnNames = new ArrayList<String>();

  @JsonProperty("result_list")
  private List<Result> resultList = new ArrayList<Result>();

  public Response context(String context) {
    this.context = context;
    return this;
  }

   /**
   * JSON-LD context URI
   * @return context
  **/
  @ApiModelProperty(example = "http://rtx.ncats.io/ns/translator.jsonld", value = "JSON-LD context URI")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public Response type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Entity type of this response
   * @return type
  **/
  @ApiModelProperty(example = "medical_translator_query_result", value = "Entity type of this response")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * URI for this response
   * @return id
  **/
  @ApiModelProperty(example = "http://rtx.ncats.io/api/rtx/v1/response/1234", value = "URI for this response")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Response reasonerId(String reasonerId) {
    this.reasonerId = reasonerId;
    return this;
  }

   /**
   * Identifier string of the reasoner that provided this response (e.g., RTX, Robokop, Indigo, Integrator)
   * @return reasonerId
  **/
  @ApiModelProperty(example = "RTX", value = "Identifier string of the reasoner that provided this response (e.g., RTX, Robokop, Indigo, Integrator)")
  public String getReasonerId() {
    return reasonerId;
  }

  public void setReasonerId(String reasonerId) {
    this.reasonerId = reasonerId;
  }

  public Response toolVersion(String toolVersion) {
    this.toolVersion = toolVersion;
    return this;
  }

   /**
   * Version label of the tool that generated this response
   * @return toolVersion
  **/
  @ApiModelProperty(example = "RTX 0.4.0", value = "Version label of the tool that generated this response")
  public String getToolVersion() {
    return toolVersion;
  }

  public void setToolVersion(String toolVersion) {
    this.toolVersion = toolVersion;
  }

  public Response schemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * Version label of this JSON-LD schema
   * @return schemaVersion
  **/
  @ApiModelProperty(example = "0.8.0", value = "Version label of this JSON-LD schema")
  public String getSchemaVersion() {
    return schemaVersion;
  }

  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }

  public Response datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

   /**
   * ISO standard datetime string for the time that this response was generated
   * @return datetime
  **/
  @ApiModelProperty(example = "2018-01-09 12:34:45", value = "ISO standard datetime string for the time that this response was generated")
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public Response originalQuestionText(String originalQuestionText) {
    this.originalQuestionText = originalQuestionText;
    return this;
  }

   /**
   * The original question text typed in by the user
   * @return originalQuestionText
  **/
  @ApiModelProperty(example = "what proteins are affected by sickle cell anemia", value = "The original question text typed in by the user")
  public String getOriginalQuestionText() {
    return originalQuestionText;
  }

  public void setOriginalQuestionText(String originalQuestionText) {
    this.originalQuestionText = originalQuestionText;
  }

  public Response restatedQuestionText(String restatedQuestionText) {
    this.restatedQuestionText = restatedQuestionText;
    return this;
  }

   /**
   * A precise restatement of the question, as understood by the Translator, for which the answer applies. The user should verify that the restated question matches the intent of their original question (it might not).
   * @return restatedQuestionText
  **/
  @ApiModelProperty(example = "Which proteins are affected by sickle cell anemia?", value = "A precise restatement of the question, as understood by the Translator, for which the answer applies. The user should verify that the restated question matches the intent of their original question (it might not).")
  public String getRestatedQuestionText() {
    return restatedQuestionText;
  }

  public void setRestatedQuestionText(String restatedQuestionText) {
    this.restatedQuestionText = restatedQuestionText;
  }

  public Response knownQueryTypeId(String knownQueryTypeId) {
    this.knownQueryTypeId = knownQueryTypeId;
    return this;
  }

   /**
   * DEPRECATED
   * @return knownQueryTypeId
  **/
  @ApiModelProperty(example = "DEPRECATED", value = "DEPRECATED")
  public String getKnownQueryTypeId() {
    return knownQueryTypeId;
  }

  public void setKnownQueryTypeId(String knownQueryTypeId) {
    this.knownQueryTypeId = knownQueryTypeId;
  }

  public Response queryTypeId(String queryTypeId) {
    this.queryTypeId = queryTypeId;
    return this;
  }

   /**
   * The query type id if one is known for the query/response (as defined in https://docs.google.com/spreadsheets/d/1Gna_yCbHj14Brp-8GBY50Mq36nwKGl5T5z4REUQQsfw/edit )
   * @return queryTypeId
  **/
  @ApiModelProperty(example = "Q2", value = "The query type id if one is known for the query/response (as defined in https://docs.google.com/spreadsheets/d/1Gna_yCbHj14Brp-8GBY50Mq36nwKGl5T5z4REUQQsfw/edit )")
  public String getQueryTypeId() {
    return queryTypeId;
  }

  public void setQueryTypeId(String queryTypeId) {
    this.queryTypeId = queryTypeId;
  }

  public Response terms(Object terms) {
    this.terms = terms;
    return this;
  }

   /**
   * The is string of the query type id if one is known for the query/response
   * @return terms
  **/
  @ApiModelProperty(example = "&quot;{ &#39;disease&#39;: &#39;malaria&#39; }&quot;", value = "The is string of the query type id if one is known for the query/response")
  public Object getTerms() {
    return terms;
  }

  public void setTerms(Object terms) {
    this.terms = terms;
  }

  public Response nResults(Integer nResults) {
    this.nResults = nResults;
    return this;
  }

   /**
   * Total number of results in the response (which may be less than what is returned if limits were placed on the results to return)
   * @return nResults
  **/
  @ApiModelProperty(example = "42", value = "Total number of results in the response (which may be less than what is returned if limits were placed on the results to return)")
  public Integer getNResults() {
    return nResults;
  }

  public void setNResults(Integer nResults) {
    this.nResults = nResults;
  }

  public Response responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Set to OK for success, or some other short string to indicate and error (e.g., KGUnavailable, TermNotFound, etc.)
   * @return responseCode
  **/
  @ApiModelProperty(example = "OK", value = "Set to OK for success, or some other short string to indicate and error (e.g., KGUnavailable, TermNotFound, etc.)")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public Response resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * DEPRECATED
   * @return resultCode
  **/
  @ApiModelProperty(example = "OK", value = "DEPRECATED")
  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  public Response message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Extended message denoting the success or mode of failure for the response
   * @return message
  **/
  @ApiModelProperty(example = "1 answer found", value = "Extended message denoting the success or mode of failure for the response")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Response tableColumnNames(List<String> tableColumnNames) {
    this.tableColumnNames = tableColumnNames;
    return this;
  }

  public Response addTableColumnNamesItem(String tableColumnNamesItem) {
    this.tableColumnNames.add(tableColumnNamesItem);
    return this;
  }

   /**
   * List of column names that corresponds to the row_data for each result
   * @return tableColumnNames
  **/
  @ApiModelProperty(example = "[&quot;chemical_substance.name&quot;,&quot;chemical_substance.id&quot;]", value = "List of column names that corresponds to the row_data for each result")
  public List<String> getTableColumnNames() {
    return tableColumnNames;
  }

  public void setTableColumnNames(List<String> tableColumnNames) {
    this.tableColumnNames = tableColumnNames;
  }

  public Response resultList(List<Result> resultList) {
    this.resultList = resultList;
    return this;
  }

  public Response addResultListItem(Result resultListItem) {
    this.resultList.add(resultListItem);
    return this;
  }

   /**
   * Get resultList
   * @return resultList
  **/
  @ApiModelProperty(value = "")
  public List<Result> getResultList() {
    return resultList;
  }

  public void setResultList(List<Result> resultList) {
    this.resultList = resultList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.context, response.context) &&
        Objects.equals(this.type, response.type) &&
        Objects.equals(this.id, response.id) &&
        Objects.equals(this.reasonerId, response.reasonerId) &&
        Objects.equals(this.toolVersion, response.toolVersion) &&
        Objects.equals(this.schemaVersion, response.schemaVersion) &&
        Objects.equals(this.datetime, response.datetime) &&
        Objects.equals(this.originalQuestionText, response.originalQuestionText) &&
        Objects.equals(this.restatedQuestionText, response.restatedQuestionText) &&
        Objects.equals(this.knownQueryTypeId, response.knownQueryTypeId) &&
        Objects.equals(this.queryTypeId, response.queryTypeId) &&
        Objects.equals(this.terms, response.terms) &&
        Objects.equals(this.nResults, response.nResults) &&
        Objects.equals(this.responseCode, response.responseCode) &&
        Objects.equals(this.resultCode, response.resultCode) &&
        Objects.equals(this.message, response.message) &&
        Objects.equals(this.tableColumnNames, response.tableColumnNames) &&
        Objects.equals(this.resultList, response.resultList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, type, id, reasonerId, toolVersion, schemaVersion, datetime, originalQuestionText, restatedQuestionText, knownQueryTypeId, queryTypeId, terms, nResults, responseCode, resultCode, message, tableColumnNames, resultList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reasonerId: ").append(toIndentedString(reasonerId)).append("\n");
    sb.append("    toolVersion: ").append(toIndentedString(toolVersion)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    originalQuestionText: ").append(toIndentedString(originalQuestionText)).append("\n");
    sb.append("    restatedQuestionText: ").append(toIndentedString(restatedQuestionText)).append("\n");
    sb.append("    knownQueryTypeId: ").append(toIndentedString(knownQueryTypeId)).append("\n");
    sb.append("    queryTypeId: ").append(toIndentedString(queryTypeId)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    nResults: ").append(toIndentedString(nResults)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    tableColumnNames: ").append(toIndentedString(tableColumnNames)).append("\n");
    sb.append("    resultList: ").append(toIndentedString(resultList)).append("\n");
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

