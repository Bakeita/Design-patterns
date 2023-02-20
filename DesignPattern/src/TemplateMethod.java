
abstract  class Game{
    public final  void game(){
        System.out.println("Invariant Method");
    }
// These function are common to all the subclasses but has different implementations
    protected abstract void startGame();
    protected abstract void initializeGame();
    protected abstract void endGame();
}

class Football extends Game{

    @Override
    protected void startGame() {

    }

    @Override
    protected void initializeGame() {

    }

    @Override
    protected void endGame() {

    }
}
// Cricket Game start and ending are different from the football
class Cricket extends Game{

    @Override
    protected void startGame() {

    }

    @Override
    protected void initializeGame() {

    }

    @Override
    protected void endGame() {

    }
}


public class TemplateMethod {


}
