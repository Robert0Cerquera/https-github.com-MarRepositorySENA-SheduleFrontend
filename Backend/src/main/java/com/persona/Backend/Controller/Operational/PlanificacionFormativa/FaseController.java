package com.persona.Backend.Controller.Operational.PlanificacionFormativa;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persona.Backend.Controller.BaseController;
import com.persona.Backend.Entity.Operational.PlanificacionFormativa.Fase;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/base/operational/planificacion_formativa/fase")
public class FaseController extends BaseController<Fase> {

}
