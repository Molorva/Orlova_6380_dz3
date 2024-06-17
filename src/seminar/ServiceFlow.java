package seminar;

import java.util.List;

public class ServiceFlow {
    public void sortFlow(List<StudentFlow> fl){
        fl.sort(new StreamComparator());
    }
}
