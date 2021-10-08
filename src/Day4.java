public class Day4 {
    private int age;

    public Day4(int initialAge){
        age = initialAge < 0 ? 0 : initialAge; 
    }

    public void amIOld() {
        String ageStatement;

        if(age >= 18) {
            ageStatement = "You are old";
        } else if(age >= 13 && age < 18) {
            ageStatement = "You are a teenager";
        } else if(age > 0 && age <= 12) {
            ageStatement = "You are young";
        } else {
            ageStatement = "Age is not valid, setting age to 0.\nYou are young";
        }

        System.out.println(ageStatement);
    }
}
