package com.jonas.CiutatsLlista.controller;//package com.example.jonas.demo.controller;
//
//import com.example.jonas.demo.model.Repositoris.CiutatRepository;
//import com.example.jonas.demo.model.Entitats.Ciutat;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/ciutat")
//public class CiutatController {
//    @Autowired
//    CiutatRepository ciutatRepository;
//     @GetMapping
//    public ResponseEntity<Ciutat> obtenirCiutatperId(@PathVariable(value="id")Long id){
//         Optional<Ciutat> ciutat = ciutatRepository.findById(id);
//         if (ciutat.isPresent()){
//             return ResponseEntity.ok().body(ciutat.get());
//         }else {
//             return ResponseEntity.notFound().build();
//         }
//     }
//
//     @PostMapping
//
//    public Ciutat crearCiutat(@RequestBody Ciutat ciutat){
//         return ciutatRepository.save(ciutat);
//     }
//
//    @DeleteMapping("/{id}")
//    public  void eliminarCiutat(@PathVariable Long id){
//        ciutatRepository.deleteById(id);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Ciutat> actualizarCiutat(@PathVariable Long id, @RequestBody Ciutat ciutatActualizada) {
//        Optional<Ciutat> optionalCiutat = ciutatRepository.findById(id);
//
//        if(optionalCiutat.isPresent()) {
//            Ciutat ciutat = optionalCiutat.get();
//            ciutat.setNom(ciutatActualizada.getNom());
//            ciutat.setPoblacio(ciutatActualizada.getPoblacio());
//            ciutat.setDescripcio(ciutatActualizada.getDescripcio());
//            ciutat.setImatge(ciutatActualizada.getImatge());
//
//            return ResponseEntity.ok().body(ciutatRepository.save(ciutat));
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//}
