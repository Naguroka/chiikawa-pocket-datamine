package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzhao {
    static final long zza;
    static final boolean zzb;
    private static final sun.misc.Unsafe zzc;
    private static final java.lang.Class zzd;
    private static final boolean zze;
    private static final com.google.android.gms.internal.ads.zzhan zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    static {
        boolean z;
        boolean z2;
        com.google.android.gms.internal.ads.zzhan zzhanVar;
        sun.misc.Unsafe unsafeZzi = zzi();
        zzc = unsafeZzi;
        int i = com.google.android.gms.internal.ads.zzgvw.zza;
        zzd = libcore.io.Memory.class;
        boolean zZzy = zzy(java.lang.Long.TYPE);
        zze = zZzy;
        boolean zZzy2 = zzy(java.lang.Integer.TYPE);
        com.google.android.gms.internal.ads.zzhan zzhalVar = null;
        if (unsafeZzi != null) {
            if (zZzy) {
                zzhalVar = new com.google.android.gms.internal.ads.zzham(unsafeZzi);
            } else if (zZzy2) {
                zzhalVar = new com.google.android.gms.internal.ads.zzhal(unsafeZzi);
            }
        }
        zzf = zzhalVar;
        if (zzhalVar == null) {
            z = false;
        } else {
            try {
                java.lang.Class<?> cls = zzhalVar.zza.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                if (zzE() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (java.lang.Throwable th) {
                zzj(th);
            }
        }
        zzg = z;
        com.google.android.gms.internal.ads.zzhan zzhanVar2 = zzf;
        if (zzhanVar2 == null) {
            z2 = false;
        } else {
            try {
                java.lang.Class<?> cls2 = zzhanVar2.zza.getClass();
                cls2.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls2.getMethod("arrayBaseOffset", java.lang.Class.class);
                cls2.getMethod("arrayIndexScale", java.lang.Class.class);
                cls2.getMethod("getInt", java.lang.Object.class, java.lang.Long.TYPE);
                cls2.getMethod("putInt", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                cls2.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                cls2.getMethod("putLong", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
                cls2.getMethod("getObject", java.lang.Object.class, java.lang.Long.TYPE);
                cls2.getMethod("putObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
                z2 = true;
            } catch (java.lang.Throwable th2) {
                zzj(th2);
                z2 = false;
            }
        }
        zzh = z2;
        zza = zzC(byte[].class);
        zzC(boolean[].class);
        zzD(boolean[].class);
        zzC(int[].class);
        zzD(int[].class);
        zzC(long[].class);
        zzD(long[].class);
        zzC(float[].class);
        zzD(float[].class);
        zzC(double[].class);
        zzD(double[].class);
        zzC(java.lang.Object[].class);
        zzD(java.lang.Object[].class);
        java.lang.reflect.Field fieldZzE = zzE();
        long jObjectFieldOffset = -1;
        if (fieldZzE != null && (zzhanVar = zzf) != null) {
            jObjectFieldOffset = zzhanVar.zza.objectFieldOffset(fieldZzE);
        }
        zzi = jObjectFieldOffset;
        zzb = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private zzhao() {
    }

    static boolean zzA() {
        return zzh;
    }

    static boolean zzB() {
        return zzg;
    }

    private static int zzC(java.lang.Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(java.lang.Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field zzE() {
        int i = com.google.android.gms.internal.ads.zzgvw.zza;
        java.lang.reflect.Field fieldZzF = zzF(java.nio.Buffer.class, "effectiveDirectAddress");
        if (fieldZzF != null) {
            return fieldZzF;
        }
        java.lang.reflect.Field fieldZzF2 = zzF(java.nio.Buffer.class, org.jacoco.core.runtime.AgentOptions.ADDRESS);
        if (fieldZzF2 == null || fieldZzF2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return fieldZzF2;
    }

    private static java.lang.reflect.Field zzF(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(java.lang.Object obj, long j, byte b) {
        com.google.android.gms.internal.ads.zzhan zzhanVar = zzf;
        long j2 = (-4) & j;
        int i = zzhanVar.zza.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        zzhanVar.zza.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(java.lang.Object obj, long j, byte b) {
        com.google.android.gms.internal.ads.zzhan zzhanVar = zzf;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zzhanVar.zza.putInt(obj, j2, ((255 & b) << i) | (zzhanVar.zza.getInt(obj, j2) & (~(255 << i))));
    }

    static byte zza(long j) {
        return zzf.zza(j);
    }

    static double zzb(java.lang.Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static float zzc(java.lang.Object obj, long j) {
        return zzf.zzc(obj, j);
    }

    static int zzd(java.lang.Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    static long zze(java.nio.ByteBuffer byteBuffer) {
        com.google.android.gms.internal.ads.zzhan zzhanVar = zzf;
        return zzhanVar.zza.getLong(byteBuffer, zzi);
    }

    static long zzf(java.lang.Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    static java.lang.Object zzg(java.lang.Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    static java.lang.Object zzh(java.lang.Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    static sun.misc.Unsafe zzi() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.zzhak());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzj(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzhao.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void zzo(long j, byte[] bArr, long j2, long j3) {
        zzf.zzd(j, bArr, j2, j3);
    }

    static void zzp(java.lang.Object obj, long j, boolean z) {
        zzf.zze(obj, j, z);
    }

    static void zzq(byte[] bArr, long j, byte b) {
        zzf.zzf(bArr, zza + j, b);
    }

    static void zzr(java.lang.Object obj, long j, double d) {
        zzf.zzg(obj, j, d);
    }

    static void zzs(java.lang.Object obj, long j, float f) {
        zzf.zzh(obj, j, f);
    }

    static void zzt(java.lang.Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    static void zzu(java.lang.Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    static void zzv(java.lang.Object obj, long j, java.lang.Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzw(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzx(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzy(java.lang.Class cls) {
        int i = com.google.android.gms.internal.ads.zzgvw.zza;
        try {
            java.lang.Class cls2 = zzd;
            cls2.getMethod("peekLong", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("peekInt", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    static boolean zzz(java.lang.Object obj, long j) {
        return zzf.zzi(obj, j);
    }
}
