package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeyt {
    public static void zza(java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.internal.ads.zzeys zzeysVar) {
        java.lang.Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzeysVar.zza(obj);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        } catch (java.lang.NullPointerException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
