package feast.models;

//bean injection via AppConfig
//Instead of relying on @Component scanning, we explicitly define beans inside
// a @Configuration class using @Bean annotated methods.
//Spring automatically injects parameters declared in the method signature.
public class Duck2 {
    private final Chicken3 chicken3;

    public Duck2(Chicken3 chicken3) {
        this.chicken3 = chicken3;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a chicken, " + chicken3.toString();
    }
}
