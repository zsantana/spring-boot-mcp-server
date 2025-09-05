package com.example.mcpserver;

import java.util.List;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class FluxosService {

    @Tool(description = "Obtem a lista de fluxos cadastrados")
	public List<String> obterListaFluxos() {
		return List.of(
			"SERV001",
			"SERV002",
			"SERV003",
			"SERV004",
			"SERV005",
			"SERV006",
			"SERV007",
			"SERV008",
			"SERV009",
			"SERV010"
		);
	}
}
