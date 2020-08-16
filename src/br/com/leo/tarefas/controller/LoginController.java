package br.com.leo.tarefas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.leo.tarefas.dao.JdbcUsuarioDao;
import br.com.leo.tarefas.modelo.Usuario;

@Controller
public class LoginController {
	
	@RequestMapping("loginForm")
	public String loginForm() {
		return "formulario-login";
	}
	
	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
		if (new JdbcUsuarioDao().existeUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "menu";
		}
		return "redirect:loginForm";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:loginForm";
	}
}