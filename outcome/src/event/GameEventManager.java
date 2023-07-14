package event;

import entity.player.Player;
import entity.tile.Tile;
import gfx.Renderer;
import map.Tilemap;

public final class GameEventManager {

    private Tilemap tilemap = new Tilemap(this, new int[] {0, 0});
    public Player player = new Player(0, 0, this);

    public GameEventManager() {
        
        this.tilemap.createTiles();
        System.out.println(this.tilemap.getTiles().size());

    }


    
    public final void init() {

        // 

    }



    public final void update() {

        this.player.update();

    }



    public final void draw() {

        Renderer.clear(0x000000);
        
        for (Tile tile : this.tilemap.getTiles()) {
            
            Renderer.drawImage(tile.image, tile.x, tile.y);

        }

        this.player.draw();

    }
    
}
