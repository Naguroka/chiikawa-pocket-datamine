package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzde extends com.google.android.gms.internal.consent_sdk.zzdb {
    static final com.google.android.gms.internal.consent_sdk.zzde zza;
    private static final java.lang.Object[] zzd;
    final transient java.lang.Object[] zzb;
    final transient java.lang.Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        zzd = objArr;
        zza = new com.google.android.gms.internal.consent_sdk.zzde(objArr, 0, objArr, 0, 0);
    }

    zzde(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj != null) {
            java.lang.Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iZza = com.google.android.gms.internal.consent_sdk.zzcw.zza(obj.hashCode());
                while (true) {
                    int i = iZza & this.zzf;
                    java.lang.Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZza = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, com.google.android.gms.internal.consent_sdk.zzcx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, com.google.android.gms.internal.consent_sdk.zzcx
    /* JADX INFO: renamed from: zzd */
    public final com.google.android.gms.internal.consent_sdk.zzdg iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    final java.lang.Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    final com.google.android.gms.internal.consent_sdk.zzda zzh() {
        return com.google.android.gms.internal.consent_sdk.zzda.zzg(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb
    final boolean zzk() {
        return true;
    }
}
