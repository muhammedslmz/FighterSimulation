public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    public void run(){
        if(isCheck()){
            while(this.f1.health>0&&this.f2.health>0){
                System.out.println("-------=New Round=-------");
                if(isStart()){
                    this.f2.health= this.f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                    this.f1.health =this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                }
                else{
                    this.f1.health =this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                    this.f2.health= this.f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                }



                System.out.println(this.f2.name + " health: "+this.f2.health);
                System.out.println(this.f1.name + " health: "+this.f1.health);

            }
        }else{
            System.out.println("Athletes' weights don't match.");
        }
    }
    boolean isCheck(){
        return(this.f1.weight>=minWeight&&this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight);

    }

    boolean isWin(){
        if(this.f1.health==0){
            System.out.println("Winner\t: "+this.f2.name);
            return true;
        }
        if(this.f2.health==0){
            System.out.println("Winner\t: "+this.f1.name);
            return true;
        }
        return false;
    }

    boolean isStart(){
        double randomNum=Math.random()*2;
        System.out.println(randomNum);
        return randomNum<1;
    }
}
