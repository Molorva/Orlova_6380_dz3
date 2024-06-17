package seminar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentFlowIterator implements Iterator<StudentGroup> {

   private List<StudentGroup> flow = new ArrayList<>();
   int index = 0;

    public StudentFlowIterator(StudentFlow flow) {
        this.flow = (List<StudentGroup>) flow;
    }
    public List<StudentGroup> getGroups() {
        return flow;
    }

    @Override
    public boolean hasNext() {
        return index < flow.size();
    }

    @Override
    public StudentGroup next() {
        StudentGroup [] groups = getGroups().toArray(new StudentGroup[0]);
        return groups[index++];
    }
}
