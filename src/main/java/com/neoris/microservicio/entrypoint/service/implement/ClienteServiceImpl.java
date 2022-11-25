package com.neoris.microservicio.entrypoint.service.implement;

import com.neoris.microservicio.crosscuting.constants.Constants;
import com.neoris.microservicio.crosscuting.exception.ValidationException;
import com.neoris.microservicio.domain.Cliente;
import com.neoris.microservicio.entrypoint.service.ClienteService;
import com.neoris.microservicio.jpa.entity.UsuarioDao;
import com.neoris.microservicio.jpa.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioDao getAllUsers() {
        return usuarioRepository.findAll().stream().findFirst().get();
    }

    @Override
    public ResponseEntity<UsuarioDao> createClient(Cliente cliente) {

        UsuarioDao usuario = new UsuarioDao();
        usuario.setNames(cliente.getNombre());
        usuario.setIdUser(cliente.getIdentificacion());
        usuario.setPassword(cliente.getContrasena());
        usuario.setAddress(cliente.getDireccion());
        usuario.setAge(cliente.getEdad());
        usuario.setStatus(Constants.TRUE);
        usuarioRepository.save(usuario);

        return ResponseEntity.ok(usuario);
    }

    @Override
    public ResponseEntity<UsuarioDao> updateClient(Long id, Cliente cliente) {

        UsuarioDao user = usuarioRepository.findByIdUser(id)
                .orElseThrow(()-> new ValidationException("Client not exist with id: " + id));
        if(cliente.getNombre() != null)
            user.setNames(cliente.getNombre());
        if(cliente.getEdad()!= null)
            user.setPassword(cliente.getContrasena());
        if(cliente.getTelefono() != null)
            user.setAge(cliente.getEdad());
        if(cliente.getDireccion() != null)
            user.setAddress(cliente.getDireccion());
        if(cliente.isEstado())
            user.setStatus(String.valueOf(cliente.isEstado()));

        usuarioRepository.save(user);

        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<UsuarioDao> deleteClient(Long id) {

        UsuarioDao user = usuarioRepository.findByIdUser(id)
                .orElseThrow(()-> new ValidationException("Client not exist with id: " + id));
        usuarioRepository.delete(user);
        return ResponseEntity.ok(user);
    }
}
