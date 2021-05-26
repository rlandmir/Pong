import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class Game {

    JFrame frame;
    Board board;

    public Game(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("pong");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        board = new Board();
        frame.add(board);
        frame.addKeyListener(this);

        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void KeyType(KeyEvent KeyEvent) {

    }
    @Override
    public void KeyPressed(KeyEvent KeyEvent) {
        if(KeyEvent.getKeyCode() == KeyEvent.vk_up){
            board.playerup();
        }
        if(KeyEvent.getKeyCode() == KeyEvent.vk_DOWN){
            board.playerDOWN();
        }
}

    @Override
    public voide KeyReleased(KeyEvent KeyEvent) {

    }
    public static voide main(String[] args) {

        Game game = new Game();
        game.board.init();
    }
}



// 1. Paint it! - Get stuff to show up
// 2. Move it! - Get stuff Moving
// 3. interactions - What happens when stuff collides ?
// 4. Gamify - Adding a score, lives, levels .....
// 5. Prettify - Add images, add menus...
