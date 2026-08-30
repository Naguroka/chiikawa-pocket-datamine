package androidx.coordinatorlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public final class DirectedAcyclicGraph<T> {
    private final androidx.core.util.Pools.Pool<java.util.ArrayList<T>> mListPool = new androidx.core.util.Pools.SimplePool(10);
    private final androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> mGraph = new androidx.collection.SimpleArrayMap<>();
    private final java.util.ArrayList<T> mSortResult = new java.util.ArrayList<>();
    private final java.util.HashSet<T> mSortTmpMarked = new java.util.HashSet<>();

    public void addNode(T t) {
        if (this.mGraph.containsKey(t)) {
            return;
        }
        this.mGraph.put(t, null);
    }

    public boolean contains(T t) {
        return this.mGraph.containsKey(t);
    }

    public void addEdge(T t, T t2) {
        if (!this.mGraph.containsKey(t) || !this.mGraph.containsKey(t2)) {
            throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        java.util.ArrayList<T> emptyList = this.mGraph.get(t);
        if (emptyList == null) {
            emptyList = getEmptyList();
            this.mGraph.put(t, emptyList);
        }
        emptyList.add(t2);
    }

    public java.util.List getIncomingEdges(T t) {
        return this.mGraph.get(t);
    }

    public java.util.List<T> getOutgoingEdges(T t) {
        int size = this.mGraph.size();
        java.util.ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            java.util.ArrayList<T> arrayListValueAt = this.mGraph.valueAt(i);
            if (arrayListValueAt != null && arrayListValueAt.contains(t)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(this.mGraph.keyAt(i));
            }
        }
        return arrayList;
    }

    public boolean hasOutgoingEdges(T t) {
        int size = this.mGraph.size();
        for (int i = 0; i < size; i++) {
            java.util.ArrayList<T> arrayListValueAt = this.mGraph.valueAt(i);
            if (arrayListValueAt != null && arrayListValueAt.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        int size = this.mGraph.size();
        for (int i = 0; i < size; i++) {
            java.util.ArrayList<T> arrayListValueAt = this.mGraph.valueAt(i);
            if (arrayListValueAt != null) {
                poolList(arrayListValueAt);
            }
        }
        this.mGraph.clear();
    }

    public java.util.ArrayList<T> getSortedList() {
        this.mSortResult.clear();
        this.mSortTmpMarked.clear();
        int size = this.mGraph.size();
        for (int i = 0; i < size; i++) {
            dfs(this.mGraph.keyAt(i), this.mSortResult, this.mSortTmpMarked);
        }
        return this.mSortResult;
    }

    private void dfs(T t, java.util.ArrayList<T> arrayList, java.util.HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new java.lang.RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        java.util.ArrayList<T> arrayList2 = this.mGraph.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                dfs(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    int size() {
        return this.mGraph.size();
    }

    private java.util.ArrayList<T> getEmptyList() {
        java.util.ArrayList<T> arrayListAcquire = this.mListPool.acquire();
        return arrayListAcquire == null ? new java.util.ArrayList<>() : arrayListAcquire;
    }

    private void poolList(java.util.ArrayList<T> arrayList) {
        arrayList.clear();
        this.mListPool.release(arrayList);
    }
}
