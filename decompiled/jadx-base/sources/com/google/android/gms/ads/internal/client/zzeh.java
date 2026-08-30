package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeh {
    private java.lang.String zzg;
    private java.lang.String zzi;
    private java.lang.String zzj;
    private boolean zzl;
    private java.lang.String zzm;
    private final java.util.HashSet zza = new java.util.HashSet();
    private final android.os.Bundle zzb = new android.os.Bundle();
    private final java.util.HashMap zzc = new java.util.HashMap();
    private final java.util.HashSet zzd = new java.util.HashSet();
    private final android.os.Bundle zze = new android.os.Bundle();
    private final java.util.HashSet zzf = new java.util.HashSet();
    private final java.util.List zzh = new java.util.ArrayList();
    private int zzk = -1;
    private int zzn = 60000;

    public final void zzA(android.os.Bundle bundle) {
        this.zzb.putAll(bundle);
    }

    public final void zzB(java.lang.String str) {
        this.zzi = str;
    }

    public final void zzC(java.lang.String str) {
        this.zzj = str;
    }

    @java.lang.Deprecated
    public final void zzD(boolean z) {
        this.zzk = z ? 1 : 0;
    }

    public final void zzn(java.lang.String str) {
        this.zzf.add(str);
    }

    public final void zzo(java.lang.Class cls, android.os.Bundle bundle) {
        if (this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzb.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new android.os.Bundle());
        }
        android.os.Bundle bundle2 = this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle2);
        bundle2.putBundle(cls.getName(), bundle);
    }

    public final void zzp(java.lang.String str, java.lang.String str2) {
        this.zze.putString(str, str2);
    }

    public final void zzq(java.lang.String str) {
        this.zza.add(str);
    }

    public final void zzr(java.lang.Class cls, android.os.Bundle bundle) {
        this.zzb.putBundle(cls.getName(), bundle);
    }

    @java.lang.Deprecated
    public final void zzs(com.google.android.gms.ads.mediation.NetworkExtras networkExtras) {
        this.zzc.put(networkExtras.getClass(), networkExtras);
    }

    public final void zzt(java.lang.String str) {
        this.zzd.add(str);
    }

    public final void zzu(java.lang.String str) {
        this.zzd.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzv(java.lang.String str) {
        this.zzm = str;
    }

    public final void zzw(java.lang.String str) {
        this.zzg = str;
    }

    public final void zzx(int i) {
        this.zzn = i;
    }

    @java.lang.Deprecated
    public final void zzy(boolean z) {
        this.zzl = z;
    }

    public final void zzz(java.util.List list) {
        this.zzh.clear();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (android.text.TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("neighboring content URL should not be null or empty");
            } else {
                this.zzh.add(str);
            }
        }
    }
}
