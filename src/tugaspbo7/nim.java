package tugaspbo7;

import java.util.Comparator;
public class nim implements Comparator<mahasiswa>
{
    @Override
    public int compare(mahasiswa a, mahasiswa b)
    {
        return a.getnim().compareToIgnoreCase(b.getnim());
    
    }
}
