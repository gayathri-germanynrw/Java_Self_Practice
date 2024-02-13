package day13_practice_tasks.state_task;

public class StateClients {
    public static void main(String[] args) {
        Virginia virgina=new Virginia("Virginia","VR","PArty","Vir_Governor","Vir_Senator",1000000);
        System.out.println("Virgina");
        System.out.println(virgina);
        System.out.println();

        California california=new California("California","CF","PArty","Cali_Governor","Cali_Senator",2000000);
        System.out.println("California");
        System.out.println(california);
        System.out.println();

        Texas texas=new Texas("Texas","TX","PArty","Texas_Governor","Texas_Senator",3000000);
        System.out.println("Texas");
        System.out.println(texas);
        System.out.println();

        Florida florida=new Florida("Florida","FL","PArty","Flori_Governor","Flori_Senator",3000000);
        System.out.println("Florida");
        System.out.println(florida);
        System.out.println();

    }
}
