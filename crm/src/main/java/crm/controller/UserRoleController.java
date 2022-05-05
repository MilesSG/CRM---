package crm.controller;

import crm.base.BaseController;
import crm.service.UserRoleService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * 乐字节：专注线上IT培训
 * 答疑老师微信：lezijie
 */
@Controller
public class UserRoleController extends BaseController {

    @Resource
    private UserRoleService userRoleService;
}
