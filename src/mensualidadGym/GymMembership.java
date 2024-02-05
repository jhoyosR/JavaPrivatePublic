package mensualidadGym;

public class GymMembership {
    public String client;
    public int plan;

    public String calculateMembershipPrice(){
        if (this.plan == 15){
            return "the cost of your membership is $18000";
        } else if (this.plan == 30) {
            return "the cost of your membership is $35000";
        } else if (this.plan == 3){
                return "the cost of your membership is $86000";
            }
        return "Choose a valid plan";
        }
    }
