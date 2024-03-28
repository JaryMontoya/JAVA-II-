package co.com.ps.javaii.service;

import co.com.ps.javaii.model.TipoDocumento;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoDocumentoService implements ITipoDocumentoService {

    private final TipoDocumentoRepository tipoDocumentoRepository;

    @Override
    public List<TipoDocumento> getTipoDocumento() {
        return tipoDocumentoRepository;
    }


   }
   @Override
  public void deleteTipoDocumento();








