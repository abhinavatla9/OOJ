import java.util.Scanner;
class actor{
    int noofmovies;
    int yearsofexp;
    String name;
    int id;
    double avg;
    static String highestavg;
    Scanner sc = new Scanner(System.in);

    void average(){
        avg = (noofmovies/yearsofexp);
    }

    void accept(){
        System.out.print("NAME :");
        name = sc.next();
        System.out.print("ID :");
        id = sc.nextInt();
        System.out.print("NO OF MOVIES :");
        noofmovies = sc.nextInt();
        System.out.print("YEARS OF EXPERIENCE :");
        yearsofexp = sc.nextInt();
    }


        void display(){
            System.out.println(name+"        *"+id+"       "+avg+"          "+noofmovies+"           "+yearsofexp);
        }

}


class actormain{
    public static void main(String ss[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF ACTORS DETAILS YOU WANT TO ENTER");
        n = sc.nextInt();
        actor a1[] = new actor[n];

        for(int i=0;i<n;i++){
            System.out.println("----------------------------------");
            System.out.println("ENTER ACTOR :"+(i+1));
            a1[i] = new actor();
            a1[i].accept();
            a1[i].average();
        }




        System.out.println("\n**********************");
        System.out.println(" S.NO  |   NAME   |   ID    |   AVERAGE  |   NO.MOVIES  |  YEARS ");
        System.out.println("______________________");
        for(int i=0;i<n;i++){
            System.out.print("     "+(i+1)+")   ");
            a1[i].display();
            System.out.println("______________________");
        }


        double l = 0;
        int index=0;
        for(int i=0;i<a1.length;i++){
            if(a1[i].avg > l){
                l = a1[i].avg;
                actor.highestavg = a1[i].name;
                index = i+1;
            }
        }


        System.out.println("\n*************\n");
        System.out.println("HIGHEST AVERAGE AMOUNG ALL ACTOR IS:");
        System.out.println("|"+index+"TH MEMBER IN TABLE "+"\n|AND AVERAGE IS :"+l);
        System.out.println("|ACTOR NAME :"+actor.highestavg);
        System.out.println("\n*************");




    }
}