package co.com.ps.javaii.service;

import co.com.ps.javaii.model.TipoDocumento;
import java.util.List;

public interface ITipoDocumentoService{


    List<TipoDocumento> getTipoDocumento();

    public class TipoDocumentoService {

        public List<TipoDocumento> getTipoDocumento();

        public TipoDocumento saveTipoDocumento(TipoDocumento tipoDocumento) {

        public TipoDocumento updateTipoDocumento(TipoDocumento tipoDocumento) {

        public void DeleteTipoDocumento(Long id) {
            tipoDocumentoRepository.delete(id);

        }
    }}
