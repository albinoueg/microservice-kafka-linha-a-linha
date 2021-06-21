package br.com.albinomoreira.kafkaline.ibgewrapper.gateway.feign;

import br.com.albinomoreira.kafkaline.ibgewrapper.gateway.json.EstadoJson;
import feign.RequestLine;

import java.util.List;

public interface EstadoClient {

    @RequestLine("GET /api/v1/localidades/estados")
    List<EstadoJson> get();
}
