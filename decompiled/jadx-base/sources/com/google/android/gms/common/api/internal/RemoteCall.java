package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface RemoteCall<T, U> {
    void accept(T t, U u) throws android.os.RemoteException;
}
