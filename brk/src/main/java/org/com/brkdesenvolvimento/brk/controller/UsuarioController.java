package org.com.brkdesenvolvimento.brk.controller;



import javax.validation.Valid;

import org.com.brkdesenvolvimento.brk.models.Usuario;
import org.com.brkdesenvolvimento.brk.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;


@PostMapping("/cadastrar")
public ResponseEntity<Usuario> postUsuario(@Valid @RequestBody Usuario email) {

	return usuarioService.cadastrarUsuario(email)
			.map(resposta -> ResponseEntity.status(HttpStatus.CREATED).body(resposta))
			.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());

	}
	
}


//	
//	@Autowired
//	private UsuarioRepository usuarioRepository;

//	@GetMapping("/all")
//	public ResponseEntity<List<Usuario>> getAll() {
//
//		return ResponseEntity.ok(usuarioRepository.findAll());
//
//	}
//
//	@GetMapping("/{id}")
//	public ResponseEntity<Usuario> getById(@PathVariable Long id) {
//		return usuarioRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
//				.orElse(ResponseEntity.notFound().build());
//	}
//}

//	
//	@PostMapping
//	public ResponseEntity<UserLogin> login(@RequestBody Optional<UserLogin> usuarioLogin) {
//		return UsuarioService.autenticarUsuario(UserLogin).map(resposta -> ResponseEntity.ok(resposta))
//				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
//	}
//
//	@PostMapping("/cadastrar")
//	public ResponseEntity<Usuario> postUsuario(@Valid @RequestBody Usuario usuario) {
//
//		return UsuarioService.cadastrarUsuario(usuario)
//				.map(resposta -> ResponseEntity.status(HttpStatus.CREATED).body(resposta))
//				.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
//
//	}
//
//	@PutMapping("/atualizar")
//	public ResponseEntity<Usuario> putUsuario(@Valid @RequestBody Usuario usuario) {
//		return usuarioService.atualizarUsuario(usuario)
//				.map(resposta -> ResponseEntity.status(HttpStatus.OK).body(resposta))
//				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
//	}
//
//}

//	
//	@Autowired
//	private UsuarioRepository usuarioRepository;

//	@GetMapping("/all")
//	public ResponseEntity<List<Usuario>> getAll() {
//
//		return ResponseEntity.ok(usuarioRepository.findAll());
//
//	}
//
//	@GetMapping("/{id}")
//	public ResponseEntity<Usuario> getById(@PathVariable Long id) {
//		return usuarioRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
//				.orElse(ResponseEntity.notFound().build());
//	}
//}

//	
//	@PostMapping
//	public ResponseEntity<UserLogin> login(@RequestBody Optional<UserLogin> usuarioLogin) {
//		return UsuarioService.autenticarUsuario(UserLogin).map(resposta -> ResponseEntity.ok(resposta))
//				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
//	}
//
//	@PostMapping("/cadastrar")
//	public ResponseEntity<Usuario> postUsuario(@Valid @RequestBody Usuario usuario) {
//
//		return UsuarioService.cadastrarUsuario(usuario)
//				.map(resposta -> ResponseEntity.status(HttpStatus.CREATED).body(resposta))
//				.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
//
//	}
//
//	@PutMapping("/atualizar")
//	public ResponseEntity<Usuario> putUsuario(@Valid @RequestBody Usuario usuario) {
//		return usuarioService.atualizarUsuario(usuario)
//				.map(resposta -> ResponseEntity.status(HttpStatus.OK).body(resposta))
//				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
//	}
//
//}