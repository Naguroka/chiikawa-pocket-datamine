package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbc {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.play_billing.zzbb zzb;
    private com.google.android.gms.internal.play_billing.zzbb zzc;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        com.google.android.gms.internal.play_billing.zzbb zzbbVar = this.zzb.zzb;
        java.lang.String str = "";
        while (zzbbVar != null) {
            java.lang.Object obj = zzbbVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                java.lang.String strDeepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                sb.append((java.lang.CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzbbVar = zzbbVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final com.google.android.gms.internal.play_billing.zzbc zza(java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.zzbb zzbbVar = new com.google.android.gms.internal.play_billing.zzbb();
        this.zzc.zzb = zzbbVar;
        this.zzc = zzbbVar;
        zzbbVar.zza = obj;
        return this;
    }

    /* synthetic */ zzbc(java.lang.String str, com.google.android.gms.internal.play_billing.zzbd zzbdVar) {
        com.google.android.gms.internal.play_billing.zzbb zzbbVar = new com.google.android.gms.internal.play_billing.zzbb();
        this.zzb = zzbbVar;
        this.zzc = zzbbVar;
        str.getClass();
        this.zza = str;
    }
}
