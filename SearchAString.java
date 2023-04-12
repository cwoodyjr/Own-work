

public class SearchAString {

    public static int linearSearch(String toSearch, String target){
    //convert target string to lowercase
        String targetLower = target.toLowerCase();
    
    //create String array, split on the spaces and store values of search string in the array
        String[] toSearchLower = toSearch.toLowerCase().split(" ");

    //create a int variable set to 0
        int result = 0;
    //create a for loop to iterate through each word in the array for the length of the array      
            for(int i = 0; i < toSearchLower.length; i++){
    //on each iterarion, check to see if target string is equal to the word in the search string            
                if (toSearchLower[i].equals(targetLower)){
    //if word matches, make result equal to the index number +1 because indexing starts at 0
                    result = i+1;
    //if word is found, exit the loop
                    break;
    //if word is not found, make result equal to -1
                }else{
                    result = -1;
                }
            }
    // this method must always return an int, so we create the result variable,
    // update it throughout the method and return it here:
    return result;
    }
        

    public static void main(String[] args) {
        String target = "text";
        String toSearch = "here is a string that contains the name sparta as part of our text search";
        System.out.println(linearSearch(toSearch, target));
        // int result = linearSearch(toSearch, target);
        // System.out.println(result);
    }
}
