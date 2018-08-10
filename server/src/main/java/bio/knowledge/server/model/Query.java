package bio.knowledge.server.model;

import java.util.Objects;
import bio.knowledge.server.model.QueryTerms;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Query
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:52:49.953-07:00")

public class Query   {
  @JsonProperty("original_question")
  private String originalQuestion = null;

  @JsonProperty("restated_question")
  private String restatedQuestion = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("known_query_type_id")
  private String knownQueryTypeId = null;

  @JsonProperty("query_type_id")
  private String queryTypeId = null;

  @JsonProperty("bypass_cache")
  private String bypassCache = null;

  @JsonProperty("asynchronous")
  private String asynchronous = null;

  @JsonProperty("options")
  private String options = null;

  @JsonProperty("max_results")
  private Integer maxResults = null;

  @JsonProperty("page_size")
  private Integer pageSize = null;

  @JsonProperty("page_number")
  private Integer pageNumber = null;

  @JsonProperty("terms")
  private QueryTerms terms = null;

  @JsonProperty("reasoner_ids")
  private List<String> reasonerIds = new ArrayList<String>();

  @JsonProperty("query_plan")
  private List<Object> queryPlan = new ArrayList<Object>();

  public Query originalQuestion(String originalQuestion) {
    this.originalQuestion = originalQuestion;
    return this;
  }

   /**
   * Original question as it was typed in by the user
   * @return originalQuestion
  **/
  @ApiModelProperty(example = "what genetic conditions offer protection against malaria", value = "Original question as it was typed in by the user")
  public String getOriginalQuestion() {
    return originalQuestion;
  }

  public void setOriginalQuestion(String originalQuestion) {
    this.originalQuestion = originalQuestion;
  }

  public Query restatedQuestion(String restatedQuestion) {
    this.restatedQuestion = restatedQuestion;
    return this;
  }

   /**
   * Restatement of the question as understood by the translator
   * @return restatedQuestion
  **/
  @ApiModelProperty(example = "Which genetic conditions may offer protection against malaria?", value = "Restatement of the question as understood by the translator")
  public String getRestatedQuestion() {
    return restatedQuestion;
  }

  public void setRestatedQuestion(String restatedQuestion) {
    this.restatedQuestion = restatedQuestion;
  }

  public Query message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Response from the translation engine to the user
   * @return message
  **/
  @ApiModelProperty(example = "Your question was understood.", value = "Response from the translation engine to the user")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Query knownQueryTypeId(String knownQueryTypeId) {
    this.knownQueryTypeId = knownQueryTypeId;
    return this;
  }

   /**
   * DEPRECATED in favor of query_type_id
   * @return knownQueryTypeId
  **/
  @ApiModelProperty(example = "DEPRECATED", value = "DEPRECATED in favor of query_type_id")
  public String getKnownQueryTypeId() {
    return knownQueryTypeId;
  }

  public void setKnownQueryTypeId(String knownQueryTypeId) {
    this.knownQueryTypeId = knownQueryTypeId;
  }

  public Query queryTypeId(String queryTypeId) {
    this.queryTypeId = queryTypeId;
    return this;
  }

   /**
   * Identifier for the specific query type
   * @return queryTypeId
  **/
  @ApiModelProperty(example = "Q1", value = "Identifier for the specific query type")
  public String getQueryTypeId() {
    return queryTypeId;
  }

  public void setQueryTypeId(String queryTypeId) {
    this.queryTypeId = queryTypeId;
  }

  public Query bypassCache(String bypassCache) {
    this.bypassCache = bypassCache;
    return this;
  }

   /**
   * Set to true in order to bypass any possible cached response and try to answer the query over again
   * @return bypassCache
  **/
  @ApiModelProperty(example = "true", value = "Set to true in order to bypass any possible cached response and try to answer the query over again")
  public String getBypassCache() {
    return bypassCache;
  }

  public void setBypassCache(String bypassCache) {
    this.bypassCache = bypassCache;
  }

  public Query asynchronous(String asynchronous) {
    this.asynchronous = asynchronous;
    return this;
  }

   /**
   * Set to true in order to receive an incomplete response_id if the query will take a while. Client can then periodically request that response_id for a status update and eventual complete response
   * @return asynchronous
  **/
  @ApiModelProperty(example = "False", value = "Set to true in order to receive an incomplete response_id if the query will take a while. Client can then periodically request that response_id for a status update and eventual complete response")
  public String getAsynchronous() {
    return asynchronous;
  }

  public void setAsynchronous(String asynchronous) {
    this.asynchronous = asynchronous;
  }

  public Query options(String options) {
    this.options = options;
    return this;
  }

   /**
   * A string of options that can be sent with the query. Options are tool specific and not stipulated here
   * @return options
  **/
  @ApiModelProperty(example = "coalesce&#x3D;True,threshold&#x3D;0.9", value = "A string of options that can be sent with the query. Options are tool specific and not stipulated here")
  public String getOptions() {
    return options;
  }

  public void setOptions(String options) {
    this.options = options;
  }

  public Query maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Maximum number of individual results to return
   * @return maxResults
  **/
  @ApiModelProperty(example = "100", value = "Maximum number of individual results to return")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public Query pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Split the results into pages with this number of results each
   * @return pageSize
  **/
  @ApiModelProperty(example = "100", value = "Split the results into pages with this number of results each")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Query pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of results when the number of results exceeds the page_size
   * @return pageNumber
  **/
  @ApiModelProperty(example = "1", value = "Page number of results when the number of results exceeds the page_size")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Query terms(QueryTerms terms) {
    this.terms = terms;
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @ApiModelProperty(value = "")
  public QueryTerms getTerms() {
    return terms;
  }

  public void setTerms(QueryTerms terms) {
    this.terms = terms;
  }

  public Query reasonerIds(List<String> reasonerIds) {
    this.reasonerIds = reasonerIds;
    return this;
  }

  public Query addReasonerIdsItem(String reasonerIdsItem) {
    this.reasonerIds.add(reasonerIdsItem);
    return this;
  }

   /**
   * List of reasoners to consult for the query
   * @return reasonerIds
  **/
  @ApiModelProperty(example = "[&quot;RTX&quot;,&quot;Robokop&quot;,&quot;Indigo&quot;]", value = "List of reasoners to consult for the query")
  public List<String> getReasonerIds() {
    return reasonerIds;
  }

  public void setReasonerIds(List<String> reasonerIds) {
    this.reasonerIds = reasonerIds;
  }

  public Query queryPlan(List<Object> queryPlan) {
    this.queryPlan = queryPlan;
    return this;
  }

  public Query addQueryPlanItem(Object queryPlanItem) {
    this.queryPlan.add(queryPlanItem);
    return this;
  }

   /**
   * List of node types and edge types in a series that constitute a query plan. Experimental.
   * @return queryPlan
  **/
  @ApiModelProperty(example = "[{&quot;node_type&quot;:&quot;chemical_substance&quot;,&quot;node_name&quot;:&quot;ibuprofen&quot;},{&quot;edge_type&quot;:&quot;interacts_with&quot;},{&quot;node_type&quot;:&quot;protein&quot;}]", value = "List of node types and edge types in a series that constitute a query plan. Experimental.")
  public List<Object> getQueryPlan() {
    return queryPlan;
  }

  public void setQueryPlan(List<Object> queryPlan) {
    this.queryPlan = queryPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Query query = (Query) o;
    return Objects.equals(this.originalQuestion, query.originalQuestion) &&
        Objects.equals(this.restatedQuestion, query.restatedQuestion) &&
        Objects.equals(this.message, query.message) &&
        Objects.equals(this.knownQueryTypeId, query.knownQueryTypeId) &&
        Objects.equals(this.queryTypeId, query.queryTypeId) &&
        Objects.equals(this.bypassCache, query.bypassCache) &&
        Objects.equals(this.asynchronous, query.asynchronous) &&
        Objects.equals(this.options, query.options) &&
        Objects.equals(this.maxResults, query.maxResults) &&
        Objects.equals(this.pageSize, query.pageSize) &&
        Objects.equals(this.pageNumber, query.pageNumber) &&
        Objects.equals(this.terms, query.terms) &&
        Objects.equals(this.reasonerIds, query.reasonerIds) &&
        Objects.equals(this.queryPlan, query.queryPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalQuestion, restatedQuestion, message, knownQueryTypeId, queryTypeId, bypassCache, asynchronous, options, maxResults, pageSize, pageNumber, terms, reasonerIds, queryPlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    
    sb.append("    originalQuestion: ").append(toIndentedString(originalQuestion)).append("\n");
    sb.append("    restatedQuestion: ").append(toIndentedString(restatedQuestion)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    knownQueryTypeId: ").append(toIndentedString(knownQueryTypeId)).append("\n");
    sb.append("    queryTypeId: ").append(toIndentedString(queryTypeId)).append("\n");
    sb.append("    bypassCache: ").append(toIndentedString(bypassCache)).append("\n");
    sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    reasonerIds: ").append(toIndentedString(reasonerIds)).append("\n");
    sb.append("    queryPlan: ").append(toIndentedString(queryPlan)).append("\n");
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

