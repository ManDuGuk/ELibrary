package egovframework.let.elibrary.web;

import java.util.Map;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.let.cop.bbs.service.BoardVO;
import egovframework.let.cop.bbs.service.EgovBBSManageService;
import egovframework.let.elibrary.service.ElibraryService;
import egovframework.let.elibrary.service.ElibraryVO;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
public class ElibraryController {

	@Resource(name="elibraryService")
	private ElibraryService elibraryService;
	
	@RequestMapping(value="/home.do")
	public String home(@ModelAttribute("searchVO") ElibraryVO searchVO,HttpServletRequest request,ModelMap model) throws Exception{
		return "elibrary/Home";
	}
	
	
	@RequestMapping(value="/news.do")
	public String news(@ModelAttribute("searchVO") ElibraryVO searchVO,HttpServletRequest request,ModelMap model) throws Exception{
		return "elibrary/news";
	}
	
}