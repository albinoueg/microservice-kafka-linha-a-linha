package br.com.albinomoreira.kafkaline.ibgewrapper.gateway.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegiaoImediata implements Serializable {
    @SerializedName("id")
    private Long id;
    @SerializedName("nome")
    private String nome;
    @SerializedName("regiao-intermediaria")
    private Mesorregiao regiaoIntermediaria;
}
