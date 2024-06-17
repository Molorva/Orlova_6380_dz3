package seminar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentFlow implements Iterable<StudentGroup>, Comparator<StudentGroup> {

    public List<StudentGroup> groups = new ArrayList<>();

    public void addGroup(StudentGroup group){
        groups.add(group);
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentFlowIterator((StudentFlow) groups);
    }


    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.toString().length() - o2.toString().length();
    }
}
