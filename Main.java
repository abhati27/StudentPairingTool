import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file (including its extension):");
        String fileName = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String trimmedLine = line.trim();
                if (trimmedLine.isEmpty()) { // check for empty lines
                    System.out.println("Ignoring empty line...");
                    continue;
                }

                if (trimmedLine.split("\\s+").length > 2) { // check for lines with more than one name
                    System.out.println("Invalid line with more than one name: " + line);
                    continue;
                }

                names.add(trimmedLine);
            }
        } catch (IOException e) {
            System.out.println("File not found: " + fileName);
            return;
        }

        if (names.isEmpty()) {
            System.out.println("No valid names found in the file.");
            return;
        }

        Collections.shuffle(names);

        List<String> groups = new ArrayList<>();
        int i = 0;
        while (i < names.size()) {
            if (i == names.size() - 1) { // last person without a pair
                if (!groups.isEmpty()) { // if there are already some groups formed
                    groups.set(groups.size() - 1, groups.get(groups.size() - 1) + "+" + names.get(i)); // add the last
                                                                                                       // person to the
                                                                                                       // last group
                } else {
                    groups.add(names.get(i)); // create a new group with just one person if no groups are formed yet
                }
            } else {
                groups.add(names.get(i) + "+" + names.get(i + 1)); // pair up two people
                i++;
            }
            i++;
        }

        int groupNumber = 1;
        for (int j = 0; j < groups.size(); j++) {
            System.out.printf("Group %d: %-40s", groupNumber++, groups.get(j));
            if ((j + 1) % 3 == 0) {
                System.out.println();
            } else {
                System.out.print("\t");
            }
        }
    }
}
