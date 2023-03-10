package com.tony.smart_buffet.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("year_mp")
public class YearMp implements Serializable {

    @JsonProperty(value ="ypId")
    private Integer ypId;

    @JsonProperty(value ="mId")
    private Integer mId;

    @JsonProperty(value ="mName")
    private String mName;

    @JsonProperty(value ="cId")
    private Integer cId;

    @JsonProperty(value ="ympNum")
    private Integer ympNum;

    @JsonProperty(value ="ympCalorie")
    private Double ympCalorie;

}