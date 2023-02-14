package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.modelo.Actividad;
import com.example.demo.modelo.ActividadGrupoMonitor;
import com.example.demo.modelo.Grupo;
import com.example.demo.modelo.Monitor;
import com.example.demo.repo.ActividadGrupoMonitorRepository;
import com.example.demo.repo.ActividadRepository;
import com.example.demo.repo.GrupoRepository;
import com.example.demo.repo.MonitorRepository;

@SpringBootTest
class Jpah2Ternaria2307ApplicationTests {
	@Autowired
	private ActividadRepository actividadRepository;
	@Autowired
	private  GrupoRepository grupoRepository;
	@Autowired
	private MonitorRepository monitorRepository;
	@Autowired
	private ActividadGrupoMonitorRepository actividadGrupoMonitorRepository;
	

	@Test
	void contextLoads() {
		Actividad actividad=new Actividad("asustar pollos");
		Actividad actividad2=new Actividad("pescar trucha y sacar tripa");
		Grupo grupo=new Grupo("Los pelaos");
		Monitor monitor=new Monitor("el soso de valladolid");
		Monitor monitor2=new Monitor("el aullador");
		actividadRepository.save(actividad);
		actividadRepository.save(actividad2);
		grupoRepository.save(grupo);
		monitorRepository.save(monitor);
		monitorRepository.save(monitor2);
		actividadGrupoMonitorRepository.save(new ActividadGrupoMonitor(actividad, grupo, monitor));
		actividadGrupoMonitorRepository.save(new ActividadGrupoMonitor(actividad2, grupo, monitor));
		actividadGrupoMonitorRepository.save(new ActividadGrupoMonitor(actividad, grupo, monitor2));
		
	}
}
