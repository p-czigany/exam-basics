package copy;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by peter on 2017.04.18..
 */
public class Copy {

  public static void main(String[] args) {
    // This should be the basic replica of the 'cp' command

    // If ran from the command line without arguments

    // It should print out the usage:
    // copy [source] [destination]

    // When just one argument is provided print out
    // No destination provided

    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination

    if (args.length == 0) {
      System.out.println("copy [source] [destination]");
    } else if (args.length == 1) {
      System.out.println("No destination provided");
    } else if (args.length == 2) {
      FileHandler handler = new FileHandler();
      List<String> linesToCopy = handler.readFromFile(Paths.get(args[0]));
      handler.printToFile(Paths.get(args[1]), linesToCopy);
    }
  }
}
