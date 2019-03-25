import java.awt.*;
import java.util.*;
import javax.swing.*;

public class SnakeGame extends JPanel{

    protected static final int HEIGHT = 30;
    protected static final int WIDTH = 30;

    protected static final int CELL_H = 20;
    protected static final int CELL_W = 20;
    //MAP Size
    protected char[][] map = new char[HEIGHT][WIDTH];
    //use to store map info

    protected static final int UP_DIRECTION = 1;
    protected static final int DOWN_DIRECTION = -1;
    protected static final int LEFT_DIRECTION = 2;
    protected static final int RIGHT_DIRECTION = -2;
    //dafault direction = right
    private  int currentDirection = RIGHT_DIRECTION;

    private LinkedList<Point> snake = new LinkedList<>();

    private Point food = new Point();

    protected static boolean GameOver = false;
    protected static boolean IsAuto = true;
    private static int Difficult_Degree = 1;
    private Scanner in;

    /*图形刷新*/

    @Override
    public  void paint(Graphics g){
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (map[i][j] == '*'){
                    g.setColor(Color.GRAY);
                }
                else {
                    g.setColor(Color.WHITE);
                }
                g.fill3DRect(j * CELL_W, i * CELL_H, CELL_H, CELL_W, true);
            }

            //画蛇
            //定位🐍头
            int W = snake.getFirst().x;
            int H = snake.getFirst().y;
            g.setColor(Color.RED);
            g.fill3DRect(W*CELL_W, H*CELL_H, 20, 20, true);
            //定位🐍身
            for (int t = 0; t < this.snake.size(); t++) {
                W = snake.get(t).x;
                H = snake.get(t).y;
                g.setColor(Color.GREEN);
                g.fill3DRect(W*CELL_W, H*CELL_H, 20, 20, true);
            }

            //画食物
            map[food.y][food.x] = '@';
            g.setColor(Color.BLUE);
        }
    }


    public void init_map(){
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (i == 0 || i == HEIGHT - 1){
                    map[i][j] = '*';
                }
                else this.map[i][j] = ' ';
            }
        }
    }

    //init a snake
    public void init_Snake(){
        int x = WIDTH/2;
        int y = HEIGHT/2;
    }

    //action move
    public void move(){
        Point snakeHead = snake.getFirst(){

        }
    }
}
