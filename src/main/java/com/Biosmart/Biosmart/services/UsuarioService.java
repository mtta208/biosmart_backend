package com.Biosmart.Biosmart.services;

import java.util.ArrayList;
import java.util.Optional;

import com.Biosmart.Biosmart.models.UsuarioModel;
import com.Biosmart.Biosmart.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public UsuarioModel login(
        String correo,
        String contrasena
) {

    ArrayList<UsuarioModel> listaUsuarios =
            (ArrayList<UsuarioModel>)
                    usuarioRepository.findAll();

    for (UsuarioModel usuario : listaUsuarios) {

        if (
                usuario.getCorreo() != null
                &&
                usuario.getContrasena() != null
                &&
                usuario.getCorreo().equals(correo)
                &&
                usuario.getContrasena().equals(contrasena)
        ) {

            return usuario;
        }
    }

    return null;
}
    public Optional<UsuarioModel> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public UsuarioModel obtenerPorCorreo(String correo) {
        return usuarioRepository.findByCorreo(correo);
    }

    public boolean eliminarUsuario(Long id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}