package com.neoris.microservicio.entrypoint.service.implement;


import com.neoris.microservicio.crosscuting.exception.ValidationException;
import com.neoris.microservicio.domain.Cuenta;
import com.neoris.microservicio.entrypoint.service.CuentaService;
import com.neoris.microservicio.jpa.entity.CuentaDao;
import com.neoris.microservicio.jpa.entity.UsuarioDao;
import com.neoris.microservicio.jpa.repository.CuentaRepository;
import com.neoris.microservicio.jpa.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CuentaServiceImpl implements CuentaService {

    private final CuentaRepository cuentaRepository;
    private final UsuarioRepository usuarioRepository;

    @Override
    public ResponseEntity<CuentaDao> createAccount(Long id,Cuenta cuenta) {
        UsuarioDao user = findUser(id);
        CuentaDao cuentaDao = new CuentaDao();
        cuentaDao.setAccountNumber(cuenta.getNumeroCuenta());
        cuentaDao.setType(cuenta.getTipoCuenta());
        cuentaDao.setBalance(cuenta.getSaldoInicial());
        cuentaDao.setUsuario(user.getId().toString());
        cuentaRepository.save(cuentaDao);
        return ResponseEntity.ok(cuentaDao);
    }

    @Override
    public ResponseEntity<CuentaDao> updateAccount(Long id, Cuenta cuenta) {
        return null;
    }

    @Override
    public ResponseEntity<CuentaDao> deleteAccount(int number) {
        CuentaDao cuenta = findAccount(number);
        cuentaRepository.delete(cuenta);
        return ResponseEntity.ok(cuenta);
    }

    public UsuarioDao findUser(Long id){
        return usuarioRepository.findByIdUser(id)
                .orElseThrow(()-> new ValidationException("Client not exist with id: " + id));
    }

    public CuentaDao findAccount(int number){
        return cuentaRepository.findByAccountNumber(number)
                .orElseThrow(()-> new ValidationException("Account doesnt exist" + number));
    }
}
