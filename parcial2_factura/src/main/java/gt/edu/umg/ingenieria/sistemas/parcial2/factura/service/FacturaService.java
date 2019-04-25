package gt.edu.umg.ingenieria.sistemas.parcial2.factura.service;

package gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model;
import ch.qos.logback.core.net.server.Client;
import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.CabeceraFacturaEntity;
import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.DetalleFacturaEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.factura.dao.CabeceraFacturaRepository;
import gt.edu.umg.ingenieria.sistemas.parcial2.factura.dao.DetalleFacturaRepository;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {

    @Autowired
    private CabeceraFacturaRepository cabeceraFacturaRepository;
    
    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;
    
    public List<CabeceraFacturaEntity> buscarTodasCabecerasFactura() {
        return (List<CabeceraFacturaEntity>) this.cabeceraFacturaRepository.findAll();
    }
    
    public List<DetalleFacturaEntity> buscarTodosDetallesFactura() {
        return (List<DetalleFacturaEntity>) this.detalleFacturaRepository.findAll();
    }
    
    public List<DetalleFacturaEntity> buscarTodosDetallesFactura(Long idCabeceraFactura) {
        return this.detalleFacturaRepository.findByHeader(idCabeceraFactura);
    }

    public CabeceraFacturaEntity creac(CabeceraFacturaEntity cabecera) {
        return this.cabeceraFacturaRepository.save(cabecera);
    }

    public List<Client> gClientes() {
        return (List<Client>) this.ca.findAll();


        public CabeceraFacturaEntity buscarNit (String nit) {
        List<> clients = gClientes();
        return clients.stream()
                .filter(client -> Objects.equals(client.getNit(), nit))
                .findFirst()
                .orElse(new Client());
    }
}
