package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzlz<MessageType extends com.google.android.gms.internal.measurement.zzmd<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzlz<MessageType, BuilderType>> extends com.google.android.gms.internal.measurement.zzkn<MessageType, BuilderType> {
    protected com.google.android.gms.internal.measurement.zzmd zza;
    private final com.google.android.gms.internal.measurement.zzmd zzb;

    protected zzlz(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzcw()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzcj();
    }

    private static void zza(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.zznp.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzkn zzaS(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.measurement.zzmm {
        int i3 = com.google.android.gms.internal.measurement.zzlp.zzb;
        int i4 = com.google.android.gms.internal.measurement.zznp.zza;
        zzaZ(bArr, 0, i2, com.google.android.gms.internal.measurement.zzlp.zza);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzkn zzaT(byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzlp zzlpVar) throws com.google.android.gms.internal.measurement.zzmm {
        zzaZ(bArr, 0, i2, zzlpVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    /* JADX INFO: renamed from: zzaX, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzlz zzaR() {
        com.google.android.gms.internal.measurement.zzlz zzlzVar = (com.google.android.gms.internal.measurement.zzlz) this.zzb.zzl(5, null, null);
        zzlzVar.zza = zzbc();
        return zzlzVar;
    }

    public final com.google.android.gms.internal.measurement.zzlz zzaY(com.google.android.gms.internal.measurement.zzmd zzmdVar) {
        if (!this.zzb.equals(zzmdVar)) {
            if (!this.zza.zzcw()) {
                zzbf();
            }
            zza(this.zza, zzmdVar);
        }
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzlz zzaZ(byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzlp zzlpVar) throws com.google.android.gms.internal.measurement.zzmm {
        if (!this.zza.zzcw()) {
            zzbf();
        }
        try {
            com.google.android.gms.internal.measurement.zznp.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i2, new com.google.android.gms.internal.measurement.zzks(zzlpVar));
            return this;
        } catch (com.google.android.gms.internal.measurement.zzmm e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.google.android.gms.internal.measurement.zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final MessageType zzba() {
        MessageType messagetype = (MessageType) zzbc();
        if (messagetype.zzcD()) {
            return messagetype;
        }
        throw new com.google.android.gms.internal.measurement.zzod(messagetype);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    /* JADX INFO: renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public MessageType zzbc() {
        if (!this.zza.zzcw()) {
            return (MessageType) this.zza;
        }
        this.zza.zzcr();
        return (MessageType) this.zza;
    }

    protected final void zzbe() {
        if (this.zza.zzcw()) {
            return;
        }
        zzbf();
    }

    protected void zzbf() {
        com.google.android.gms.internal.measurement.zzmd zzmdVarZzcj = this.zzb.zzcj();
        zza(zzmdVarZzcj, this.zza);
        this.zza = zzmdVarZzcj;
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zznh zzcC() {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final boolean zzcD() {
        return com.google.android.gms.internal.measurement.zzmd.zzd(this.zza, false);
    }
}
