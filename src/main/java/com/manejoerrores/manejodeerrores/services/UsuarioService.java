package com.manejoerrores.manejodeerrores.services;

import com.manejoerrores.manejodeerrores.models.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> listar();
    public Usuario listarPorId(Integer id);
}
