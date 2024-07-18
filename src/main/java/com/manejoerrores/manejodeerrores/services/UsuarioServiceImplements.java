package com.manejoerrores.manejodeerrores.services;

import com.manejoerrores.manejodeerrores.models.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImplements implements UsuarioService {

    private List<Usuario> lista;

    public UsuarioServiceImplements() {
        this.lista = new ArrayList<>();
        lista.add(new Usuario("Luis", "Amador", 1));
        lista.add(new Usuario("Lui", "Amado", 1));
        lista.add(new Usuario("Lu", "Amad", 1));
        lista.add(new Usuario("L", "Ama", 1));
        lista.add(new Usuario("Luis", "Am", 1));
        lista.add(new Usuario("Luis", "A", 1));
    }

    @Override
    public List<Usuario> listar() {
        return this.lista;
    }

    @Override
    public Usuario listarPorId(Integer id) {
        Usuario resultado = null;

        for (Usuario u : lista) {
            if (u.getId().equals(id)) ;
            resultado = u;
            break;
        }
        return resultado;
    }

}
