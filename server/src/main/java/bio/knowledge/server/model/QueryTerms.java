package bio.knowledge.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Dict of terms needed by the specific query type
 */
@ApiModel(description = "Dict of terms needed by the specific query type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:43:13.676-07:00")

public class QueryTerms   {
  @JsonProperty("disease")
  private String disease = null;

  @JsonProperty("protein")
  private String protein = null;

  @JsonProperty("anatomical_entity")
  private String anatomicalEntity = null;

  @JsonProperty("chemical_substance")
  private String chemicalSubstance = null;

  @JsonProperty("metabolite")
  private String metabolite = null;

  public QueryTerms disease(String disease) {
    this.disease = disease;
    return this;
  }

   /**
   * Get disease
   * @return disease
  **/
  @ApiModelProperty(example = "malaria", value = "")
  public String getDisease() {
    return disease;
  }

  public void setDisease(String disease) {
    this.disease = disease;
  }

  public QueryTerms protein(String protein) {
    this.protein = protein;
    return this;
  }

   /**
   * Get protein
   * @return protein
  **/
  @ApiModelProperty(example = "P12345", value = "")
  public String getProtein() {
    return protein;
  }

  public void setProtein(String protein) {
    this.protein = protein;
  }

  public QueryTerms anatomicalEntity(String anatomicalEntity) {
    this.anatomicalEntity = anatomicalEntity;
    return this;
  }

   /**
   * Get anatomicalEntity
   * @return anatomicalEntity
  **/
  @ApiModelProperty(example = "liver", value = "")
  public String getAnatomicalEntity() {
    return anatomicalEntity;
  }

  public void setAnatomicalEntity(String anatomicalEntity) {
    this.anatomicalEntity = anatomicalEntity;
  }

  public QueryTerms chemicalSubstance(String chemicalSubstance) {
    this.chemicalSubstance = chemicalSubstance;
    return this;
  }

   /**
   * Get chemicalSubstance
   * @return chemicalSubstance
  **/
  @ApiModelProperty(example = "ibuprofen", value = "")
  public String getChemicalSubstance() {
    return chemicalSubstance;
  }

  public void setChemicalSubstance(String chemicalSubstance) {
    this.chemicalSubstance = chemicalSubstance;
  }

  public QueryTerms metabolite(String metabolite) {
    this.metabolite = metabolite;
    return this;
  }

   /**
   * Get metabolite
   * @return metabolite
  **/
  @ApiModelProperty(example = "ibuprofen", value = "")
  public String getMetabolite() {
    return metabolite;
  }

  public void setMetabolite(String metabolite) {
    this.metabolite = metabolite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTerms queryTerms = (QueryTerms) o;
    return Objects.equals(this.disease, queryTerms.disease) &&
        Objects.equals(this.protein, queryTerms.protein) &&
        Objects.equals(this.anatomicalEntity, queryTerms.anatomicalEntity) &&
        Objects.equals(this.chemicalSubstance, queryTerms.chemicalSubstance) &&
        Objects.equals(this.metabolite, queryTerms.metabolite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disease, protein, anatomicalEntity, chemicalSubstance, metabolite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTerms {\n");
    
    sb.append("    disease: ").append(toIndentedString(disease)).append("\n");
    sb.append("    protein: ").append(toIndentedString(protein)).append("\n");
    sb.append("    anatomicalEntity: ").append(toIndentedString(anatomicalEntity)).append("\n");
    sb.append("    chemicalSubstance: ").append(toIndentedString(chemicalSubstance)).append("\n");
    sb.append("    metabolite: ").append(toIndentedString(metabolite)).append("\n");
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

