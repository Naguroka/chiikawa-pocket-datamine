package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class SharedValues {
    public static final int UNSET = -1;
    private android.util.SparseIntArray mValues = new android.util.SparseIntArray();
    private java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>>> mValuesListeners = new java.util.HashMap<>();

    public interface SharedValuesListener {
        void onNewValue(int key, int newValue, int oldValue);
    }

    public void addListener(int key, androidx.constraintlayout.widget.SharedValues.SharedValuesListener listener) {
        java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>> hashSet = this.mValuesListeners.get(java.lang.Integer.valueOf(key));
        if (hashSet == null) {
            hashSet = new java.util.HashSet<>();
            this.mValuesListeners.put(java.lang.Integer.valueOf(key), hashSet);
        }
        hashSet.add(new java.lang.ref.WeakReference<>(listener));
    }

    public void removeListener(int key, androidx.constraintlayout.widget.SharedValues.SharedValuesListener listener) {
        java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>> hashSet = this.mValuesListeners.get(java.lang.Integer.valueOf(key));
        if (hashSet == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener> weakReference : hashSet) {
            androidx.constraintlayout.widget.SharedValues.SharedValuesListener sharedValuesListener = weakReference.get();
            if (sharedValuesListener == null || sharedValuesListener == listener) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }

    public void removeListener(androidx.constraintlayout.widget.SharedValues.SharedValuesListener listener) {
        java.util.Iterator<java.lang.Integer> it = this.mValuesListeners.keySet().iterator();
        while (it.hasNext()) {
            removeListener(it.next().intValue(), listener);
        }
    }

    public void clearListeners() {
        this.mValuesListeners.clear();
    }

    public int getValue(int key) {
        return this.mValues.get(key, -1);
    }

    public void fireNewValue(int key, int value) {
        int i = this.mValues.get(key, -1);
        if (i == value) {
            return;
        }
        this.mValues.put(key, value);
        java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>> hashSet = this.mValuesListeners.get(java.lang.Integer.valueOf(key));
        if (hashSet == null) {
            return;
        }
        java.util.Iterator<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>> it = hashSet.iterator();
        boolean z = false;
        while (it.hasNext()) {
            androidx.constraintlayout.widget.SharedValues.SharedValuesListener sharedValuesListener = it.next().get();
            if (sharedValuesListener != null) {
                sharedValuesListener.onNewValue(key, value, i);
            } else {
                z = true;
            }
        }
        if (z) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener> weakReference : hashSet) {
                if (weakReference.get() == null) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }
}
