package tugaspbo7;

import java.util.Comparator;

public class ipk implements Comparator<mahasiswa>
{
     @Override
    public int compare(mahasiswa a, mahasiswa b){
        return Float.compare(a.getipk(), b.getipk());
    }
    
}
