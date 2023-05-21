package advisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        Option option = new Option();
        OAuth oAuth = new OAuth();

        do{
            input = sc.nextLine();
            if(input.equals("auth")){
                oAuth.setAuthorize(true);
            }
            if(!oAuth.isAuthorize()){
                System.out.println("Please, provide access for application.");
            }
            else{
                switch (input){
                    case "new"->option.newReleases();
                    case "featured"->option.featured();
                    case "playlists mood"->option.playlists();
                    case "categories"->option.categories();
                    case "auth"->{
                        oAuth.printURL();
                        System.out.println("---SUCCESS---");
                    }
                }
            }
        }while(!input.equals("exit"));
        System.out.println("---GOODBYE!---");

    }
}
