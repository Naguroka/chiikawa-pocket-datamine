package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhe extends com.google.android.gms.measurement.internal.zzjr {
    private char zza;
    private long zzb;
    private java.lang.String zzc;
    private final com.google.android.gms.measurement.internal.zzhc zzd;
    private final com.google.android.gms.measurement.internal.zzhc zze;
    private final com.google.android.gms.measurement.internal.zzhc zzf;
    private final com.google.android.gms.measurement.internal.zzhc zzg;
    private final com.google.android.gms.measurement.internal.zzhc zzh;
    private final com.google.android.gms.measurement.internal.zzhc zzi;
    private final com.google.android.gms.measurement.internal.zzhc zzj;
    private final com.google.android.gms.measurement.internal.zzhc zzk;
    private final com.google.android.gms.measurement.internal.zzhc zzl;

    zzhe(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new com.google.android.gms.measurement.internal.zzhc(this, 6, false, false);
        this.zze = new com.google.android.gms.measurement.internal.zzhc(this, 6, true, false);
        this.zzf = new com.google.android.gms.measurement.internal.zzhc(this, 6, false, true);
        this.zzg = new com.google.android.gms.measurement.internal.zzhc(this, 5, false, false);
        this.zzh = new com.google.android.gms.measurement.internal.zzhc(this, 5, true, false);
        this.zzi = new com.google.android.gms.measurement.internal.zzhc(this, 5, false, true);
        this.zzj = new com.google.android.gms.measurement.internal.zzhc(this, 4, false, false);
        this.zzk = new com.google.android.gms.measurement.internal.zzhc(this, 3, false, false);
        this.zzl = new com.google.android.gms.measurement.internal.zzhc(this, 2, false, false);
    }

    protected static java.lang.Object zzn(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new com.google.android.gms.measurement.internal.zzhd(str);
    }

    static java.lang.String zzo(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String strZzp = zzp(z, obj);
        java.lang.String strZzp2 = zzp(z, obj2);
        java.lang.String strZzp3 = zzp(z, obj3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        java.lang.String str3 = ", ";
        if (!android.text.TextUtils.isEmpty(strZzp)) {
            sb.append(str2);
            sb.append(strZzp);
            str2 = ", ";
        }
        if (android.text.TextUtils.isEmpty(strZzp2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strZzp2);
        }
        if (!android.text.TextUtils.isEmpty(strZzp3)) {
            sb.append(str3);
            sb.append(strZzp3);
        }
        return sb.toString();
    }

    static java.lang.String zzp(boolean z, java.lang.Object obj) {
        java.lang.String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof java.lang.Integer) {
            obj = java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
        }
        if (obj instanceof java.lang.Long) {
            if (!z) {
                return obj.toString();
            }
            java.lang.Long l = (java.lang.Long) obj;
            if (java.lang.Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            java.lang.String strValueOf = java.lang.String.valueOf(java.lang.Math.abs(l.longValue()));
            long jRound = java.lang.Math.round(java.lang.Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = java.lang.Math.round(java.lang.Math.pow(10.0d, strValueOf.length()) - 1.0d);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = cCharAt == '-' ? "-" : "";
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof java.lang.Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof java.lang.Throwable)) {
            if (obj instanceof com.google.android.gms.measurement.internal.zzhd) {
                return ((com.google.android.gms.measurement.internal.zzhd) obj).zza;
            }
            return z ? "-" : obj.toString();
        }
        java.lang.Throwable th = (java.lang.Throwable) obj;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(z ? th.getClass().getName() : th.toString());
        java.lang.String strZzq = zzq(com.google.android.gms.measurement.internal.zzio.class.getCanonicalName());
        for (java.lang.StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzq(className).equals(strZzq)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
        }
        return sb2.toString();
    }

    static java.lang.String zzq(java.lang.String str) {
        int iLastIndexOf;
        return (android.text.TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final boolean zzc() {
        return false;
    }

    public final com.google.android.gms.measurement.internal.zzhc zzd() {
        return this.zzk;
    }

    public final com.google.android.gms.measurement.internal.zzhc zze() {
        return this.zzd;
    }

    public final com.google.android.gms.measurement.internal.zzhc zzf() {
        return this.zzf;
    }

    public final com.google.android.gms.measurement.internal.zzhc zzh() {
        return this.zze;
    }

    public final com.google.android.gms.measurement.internal.zzhc zzi() {
        return this.zzj;
    }

    public final com.google.android.gms.measurement.internal.zzhc zzj() {
        return this.zzl;
    }

    public final com.google.android.gms.measurement.internal.zzhc zzk() {
        return this.zzg;
    }

    public final com.google.android.gms.measurement.internal.zzhc zzl() {
        return this.zzi;
    }

    public final com.google.android.gms.measurement.internal.zzhc zzm() {
        return this.zzh;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"logTagDoNotUseDirectly"})
    protected final java.lang.String zzr() {
        java.lang.String str;
        synchronized (this) {
            if (this.zzc == null) {
                com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                if (zzioVar.zzz() != null) {
                    this.zzc = zzioVar.zzz();
                } else {
                    this.zzc = this.zzu.zzf().zzq();
                }
            }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    protected final void zzu(int i, boolean z, boolean z2, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (!z && android.util.Log.isLoggable(zzr(), i)) {
            android.util.Log.println(i, zzr(), zzo(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.measurement.internal.zzil zzilVarZzo = this.zzu.zzo();
        if (zzilVarZzo == null) {
            android.util.Log.println(6, zzr(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzilVarZzo.zzy()) {
                android.util.Log.println(6, zzr(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            zzilVarZzo.zzq(new com.google.android.gms.measurement.internal.zzhb(this, i, str, obj, obj2, obj3));
        }
    }
}
