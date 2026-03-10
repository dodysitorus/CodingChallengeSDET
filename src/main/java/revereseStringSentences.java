public class revereseStringSentences {
    public static void main(String[] args) {
        String input = "I am working in Infosys";
        String[] inputArr = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = inputArr.length - 1; i >= 0; i--) {
            result.append(inputArr[i]);
            if (i!=0){
                result.append(" ");
            }
        }

        System.out.println(result);
    }
}
