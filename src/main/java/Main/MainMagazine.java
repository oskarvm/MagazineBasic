package Main;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

import Entities.*;


public class MainMagazine {

    public static void main(String[] args)  {
        ArrayList<Revista> revistes = new ArrayList();
        FileAccessor fa;

        Menu menu = new Menu();
        int opcio;

        opcio = menu.menuPral();

        switch (opcio) {

            case 1:

                System.out.println("1!!");
                fa=new FileAccessor();
                try {
                    fa.readAutorsFile("src/main/java/Docs/autors.txt");
                    fa.printAutors();
                    fa.readMagazinesFile("src/main/java/Docs/revistes.txt");
                    fa.printRevistes();
                    revistes=fa.readArticlesFile("src/main/java/Docs/articles.txt");
                    mostraRevistes(revistes);
                } catch (NumberFormatException | IOException e) {

                    e.printStackTrace();
                }
                break;

            case 2:
                System.out.println();
                System.out.println();
                try {

                }catch ();
                break;

            default:
                System.out.println("Adeu!!");
                System.exit(1);
                break;

        }

    }
    public static void mostraRevistes(ArrayList<Revista> revistes){
        for (int i = 0; i < revistes.size(); i++) {

            System.out.println(revistes.get(i).toString());
            for (int j = 0; j < revistes.get(i).getArticles().size(); j++) {
                System.out.println("\t"+ revistes.get(i).getArticle(j).toString());
                System.out.println("\t\t"+revistes.get(i).getArticle(j).getAutor().toString());
            }

        }
    }

    public static Revista seleccionaRevista(ArrayList<Revista> revistes){
        //TODO
       for(Revista revista : )

        return null;

    }
    public static Article seleccionaArticle(Revista<revista> revista){
        //TODO

        return null;

    }



}
