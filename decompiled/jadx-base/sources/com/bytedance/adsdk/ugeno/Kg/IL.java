package com.bytedance.adsdk.ugeno.Kg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IL {
    private android.database.DataSetObserver IL;
    private final android.database.DataSetObservable bg = new android.database.DataSetObservable();

    public android.os.Parcelable IL() {
        return null;
    }

    public float bg(int i) {
        return 1.0f;
    }

    public abstract int bg();

    public int bg(java.lang.Object obj) {
        return -1;
    }

    public abstract boolean bg(android.view.View view, java.lang.Object obj);

    public java.lang.Object bg(android.view.ViewGroup viewGroup, int i) {
        return bg((android.view.View) viewGroup, i);
    }

    public void bg(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        bg((android.view.View) viewGroup, i, obj);
    }

    @java.lang.Deprecated
    public java.lang.Object bg(android.view.View view, int i) {
        throw new java.lang.UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @java.lang.Deprecated
    public void bg(android.view.View view, int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void bX() {
        synchronized (this) {
            android.database.DataSetObserver dataSetObserver = this.IL;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.bg.notifyChanged();
    }

    void bg(android.database.DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.IL = dataSetObserver;
        }
    }
}
