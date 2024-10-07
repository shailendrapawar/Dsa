public class DividePlayersIntoTeamsOfEqualSum {
    public static void main(String[] args) {
        int skills[]={3,2,5,1,3,4};
        int teams=skills.length/2;

        int map[]=new int[1001];
        //calculating total sum
        int totalSum=0;
        for(int elem:skills){
            map[elem]++;
            totalSum+=elem;
        }

        if(totalSum%teams!=0){
            System.out.println(false);
        }
        int targetSum=totalSum/teams;
        long res=0;

        for(int elem :skills){
            if(map[elem]==0){
                continue;
            }
            map[elem]--;
            int patner=targetSum-elem;

            if(map[patner]==0){
                System.out.println(false);
            }

            map[patner]--;
            res=res+((long)elem*(long)patner);

        }
        System.out.println(res);

    }
}
