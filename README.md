# StudentPairingTool
This is a robust and user-friendly tool developed in Java. Its primary function is to generate random student groups, given a list of student names from a text file.

<img width="776" alt="Screen Shot 2023-05-10 at 5 25 48 PM" src="https://github.com/abhati27/StudentPairingTool/assets/60200047/f480812b-9799-4a8c-a9c8-ad57ffbfac13">

## Features
* The user is prompted to input the file name, and the program handles the rest, ensuring a seamless and convenient experience.
* The program applies a shuffling algorithm to the list of names to ensure randomness in group allocation.
* It then pairs the students, creating groups of two.
* The program is also equipped to handle edge cases. For instance, if there is an odd number of students and one student is left without a pair, the program intelligently adds this student to an existing group, creating a group of three.
* The program is designed to be resilient and informative. It gracefully handles exceptions, such as missing files or invalid inputs, and provides appropriate error messages to the user.

## Usage
1. Clone this repository to your local machine.
2. Add a text file in the root directory of the project with the names of the students, one name per line.
3. Run the Main.java program.
4. When prompted, enter the name of the text file you created in step 2.
5. The program will print the random groups of students to the console.

## Example

```
Enter the name of the file (including its extension):
names.txt
Group 1: Lily Scott+Sophia Brown                    Group 2: John Doe+Jack King                          Group 3: Noah Hill+Michael Johnson               
Group 4: David Jones+Daniel Rodriguez               Group 5: William Anderson+Madison Rodriguez          Group 6: Alexander Clark+Abigail Hernandez       
Group 7: Henry Hall+Emma Martinez                   Group 8: Sofia Wright+Ella Jackson                   Group 9: Amelia Miller+James Thomas              
Group 10: Oscar Lopez+Sebastian Young               Group 11: Jane Smith+Ethan Martinez                 Group 12: Benjamin Walker+Anmol Bhatia            
Group 13: Isabella White+Lucas Harris               Group 14: Mia Thompson+Ava Robinson                 Group 15: Olivia Garcia+Emily Lewis+Emily Williams
```
