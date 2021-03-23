//
//    given input string 1111122222, and size 5, return output 510
//    1111122222 ---> 11111 22222 ---> 1+1+1+1+1 = 5, 2+2+2+2+2 = 10
//    ---> 5 10 ---> 510 (length is < k, done)
//
//    given input string 1111122222, and size 3, return 3464
//    1111122222 ---> 111 112 222 2 ---> 1+1+1 = 3, 1+1+2 = 4, 2+2+2 = 6, 2 = 2
//    ---> 3 4 6 2 ---> 3462 (length is > k, need to process it) ---> 346 2 ---> 3+4+6 = 13, 2 = 2 ---> 132


    //no gurantee 100% test caese pass though ^^
    public static String reduceTheNumber(String num, int k) {

            String number = "";

            // The desired string length should always <= than k
            while(num.length() > k){
                //store string in length of k into arraylist
                List<String> tokens = new ArrayList<>();
                for (int i = 0; i < num.length(); i += k) {
                    //add string into arraylist(string with length of k, if length < k, then add whole string)
                    tokens.add(num.substring(i, Math.min(num.length(), i + k)));
                }
                // str is used to store sum of each string in the list
                String str = "";
                //get string from the list
                for(int i = 0; i < tokens.size(); i++){
                    String string = tokens.get(i);
                    int sum = 0;
                    //get character from the list, and add them
                    for(int j = 0; j < string.length(); j++){
                        char ch = string.charAt(j);
                        sum += Integer.parseInt(String.valueOf(ch));
                    }
                    //store sum into the str
                    str += Integer.toString(sum);
                }
                //update num with str to recheck the length of num, and also update number
                num = str;
                number = num;
            }

            return number;
    }
