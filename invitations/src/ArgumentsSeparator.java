public class ArgumentsSeparator {
    private final String[] userArgs;

    public ArgumentsSeparator(String[] userArgs) {
        this.userArgs = userArgs;
    }

    public String separateOption() {
        return userArgs[0];
    }

    public String separateCountry() {
        String country = "";
        for (String userArg : userArgs) {
            if (userArg.startsWith("--country")) {
                String[] splitArg = userArg.split(":");
                country = splitArg[splitArg.length - 1];
            }
        }
        return country;
    }

    public String separateFile() {
        return userArgs[userArgs.length - 1];
    }


    public int separateAge() {
        int age = 0;
        for (String userArg : userArgs) {
            if (userArg.startsWith("--age")) {
                String[] splitArg = userArg.split(":");
                age = Integer.parseInt(splitArg[splitArg.length - 1]);
            }
        }
        return age;
    }
}
