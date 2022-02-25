import java.util.Scanner;

public class TourMagie {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Spectateur spectateur = new Spectateur();
        spectateur.setAge();
        spectateur.setArgentPoche();
        System.out.println("[Spectateur] (j'écris le papier)");
        Papier papier = new Papier();
        papier.setAgeSpectateur(spectateur.getAge());
        papier.setArgentSpectateur(spectateur.getArgentPoche());
        Assistant assistant = new Assistant(papier.getAgeSpectateur(), papier.getArgentSpectateur());
        assistant.calculAssistant();
        Magicien magicien = new Magicien();
        magicien.setCalculTourMagieAssitant(assistant.getCalculTourMagie());
        magicien.tourMagie();
    }

    static class Spectateur {
        //Attributes
        private int age;
        private int argentPoche;

        //Constructors
        public Spectateur() {
            System.out.println("[Spectateur] - (J'entre en scéne)");
            this.argentPoche = -1;
        }

        //Getters and Setters
        public void setAge() {
            System.out.print("Quel âge ai-je? ");
            this.age = keyboard.nextInt();
        }

        public int getAge (){
            return this.age;
        }

        public int getArgentPoche(){
            return this.argentPoche;
        }

        //Methods
        public void setArgentPoche() {
            while(this.argentPoche >= 100 || this.argentPoche <= -1) {
                System.out.print("Combien d'argent ai-je en poche (<100)? ");
                this.argentPoche = keyboard.nextInt();
            }
            System.out.println("[Spectateur] 'J'ai un montant qui convient");
        }
    }

    static class Magicien {
        //Attributes
        private int calculTourMagieAssitant;

        //Constructors
        public Magicien (){
            System.out.println("[Magicien] Un petit tour de magie...");
        }

        //Getters and Setters
        public void setCalculTourMagieAssitant(int calculTourMagieAssitant){
            this.calculTourMagieAssitant = calculTourMagieAssitant;
        }

        //Methods
        public void tourMagie (){
            String calculFinal = Integer.toString(this.calculTourMagieAssitant + 115);
            System.out.println("[Magicien] - hum... je vois que vous êtes agé de " + calculFinal.substring(0,calculFinal.length() - 2) + " ans et que vous avez " + calculFinal.substring(calculFinal.length() - 2) + " francs suisses en poche !");
        }
    }

    static class Papier {
        //Attributes
        private int ageSpectateur;
        private int argentSpectateur;

        //Constructors

        //Getters and Setters
        public void setAgeSpectateur (int age){
            this.ageSpectateur = age;
        }

        public void setArgentSpectateur (int argentSpectateur){
            this.argentSpectateur = argentSpectateur;
        }

        public int getAgeSpectateur (){
            return this.ageSpectateur;
        }

        public int getArgentSpectateur(){
            return this.argentSpectateur;
        }
    }

    static class Assistant {
        //Attributes
        private int ageSpectateur;
        private int argentSpectateur;
        private int calculTourMagie;

        //Constructors
        public Assistant (int ageSpectateur, int argentSpectateur){
            System.out.println("[Assistant] (Je lis le papier)");
            this.ageSpectateur = ageSpectateur;
            this.argentSpectateur = argentSpectateur;
        }

        //Getters and Setters
        public int getCalculTourMagie (){
            return this.calculTourMagie;
        }

        //Methods
        public void calculAssistant (){
            System.out.println("[Assistant] (Je calcule mentalement)");
            this.calculTourMagie = (this.ageSpectateur * 2 + 5) * 50 + this.argentSpectateur - 365;
            System.out.println("[Assistant] J'annonce : " + this.calculTourMagie + " !");
        }

    }
}
