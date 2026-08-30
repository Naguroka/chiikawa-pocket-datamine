package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewModel {
    private final java.util.Map<java.lang.String, java.lang.Object> mBagOfTags;
    private volatile boolean mCleared;
    private final java.util.Set<java.io.Closeable> mCloseables;

    protected void onCleared() {
    }

    public ViewModel() {
        this.mBagOfTags = new java.util.HashMap();
        this.mCloseables = new java.util.LinkedHashSet();
        this.mCleared = false;
    }

    public ViewModel(java.io.Closeable... closeableArr) {
        this.mBagOfTags = new java.util.HashMap();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        this.mCloseables = linkedHashSet;
        this.mCleared = false;
        linkedHashSet.addAll(java.util.Arrays.asList(closeableArr));
    }

    public void addCloseable(java.io.Closeable closeable) {
        if (this.mCleared) {
            closeWithRuntimeException(closeable);
            return;
        }
        java.util.Set<java.io.Closeable> set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                this.mCloseables.add(closeable);
            }
        }
    }

    final void clear() {
        this.mCleared = true;
        java.util.Map<java.lang.String, java.lang.Object> map = this.mBagOfTags;
        if (map != null) {
            synchronized (map) {
                java.util.Iterator<java.lang.Object> it = this.mBagOfTags.values().iterator();
                while (it.hasNext()) {
                    closeWithRuntimeException(it.next());
                }
            }
        }
        java.util.Set<java.io.Closeable> set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                java.util.Iterator<java.io.Closeable> it2 = this.mCloseables.iterator();
                while (it2.hasNext()) {
                    closeWithRuntimeException(it2.next());
                }
            }
            this.mCloseables.clear();
        }
        onCleared();
    }

    <T> T setTagIfAbsent(java.lang.String str, T t) {
        java.lang.Object obj;
        synchronized (this.mBagOfTags) {
            obj = this.mBagOfTags.get(str);
            if (obj == null) {
                this.mBagOfTags.put(str, t);
            }
        }
        if (obj != null) {
            t = (T) obj;
        }
        if (this.mCleared) {
            closeWithRuntimeException(t);
        }
        return t;
    }

    <T> T getTag(java.lang.String str) {
        T t;
        java.util.Map<java.lang.String, java.lang.Object> map = this.mBagOfTags;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.mBagOfTags.get(str);
        }
        return t;
    }

    private static void closeWithRuntimeException(java.lang.Object obj) {
        if (obj instanceof java.io.Closeable) {
            try {
                ((java.io.Closeable) obj).close();
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }
}
