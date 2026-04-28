package ru.samsung.gamestudio.objects;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import java.util.Random;

import ru.samsung.gamestudio.GameSettings;

public class StarObject extends TrashObject {

    private static final int paddingHorizontal = 30;

    public StarObject(String texturePath, int width, int height, World world) {
        super(
                width, height,
                texturePath,
                world
        );

        body.setLinearVelocity(new Vector2(0, -GameSettings.TRASH_VELOCITY));
    }

}
