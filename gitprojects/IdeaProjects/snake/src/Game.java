import java.io.*;

//为了测试我的器量
//2019-3-22制作的游戏

public class Game {

    public void 

    public void createFood(SnakeBody sb){
        int flag = 0;
        SnakeBody p = new SnakeBody();
        while (p != null){
            Food food = new Food(Math.random())
            if (p.x == )
        }
    }
}

class MyConstants{
    private MyConstants(){};
    final int Up = 1;
    final int Down = -1;
}

class SnakeBody{
    int x;
    int y;
    SnakeBody next;

    public void move(){

    }
}

class Food{
    public Food(int x, int y){
        this.x = x;
        this.y = y;
    }
    int x;
    int y;
}