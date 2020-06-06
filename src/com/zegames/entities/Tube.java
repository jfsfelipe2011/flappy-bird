package com.zegames.entities;

import com.zegames.main.Game;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tube extends Entity {

    public Tube(double x, double y, int width, int height, double speed, BufferedImage sprite) {
        super(x, y, width, height, speed, sprite);
    }

    @Override
    public void tick() {
        x--;

        if (x + width <= 0) {
            Game.score += 0.5;
            Game.entities.remove(this);
        }
    }

    @Override
    public void render(Graphics g) {
        if (sprite != null) {
            g.drawImage(sprite, this.getX(), this.getY(), width, height, null);
        } else {
            g.setColor(Color.GREEN);
            g.fillRect(getX(), getY(), width, height);
        }
    }
}
