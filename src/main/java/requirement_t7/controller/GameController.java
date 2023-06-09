package requirement_t7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import requirement_t7.model.Game;

@RestController
public class GameController {

    @Autowired
    private Game game;

    @RequestMapping(value = "/execute",method = RequestMethod.POST)
    public String execute(){
        return game.execute();
    }

    @RequestMapping(value = "/compile",method = RequestMethod.POST)
    public String compile(){
        game.setInputClassName("InputClass");
        game.setInputTestClassName("InputTestClass");
        return game.compile();
    }
}
