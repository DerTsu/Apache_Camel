package co.com.jhonatan.microservice.apacheCamel.model.client;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Validated
public class ClientHeader   {
	  @JsonProperty("id")
	  private String id = null;

	  @JsonProperty("type")
	  private String type = null;

	  public ClientHeader id(String id) {
	    this.id = id;
	    return this;
	  }

	  @ApiModelProperty(required = true, value = "")
	  @NotNull

	  public String getId() {
	    return id;
	  }

	  public void setId(String id) {
	    this.id = id;
	  }

	  public ClientHeader type(String type) {
	    this.type = type;
	    return this;
	  }

	  @ApiModelProperty(required = true, value = "")
	  @NotNull

	  public String getType() {
	    return type;
	  }

	  public void setType(String type) {
	    this.type = type;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    ClientHeader header = (ClientHeader) o;
	    return Objects.equals(this.id, header.id) &&
	        Objects.equals(this.type, header.type);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(id, type);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Header {\n");
	    
	    sb.append("    id: ").append(toIndentedString(id)).append("\n");
	    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
