package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfb extends com.google.android.gms.internal.drive.zzkk<com.google.android.gms.internal.drive.zzfb, com.google.android.gms.internal.drive.zzfb.zza> implements com.google.android.gms.internal.drive.zzls {
    private static volatile com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfb> zzhk;
    private static final com.google.android.gms.internal.drive.zzfb zzhp;
    private int zzhd;
    private byte zzhi = 2;
    private int zzhe = 1;
    private java.lang.String zzhm = "";
    private long zzhn = -1;
    private long zzhg = -1;
    private int zzho = -1;

    private zzfb() {
    }

    public static final class zza extends com.google.android.gms.internal.drive.zzkk.zza<com.google.android.gms.internal.drive.zzfb, com.google.android.gms.internal.drive.zzfb.zza> implements com.google.android.gms.internal.drive.zzls {
        private zza() {
            super(com.google.android.gms.internal.drive.zzfb.zzhp);
        }

        public final com.google.android.gms.internal.drive.zzfb.zza zzm(int i) {
            zzdb();
            ((com.google.android.gms.internal.drive.zzfb) this.zzru).zzj(1);
            return this;
        }

        public final com.google.android.gms.internal.drive.zzfb.zza zze(java.lang.String str) {
            zzdb();
            ((com.google.android.gms.internal.drive.zzfb) this.zzru).zzd(str);
            return this;
        }

        public final com.google.android.gms.internal.drive.zzfb.zza zzg(long j) {
            zzdb();
            ((com.google.android.gms.internal.drive.zzfb) this.zzru).zzf(j);
            return this;
        }

        public final com.google.android.gms.internal.drive.zzfb.zza zzh(long j) {
            zzdb();
            ((com.google.android.gms.internal.drive.zzfb) this.zzru).zza(j);
            return this;
        }

        public final com.google.android.gms.internal.drive.zzfb.zza zzn(int i) {
            zzdb();
            ((com.google.android.gms.internal.drive.zzfb) this.zzru).zzl(i);
            return this;
        }

        /* synthetic */ zza(com.google.android.gms.internal.drive.zzfc zzfcVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(int i) {
        this.zzhd |= 1;
        this.zzhe = i;
    }

    public final java.lang.String getResourceId() {
        return this.zzhm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(java.lang.String str) {
        str.getClass();
        this.zzhd |= 2;
        this.zzhm = str;
    }

    public final long zzal() {
        return this.zzhn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(long j) {
        this.zzhd |= 4;
        this.zzhn = j;
    }

    public final long zzam() {
        return this.zzhg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(long j) {
        this.zzhd |= 8;
        this.zzhg = j;
    }

    public final int getResourceType() {
        return this.zzho;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(int i) {
        this.zzhd |= 16;
        this.zzho = i;
    }

    public static com.google.android.gms.internal.drive.zzfb zza(byte[] bArr, com.google.android.gms.internal.drive.zzjx zzjxVar) throws com.google.android.gms.internal.drive.zzkq {
        return (com.google.android.gms.internal.drive.zzfb) com.google.android.gms.internal.drive.zzkk.zza(zzhp, bArr, zzjxVar);
    }

    public static com.google.android.gms.internal.drive.zzfb.zza zzan() {
        return zzhp.zzcw();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.drive.zzkk$zzb, com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfb>] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    @Override // com.google.android.gms.internal.drive.zzkk
    protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
        ?? r3;
        com.google.android.gms.internal.drive.zzfc zzfcVar = null;
        switch (com.google.android.gms.internal.drive.zzfc.zzhl[i - 1]) {
            case 1:
                return new com.google.android.gms.internal.drive.zzfb();
            case 2:
                return new com.google.android.gms.internal.drive.zzfb.zza(zzfcVar);
            case 3:
                return zza(zzhp, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001Ԅ\u0000\u0002Ԉ\u0001\u0003Ԑ\u0002\u0004Ԑ\u0003\u0005\u0004\u0004", new java.lang.Object[]{"zzhd", "zzhe", "zzhm", "zzhn", "zzhg", "zzho"});
            case 4:
                return zzhp;
            case 5:
                com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfb> zzmbVar = zzhk;
                java.lang.Object obj3 = zzmbVar;
                if (zzmbVar == null) {
                    synchronized (com.google.android.gms.internal.drive.zzfb.class) {
                        com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfb> zzmbVar2 = zzhk;
                        r3 = zzmbVar2;
                        if (zzmbVar2 == null) {
                            ?? zzbVar = new com.google.android.gms.internal.drive.zzkk.zzb(zzhp);
                            zzhk = zzbVar;
                            r3 = zzbVar;
                        }
                        break;
                    }
                    obj3 = r3;
                }
                return obj3;
            case 6:
                return java.lang.Byte.valueOf(this.zzhi);
            case 7:
                this.zzhi = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        com.google.android.gms.internal.drive.zzfb zzfbVar = new com.google.android.gms.internal.drive.zzfb();
        zzhp = zzfbVar;
        com.google.android.gms.internal.drive.zzkk.zza((java.lang.Class<com.google.android.gms.internal.drive.zzfb>) com.google.android.gms.internal.drive.zzfb.class, zzfbVar);
    }
}
