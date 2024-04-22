package pckg_abs_cls;

public class SuperHero extends Person implements FlyAbility, Strength{


    private String superheroName;
    protected SuperHero(String name, String sname, String superName) {
        super(name, sname);
        this.superheroName = superName;
    }

    @Override
    protected void getSignature() {
        System.out.println(getClass().getSimpleName() + "superHeroName: " + this.superheroName);

    }

    @Override
    public void flyAroundTown() {
        System.out.println(this.superheroName + " can Fly...");
    }

    @Override
    public void haveEnormousStrength(int level) {
        System.out.println(this.superheroName + " has superstrength of level: " + level);

    }
}
