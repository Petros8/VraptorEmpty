package br.com.fabrica.vraptorempty.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.vraptor.Result;

public class GenericController {
	
	@Inject
	protected Result result;
	@Inject
	protected HttpServletResponse response;
	@Inject
	protected HttpServletRequest request;
	
	
}
