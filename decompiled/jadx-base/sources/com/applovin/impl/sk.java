package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sk implements com.applovin.impl.af.b {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
