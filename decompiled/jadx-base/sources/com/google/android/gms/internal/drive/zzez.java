package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzez extends com.google.android.gms.internal.drive.zzkk<com.google.android.gms.internal.drive.zzez, com.google.android.gms.internal.drive.zzez.zza> implements com.google.android.gms.internal.drive.zzls {
    private static final com.google.android.gms.internal.drive.zzez zzhj;
    private static volatile com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzez> zzhk;
    private int zzhd;
    private byte zzhi = 2;
    private int zzhe = 1;
    private long zzhf = -1;
    private long zzhg = -1;
    private long zzhh = -1;

    private zzez() {
    }

    public static final class zza extends com.google.android.gms.internal.drive.zzkk.zza<com.google.android.gms.internal.drive.zzez, com.google.android.gms.internal.drive.zzez.zza> implements com.google.android.gms.internal.drive.zzls {
        private zza() {
            super(com.google.android.gms.internal.drive.zzez.zzhj);
        }

        public final com.google.android.gms.internal.drive.zzez.zza zzk(int i) {
            zzdb();
            ((com.google.android.gms.internal.drive.zzez) this.zzru).zzj(1);
            return this;
        }

        public final com.google.android.gms.internal.drive.zzez.zza zzc(long j) {
            zzdb();
            ((com.google.android.gms.internal.drive.zzez) this.zzru).setSequenceNumber(j);
            return this;
        }

        public final com.google.android.gms.internal.drive.zzez.zza zzd(long j) {
            zzdb();
            ((com.google.android.gms.internal.drive.zzez) this.zzru).zza(j);
            return this;
        }

        public final com.google.android.gms.internal.drive.zzez.zza zze(long j) {
            zzdb();
            ((com.google.android.gms.internal.drive.zzez) this.zzru).zzb(j);
            return this;
        }

        /* synthetic */ zza(com.google.android.gms.internal.drive.zzfa zzfaVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(int i) {
        this.zzhd |= 1;
        this.zzhe = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSequenceNumber(long j) {
        this.zzhd |= 2;
        this.zzhf = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(long j) {
        this.zzhd |= 4;
        this.zzhg = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(long j) {
        this.zzhd |= 8;
        this.zzhh = j;
    }

    public static com.google.android.gms.internal.drive.zzez.zza zzaj() {
        return zzhj.zzcw();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.drive.zzkk$zzb, com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzez>] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    @Override // com.google.android.gms.internal.drive.zzkk
    protected final java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2) {
        ?? r3;
        com.google.android.gms.internal.drive.zzfa zzfaVar = null;
        switch (com.google.android.gms.internal.drive.zzfa.zzhl[i - 1]) {
            case 1:
                return new com.google.android.gms.internal.drive.zzez();
            case 2:
                return new com.google.android.gms.internal.drive.zzez.zza(zzfaVar);
            case 3:
                return zza(zzhj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001Ԅ\u0000\u0002Ԑ\u0001\u0003Ԑ\u0002\u0004Ԑ\u0003", new java.lang.Object[]{"zzhd", "zzhe", "zzhf", "zzhg", "zzhh"});
            case 4:
                return zzhj;
            case 5:
                com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzez> zzmbVar = zzhk;
                java.lang.Object obj3 = zzmbVar;
                if (zzmbVar == null) {
                    synchronized (com.google.android.gms.internal.drive.zzez.class) {
                        com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzez> zzmbVar2 = zzhk;
                        r3 = zzmbVar2;
                        if (zzmbVar2 == null) {
                            ?? zzbVar = new com.google.android.gms.internal.drive.zzkk.zzb(zzhj);
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
        com.google.android.gms.internal.drive.zzez zzezVar = new com.google.android.gms.internal.drive.zzez();
        zzhj = zzezVar;
        com.google.android.gms.internal.drive.zzkk.zza((java.lang.Class<com.google.android.gms.internal.drive.zzez>) com.google.android.gms.internal.drive.zzez.class, zzezVar);
    }
}
