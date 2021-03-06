package deu.team.jsp.nowBookStatus;

import deu.team.jsp.interceptor.CheckSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class NowBookStatusController {

    @Autowired
    NowBookStatusService nowBookStatusService;

    @CheckSession
    @GetMapping("/nowLabStatusPage")
    public String nowBookStatus(HttpServletRequest request, Model model){
        model.addAttribute("seats", nowBookStatusService.nowBookStatus(request,model));
        return "WEB-INF/student/nowLabStatus.jsp";
    }

}
