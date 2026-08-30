package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzmd<MessageType extends com.google.android.gms.internal.measurement.zzmd<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzlz<MessageType, BuilderType>> extends com.google.android.gms.internal.measurement.zzko<MessageType, BuilderType> {
    private static final java.util.Map zzb = new java.util.concurrent.ConcurrentHashMap();
    private int zzd = -1;
    protected com.google.android.gms.internal.measurement.zzof zzc = com.google.android.gms.internal.measurement.zzof.zzc();

    private final int zzc(com.google.android.gms.internal.measurement.zzns zznsVar) {
        return com.google.android.gms.internal.measurement.zznp.zza().zzb(getClass()).zza(this);
    }

    static com.google.android.gms.internal.measurement.zzmd zzci(java.lang.Class cls) {
        java.util.Map map = zzb;
        com.google.android.gms.internal.measurement.zzmd zzmdVar = (com.google.android.gms.internal.measurement.zzmd) map.get(cls);
        if (zzmdVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzmdVar = (com.google.android.gms.internal.measurement.zzmd) map.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzmdVar == null) {
            zzmdVar = (com.google.android.gms.internal.measurement.zzmd) ((com.google.android.gms.internal.measurement.zzmd) com.google.android.gms.internal.measurement.zzol.zze(cls)).zzl(6, null, null);
            if (zzmdVar == null) {
                throw new java.lang.IllegalStateException();
            }
            map.put(cls, zzmdVar);
        }
        return zzmdVar;
    }

    protected static com.google.android.gms.internal.measurement.zzmh zzck() {
        return com.google.android.gms.internal.measurement.zzme.zzf();
    }

    protected static com.google.android.gms.internal.measurement.zzmi zzcl() {
        return com.google.android.gms.internal.measurement.zzmw.zzf();
    }

    protected static com.google.android.gms.internal.measurement.zzmi zzcm(com.google.android.gms.internal.measurement.zzmi zzmiVar) {
        int size = zzmiVar.size();
        return zzmiVar.zzd(size + size);
    }

    protected static com.google.android.gms.internal.measurement.zzmj zzcn() {
        return com.google.android.gms.internal.measurement.zznq.zze();
    }

    protected static com.google.android.gms.internal.measurement.zzmj zzco(com.google.android.gms.internal.measurement.zzmj zzmjVar) {
        int size = zzmjVar.size();
        return zzmjVar.zzd(size + size);
    }

    static java.lang.Object zzcp(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    protected static java.lang.Object zzcq(com.google.android.gms.internal.measurement.zznh zznhVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.measurement.zznr(zznhVar, str, objArr);
    }

    protected static void zzct(java.lang.Class cls, com.google.android.gms.internal.measurement.zzmd zzmdVar) {
        zzmdVar.zzcs();
        zzb.put(cls, zzmdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzd(com.google.android.gms.internal.measurement.zzmd zzmdVar, boolean z) {
        byte bByteValue = ((java.lang.Byte) zzmdVar.zzl(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = com.google.android.gms.internal.measurement.zznp.zza().zzb(zzmdVar.getClass()).zzk(zzmdVar);
        if (z) {
            zzmdVar.zzl(2, true != zZzk ? null : zzmdVar, null);
        }
        return zZzk;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.google.android.gms.internal.measurement.zznp.zza().zzb(getClass()).zzj(this, (com.google.android.gms.internal.measurement.zzmd) obj);
    }

    public final int hashCode() {
        if (zzcw()) {
            return zzce();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzce = zzce();
        this.zza = iZzce;
        return iZzce;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.internal.measurement.zznj.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzng zzcA() {
        return (com.google.android.gms.internal.measurement.zzlz) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final void zzcB(com.google.android.gms.internal.measurement.zzlk zzlkVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zznp.zza().zzb(getClass()).zzi(this, com.google.android.gms.internal.measurement.zzll.zza(zzlkVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final /* synthetic */ com.google.android.gms.internal.measurement.zznh zzcC() {
        return (com.google.android.gms.internal.measurement.zzmd) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final boolean zzcD() {
        return zzd(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    final int zzca(com.google.android.gms.internal.measurement.zzns zznsVar) {
        if (zzcw()) {
            int iZza = zznsVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zznsVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    final int zzce() {
        return com.google.android.gms.internal.measurement.zznp.zza().zzb(getClass()).zzb(this);
    }

    protected final com.google.android.gms.internal.measurement.zzlz zzcg() {
        return (com.google.android.gms.internal.measurement.zzlz) zzl(5, null, null);
    }

    public final com.google.android.gms.internal.measurement.zzlz zzch() {
        com.google.android.gms.internal.measurement.zzlz zzlzVar = (com.google.android.gms.internal.measurement.zzlz) zzl(5, null, null);
        zzlzVar.zzaY(this);
        return zzlzVar;
    }

    final com.google.android.gms.internal.measurement.zzmd zzcj() {
        return (com.google.android.gms.internal.measurement.zzmd) zzl(4, null, null);
    }

    protected final void zzcr() {
        com.google.android.gms.internal.measurement.zznp.zza().zzb(getClass()).zzf(this);
        zzcs();
    }

    final void zzcs() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzcu(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean zzcw() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2);

    @Override // com.google.android.gms.internal.measurement.zznh
    public final int zzcf() {
        int iZzc;
        if (zzcw()) {
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
