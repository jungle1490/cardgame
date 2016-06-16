package GameContent.Role;

import GameContent.action.Skill;

/**
 * Created by joejungle on 2016/6/16.
 */
public class Role {

    String name;
    int image;
    int HP;

    Role(){

        this.HP=50;
    };

    Role(String name,int image){
        this.name=name;
        this.image=image;
        this.HP=50;
    };

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getHP() {
        return HP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

}
