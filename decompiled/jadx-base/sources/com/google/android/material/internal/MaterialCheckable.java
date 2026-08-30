package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public interface MaterialCheckable<T extends com.google.android.material.internal.MaterialCheckable<T>> extends android.widget.Checkable {

    public interface OnCheckedChangeListener<C> {
        void onCheckedChanged(C c, boolean z);
    }

    int getId();

    void setInternalOnCheckedChangeListener(com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener<T> onCheckedChangeListener);
}
