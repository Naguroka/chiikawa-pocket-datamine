package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzgxl<MessageType extends com.google.android.gms.internal.ads.zzgxr<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzgxl<MessageType, BuilderType>> extends com.google.android.gms.internal.ads.zzgvr<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    protected zzgxl(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzcd()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        com.google.android.gms.internal.ads.zzgzm.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    protected /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgvr zzaD(com.google.android.gms.internal.ads.zzgvs zzgvsVar) {
        zzbi((com.google.android.gms.internal.ads.zzgxr) zzgvsVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    /* JADX INFO: renamed from: zzaK */
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgvr zzaW(com.google.android.gms.internal.ads.zzgwp zzgwpVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        zzbk(zzgwpVar, zzgxbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    /* JADX INFO: renamed from: zzaN */
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgvr zzaZ(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgyg {
        zzbl(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    /* JADX INFO: renamed from: zzaO */
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgvr zzba(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        zzbm(bArr, i, i2, zzgxbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgzb zzaW(com.google.android.gms.internal.ads.zzgwp zzgwpVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        zzbk(zzgwpVar, zzgxbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgzb zzaZ(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgyg {
        zzbl(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgzb zzba(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        zzbm(bArr, i, i2, zzgxbVar);
        return this;
    }

    public final BuilderType zzbg() {
        if (this.zzb.zzcd()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    /* JADX INFO: renamed from: zzbh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzaP() {
        BuilderType buildertype = (BuilderType) zzbt().zzcX();
        buildertype.zza = (MessageType) zzbs();
        return buildertype;
    }

    protected BuilderType zzbi(MessageType messagetype) {
        zzbj(messagetype);
        return this;
    }

    public BuilderType zzbj(MessageType messagetype) {
        if (zzbt().equals(messagetype)) {
            return this;
        }
        zzbu();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbk(com.google.android.gms.internal.ads.zzgwp zzgwpVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        zzbu();
        try {
            com.google.android.gms.internal.ads.zzgzm.zza().zzb(this.zza.getClass()).zzh(this.zza, com.google.android.gms.internal.ads.zzgwq.zzq(zzgwpVar), zzgxbVar);
            return this;
        } catch (java.lang.RuntimeException e) {
            if (e.getCause() instanceof java.io.IOException) {
                throw ((java.io.IOException) e.getCause());
            }
            throw e;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgyg {
        int i3 = com.google.android.gms.internal.ads.zzgxb.zzb;
        int i4 = com.google.android.gms.internal.ads.zzgzm.zza;
        zzbm(bArr, i, i2, com.google.android.gms.internal.ads.zzgxb.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        zzbu();
        try {
            com.google.android.gms.internal.ads.zzgzm.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i, i + i2, new com.google.android.gms.internal.ads.zzgvx(zzgxbVar));
            return this;
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: zzbn, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbr() {
        MessageType messagetype = (MessageType) zzbs();
        if (messagetype.zzbw()) {
            return messagetype;
        }
        throw zzbb(messagetype);
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    /* JADX INFO: renamed from: zzbo, reason: merged with bridge method [inline-methods] */
    public MessageType zzbs() {
        if (!this.zza.zzcd()) {
            return this.zza;
        }
        this.zza.zzbU();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzd
    /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgzb zzbq() {
        zzbg();
        return this;
    }

    protected final void zzbu() {
        if (this.zza.zzcd()) {
            return;
        }
        zzbv();
    }

    protected void zzbv() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzgzd
    public final boolean zzbw() {
        return com.google.android.gms.internal.ads.zzgxr.zzk(this.zza, false);
    }
}
