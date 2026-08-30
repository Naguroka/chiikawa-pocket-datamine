package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class CopyOnWriteMultiset<E> implements java.lang.Iterable<E> {
    private final java.lang.Object lock = new java.lang.Object();
    private final java.util.Map<E, java.lang.Integer> elementCounts = new java.util.HashMap();
    private java.util.Set<E> elementSet = java.util.Collections.emptySet();
    private java.util.List<E> elements = java.util.Collections.emptyList();

    public void add(E e) {
        synchronized (this.lock) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.elements);
            arrayList.add(e);
            this.elements = java.util.Collections.unmodifiableList(arrayList);
            java.lang.Integer num = this.elementCounts.get(e);
            if (num == null) {
                java.util.HashSet hashSet = new java.util.HashSet(this.elementSet);
                hashSet.add(e);
                this.elementSet = java.util.Collections.unmodifiableSet(hashSet);
            }
            this.elementCounts.put(e, java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public void remove(E e) {
        synchronized (this.lock) {
            java.lang.Integer num = this.elementCounts.get(e);
            if (num == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.elements);
            arrayList.remove(e);
            this.elements = java.util.Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.elementCounts.remove(e);
                java.util.HashSet hashSet = new java.util.HashSet(this.elementSet);
                hashSet.remove(e);
                this.elementSet = java.util.Collections.unmodifiableSet(hashSet);
            } else {
                this.elementCounts.put(e, java.lang.Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public java.util.Set<E> elementSet() {
        java.util.Set<E> set;
        synchronized (this.lock) {
            set = this.elementSet;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        java.util.Iterator<E> it;
        synchronized (this.lock) {
            it = this.elements.iterator();
        }
        return it;
    }

    public int count(E e) {
        int iIntValue;
        synchronized (this.lock) {
            iIntValue = this.elementCounts.containsKey(e) ? this.elementCounts.get(e).intValue() : 0;
        }
        return iIntValue;
    }
}
