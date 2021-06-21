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
public class EstadoJson implements Serializable {

    @SerializedName("id")
    private Long id;
    @SerializedName("sigla")
    private String sigla;
    @SerializedName("nome")
    private String nome;
    @SerializedName("regiao")
    private RegiaoJson regiao;
}
