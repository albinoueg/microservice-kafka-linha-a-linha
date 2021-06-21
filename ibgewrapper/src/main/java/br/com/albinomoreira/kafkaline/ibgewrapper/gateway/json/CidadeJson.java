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
public class CidadeJson implements Serializable {
    @SerializedName("id")
    private Long id;
    @SerializedName("nome")
    private String nome;
    @SerializedName("microrregiao")
    private Microrregiao microrregiao;
    @SerializedName("regiao-imediata")
    private RegiaoImediata regiaoImediata;
}
