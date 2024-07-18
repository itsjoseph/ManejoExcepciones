package com.manejoerrores.manejodeerrores.cotrollers;

import com.manejoerrores.manejodeerrores.models.Usuario;
import com.manejoerrores.manejodeerrores.services.UsuarioService;
import com.manejoerrores.manejodeerrores.services.UsuarioServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AppController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/index")
    public String index(Model model) {
        Integer valor = 1000 / 0;
        return "index";
    }


    @GetMapping("/ver/{id}")
    public String obtenerId(@PathVariable Integer id, Model model) {
        Usuario usuario = usuarioService.listarPorId(id);
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo","Detalle usuario: ".concat(usuario.getNombre()));
        return "ver";
    }
}
