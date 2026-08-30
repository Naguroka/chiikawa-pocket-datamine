package com.google.android.gms.appset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AppSet {
    private AppSet() {
    }

    public static com.google.android.gms.appset.AppSetIdClient getClient(android.content.Context context) {
        return new com.google.android.gms.internal.appset.zzr(context);
    }
}
