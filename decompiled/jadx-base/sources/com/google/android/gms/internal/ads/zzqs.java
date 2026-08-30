package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzqs extends com.google.android.gms.internal.ads.zzsn implements com.google.android.gms.internal.ads.zzkk {
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzpe zzc;
    private final com.google.android.gms.internal.ads.zzpm zzd;
    private final com.google.android.gms.internal.ads.zzrz zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private com.google.android.gms.internal.ads.zzab zzi;
    private com.google.android.gms.internal.ads.zzab zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqs(android.content.Context context, com.google.android.gms.internal.ads.zzsb zzsbVar, com.google.android.gms.internal.ads.zzsp zzspVar, boolean z, android.os.Handler handler, com.google.android.gms.internal.ads.zzpf zzpfVar, com.google.android.gms.internal.ads.zzpm zzpmVar) {
        super(1, zzsbVar, zzspVar, false, 44100.0f);
        com.google.android.gms.internal.ads.zzqr zzqrVar = null;
        com.google.android.gms.internal.ads.zzrz zzrzVar = com.google.android.gms.internal.ads.zzei.zza >= 35 ? new com.google.android.gms.internal.ads.zzrz(com.google.android.gms.internal.ads.zzry.zza) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzpmVar;
        this.zze = zzrzVar;
        this.zzo = -1000;
        this.zzc = new com.google.android.gms.internal.ads.zzpe(handler, zzpfVar);
        zzpmVar.zzq(new com.google.android.gms.internal.ads.zzqq(this, zzqrVar));
    }

    private final int zzaQ(com.google.android.gms.internal.ads.zzsg zzsgVar, com.google.android.gms.internal.ads.zzab zzabVar) {
        if (!"OMX.google.raw.decoder".equals(zzsgVar.zza) || com.google.android.gms.internal.ads.zzei.zza >= 24 || (com.google.android.gms.internal.ads.zzei.zza == 23 && com.google.android.gms.internal.ads.zzei.zzM(this.zzb))) {
            return zzabVar.zzp;
        }
        return -1;
    }

    private static java.util.List zzaR(com.google.android.gms.internal.ads.zzsp zzspVar, com.google.android.gms.internal.ads.zzab zzabVar, boolean z, com.google.android.gms.internal.ads.zzpm zzpmVar) throws com.google.android.gms.internal.ads.zzsu {
        com.google.android.gms.internal.ads.zzsg zzsgVarZza;
        if (zzabVar.zzo == null) {
            return com.google.android.gms.internal.ads.zzfxn.zzn();
        }
        return (!zzpmVar.zzA(zzabVar) || (zzsgVarZza = com.google.android.gms.internal.ads.zzta.zza()) == null) ? com.google.android.gms.internal.ads.zzta.zze(zzspVar, zzabVar, false, false) : com.google.android.gms.internal.ads.zzfxn.zzo(zzsgVarZza);
    }

    private final void zzaS() {
        long jZzb = this.zzd.zzb(zzW());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzb = java.lang.Math.max(this.zzk, jZzb);
            }
            this.zzk = jZzb;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final void zzA() {
        com.google.android.gms.internal.ads.zzrz zzrzVar;
        this.zzd.zzk();
        if (com.google.android.gms.internal.ads.zzei.zza < 35 || (zzrzVar = this.zze) == null) {
            return;
        }
        zzrzVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    protected final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzm) {
            }
        } finally {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final void zzE() {
        zzaS();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzlj, com.google.android.gms.internal.ads.zzlm
    public final java.lang.String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzlj
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzlj
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final float zzZ(float f, com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzab[] zzabVarArr) {
        int iMax = -1;
        for (com.google.android.gms.internal.ads.zzab zzabVar2 : zzabVarArr) {
            int i = zzabVar2.zzE;
            if (i != -1) {
                iMax = java.lang.Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final long zza() {
        if (zzcT() == 2) {
            zzaS();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final int zzaa(com.google.android.gms.internal.ads.zzsp zzspVar, com.google.android.gms.internal.ads.zzab zzabVar) throws com.google.android.gms.internal.ads.zzsu {
        int i;
        boolean z;
        if (!com.google.android.gms.internal.ads.zzbb.zzg(zzabVar.zzo)) {
            return 128;
        }
        int i2 = zzabVar.zzK;
        boolean zZzaP = zzaP(zzabVar);
        int i3 = 1;
        if (!zZzaP || (i2 != 0 && com.google.android.gms.internal.ads.zzta.zza() == null)) {
            i = 0;
        } else {
            com.google.android.gms.internal.ads.zzor zzorVarZzd = this.zzd.zzd(zzabVar);
            if (zzorVarZzd.zzb) {
                i = true != zzorVarZzd.zzc ? 512 : 1536;
                if (zzorVarZzd.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (this.zzd.zzA(zzabVar)) {
                return i | 172;
            }
        }
        if ((!androidx.media3.common.MimeTypes.AUDIO_RAW.equals(zzabVar.zzo) || this.zzd.zzA(zzabVar)) && this.zzd.zzA(com.google.android.gms.internal.ads.zzei.zzA(2, zzabVar.zzD, zzabVar.zzE))) {
            java.util.List listZzaR = zzaR(zzspVar, zzabVar, false, this.zzd);
            if (!listZzaR.isEmpty()) {
                if (zZzaP) {
                    com.google.android.gms.internal.ads.zzsg zzsgVar = (com.google.android.gms.internal.ads.zzsg) listZzaR.get(0);
                    boolean zZze = zzsgVar.zze(zzabVar);
                    if (!zZze) {
                        int i4 = 1;
                        while (true) {
                            if (i4 >= listZzaR.size()) {
                                z = true;
                                break;
                            }
                            com.google.android.gms.internal.ads.zzsg zzsgVar2 = (com.google.android.gms.internal.ads.zzsg) listZzaR.get(i4);
                            if (zzsgVar2.zze(zzabVar)) {
                                z = false;
                                zZze = true;
                                zzsgVar = zzsgVar2;
                                break;
                            }
                            i4++;
                        }
                    } else {
                        z = true;
                        break;
                    }
                    int i5 = true != zZze ? 3 : 4;
                    int i6 = 8;
                    if (zZze && zzsgVar.zzf(zzabVar)) {
                        i6 = 16;
                    }
                    return i5 | i6 | 32 | (true != zzsgVar.zzg ? 0 : 64) | (true != z ? 0 : 128) | i;
                }
                i3 = 2;
            }
        }
        return i3 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final com.google.android.gms.internal.ads.zzht zzab(com.google.android.gms.internal.ads.zzsg zzsgVar, com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzab zzabVar2) {
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzht zzhtVarZzb = zzsgVar.zzb(zzabVar, zzabVar2);
        int i3 = zzhtVarZzb.zze;
        if (zzaM(zzabVar2)) {
            i3 |= 32768;
        }
        if (zzaQ(zzsgVar, zzabVar2) > this.zzf) {
            i3 |= 64;
        }
        java.lang.String str = zzsgVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzhtVarZzb.zzd;
            i2 = 0;
        }
        return new com.google.android.gms.internal.ads.zzht(str, zzabVar, zzabVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final com.google.android.gms.internal.ads.zzsa zzaf(com.google.android.gms.internal.ads.zzsg zzsgVar, com.google.android.gms.internal.ads.zzab zzabVar, android.media.MediaCrypto mediaCrypto, float f) {
        com.google.android.gms.internal.ads.zzab[] zzabVarArrZzT = zzT();
        int length = zzabVarArrZzT.length;
        int iZzaQ = zzaQ(zzsgVar, zzabVar);
        if (length != 1) {
            for (com.google.android.gms.internal.ads.zzab zzabVar2 : zzabVarArrZzT) {
                if (zzsgVar.zzb(zzabVar, zzabVar2).zzd != 0) {
                    iZzaQ = java.lang.Math.max(iZzaQ, zzaQ(zzsgVar, zzabVar2));
                }
            }
        }
        this.zzf = iZzaQ;
        this.zzg = com.google.android.gms.internal.ads.zzei.zza < 24 && "OMX.SEC.aac.dec".equals(zzsgVar.zza) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(com.google.android.gms.internal.ads.zzei.zzc) && (com.google.android.gms.internal.ads.zzei.zzb.startsWith("zeroflte") || com.google.android.gms.internal.ads.zzei.zzb.startsWith("herolte") || com.google.android.gms.internal.ads.zzei.zzb.startsWith("heroqlte"));
        java.lang.String str = zzsgVar.zza;
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        java.lang.String str2 = zzsgVar.zzc;
        int i = this.zzf;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str2);
        mediaFormat.setInteger("channel-count", zzabVar.zzD);
        mediaFormat.setInteger("sample-rate", zzabVar.zzE);
        com.google.android.gms.internal.ads.zzdr.zzb(mediaFormat, zzabVar.zzr);
        com.google.android.gms.internal.ads.zzdr.zza(mediaFormat, "max-input-size", i);
        if (com.google.android.gms.internal.ads.zzei.zza >= 23) {
            mediaFormat.setInteger(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f && (com.google.android.gms.internal.ads.zzei.zza != 23 || (!"ZTE B2017G".equals(com.google.android.gms.internal.ads.zzei.zzd) && !"AXON 7 mini".equals(com.google.android.gms.internal.ads.zzei.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (com.google.android.gms.internal.ads.zzei.zza <= 28 && androidx.media3.common.MimeTypes.AUDIO_AC4.equals(zzabVar.zzo)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (com.google.android.gms.internal.ads.zzei.zza >= 24 && this.zzd.zza(com.google.android.gms.internal.ads.zzei.zzA(4, zzabVar.zzD, zzabVar.zzE)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (com.google.android.gms.internal.ads.zzei.zza >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (com.google.android.gms.internal.ads.zzei.zza >= 35) {
            mediaFormat.setInteger("importance", java.lang.Math.max(0, -this.zzo));
        }
        this.zzj = (!androidx.media3.common.MimeTypes.AUDIO_RAW.equals(zzsgVar.zzb) || androidx.media3.common.MimeTypes.AUDIO_RAW.equals(zzabVar.zzo)) ? null : zzabVar;
        return com.google.android.gms.internal.ads.zzsa.zza(zzsgVar, mediaFormat, zzabVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final java.util.List zzag(com.google.android.gms.internal.ads.zzsp zzspVar, com.google.android.gms.internal.ads.zzab zzabVar, boolean z) throws com.google.android.gms.internal.ads.zzsu {
        return com.google.android.gms.internal.ads.zzta.zzf(zzaR(zzspVar, zzabVar, false, this.zzd), zzabVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzaj(com.google.android.gms.internal.ads.zzhh zzhhVar) {
        com.google.android.gms.internal.ads.zzab zzabVar;
        if (com.google.android.gms.internal.ads.zzei.zza < 29 || (zzabVar = zzhhVar.zza) == null || !java.util.Objects.equals(zzabVar.zzo, androidx.media3.common.MimeTypes.AUDIO_OPUS) || !zzaL()) {
            return;
        }
        java.nio.ByteBuffer byteBuffer = zzhhVar.zzf;
        byteBuffer.getClass();
        com.google.android.gms.internal.ads.zzab zzabVar2 = zzhhVar.zza;
        zzabVar2.getClass();
        int i = zzabVar2.zzG;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzr(i, (int) ((byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / androidx.media3.common.C.NANOS_PER_SECOND));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzak(java.lang.Exception exc) {
        com.google.android.gms.internal.ads.zzdo.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzal(java.lang.String str, com.google.android.gms.internal.ads.zzsa zzsaVar, long j, long j2) {
        this.zzc.zze(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzam(java.lang.String str) {
        this.zzc.zzf(str);
    }

    protected final void zzao() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzap() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzaq() throws com.google.android.gms.internal.ads.zzib {
        try {
            this.zzd.zzj();
        } catch (com.google.android.gms.internal.ads.zzpl e) {
            throw zzcW(e, e.zzc, e.zzb, true != zzaL() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final boolean zzas(com.google.android.gms.internal.ads.zzab zzabVar) {
        zzn();
        return this.zzd.zzA(zzabVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final com.google.android.gms.internal.ads.zzbe zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzg(com.google.android.gms.internal.ads.zzbe zzbeVar) {
        this.zzd.zzs(zzbeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final boolean zzj() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzlj
    public final com.google.android.gms.internal.ads.zzkk zzl() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    protected final void zzx() {
        this.zzm = true;
        this.zzi = null;
        try {
            this.zzd.zzf();
            super.zzx();
        } catch (java.lang.Throwable th) {
            super.zzx();
            throw th;
        } finally {
            this.zzc.zzg(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    protected final void zzy(boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzib {
        super.zzy(z, z2);
        this.zzc.zzh(this.zza);
        zzn();
        this.zzd.zzt(zzo());
        this.zzd.zzp(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    protected final void zzz(long j, boolean z) throws com.google.android.gms.internal.ads.zzib {
        super.zzz(j, z);
        this.zzd.zzf();
        this.zzk = j;
        this.zzn = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final com.google.android.gms.internal.ads.zzht zzac(com.google.android.gms.internal.ads.zzke zzkeVar) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzab zzabVar = zzkeVar.zza;
        zzabVar.getClass();
        this.zzi = zzabVar;
        com.google.android.gms.internal.ads.zzht zzhtVarZzac = super.zzac(zzkeVar);
        this.zzc.zzi(zzabVar, zzhtVarZzac);
        return zzhtVarZzac;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final boolean zzar(long j, long j2, com.google.android.gms.internal.ads.zzsd zzsdVar, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, com.google.android.gms.internal.ads.zzab zzabVar) throws com.google.android.gms.internal.ads.zzib {
        byteBuffer.getClass();
        if (this.zzj != null && (i2 & 2) != 0) {
            zzsdVar.getClass();
            zzsdVar.zzo(i, false);
            return true;
        }
        if (z) {
            if (zzsdVar != null) {
                zzsdVar.zzo(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzx(byteBuffer, j3, i3)) {
                return false;
            }
            if (zzsdVar != null) {
                zzsdVar.zzo(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (com.google.android.gms.internal.ads.zzpi e) {
            com.google.android.gms.internal.ads.zzab zzabVar2 = this.zzi;
            if (zzaL()) {
                zzn();
            }
            throw zzcW(e, zzabVar2, e.zzb, 5001);
        } catch (com.google.android.gms.internal.ads.zzpl e2) {
            if (zzaL()) {
                zzn();
            }
            throw zzcW(e2, zzabVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzle
    public final void zzu(int i, java.lang.Object obj) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzrz zzrzVar;
        if (i == 2) {
            com.google.android.gms.internal.ads.zzpm zzpmVar = this.zzd;
            obj.getClass();
            zzpmVar.zzw(((java.lang.Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            com.google.android.gms.internal.ads.zze zzeVar = (com.google.android.gms.internal.ads.zze) obj;
            com.google.android.gms.internal.ads.zzpm zzpmVar2 = this.zzd;
            zzeVar.getClass();
            zzpmVar2.zzm(zzeVar);
            return;
        }
        if (i == 6) {
            com.google.android.gms.internal.ads.zzf zzfVar = (com.google.android.gms.internal.ads.zzf) obj;
            com.google.android.gms.internal.ads.zzpm zzpmVar3 = this.zzd;
            zzfVar.getClass();
            zzpmVar3.zzo(zzfVar);
            return;
        }
        if (i == 12) {
            if (com.google.android.gms.internal.ads.zzei.zza >= 23) {
                this.zzd.zzu((android.media.AudioDeviceInfo) obj);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzo = ((java.lang.Integer) obj).intValue();
            com.google.android.gms.internal.ads.zzsd zzsdVarZzaz = zzaz();
            if (zzsdVarZzaz == null || com.google.android.gms.internal.ads.zzei.zza < 35) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("importance", java.lang.Math.max(0, -this.zzo));
            zzsdVarZzaz.zzq(bundle);
            return;
        }
        if (i == 9) {
            com.google.android.gms.internal.ads.zzpm zzpmVar4 = this.zzd;
            obj.getClass();
            zzpmVar4.zzv(((java.lang.Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.zzu(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((java.lang.Integer) obj).intValue();
            this.zzd.zzn(iIntValue);
            if (com.google.android.gms.internal.ads.zzei.zza < 35 || (zzrzVar = this.zze) == null) {
                return;
            }
            zzrzVar.zzd(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzan(com.google.android.gms.internal.ads.zzab zzabVar, android.media.MediaFormat mediaFormat) throws com.google.android.gms.internal.ads.zzib {
        int iZzn;
        int[] iArr;
        int i;
        com.google.android.gms.internal.ads.zzab zzabVar2 = this.zzj;
        int[] iArr2 = null;
        if (zzabVar2 != null) {
            zzabVar = zzabVar2;
        } else if (zzaz() != null) {
            mediaFormat.getClass();
            if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(zzabVar.zzo)) {
                iZzn = zzabVar.zzF;
            } else if (com.google.android.gms.internal.ads.zzei.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iZzn = mediaFormat.containsKey("v-bits-per-sample") ? com.google.android.gms.internal.ads.zzei.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iZzn = mediaFormat.getInteger("pcm-encoding");
            }
            com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
            zzzVar.zzaa(androidx.media3.common.MimeTypes.AUDIO_RAW);
            zzzVar.zzU(iZzn);
            zzzVar.zzG(zzabVar.zzG);
            zzzVar.zzH(zzabVar.zzH);
            zzzVar.zzT(zzabVar.zzl);
            java.lang.Object obj = zzabVar.zzm;
            zzzVar.zzM(zzabVar.zza);
            zzzVar.zzO(zzabVar.zzb);
            zzzVar.zzP(zzabVar.zzc);
            zzzVar.zzQ(zzabVar.zzd);
            zzzVar.zzac(zzabVar.zze);
            zzzVar.zzY(zzabVar.zzf);
            zzzVar.zzz(mediaFormat.getInteger("channel-count"));
            zzzVar.zzab(mediaFormat.getInteger("sample-rate"));
            com.google.android.gms.internal.ads.zzab zzabVarZzag = zzzVar.zzag();
            if (this.zzg && zzabVarZzag.zzD == 6 && (i = zzabVar.zzD) < 6) {
                iArr2 = new int[i];
                for (int i2 = 0; i2 < zzabVar.zzD; i2++) {
                    iArr2[i2] = i2;
                }
            } else if (this.zzh) {
                int i3 = zzabVarZzag.zzD;
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
                iArr2 = iArr;
            }
            zzabVar = zzabVarZzag;
        }
        try {
            if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
                if (zzaL()) {
                    zzn();
                }
                com.google.android.gms.internal.ads.zzcw.zzf(com.google.android.gms.internal.ads.zzei.zza >= 29);
            }
            this.zzd.zze(zzabVar, 0, iArr2);
        } catch (com.google.android.gms.internal.ads.zzph e) {
            throw zzcW(e, e.zza, false, 5001);
        }
    }
}
