package co.com.jhonatan.microservice.apacheCamel.model.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.com.jhonatan.microservice.apacheCamel.model.GetEnigmaStepResponse;
import io.swagger.annotations.ApiModelProperty;

@Validated
public class ClientJsonApiBodyResponseSuccess   {
	  @JsonProperty("data")
	  @Valid
	  private List<GetEnigmaStepResponse> data = new ArrayList<GetEnigmaStepResponse>();

	  public ClientJsonApiBodyResponseSuccess data(List<GetEnigmaStepResponse> data) {
	    this.data = data;
	    return this;
	  }

	  public ClientJsonApiBodyResponseSuccess addDataItem(GetEnigmaStepResponse dataItem) {
	    this.data.add(dataItem);
	    return this;
	  }

	  @ApiModelProperty(required = true, value = "")
	  @NotNull
	  @Valid
	  public List<GetEnigmaStepResponse> getData() {
	    return data;
	  }

	  public void setData(List<GetEnigmaStepResponse> data) {
	    this.data = data;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    ClientJsonApiBodyResponseSuccess jsonApiBodyResponseSuccess = (ClientJsonApiBodyResponseSuccess) o;
	    return Objects.equals(this.data, jsonApiBodyResponseSuccess.data);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(data);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class JsonApiBodyResponseSuccess {\n");
	    
	    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
