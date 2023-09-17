import java.util.*;

public class Dinojokes {
    public static void main(String[] args) {
        String banner = "===============\n== DINOJOKES ==\n===============\n";
        System.out.println(banner);
        jokeLoop();
        System.exit(0);
    }

    private static void jokeLoop() {
        String askInput 
            = "Press enter to see another dino joke, or 'q' then enter to quit";
        Scanner in = new Scanner(System.in);
        String userInput;
        do {
            System.out.println(randomJoke());
            System.out.println(askInput);
            userInput = in.nextLine();
        } while (!userInput.equals("q"));
        in.close();
    }

    private static String randomJoke() {
        List<String> jokeList = Dinojokes.hilarity;
        int randomIndex = new Random().nextInt(jokeList.size());
        return jokeList.get(randomIndex) + "\n";
    }

    private static final List<String> hilarity = new ArrayList<>(Arrays.asList(
            "What do you call a dinosaur that buzzes?\nA BEE-REX!",
            "What do you call a sleeping dinosaur?\nA DINO-SNORE!",
            "What do you call a laughing dinosaur?\nA GIGGLE-NOTOSAURUS!"
    ));

}
