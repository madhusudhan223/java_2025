public class User implements Comparable<User>  {

    private int points;

    public User(int userPoints){
        this.points = userPoints;
    }

    @Override
    public int compareTo(User other) {
//       if(points < other.points){
//           return -1;
//       }if(points == other.points){
//            return 0;
//        }
//       return 1;
        return points - other.points;
    }
}

//

// object1 < object2 (other object)  --> return -1
// object1 == object2  ---> return 0
// object1 > object2   ---> return 1

//

// comparable interface is used to compare two objects


