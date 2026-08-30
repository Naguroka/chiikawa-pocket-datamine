package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzy implements java.lang.Iterable {
    final /* synthetic */ java.lang.CharSequence zza;
    final /* synthetic */ com.google.android.gms.internal.common.zzaa zzb;

    zzy(com.google.android.gms.internal.common.zzaa zzaaVar, java.lang.CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzaaVar;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.zzb.zzh(this.zza);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('[');
        java.util.Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(com.google.android.gms.internal.common.zzt.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((java.lang.CharSequence) ", ");
                    sb.append(com.google.android.gms.internal.common.zzt.zza(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
