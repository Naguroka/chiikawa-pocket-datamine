package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgx {
    protected static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    protected static final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference();
    protected static final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();
    private final com.google.android.gms.measurement.internal.zzgw zzd;

    public zzgx(com.google.android.gms.measurement.internal.zzgw zzgwVar) {
        this.zzd = zzgwVar;
    }

    private static final java.lang.String zzg(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2, java.util.concurrent.atomic.AtomicReference atomicReference) {
        java.lang.String str2;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(atomicReference);
        com.google.android.gms.common.internal.Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (java.util.Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    java.lang.String[] strArr3 = (java.lang.String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new java.lang.String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final java.lang.String zza(java.lang.Object[] objArr) {
        if (objArr == null) {
            return okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.ironsource.y8.i.d);
        for (java.lang.Object obj : objArr) {
            java.lang.String strZzb = obj instanceof android.os.Bundle ? zzb((android.os.Bundle) obj) : java.lang.String.valueOf(obj);
            if (strZzb != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strZzb);
            }
        }
        sb.append(com.ironsource.y8.i.e);
        return sb.toString();
    }

    protected final java.lang.String zzb(android.os.Bundle bundle) {
        java.lang.String strZza;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Bundle[{");
        for (java.lang.String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(zze(str));
            sb.append(com.ironsource.y8.i.b);
            java.lang.Object obj = bundle.get(str);
            if (obj instanceof android.os.Bundle) {
                strZza = zza(new java.lang.Object[]{obj});
            } else if (obj instanceof java.lang.Object[]) {
                strZza = zza((java.lang.Object[]) obj);
            } else {
                strZza = obj instanceof java.util.ArrayList ? zza(((java.util.ArrayList) obj).toArray()) : java.lang.String.valueOf(obj);
            }
            sb.append(strZza);
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final java.lang.String zzc(com.google.android.gms.measurement.internal.zzbh zzbhVar) {
        java.lang.String string;
        com.google.android.gms.measurement.internal.zzgw zzgwVar = this.zzd;
        if (!zzgwVar.zza()) {
            return zzbhVar.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("origin=");
        sb.append(zzbhVar.zzc);
        sb.append(",name=");
        sb.append(zzd(zzbhVar.zza));
        sb.append(",params=");
        com.google.android.gms.measurement.internal.zzbf zzbfVar = zzbhVar.zzb;
        if (zzbfVar == null) {
            string = null;
        } else {
            string = !zzgwVar.zza() ? zzbfVar.toString() : zzb(zzbfVar.zzc());
        }
        sb.append(string);
        return sb.toString();
    }

    protected final java.lang.String zzd(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, com.google.android.gms.measurement.internal.zzjy.zzc, com.google.android.gms.measurement.internal.zzjy.zza, zza);
    }

    protected final java.lang.String zze(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, com.google.android.gms.measurement.internal.zzjz.zzb, com.google.android.gms.measurement.internal.zzjz.zza, zzb);
    }

    protected final java.lang.String zzf(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return zzg(str, com.google.android.gms.measurement.internal.zzka.zzb, com.google.android.gms.measurement.internal.zzka.zza, zzc);
        }
        return "experiment_id(" + str + ")";
    }
}
