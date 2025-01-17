package com.persona.Backend.Controller.Security;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persona.Backend.Controller.BaseController;
import com.persona.Backend.Entity.Security.VistasRoles;

@CrossOrigin("*")//permite que cualquier dominio tenga acceso a el
@RestController
@RequestMapping("/api/v1/base/security/vistas_roles")
public class VistasRolesController extends BaseController<VistasRoles>{

}
