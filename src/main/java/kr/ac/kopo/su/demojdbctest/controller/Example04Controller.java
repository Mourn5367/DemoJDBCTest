package kr.ac.kopo.su.demojdbctest.controller;

import kr.ac.kopo.su.demojdbctest.domain.Member;
import kr.ac.kopo.su.demojdbctest.repository.MemberRepository03;
import kr.ac.kopo.su.demojdbctest.repository.MemberRepository04;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/exam04")
public class Example04Controller
{
    @Autowired
    MemberRepository04 repository;

    @GetMapping
    public String viewHomepage(Model model)
    {
        Iterable<Member> memberList = repository.selectMethod();
        model.addAttribute("memberList", memberList);
        return "viewPage04";
    }

    @GetMapping("/new")
    public String newMember(Model model)
    {
        model.addAttribute("member", new Member());
        return "viewPage04_";
    }
    @PostMapping("/insert")
    public String insertMethod(@ModelAttribute("member") Member member)
    {
        repository.insertMethod(member);
        return "redirect:/exam04";
    }

    @GetMapping("/edit/{id}")
    public String editMethod(@PathVariable(name = "id")int id, Model model)
    {
        Member member = repository.selectMethodById(id);
        model.addAttribute("member", member);
        return "viewPage04__";
    }

    @PostMapping("/update")
    public String updateMethod(@ModelAttribute("member") Member member)
    {
        repository.updateMethod(member);
        return "redirect:/exam04";
    }
    @GetMapping("/delete/{id}")
    public String editMethod(@PathVariable(name = "id")int id)
    {
        repository.deleteMethod(id);
        return "redirect:/exam04";
    }

}
