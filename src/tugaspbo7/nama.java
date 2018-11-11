package tugaspbo7;

import java.util.Comparator;
public class nama implements Comparator<mahasiswa>{
     @Override
    public int compare(mahasiswa a, mahasiswa b)
    {
        return a.getnama().compareToIgnoreCase(b.getnama());   
    }
    
}
