package lecture25_string_methods;

public class StringMethods {
    public static void main(String[] args) {
        String text = "Yll Gashi";
        // same with ['Y', 'l', 'l', ' ', 'G', 'a', 's', 'h', 'i']


        // charAt(int index) -> Get specific character in specific index (position starting by 0)
        char firstChar = text.charAt(0); // 'Y'
        char lastElement = text.charAt(8); // 'i'
        System.out.println(firstChar);
        System.out.println(lastElement);


        // length() -> Get string total characters number
        int textLength = text.length(); // 9
        System.out.println(textLength);


        // format() -> Format string (like printf)
        String formatedText = String.format("%s %S", "Yll", "Gashi");
        System.out.println(formatedText);


        // substring(int startingIndex) -> Give a new string from specific index
        String lastName = text.substring(4);
        System.out.println(lastName);

        // substring(int startingIndex, int endingIndex + 1)
        String onePartOfText = text.substring(4, 7 + 1);
        System.out.println(onePartOfText);

        // contains() -> Check if a character exists inside string
        boolean doesGashiExists = text.contains("Gashi");
        boolean doesKrasniqiExists = text.contains("Krasniqi");
        System.out.println(doesGashiExists);
        System.out.println(doesKrasniqiExists);


        // join()
        String joinedText = String.join(" --> ", "Master", "Bachelor", "High Scool", "Elementary School");
        System.out.println(joinedText);

        // equals()
        String textOne = "abc";
        String textTwo = "abc";
        boolean areTextOneAndTextTwoEqual = textOne.equals(textTwo);

        // isEmpty()
        boolean isTextOneEmpty = text.isEmpty();

        String emptyText = "";
        boolean isTextTwoEmpty = emptyText.isEmpty();

        System.out.println(isTextOneEmpty);
        System.out.println(isTextTwoEmpty);


        // concat() (the same with the '+' sign)
        String firstName = "Filan";
        String fullNameWithConcat = firstName.concat(" Fisteku");
        System.out.println(fullNameWithConcat);
        // the same with
        String fullNameWithPlus = "Filan" + " Fisteku";
        System.out.println(fullNameWithConcat);


        // replace specific character
        String textFromWord = "Unw jam Shqiptwtarw dhe krenarw";
        String replacedText = textFromWord.replace('w', 'ë');
        System.out.println(replacedText);

        // replace specific word
        String myBiography = "Une jam fullName dhe jam Kosovar";
        String replacedBiography = myBiography.replace("fullName", "Filan Fisteku");
        System.out.println(replacedBiography);

        // equalsIgnoreCase
        String thirdText = "Filan Fisteku";
        String fourthText = "FILAN FISTEKU";
        boolean areThirdAndFourthTextEqual = thirdText.equals(fourthText);
        boolean areThirdAndFourthTextEqualButIgnoreCase = thirdText.equalsIgnoreCase(fourthText);
        System.out.println(areThirdAndFourthTextEqual);
        System.out.println(areThirdAndFourthTextEqualButIgnoreCase);


        // indexOf -> Will get the first position number (index) of character which we are searching for
        // if there is none then it will return to us "-1"
        String secondText = "Abcdefghie";
        int positionOfE = secondText.indexOf('e');
        int positionOfZ = secondText.indexOf('z');
        System.out.println(positionOfE);
        if (positionOfZ == -1) {
            System.out.println("Character not found");
        }

        // indexOf from specific character
        String fifthText = "Abcdefghie";
        int positionOfEFromFourIndex = secondText.indexOf('e', 7);

        // indexOf - with word
        String sixthText = "Filan Fisteku";
        int positionOfLastName = sixthText.indexOf("Fisteku");
        System.out.println(sixthText);

        // lastIndexOf
        String seventhText = "Abcdefghie";
        int lastPositionOfText = seventhText.lastIndexOf('e');


        // toLowerCase()
        String eightText = "FILAN FISTEKU";
        String eightTextInLowerCase = eightText.toLowerCase();
        System.out.println(eightTextInLowerCase);

        // toUpperCase()
        String ninthText = "filan fisteku";
        String ninthTextInUpperCase = ninthText.toUpperCase();
        System.out.println(ninthTextInUpperCase);

        // trim()
        String textWithBlankCharacters = "     Filan         ";
        String textWithoutBlankCharacters = textWithBlankCharacters.trim();
        System.out.println(textWithBlankCharacters);
        System.out.println(textWithoutBlankCharacters);


        // valueOf()
        String valueOfInt = String.valueOf(100); // "100"
        String valueOfDouble = String.valueOf(3.14); // "3.14"
    }
}










