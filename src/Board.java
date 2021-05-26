import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Board extends JPanel implements ActionListener {

    final int BALLD = 20, PADDLEW = 20, PADDLEH = 80, BORDER = 10;

    int ballX = 0, ballY = 0, paddleCX = 0, paddleCY = 0, paddlePX = 0, paddlePy = 0;
    int ballDX = 3, ballDY = 4, paddlePDY = 10, paddleCDY = 3;
    Timer timer;
}

    public Board(){
    setPreferredSize(new Dimension(800, 600));
    setBackground(Color.BLACK);
    timer = new Timer(1000/60, this);
    }

    public void init() {
        ballX = getWidth() / 2 - BALLD / 2;
        ballY = getHeight() / 2 - BALLD / 2;

        paddlePX = 0 + BORDER;
        paddlePy = getHeight() / 2 - PADDLEH / 2;

        paddleCX = getWidth() - BORDER - PADDLEW;
        paddleCY = getHeight() / 2 - PADDLEH / 2;
        timer.start();
    }
    public void checkCollision() {

        Rectangle paddle1 = new Rectangle(paddlePX, paddlePy, PADDLEW, PADDLEH);
        Rectangle paddle2 = new Rectangle(paddlePX, paddlePy, PADDLEW, PADDLEH);
        Rectangle ball = new Rectangle(ballX, ballY, BALLD, BALLD);

        if (ball.intersects(paddle1) || ball.intersects(paddle2)) {
            ballDX *= -1;
        }
        if (playerscore >= 10 || computerScore >= 10) {
            timer.stop()

        }

        public void move () {
            if (ballX + BALLD >= getWidth() || ballX <= 0) {
                ballDX *= -1;
            }
            if (ballY + BALLD >= getWidth() || ballY <= 0) {
                ballDX *= -1;
            }
            ballX += ballDX;
            ballY += ballDY;

            boolen Menu = false, PLAY = True, GAMEOVER = false

            public void Board () {
                setPreferredSize(new Dimension(800, 600));
                setBackground(Color.BLACK);
            }

            public void move () {
                if (ballX + BALLD >= getWidth() || ballX <= 0) {
                    ballDX *= -1;
                }
                if (ballY + BALLD >= getHeight() || ballY <= 0) {
                    ballDY *= -1;
                }
                ballX += ballDX;
                ballY += ballDY;

                if (ballX + BALLD / 2 > getWidth() / 2) {
                    if (ballY > paddleCY + PADDLEH / 2) {
                        paddleCY += paddleCDY;
                    }
                }
                if (ballY <= paddleCY + PADDLEH / 2) {
                    paddleCY -= paddleCDY;
                }
            }
        }

        public void playerUP () {
            if (paddlePy > 0) {
                paddlePy -= paddlePDY;
            }
        }
        public void reset () {
            playerScore = 0;
            computerScore = 0;
            init();
            Menu = false;
            GAMEOVER = false;
            PLAY = ture;
            repaint();
        }

        @Override
        public void actionPerformed (ActionEvent actionEvent){
            checkCollision();
            move();
            repaint();
        }
        public void paintComponent (Graphics g){

            super.paintComponent(g);

            g.setColor(Color.white);

            g.fillOval(ballX, ballY, BALLD, BALLD);
            g.fillRect(paddlePX, paddlePy, PADDLEW, PADDLEH);
            g.fillRect(paddleCX, paddleCY, PADDLEW, PADDLEH);

            g.setFont(new Font("serif", Font.BOLD, 52));
            printSimpleString(Integer.toString(playerScore), getWidth() / 2, 0, BORDER * 5, g);
            printSimpleString(Integer.toString(ComputerScore), getWidth() / 2, getWidth() / 2BORDER * 5, g);

            g.fillRect(getWidth() / 2 - BORDER / 2, 0, BORDER, getHeight());
        }else if (GAMEOVER) {
            g.setFont(new Font("serif", Font.BOLD, 52));
            printSimpleString("GAME OVER", getWidth(), 0, getHeight() / 3, g);
            printSimpleString("PRESS P TO PLAY AGAIN", getWidth(), 0, getHeight() / 3 * 2.g);
        }
    }

        private void printSimpleString(string s, int width, int Xpos, int YPos, Graphics g2d){
    int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
    int start = width/2 - stringLen/2
            g2
    }
}