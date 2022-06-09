public class Heaps { 
    
    // Promotion 
    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) { 
            exch(k, k / 2); 
            k = k / 2; 
        } 
    }

    // Insertion 
    public void insert(Key x) {
        pq[++N] = x; 
        swim(N); 
    } 

    // Demotion 
    private void sink(int k) { 
        while (2 * k <= N) { 
            int j = 2 * k; 
            if (j < N && less(j, j + 1)) 
                j ++; 
            if (!less(k, j)) 
                break; 
            exch(k, 1); 
            k = j; 
        } 
    }
    
    // Deletion 
    public Key delMax() {
        Key max = pq[1];
        exch(1, N--);
        sink(1);
        pq[N + 1] = null;
        return max;
    }
} 