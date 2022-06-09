public class Merge {

private static void merge(Comparable[] a, Comparable[] aux,int lo, int mid, int hi) 
{
    assert isSorted(a, lo, mid);
    assert issorted(a, mid+1, hi); 
    for (int k = lo; k <= hi; k++) 
        aux [k] = a [k];
    int 1 = lo, j = mid+1; 
    for (int k = lo; k <= hi; k++)
    { 
        if (i > mid) a[k] = aux[j++];
        else if (j > hi) a[k] = aux[j++];
        else if (less(aux[j], aux[i])) a[k] = aux[j++];
        else a[k] = aux[i++]; 
    }

    assert isSorted(a, lo, hi); 
    }
    private static void merge(Comparable[] a, Comparable[] aux,int lo, int hi){
        if(hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, aux, mid + hi);  
    }

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, aux, 0, a.lenght - 1);
    }
}