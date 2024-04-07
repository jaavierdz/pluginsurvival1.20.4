package cs.javierdz.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class deathListener implements Listener {
    public void onDeath(PlayerDeathEvent event){
        Player player = event.getEntity().getPlayer();
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();
        Objective objective = board.getObjective("muertes");
        Score score = objective.getScore(player);
        int currentScore = objective.getScore(player).getScore();
        objective.getScore(player).setScore(currentScore + 1);


    }
}
