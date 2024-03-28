package co.com.ps.javaii.controller;

import co.com.ps.javaii.model.TipoDocumento;
import co.com.ps.javaii.service.ITipoDocumentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-documento")
@RequiredArgsConstructor
public class TipoDocumentoController {

    private final ITipoDocumentoService tipoDocumentoService;


    @GetMapping
    public ResponseEntity<List<TipoDocumento>>   getTipoDocumento(){
        return ResponseEntity.ok(tipoDocumentoService.getTipoDocumento());
    }

    @PostMapping
    public ResponseEntity<TipoDocumento> saveTipoDocumento(@RequestBody TipoDocumento tipoDocumento){
        return ResponseEntity.ok(tipoDocumentoService.saveTipoDocumento(tipoDocumento));
    }

    @PutMapping
    public ResponseEntity<TipoDocumento> updateTipoDocumento(@RequestBody TipoDocumento tipoDocumento){
        return ResponseEntity.ok(tipoDocumentoService.updateTipoDocumento (tipoDocumento));
    }

    @DeleteMapping("{id} ")
    public ResponseEntity <TipoDocumento> deleteTipoDocumento(@PathVariable Long id){
        tipoDocumentoService.deleteTipoDocumento (id);
        return ResponseEntity.ok(null);

    }

}
