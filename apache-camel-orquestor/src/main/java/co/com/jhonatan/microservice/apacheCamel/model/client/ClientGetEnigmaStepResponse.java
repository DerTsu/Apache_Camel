package co.com.jhonatan.microservice.apacheCamel.model.client;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.com.jhonatan.microservice.apacheCamel.model.Header;
import io.swagger.annotations.ApiModelProperty;

@Validated
public class ClientGetEnigmaStepResponse   {
	  @JsonProperty("header")
	  private Header header = null;

	  @JsonProperty("answer")
	  private String answer = null;

	  public ClientGetEnigmaStepResponse header(Header header) {
	    this.header = header;
	    return this;
	  }

	  @ApiModelProperty(required = true, value = "")
	  @NotNull

	  @Valid
	  public Header getHeader() {
	    return header;
	  }

	  public void setHeader(Header header) {
	    this.header = header;
	  }

	  public ClientGetEnigmaStepResponse answer(String answer) {
	    this.answer = answer;
	    return this;
	  }

	  @ApiModelProperty(required = true, value = "")
	  @NotNull

	  public String getAnswer() {
	    return answer;
	  }

	  public void setAnswer(String answer) {
	    this.answer = answer;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    ClientGetEnigmaStepResponse getEnigmaStepResponse = (ClientGetEnigmaStepResponse) o;
	    return Objects.equals(this.header, getEnigmaStepResponse.header) &&
	        Objects.equals(this.answer, getEnigmaStepResponse.answer);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(header, answer);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class GetEnigmaStepResponse {\n");
	    
	    sb.append("    header: ").append(toIndentedString(header)).append("\n");
	    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }

	  private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }
	}
