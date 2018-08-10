package bio.knowledge.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Question
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-09T20:43:13.676-07:00")

public class Question   {
  @JsonProperty("text")
  private String text = null;

  /**
   * Human language in which the question is posed
   */
  public enum LanguageEnum {
    ENGLISH("English");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LanguageEnum fromValue(String text) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("language")
  private LanguageEnum language = null;

  public Question text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Free text question
   * @return text
  **/
  @ApiModelProperty(example = "what genetic conditions offer protection against malaria", value = "Free text question")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Question language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * Human language in which the question is posed
   * @return language
  **/
  @ApiModelProperty(example = "English", value = "Human language in which the question is posed")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Question question = (Question) o;
    return Objects.equals(this.text, question.text) &&
        Objects.equals(this.language, question.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Question {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

