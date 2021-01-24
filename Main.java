// "We're in the endgame now." - Stephen Strange, M.D., Ph.D.
// https://pics.me.me/were-in-the-endgame-now-when-the-power-point-goes-38463881.png

import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.util.*;


public class Main {
    public static final int ARR_LENGTH = 25;

    public static void main(String[] args) throws NoSuchAlgorithmException {
	// setup the hash map here

        HashMap<String, String> hashedNamesHM = new HashMap<String, String>();

        Hashes hashes = new Hashes();

        String filename = "names.txt";

        //key array
        String[] namesArr;
        namesArr = readNames(filename);

        //print out every element in the array
        for(int i = 0; i < namesArr.length; i++)
        {
            System.out.println(namesArr[i]);
            hashes.makeHash(namesArr[i]);
            hashedNamesHM.put(namesArr[i] , hashes.getHashedStr());
        }

		System.out.println("");
        System.out.println(hashedNamesHM.toString());
        System.out.println("");

        // find your main man
        if (hashedNamesHM.containsKey("Hugh Mungus")) {
            System.out.println("Hugh Mungus = " + hashedNamesHM.get("Hugh Mungus"));
        } else {
            System.out.println("The HashMap does not contain Hugh Mungus.");
        }

        // find your leading lady
        if (hashedNamesHM.containsKey("Kah Rona")) {
            System.out.println("Kah Rona = " + hashedNamesHM.get("Kah Rona"));
        } else {
            System.out.println("The HashMap does not contain Kah Rona.");
        }
    }


    // read the names from names.txt and put them into an array
    public static String[] readNames(String filename)
    {
        String[] names = new String[ARR_LENGTH];
        String currentLine = "";
        int index = 0;

		try{
			Scanner input = new Scanner(new File(filename));

			while(input.hasNext()){
				//change currentLine to each line in the file
				currentLine = input.nextLine();
				//add each line to the names array
				names[index] = currentLine;
                index++;
			}

			//say the list of names has been read
			System.out.println("The list of names has been read.");
		}

		catch(FileNotFoundException e){
			e.printStackTrace();
		}




        return names;
    }
}

//useful command System.out.println(new File(filename).getAbsolutePath());
//Name -> Joe Jones is the key
//Hash -> asdfasd657fa434t is the value
