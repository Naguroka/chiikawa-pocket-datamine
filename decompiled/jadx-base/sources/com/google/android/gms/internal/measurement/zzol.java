package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzol {
    static final long zza;
    static final boolean zzb;
    private static final sun.misc.Unsafe zzc;
    private static final java.lang.Class zzd;
    private static final boolean zze;
    private static final com.google.android.gms.internal.measurement.zzok zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    static {
        boolean z;
        boolean z2;
        com.google.android.gms.internal.measurement.zzok zzokVar;
        sun.misc.Unsafe unsafeZzg = zzg();
        zzc = unsafeZzg;
        int i = com.google.android.gms.internal.measurement.zzkr.zza;
        zzd = libcore.io.Memory.class;
        boolean zZzv = zzv(java.lang.Long.TYPE);
        zze = zZzv;
        boolean zZzv2 = zzv(java.lang.Integer.TYPE);
        com.google.android.gms.internal.measurement.zzok zzoiVar = null;
        if (unsafeZzg != null) {
            if (zZzv) {
                zzoiVar = new com.google.android.gms.internal.measurement.zzoj(unsafeZzg);
            } else if (zZzv2) {
                zzoiVar = new com.google.android.gms.internal.measurement.zzoi(unsafeZzg);
            }
        }
        zzf = zzoiVar;
        if (zzoiVar == null) {
            z = false;
        } else {
            try {
                java.lang.Class<?> cls = zzoiVar.zza.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                if (zzB() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (java.lang.Throwable th) {
                zzh(th);
            }
        }
        zzg = z;
        com.google.android.gms.internal.measurement.zzok zzokVar2 = zzf;
        if (zzokVar2 == null) {
            z2 = false;
        } else {
            try {
                java.lang.Class<?> cls2 = zzokVar2.zza.getClass();
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
                zzh(th2);
                z2 = false;
            }
        }
        zzh = z2;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(java.lang.Object[].class);
        zzA(java.lang.Object[].class);
        java.lang.reflect.Field fieldZzB = zzB();
        if (fieldZzB != null && (zzokVar = zzf) != null) {
            zzokVar.zza.objectFieldOffset(fieldZzB);
        }
        zzb = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private zzol() {
    }

    private static int zzA(java.lang.Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field zzB() {
        int i = com.google.android.gms.internal.measurement.zzkr.zza;
        java.lang.reflect.Field fieldZzC = zzC(java.nio.Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        java.lang.reflect.Field fieldZzC2 = zzC(java.nio.Buffer.class, org.jacoco.core.runtime.AgentOptions.ADDRESS);
        if (fieldZzC2 == null || fieldZzC2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    private static java.lang.reflect.Field zzC(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(java.lang.Object obj, long j, byte b) {
        sun.misc.Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(java.lang.Object obj, long j, byte b) {
        sun.misc.Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    static double zza(java.lang.Object obj, long j) {
        return zzf.zza(obj, j);
    }

    static float zzb(java.lang.Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static int zzc(java.lang.Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    static long zzd(java.lang.Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    static java.lang.Object zze(java.lang.Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    static java.lang.Object zzf(java.lang.Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    static sun.misc.Unsafe zzg() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.measurement.zzoh());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.zzol.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void zzm(java.lang.Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    static void zzn(byte[] bArr, long j, byte b) {
        zzf.zzd(bArr, zza + j, b);
    }

    static void zzo(java.lang.Object obj, long j, double d) {
        zzf.zze(obj, j, d);
    }

    static void zzp(java.lang.Object obj, long j, float f) {
        zzf.zzf(obj, j, f);
    }

    static void zzq(java.lang.Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    static void zzr(java.lang.Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    static void zzs(java.lang.Object obj, long j, java.lang.Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzt(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzu(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzv(java.lang.Class cls) {
        int i = com.google.android.gms.internal.measurement.zzkr.zza;
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

    static boolean zzw(java.lang.Object obj, long j) {
        return zzf.zzg(obj, j);
    }

    static boolean zzx() {
        return zzh;
    }

    static boolean zzy() {
        return zzg;
    }

    private static int zzz(java.lang.Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
