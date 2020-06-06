package com.zegames.world;

import com.zegames.entities.Entity;
import com.zegames.entities.Tube;
import com.zegames.main.Game;

public class TubeGenerator {
    public int time = 0;
    public int targetTime = 60;

    public void tick() {
        time++;

        if (time == 60) {
            int altura1 = Entity.rand.nextInt(70 - 30) + 30;
            Tube tube1 = new Tube(Game.WIDTH, 0, 20, altura1, 1,Game.spritesheet.getSprite(32, 0, 16, 16));

            Game.entities.add(tube1);

            int altura2 = Entity.rand.nextInt(70 - 30) + 30;
            Tube tube2 = new Tube(Game.WIDTH, Game.HEIGHT - altura2, 20, altura2, 1,Game.spritesheet.getSprite(16, 0, 16, 16));

            Game.entities.add(tube2);

            time = 0;
        }
    }
}
