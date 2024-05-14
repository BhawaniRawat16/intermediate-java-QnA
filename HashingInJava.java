// ///Mejority of element 
// import java.util.HashMap;
// import java.util.HashSet;

// public class HashingInJava {

//     public static void majorityElement(int arr[] , HashMap<Integer , Integer> map){
//         for(int i = 0; i<arr.length; i++){
//             if(map.containsKey(arr[i])){
//                 map.put(arr[i], map.get(arr[i])+1); 
                
//             }else{
//                 map.put(arr[i], 1);
//             }
//         }

//         for(int key: map.keySet()){
//             if(map.get(key) > arr.length/3){
//                 System.out.println(key);
//             }
//         }
//     }

//     public static int unionOfTwoArray(int arr1[] , int arr2[]){ // Union Of Two Array
//         HashSet<Integer> set = new HashSet<Integer>();
//         for (int i = 0; i < arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         for (int i = 0; i < arr2.length; i++) {
//             set.add(arr2[i]);
//         }
//         System.out.println(set);
//         return set.size();
//     }

//     public static int intersectionOfTwoSets(int arr1[] , int arr2[]){//Intersection Of Two Array
//         HashSet<Integer> set = new HashSet<Integer>();
//         int count = 0;

//         for (int i = 0; i < arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         for (int i = 0; i < arr2.length; i++) {
//             if(set.contains(arr2[i])){
//                 count++;
//                 set.remove(arr2[i]);
//             }
//         }

//         return count;

//     }
//     public static void main(String[] args) {
//         HashMap<Integer , Integer> map = new HashMap<>();
//         int arr[] = {1 , 2};

//         int arr1[] = {7 , 3 , 9};
//         int arr2[] = {6 , 3 , 9 , 2 , 9 , 4};
//         majorityElement(arr, map);
//         int union = unionOfTwoArray(arr1, arr2);
//         System.out.println("Union = "+union);
//         int intersection = intersectionOfTwoSets(arr1, arr2);
//         System.out.println(intersection);
//     }
// }

// import java.util.HashMap;

// /**
//  * Find Itenerary from Tickets
//  */
// public class HashingInJava {

//     public static String findItenerary(HashMap<String , String> map){
//         HashMap<String , String> reverMap = new HashMap<String,String>();
//         String start = "";
//         for (String key: map.keySet()) {
//             reverMap.put(map.get(key) , key);
//         }
        
//         for(String key: map.keySet()){
//             if(reverMap.containsKey(key)==false){
//                 return key;
//             }
//         }
        
//         return null;

//     }

//     public static void main(String[] args) {
//         HashMap<String , String> map = new HashMap<>();
//         map.put("Chennai", "Bengaluru");
//         map.put("Mumbai", "Delhi");
//         map.put("Goa", "Chennai");
//         map.put("Delhi", "Goa");

//         String start = findItenerary(map);

//         while (map.containsKey(start)) {
//             System.out.print(start+" -> ");

//             start = map.get(start);
//         }

//         System.out.print(start);
//     }
// }



/**
 * Subarray sum equal to k;
 * arr = {1 , 2 , 3}  subarr =(1,2) , (3) k = 3 
 * return number of such subarray
 */
public class HashingInJava {

    public static void main(String[] args) {
        
    }
}