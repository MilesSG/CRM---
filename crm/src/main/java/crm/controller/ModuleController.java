package crm.controller;

import crm.base.BaseController;
import crm.base.ResultInfo;
import crm.model.TreeModel;
import crm.service.ModuleService;
import crm.vo.Module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 乐字节：专注线上IT培训
 * 答疑老师微信：lezijie
 */
@RequestMapping("module")
@Controller
public class ModuleController extends BaseController {

    @Resource
    private ModuleService moduleService;


    /**
     * 查询所有的资源列表
     *
     *
     * 乐字节：专注线上IT培训
     * 答疑老师微信：lezijie
     * @param
     * @return java.util.List<com.xxxx.crm.model.TreeModel>
     */
    @RequestMapping("queryAllModules")
    @ResponseBody
    public List<TreeModel> queryAllModules(Integer roleId) {
        return moduleService.queryAllModules(roleId);
    }


    /***
     * 进入授权页面
     *
     *
     * 乐字节：专注线上IT培训
     * 答疑老师微信：lezijie
     * @param roleId
     * @return java.lang.String
     */
    @RequestMapping("toAddGrantPage")
    public String toAddGrantPage(Integer roleId, HttpServletRequest request) {
        // 将需要授权的角色ID设置到请求域中
        request.setAttribute("roleId", roleId);
        return "role/grant";
    }


    /***
     * 查询资源列表
     *
     *
     * 乐字节：专注线上IT培训
     * 答疑老师微信：lezijie
     * @param
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    @RequestMapping("list")
    @ResponseBody
    public Map<String,Object>  queryModuleList() {
        return moduleService.queryModuleList();
    }


    /***
     * 进入资源管理页面
     *
     *
     * 乐字节：专注线上IT培训
     * 答疑老师微信：lezijie
     * @param
     * @return java.lang.String
     */
    @RequestMapping("index")
    public String index() {
        return "module/module";
    }


    /**
     * 添加资源
     *
     *
     * 乐字节：专注线上IT培训
     * 答疑老师微信：lezijie
     * @param module
     * @return com.xxxx.crm.base.ResultInfo
     */
    @PostMapping("add")
    @ResponseBody
    public ResultInfo addModule(Module module) {

        moduleService.addModule(module);
        return success("添加资源成功！");
    }


    /**
     * 修改资源
     *
     *
     * 乐字节：专注线上IT培训
     * 答疑老师微信：lezijie
     * @param module
     * @return com.xxxx.crm.base.ResultInfo
     */
    @PostMapping("update")
    @ResponseBody
    public ResultInfo updateModule(Module module) {

        moduleService.updateModule(module);
        return success("修改资源成功！");
    }


    /**
     * 删除资源
     *
     *
     * 乐字节：专注线上IT培训
     * 答疑老师微信：lezijie
     * @param id
     * @return com.xxxx.crm.base.ResultInfo
     */
    @PostMapping("delete")
    @ResponseBody
    public ResultInfo deleteModule(Integer id) {

        moduleService.deleteModule(id);
        return success("删除资源成功！");
    }


    /**
     * 打开添加资源的页面
     *
     *
     * 乐字节：专注线上IT培训
     * 答疑老师微信：lezijie
     * @param grade 层级
     * @param parentId  父菜单ID
     * @return java.lang.String
     */
    @RequestMapping("toAddModulePage")
    public String toAddModulePage(Integer grade, Integer parentId, HttpServletRequest request) {
        // 将数据设置到请求域中
        request.setAttribute("grade", grade);
        request.setAttribute("parentId", parentId);

        return "module/add";
    }


    /**
     * 打开修改资源的页面
     *
     *
     * 乐字节：专注线上IT培训
     * 答疑老师微信：lezijie
     * @param id
     * @return java.lang.String
     */
    @RequestMapping("toUpdateModulePage")
    public String toUpdateModulePage(Integer id, Model model) {
        // 将要修改的资源对象设置到请求域中
        model.addAttribute("module", moduleService.selectByPrimaryKey(id));
        return "module/update";
    }
}
