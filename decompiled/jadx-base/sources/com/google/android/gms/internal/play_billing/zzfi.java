package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfi<MessageType extends com.google.android.gms.internal.play_billing.zzfi<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.play_billing.zzfe<MessageType, BuilderType>> extends com.google.android.gms.internal.play_billing.zzds<MessageType, BuilderType> {
    private static final java.util.Map zzb = new java.util.concurrent.ConcurrentHashMap();
    private int zzd = -1;
    protected com.google.android.gms.internal.play_billing.zzhi zzc = com.google.android.gms.internal.play_billing.zzhi.zzc();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzA(com.google.android.gms.internal.play_billing.zzfi zzfiVar, boolean z) {
        byte bByteValue = ((java.lang.Byte) zzfiVar.zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = com.google.android.gms.internal.play_billing.zzgs.zza().zzb(zzfiVar.getClass()).zzk(zzfiVar);
        if (z) {
            zzfiVar.zzb(2, true != zZzk ? null : zzfiVar, null);
        }
        return zZzk;
    }

    private final int zzc(com.google.android.gms.internal.play_billing.zzgv zzgvVar) {
        return com.google.android.gms.internal.play_billing.zzgs.zza().zzb(getClass()).zza(this);
    }

    private static com.google.android.gms.internal.play_billing.zzfi zzd(com.google.android.gms.internal.play_billing.zzfi zzfiVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.play_billing.zzeu zzeuVar) throws com.google.android.gms.internal.play_billing.zzfq {
        if (i2 == 0) {
            return zzfiVar;
        }
        com.google.android.gms.internal.play_billing.zzfi zzfiVarZzo = zzfiVar.zzo();
        try {
            com.google.android.gms.internal.play_billing.zzgv zzgvVarZzb = com.google.android.gms.internal.play_billing.zzgs.zza().zzb(zzfiVarZzo.getClass());
            zzgvVarZzb.zzh(zzfiVarZzo, bArr, 0, i2, new com.google.android.gms.internal.play_billing.zzdw(zzeuVar));
            zzgvVarZzb.zzf(zzfiVarZzo);
            return zzfiVarZzo;
        } catch (com.google.android.gms.internal.play_billing.zzfq e) {
            throw e;
        } catch (com.google.android.gms.internal.play_billing.zzhg e2) {
            throw e2.zza();
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.android.gms.internal.play_billing.zzfq) {
                throw ((com.google.android.gms.internal.play_billing.zzfq) e3.getCause());
            }
            throw new com.google.android.gms.internal.play_billing.zzfq(e3);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    static com.google.android.gms.internal.play_billing.zzfi zzn(java.lang.Class cls) {
        java.util.Map map = zzb;
        com.google.android.gms.internal.play_billing.zzfi zzfiVar = (com.google.android.gms.internal.play_billing.zzfi) map.get(cls);
        if (zzfiVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfiVar = (com.google.android.gms.internal.play_billing.zzfi) map.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzfiVar == null) {
            zzfiVar = (com.google.android.gms.internal.play_billing.zzfi) ((com.google.android.gms.internal.play_billing.zzfi) com.google.android.gms.internal.play_billing.zzho.zze(cls)).zzb(6, null, null);
            if (zzfiVar == null) {
                throw new java.lang.IllegalStateException();
            }
            map.put(cls, zzfiVar);
        }
        return zzfiVar;
    }

    protected static com.google.android.gms.internal.play_billing.zzfi zzp(com.google.android.gms.internal.play_billing.zzfi zzfiVar, byte[] bArr, com.google.android.gms.internal.play_billing.zzeu zzeuVar) throws com.google.android.gms.internal.play_billing.zzfq {
        com.google.android.gms.internal.play_billing.zzfi zzfiVarZzd = zzd(zzfiVar, bArr, 0, bArr.length, zzeuVar);
        if (zzfiVarZzd == null || zzA(zzfiVarZzd, true)) {
            return zzfiVarZzd;
        }
        throw new com.google.android.gms.internal.play_billing.zzhg(zzfiVarZzd).zza();
    }

    protected static com.google.android.gms.internal.play_billing.zzfm zzq() {
        return com.google.android.gms.internal.play_billing.zzfj.zzf();
    }

    protected static com.google.android.gms.internal.play_billing.zzfn zzr() {
        return com.google.android.gms.internal.play_billing.zzgt.zze();
    }

    static java.lang.Object zzs(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static java.lang.Object zzt(com.google.android.gms.internal.play_billing.zzgl zzglVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.play_billing.zzgu(zzglVar, str, objArr);
    }

    protected static void zzw(java.lang.Class cls, com.google.android.gms.internal.play_billing.zzfi zzfiVar) {
        zzfiVar.zzv();
        zzb.put(cls, zzfiVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.google.android.gms.internal.play_billing.zzgs.zza().zzb(getClass()).zzj(this, (com.google.android.gms.internal.play_billing.zzfi) obj);
    }

    public final int hashCode() {
        if (zzz()) {
            return zzi();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzi = zzi();
        this.zza = iZzi;
        return iZzi;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.internal.play_billing.zzgn.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final /* synthetic */ com.google.android.gms.internal.play_billing.zzgk zzK() {
        return (com.google.android.gms.internal.play_billing.zzfe) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final void zzL(com.google.android.gms.internal.play_billing.zzep zzepVar) throws java.io.IOException {
        com.google.android.gms.internal.play_billing.zzgs.zza().zzb(getClass()).zzi(this, com.google.android.gms.internal.play_billing.zzeq.zza(zzepVar));
    }

    protected abstract java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2);

    @Override // com.google.android.gms.internal.play_billing.zzds
    final int zze(com.google.android.gms.internal.play_billing.zzgv zzgvVar) {
        if (zzz()) {
            int iZza = zzgvVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzgvVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final /* synthetic */ com.google.android.gms.internal.play_billing.zzgl zzh() {
        return (com.google.android.gms.internal.play_billing.zzfi) zzb(6, null, null);
    }

    final int zzi() {
        return com.google.android.gms.internal.play_billing.zzgs.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final boolean zzk() {
        return zzA(this, true);
    }

    protected final com.google.android.gms.internal.play_billing.zzfe zzl() {
        return (com.google.android.gms.internal.play_billing.zzfe) zzb(5, null, null);
    }

    public final com.google.android.gms.internal.play_billing.zzfe zzm() {
        com.google.android.gms.internal.play_billing.zzfe zzfeVar = (com.google.android.gms.internal.play_billing.zzfe) zzb(5, null, null);
        zzfeVar.zzd(this);
        return zzfeVar;
    }

    final com.google.android.gms.internal.play_billing.zzfi zzo() {
        return (com.google.android.gms.internal.play_billing.zzfi) zzb(4, null, null);
    }

    protected final void zzu() {
        com.google.android.gms.internal.play_billing.zzgs.zza().zzb(getClass()).zzf(this);
        zzv();
    }

    final void zzv() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzx(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean zzz() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final int zzj() {
        int iZzc;
        if (zzz()) {
            iZzc = zzc(null);
            if (iZzc < 0) {
                throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iZzc);
            }
        } else {
            iZzc = this.zzd & Integer.MAX_VALUE;
            if (iZzc == Integer.MAX_VALUE) {
                iZzc = zzc(null);
                if (iZzc < 0) {
                    throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iZzc);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzc;
            }
        }
        return iZzc;
    }
}
