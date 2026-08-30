package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfty implements com.google.android.gms.internal.ads.zzfuo {
    protected zzfty() {
    }

    public static com.google.android.gms.internal.ads.zzfty zzc(char c) {
        return new com.google.android.gms.internal.ads.zzftv(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    @java.lang.Deprecated
    public final /* synthetic */ boolean zza(java.lang.Object obj) {
        return zzb(((java.lang.Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
