package io.tracker.pk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.tracker.pk.models.LocationStats;
import io.tracker.pk.service.CoronaVirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	CoronaVirusDataService coronaVirusDataService;
	
	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allstats = coronaVirusDataService.getAllstats();
		int totalReportedCases = allstats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
		int totalNewCases = allstats.stream().mapToInt(stat -> stat.getDiffFromPervDay()).sum();
		model.addAttribute("totalNewCases", totalNewCases);
		model.addAttribute("locationStats", allstats);
		model.addAttribute("totalReportedCases", totalReportedCases);
		return "home";
	}
}
