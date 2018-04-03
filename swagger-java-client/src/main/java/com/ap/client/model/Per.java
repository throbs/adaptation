/**
 * title
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.ap.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Per
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-03T15:08:55.388+08:00")
public class Per   {
  @SerializedName("OBJID")
  private String OBJID = null;

  @SerializedName("SUBOBJ_ID")
  private String SUBOBJ_ID = null;

  @SerializedName("COLLECTTIME")
  private String COLLECTTIME = null;

  @SerializedName("TYPE_ID")
  private String TYPE_ID = null;

  @SerializedName("KPI_ID")
  private String KPI_ID = null;

  @SerializedName("KPI_VLAUE")
  private String KPI_VLAUE = null;

  public Per OBJID(String OBJID) {
    this.OBJID = OBJID;
    return this;
  }

   /**
   * Get OBJID
   * @return OBJID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOBJID() {
    return OBJID;
  }

  public void setOBJID(String OBJID) {
    this.OBJID = OBJID;
  }

  public Per SUBOBJ_ID(String SUBOBJ_ID) {
    this.SUBOBJ_ID = SUBOBJ_ID;
    return this;
  }

   /**
   * Get SUBOBJ_ID
   * @return SUBOBJ_ID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSUBOBJID() {
    return SUBOBJ_ID;
  }

  public void setSUBOBJID(String SUBOBJ_ID) {
    this.SUBOBJ_ID = SUBOBJ_ID;
  }

  public Per COLLECTTIME(String COLLECTTIME) {
    this.COLLECTTIME = COLLECTTIME;
    return this;
  }

   /**
   * Get COLLECTTIME
   * @return COLLECTTIME
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCOLLECTTIME() {
    return COLLECTTIME;
  }

  public void setCOLLECTTIME(String COLLECTTIME) {
    this.COLLECTTIME = COLLECTTIME;
  }

  public Per TYPE_ID(String TYPE_ID) {
    this.TYPE_ID = TYPE_ID;
    return this;
  }

   /**
   * Get TYPE_ID
   * @return TYPE_ID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTYPEID() {
    return TYPE_ID;
  }

  public void setTYPEID(String TYPE_ID) {
    this.TYPE_ID = TYPE_ID;
  }

  public Per KPI_ID(String KPI_ID) {
    this.KPI_ID = KPI_ID;
    return this;
  }

   /**
   * Get KPI_ID
   * @return KPI_ID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKPIID() {
    return KPI_ID;
  }

  public void setKPIID(String KPI_ID) {
    this.KPI_ID = KPI_ID;
  }

  public Per KPI_VLAUE(String KPI_VLAUE) {
    this.KPI_VLAUE = KPI_VLAUE;
    return this;
  }

   /**
   * Get KPI_VLAUE
   * @return KPI_VLAUE
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKPIVLAUE() {
    return KPI_VLAUE;
  }

  public void setKPIVLAUE(String KPI_VLAUE) {
    this.KPI_VLAUE = KPI_VLAUE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Per per = (Per) o;
    return Objects.equals(this.OBJID, per.OBJID) &&
        Objects.equals(this.SUBOBJ_ID, per.SUBOBJ_ID) &&
        Objects.equals(this.COLLECTTIME, per.COLLECTTIME) &&
        Objects.equals(this.TYPE_ID, per.TYPE_ID) &&
        Objects.equals(this.KPI_ID, per.KPI_ID) &&
        Objects.equals(this.KPI_VLAUE, per.KPI_VLAUE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(OBJID, SUBOBJ_ID, COLLECTTIME, TYPE_ID, KPI_ID, KPI_VLAUE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Per {\n");
    
    sb.append("    OBJID: ").append(toIndentedString(OBJID)).append("\n");
    sb.append("    SUBOBJ_ID: ").append(toIndentedString(SUBOBJ_ID)).append("\n");
    sb.append("    COLLECTTIME: ").append(toIndentedString(COLLECTTIME)).append("\n");
    sb.append("    TYPE_ID: ").append(toIndentedString(TYPE_ID)).append("\n");
    sb.append("    KPI_ID: ").append(toIndentedString(KPI_ID)).append("\n");
    sb.append("    KPI_VLAUE: ").append(toIndentedString(KPI_VLAUE)).append("\n");
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
