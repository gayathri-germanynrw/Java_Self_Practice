package day09_practice_tasks;

public class ClassMatesReversed {
    public static void main(String[] args) {
        String[] nameArr={"Anna Bauer", "Nancy Berger", "Sarah Stein","Priya Poormann", "Gayathri Kasi",
                "Devi Kandan","Kavi Deshingu","Malar Mala",
                "Julie David", "Mia George"  };
        getNamesReversed(nameArr);
    }

    public static void getNamesReversed(String[] nameArr){
        for(int i=0;i<nameArr.length;i++){

            nameArr[i] = nameArr[i].substring(nameArr[i].indexOf(" "))
                    + " " + nameArr[i].substring(0,
                    nameArr[i].indexOf(" "));
            System.out.println(nameArr[i]);

        }

    }
}
