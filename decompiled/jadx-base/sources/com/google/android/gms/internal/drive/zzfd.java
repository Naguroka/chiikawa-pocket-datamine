package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfd extends com.google.android.gms.internal.drive.zzkk<com.google.android.gms.internal.drive.zzfd, com.google.android.gms.internal.drive.zzfd.zza> implements com.google.android.gms.internal.drive.zzls {
    private static volatile com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfd> zzhk;
    private static final com.google.android.gms.internal.drive.zzfd zzhq;
    private int zzhd;
    private byte zzhi = 2;
    private long zzhn = -1;
    private long zzhg = -1;

    private zzfd() {
    }

    public static final class zza extends com.google.android.gms.internal.drive.zzkk.zza<com.google.android.gms.internal.drive.zzfd, com.google.android.gms.internal.drive.zzfd.zza> implements com.google.android.gms.internal.drive.zzls {
        private zza() {
            super(com.google.android.gms.internal.drive.zzfd.zzhq);
        }

        public final com.google.android.gms.internal.drive.zzfd.zza zzi(long j) {
            zzdb();
            ((com.google.android.gms.internal.drive.zzfd) this.zzru).zzf(j);
            return this;
        }

        public final com.google.android.gms.internal.drive.zzfd.zza zzj(long j) {
            zzdb();
            ((com.google.android.gms.internal.drive.zzfd) this.zzru).zza(j);
            return this;
        }

        /* synthetic */ zza(com.google.android.gms.internal.drive.zzfe zzfeVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(long j) {
        this.zzhd |= 1;
        this.zzhn = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(long j) {
        this.zzhd |= 2;
        this.zzhg = j;
    }

    public static com.google.android.gms.internal.drive.zzfd.zza zzap() {
        return zzhq.zzcw();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.drive.zzkk$zzb, com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfd>] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    @Override // com.google.android.gms.internal.drive.zzkk
    protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
        ?? r3;
        com.google.android.gms.internal.drive.zzfe zzfeVar = null;
        switch (com.google.android.gms.internal.drive.zzfe.zzhl[i - 1]) {
            case 1:
                return new com.google.android.gms.internal.drive.zzfd();
            case 2:
                return new com.google.android.gms.internal.drive.zzfd.zza(zzfeVar);
            case 3:
                return zza(zzhq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Ԑ\u0000\u0002Ԑ\u0001", new java.lang.Object[]{"zzhd", "zzhn", "zzhg"});
            case 4:
                return zzhq;
            case 5:
                com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfd> zzmbVar = zzhk;
                java.lang.Object obj3 = zzmbVar;
                if (zzmbVar == null) {
                    synchronized (com.google.android.gms.internal.drive.zzfd.class) {
                        com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfd> zzmbVar2 = zzhk;
                        r3 = zzmbVar2;
                        if (zzmbVar2 == null) {
                            ?? zzbVar = new com.google.android.gms.internal.drive.zzkk.zzb(zzhq);
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
        com.google.android.gms.internal.drive.zzfd zzfdVar = new com.google.android.gms.internal.drive.zzfd();
        zzhq = zzfdVar;
        com.google.android.gms.internal.drive.zzkk.zza((java.lang.Class<com.google.android.gms.internal.drive.zzfd>) com.google.android.gms.internal.drive.zzfd.class, zzfdVar);
    }
}
