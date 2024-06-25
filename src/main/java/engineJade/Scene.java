package engineJade;

import java.util.ArrayList;
import java.util.List;

public abstract class Scene {

    protected Camera camera;
    private boolean isRunning = false;
    protected List<GameObject> gameOjects = new ArrayList<>();

    public Scene() {

    }

    public void init() {

    }

    public void start() {
        for (GameObject go : gameOjects) {
            go.start();
        }
        isRunning = true;
    }

    public void addGameObjectToScene(GameObject go) {
        if(!isRunning) {
            gameOjects.add(go);
        } else {
            gameOjects.add(go);
            go.start();
        }
    }

    public abstract void update(float dt);

    public Camera camera() {
        return this.camera;
    }
}
