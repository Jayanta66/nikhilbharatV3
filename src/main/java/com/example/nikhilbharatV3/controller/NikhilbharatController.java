package com.example.nikhilbharatV3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NikhilbharatController {
	
	@GetMapping
	String home() {
		return "index";
	}
	
	@GetMapping("/indexSlider") 
	public String indexSlider(Model model) {
		return "indexSlider"; 
		}
	@GetMapping("/indexPdfReader") 
	public String indexPdfReader(Model model) {
		return "indexPdfReader"; 
		}
	
	
	@GetMapping("/indexTutorials") 
	public String indexTutorials(Model model) {
		return "indexTutorials"; 
		}
	
	@GetMapping("/livechat") 
	public String livechat(Model model) {
		return "livechat"; 
		}
	@RequestMapping("/membership")
	public String membership() {
		return "membership";
	}
	@RequestMapping("/gallary")
	public String gallary() {
		return "gallary";
	}
	
	
	
	@RequestMapping("/aboutUs")
	public String aboutUs() {
		return "aboutUs";
	}
	
	@RequestMapping("/gallery_2")
	public String gallery_2() {
		return "gallary_2";
	}
	
	@RequestMapping("/indexVideolist")
	public String indexVideolist() {
		return "indexVideolist";
	}
	
	
	@RequestMapping("/aAndnVideolist")
	public String aAndnVideolist() {
		return "aAndnVideolist";
	}
	
	
	@RequestMapping("/anVideolist")
	public String anVideolist() {
		return "anVideolist";
	}
	
	
	@RequestMapping("/asmVideolist")
	public String asmVideolist() {
		return "asmVideolist";
	}
	
	
	@RequestMapping("/biharVideolist")
	public String biharVideolist() {
		return "biharVideolist";
	}
	
	@RequestMapping("/cgVideolist")
	public String cgVideolist() {
		return "cgVideolist";
	}
	
	
	@RequestMapping("/delhiVideolist")
	public String delhiVideolist() {
		return "delhiVideolist";
	}
	
	
	@RequestMapping("/gujratVideolist")
	public String gujratVideolist() {
		return "gujratVideolist";
	}
	
	
	@RequestMapping("/jhVideolist")
	public String jhVideolist() {
		return "jhVideolist";
	}
	
	@RequestMapping("/kaVideolist")
	public String kaVideolist() {
		return "kaVideolist";
	}
	
	
	@RequestMapping("/mhVideolist")
	public String mhVideolist() {
		return "mhVideolist";
	}
	
	
	@RequestMapping("/mpVideolist")
	public String mpVideolist() {
		return "mpVideolist";
	}
	
	
	@RequestMapping("/odVideolist")
	public String odVideolist() {
		return "odVideolist";
	}
	
	@RequestMapping("/teVideolist")
	public String teVideolist() {
		return "teVideolist";
	}
	
	
	@RequestMapping("/triVideolist")
	public String triVideolist() {
		return "triVideolist";
	}
	
	
	@RequestMapping("/ukVideolist")
	public String ukVideolist() {
		return "ukVideolist";
	}
	
	
	@RequestMapping("/upVideolist")
	public String upVideolist() {
		return "upVideolist";
	}
	
			
	@RequestMapping("/westBengalVideolist")
	public String westBengalVideolist() {
		return "westBengalVideolist";
	}
		
	
//######################################################################	
	@RequestMapping("/photos")
	public String photos() {
		return "photos";
	}
	
	@RequestMapping("/indexPhoto_gallary")
	public String indexPhoto_gallary() {
		return "indexPhoto_gallary";
	}
	
	
	
	@RequestMapping("/aAndnPhoto_gallary")
	public String aAnddPhoto_gallary() {
		return "aAndnPhoto_gallary";
	}

	
	@RequestMapping("/anPhoto_gallary")
	public String anPhoto_gallary() {
		return "anPhoto_gallary";
	}
	
	
	@RequestMapping("/asmPhoto_gallary")
	public String asmPhoto_gallary() {
		return "asmPhoto_gallary";
	}

	
	
	@RequestMapping("/biharPhoto_gallary")
	public String biharPhoto_gallary() {
		return "biharPhoto_gallary";
	}
	
	
	@RequestMapping("/cgPhoto_gallary")
	public String cgPhoto_gallary() {
		return "cgPhoto_gallary";
	}

	
	@RequestMapping("/delhiPhoto_gallary")
	public String delhiPhoto_gallary() {
		return "delhiPhoto_gallary";
	}
	
	
	@RequestMapping("/gujratPhoto_gallary")
	public String gujratPhoto_gallary() {
		return "gujratPhoto_gallary";
	}

	
	
	@RequestMapping("/jhPhoto_gallary")
	public String jhPhoto_gallary() {
		return "jhPhoto_gallary";
	}
	
	
	@RequestMapping("/kaPhoto_gallary")
	public String kaPhoto_gallary() {
		return "kaPhoto_gallary";
	}

	
	@RequestMapping("/mhPhoto_gallary")
	public String mhPhoto_gallary() {
		return "mhPhoto_gallary";
	}
	
	
	@RequestMapping("/mpPhoto_gallary")
	public String mpPhoto_gallary() {
		return "mpPhoto_gallary";
	}

	
	
	@RequestMapping("/odPhoto_gallary")
	public String odPhoto_gallary() {
		return "odPhoto_gallary";
	}
	
	@RequestMapping("/tePhoto_gallary")
	public String tePhoto_gallary() {
		return "tePhoto_gallary";
	}

	
	@RequestMapping("/triPhoto_gallary")
	public String triPhoto_gallary() {
		return "triPhoto_gallary";
	}
	
	
	@RequestMapping("/ukPhoto_gallary")
	public String ukPhoto_gallary() {
		return "ukPhoto_gallary";
	}

	
	
	@RequestMapping("/upPhoto_gallary")
	public String upPhoto_gallary() {
		return "upPhoto_gallary";
	}
	
	@RequestMapping("/westBengalPhoto_gallary")
	public String westBengalPhoto_gallary() {
		return "westBengalPhoto_gallary";
	}

//##############################################################	
	
	
	@RequestMapping("/westBengal")
	public String westBengal() {
		return "westBengal";
	}

	@RequestMapping("/gujrat")
	public String gujrat() {
		return "gujrat";
	}
	

	@RequestMapping("/bihar")
	public String bihar() {
		return "bihar";
	}
	
	@RequestMapping("/delhi")
	public String delhi() {
		return "delhi";
	}
	
	@RequestMapping("/cg")
	public String cg() {
		return "cg";
	}
	
	@RequestMapping("/od")
	public String od() {
		return "od";
	}
	

	@RequestMapping("/an")
	public String an() {
		return "an";
	}
	
	@RequestMapping("/te")
	public String te() {
		return "te";
	}
	
	@RequestMapping("/aAndn")
	public String aAndn() {
		return "aAndn";
	}
	
	@RequestMapping("/mh")
	public String mh() {
		return "mh";
	}
	

	@RequestMapping("/ka")
	public String ka() {
		return "ka";
	}
	
	@RequestMapping("/asm")
	public String asm() {
		return "asm";
	}
	
	@RequestMapping("/tri")
	public String tri() {
		return "tri";
	}
	
	@RequestMapping("/jh")
	public String jh() {
		return "jh";
	}
	

	@RequestMapping("/up")
	public String up() {
		return "up";
	}
	
	@RequestMapping("/uk")
	public String uk() {
		return "uk";
	}
	
	
	@RequestMapping("/mp")
	public String mp() {
		return "mp";
	}
	


}
