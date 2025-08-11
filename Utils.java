public class Utils {
//    public static int max(int first, int second){
//        return (first > second) ? first : second;
////        if(first > second){
////            return first;
////        }else{
////            return second;
////        }
//
//
////        ternary operator
//
//    }
    public static <T extends Comparable> T max(T first, T second){
        return (first.compareTo(second) > 0) ? first : second;

        // comparable operators > < =
        // sout(object) --> ClassName@hashcode
    }

}
