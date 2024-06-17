package seminar;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentFlow> {

    @Override
    public int compare(StudentFlow o1, StudentFlow o2) {
       return o1.getGroups().size() - o2.getGroups().size();
    }
}
