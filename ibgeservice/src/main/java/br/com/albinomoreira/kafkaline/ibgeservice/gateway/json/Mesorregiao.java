package br.com.albinomoreira.kafkaline.ibgeservice.gateway.json;

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
public class Mesorregiao implements Serializable {
    @SerializedName(value = "id")
    private Long id;
    @SerializedName(value = "nome")
    private String nome;
    @SerializedName(value = "UF")
    private Uf uf;
}
