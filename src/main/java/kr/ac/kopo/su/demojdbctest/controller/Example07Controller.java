package kr.ac.kopo.su.demojdbctest.controller;

import kr.ac.kopo.su.demojdbctest.domain.Player;
import kr.ac.kopo.su.demojdbctest.domain.Team;
import kr.ac.kopo.su.demojdbctest.repository.PlayerRepository;
import kr.ac.kopo.su.demojdbctest.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "exam07")
public class Example07Controller
{
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamRepository teamRepository;



    @GetMapping
    public String requestInsert(Model model)
    {

        Team team = new Team();
        team.setName("Reject");
        teamRepository.save(team);

        Player player = new Player();
        player.setName("Leshar");
        player.setTeam(team);
        playerRepository.save(player);

        List<Player> playerList = playerRepository.findAll();
        List<Team> teamList = teamRepository.findAll();

        model.addAttribute("playerList", playerList);
        model.addAttribute("teamList", teamList);

        return "viewPage07";
    }

}
