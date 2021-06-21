package br.com.albinomoreira.kafkaline.ibgewrapper.gateway.feign.http;

import br.com.albinomoreira.kafkaline.ibgewrapper.gateway.json.CidadeJson;
import br.com.albinomoreira.kafkaline.ibgewrapper.gateway.json.EstadoJson;
import br.com.albinomoreira.kafkaline.ibgewrapper.service.cidade.ConsultarCidadePorCodigoService;
import br.com.albinomoreira.kafkaline.ibgewrapper.service.estado.ConsultarEstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoResource {

    @Autowired
    private ConsultarEstadoService consultaEstadoService;

    @Autowired
    private ConsultarCidadePorCodigoService consultarCidadePorCodigoService;

    @GetMapping("/")
    public List<EstadoJson> consultar(){
        return consultaEstadoService.execute();
    }

    @GetMapping("/{id}/cidades/")
    public List<CidadeJson> consultarCidades(@PathVariable("id") String estados) {
        return consultarCidadePorCodigoService.execute(estados);
    }
}
