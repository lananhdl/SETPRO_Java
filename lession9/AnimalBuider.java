package lession9;
// outer class -> Just read only
public class AnimalBuider {
    private   String name;
    private  int speeds;
    private  Boolean flyable;
    protected AnimalBuider(Builder builder){
       this.name = builder.name;
      this.speeds=builder.speeds;
       this.flyable=builder.flyable;
    }

    //read Only
    public String getName() {
        return name;
    }

    public int getSpeeds() {
        return speeds;
    }

    public Boolean getFlyable() {
        return flyable;
    }


    //inner class
    public static class Builder{

        private   String name;
        private  int speeds;
        private  Boolean flyable;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeeds(int speeds) {
            this.speeds = speeds;
            return this;
        }

        public Builder setFlyable(Boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public  AnimalBuider build(){
            return new AnimalBuider(this);
        }
    }
}
