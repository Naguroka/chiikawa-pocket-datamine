package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class HashAccumulator {
    private int zaa = 1;

    public com.google.android.gms.auth.api.signin.internal.HashAccumulator addObject(java.lang.Object obj) {
        this.zaa = (this.zaa * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int hash() {
        return this.zaa;
    }

    public final com.google.android.gms.auth.api.signin.internal.HashAccumulator zaa(boolean z) {
        this.zaa = (this.zaa * 31) + (z ? 1 : 0);
        return this;
    }
}
