package co.com.jhonatan.microservice.apacheCamel.model;

import java.util.Objects;
import co.com.jhonatan.microservice.apacheCamel.model.Header;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-12T11:12:49.479-05:00[America/Bogota]")
public class GetEnigmaRequest   {
	  @JsonProperty("header")
	  private Header header = null;

	  @JsonProperty("enigma")
	  private String enigma = null;

	  public GetEnigmaRequest header(Header header) {
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

	  public GetEnigmaRequest enigma(String enigma) {
	    this.enigma = enigma;
	    return this;
	  }

	  @ApiModelProperty(required = true, value = "")
	  @NotNull

	  public String getEnigma() {
	    return enigma;
	  }

	  public void setEnigma(String enigma) {
	    this.enigma = enigma;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    GetEnigmaRequest getEnigmaRequest = (GetEnigmaRequest) o;
	    return Objects.equals(this.header, getEnigmaRequest.header) &&
	        Objects.equals(this.enigma, getEnigmaRequest.enigma);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(header, enigma);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class GetEnigmaRequest {\n");
	    
	    sb.append("    header: ").append(toIndentedString(header)).append("\n");
	    sb.append("    enigma: ").append(toIndentedString(enigma)).append("\n");
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