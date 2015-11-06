package cn.infisa.base.web.security;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.infisa.base.entity.security.DataPermission;
import cn.infisa.base.service.security.SecurityService;
/**
 * 角色相关的crud操作
 * @author libo libo@infisa.cn
 * @since 2014年10月14日 下午3:00:35
 */
@Controller
@RequestMapping(value = "/security/data-permission")
public class DataPermissionController {

	private final static Logger logger = LoggerFactory.getLogger(DataPermissionController.class);
	private static final String URL_BASE = "/security/data-permission/";
	@Autowired
	private  SecurityService securityService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView execute(Model model){
		model.addAttribute("list", securityService.getAllDataPermissions());
		return new ModelAndView(URL_BASE+"list");
	}
	
	@RequestMapping(value="create",method=RequestMethod.GET)
	public ModelAndView create(Model model){
		//model.addAttribute("entity",entity);//存入一个实体对象
		return new ModelAndView(URL_BASE+"input");
	}
	
	@RequestMapping(value="save",method = RequestMethod.POST)
	public ModelAndView save(@Valid DataPermission entity, RedirectAttributes redirectAttributes){
		securityService.saveDataPermission(entity);
		redirectAttributes.addFlashAttribute("message", "保存用户" + entity.getName() + "成功");
		return new ModelAndView("redirect:"+URL_BASE);
	}
	
	@RequestMapping(value="delete/{id}",method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") Long id, Model model){
		securityService.deleteDataPermission(id);
		return new ModelAndView("redirect:"+URL_BASE);
	}
	
	@RequestMapping(value="update/{id}",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") Long id, Model model){
		model.addAttribute("entity",securityService.getDataPermission(id));//存入一个实体对象
		return new ModelAndView(URL_BASE+"input");
	}
}
