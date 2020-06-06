package com.zegames.entities;

import com.zegames.main.Game;
import com.zegames.world.World;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Entity{
    public boolean isPressed = false;

    public Player(int x, int y, int width, int height,double speed,BufferedImage sprite) {
        super(x, y, width, height,speed,sprite);
    }

    public void tick() {
        depth = 2;

        if (!isPressed) {
            y++;
        } else {
            if (y > 0) {
                y--;
            }
        }

        if (y > Game.HEIGHT) {
            World.restartGame();
        }

        for (int i = 0; i < Game.entities.size(); i++) {
            Entity entity = Game.entities.get(i);

            if (entity != this) {
                if (Entity.isColidding(this, entity)) {
                    World.restartGame();
                    return;
                }
            }
        }
    }
}
