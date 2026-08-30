package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zznd {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.drive.zznd.class.getName());
    private static final java.lang.Class<?> zzni;
    private static final boolean zzog;
    private static final sun.misc.Unsafe zzuc;
    private static final boolean zzvy;
    private static final boolean zzvz;
    private static final com.google.android.gms.internal.drive.zznd.zzd zzwa;
    private static final boolean zzwb;
    private static final long zzwc;
    private static final long zzwd;
    private static final long zzwe;
    private static final long zzwf;
    private static final long zzwg;
    private static final long zzwh;
    private static final long zzwi;
    private static final long zzwj;
    private static final long zzwk;
    private static final long zzwl;
    private static final long zzwm;
    private static final long zzwn;
    private static final long zzwo;
    private static final long zzwp;
    private static final int zzwq;
    static final boolean zzwr;

    private zznd() {
    }

    static final class zza extends com.google.android.gms.internal.drive.zznd.zzd {
        zza(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final byte zzx(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.drive.zznd.zzwr) {
                return com.google.android.gms.internal.drive.zznd.zzp(obj, j);
            }
            return com.google.android.gms.internal.drive.zznd.zzq(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zze(java.lang.Object obj, long j, byte b) {
            if (com.google.android.gms.internal.drive.zznd.zzwr) {
                com.google.android.gms.internal.drive.zznd.zza(obj, j, b);
            } else {
                com.google.android.gms.internal.drive.zznd.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final boolean zzl(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.drive.zznd.zzwr) {
                return com.google.android.gms.internal.drive.zznd.zzr(obj, j);
            }
            return com.google.android.gms.internal.drive.zznd.zzs(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(java.lang.Object obj, long j, boolean z) {
            if (com.google.android.gms.internal.drive.zznd.zzwr) {
                com.google.android.gms.internal.drive.zznd.zzb(obj, j, z);
            } else {
                com.google.android.gms.internal.drive.zznd.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final float zzm(java.lang.Object obj, long j) {
            return java.lang.Float.intBitsToFloat(zzj(obj, j));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(java.lang.Object obj, long j, float f) {
            zza(obj, j, java.lang.Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final double zzn(java.lang.Object obj, long j) {
            return java.lang.Double.longBitsToDouble(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(java.lang.Object obj, long j, double d) {
            zza(obj, j, java.lang.Double.doubleToLongBits(d));
        }
    }

    static final class zzb extends com.google.android.gms.internal.drive.zznd.zzd {
        zzb(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final byte zzx(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.drive.zznd.zzwr) {
                return com.google.android.gms.internal.drive.zznd.zzp(obj, j);
            }
            return com.google.android.gms.internal.drive.zznd.zzq(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zze(java.lang.Object obj, long j, byte b) {
            if (com.google.android.gms.internal.drive.zznd.zzwr) {
                com.google.android.gms.internal.drive.zznd.zza(obj, j, b);
            } else {
                com.google.android.gms.internal.drive.zznd.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final boolean zzl(java.lang.Object obj, long j) {
            if (com.google.android.gms.internal.drive.zznd.zzwr) {
                return com.google.android.gms.internal.drive.zznd.zzr(obj, j);
            }
            return com.google.android.gms.internal.drive.zznd.zzs(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(java.lang.Object obj, long j, boolean z) {
            if (com.google.android.gms.internal.drive.zznd.zzwr) {
                com.google.android.gms.internal.drive.zznd.zzb(obj, j, z);
            } else {
                com.google.android.gms.internal.drive.zznd.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final float zzm(java.lang.Object obj, long j) {
            return java.lang.Float.intBitsToFloat(zzj(obj, j));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(java.lang.Object obj, long j, float f) {
            zza(obj, j, java.lang.Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final double zzn(java.lang.Object obj, long j) {
            return java.lang.Double.longBitsToDouble(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(java.lang.Object obj, long j, double d) {
            zza(obj, j, java.lang.Double.doubleToLongBits(d));
        }
    }

    static final class zzc extends com.google.android.gms.internal.drive.zznd.zzd {
        zzc(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final byte zzx(java.lang.Object obj, long j) {
            return this.zzws.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zze(java.lang.Object obj, long j, byte b) {
            this.zzws.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final boolean zzl(java.lang.Object obj, long j) {
            return this.zzws.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(java.lang.Object obj, long j, boolean z) {
            this.zzws.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final float zzm(java.lang.Object obj, long j) {
            return this.zzws.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(java.lang.Object obj, long j, float f) {
            this.zzws.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final double zzn(java.lang.Object obj, long j) {
            return this.zzws.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(java.lang.Object obj, long j, double d) {
            this.zzws.putDouble(obj, j, d);
        }
    }

    static boolean zzfd() {
        return zzog;
    }

    static abstract class zzd {
        sun.misc.Unsafe zzws;

        zzd(sun.misc.Unsafe unsafe) {
            this.zzws = unsafe;
        }

        public abstract void zza(java.lang.Object obj, long j, double d);

        public abstract void zza(java.lang.Object obj, long j, float f);

        public abstract void zza(java.lang.Object obj, long j, boolean z);

        public abstract void zze(java.lang.Object obj, long j, byte b);

        public abstract boolean zzl(java.lang.Object obj, long j);

        public abstract float zzm(java.lang.Object obj, long j);

        public abstract double zzn(java.lang.Object obj, long j);

        public abstract byte zzx(java.lang.Object obj, long j);

        public final int zzj(java.lang.Object obj, long j) {
            return this.zzws.getInt(obj, j);
        }

        public final void zza(java.lang.Object obj, long j, int i) {
            this.zzws.putInt(obj, j, i);
        }

        public final long zzk(java.lang.Object obj, long j) {
            return this.zzws.getLong(obj, j);
        }

        public final void zza(java.lang.Object obj, long j, long j2) {
            this.zzws.putLong(obj, j, j2);
        }
    }

    static boolean zzfe() {
        return zzwb;
    }

    static <T> T zzh(java.lang.Class<T> cls) {
        try {
            return (T) zzuc.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    private static int zzi(java.lang.Class<?> cls) {
        if (zzog) {
            return zzwa.zzws.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzj(java.lang.Class<?> cls) {
        if (zzog) {
            return zzwa.zzws.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzj(java.lang.Object obj, long j) {
        return zzwa.zzj(obj, j);
    }

    static void zza(java.lang.Object obj, long j, int i) {
        zzwa.zza(obj, j, i);
    }

    static long zzk(java.lang.Object obj, long j) {
        return zzwa.zzk(obj, j);
    }

    static void zza(java.lang.Object obj, long j, long j2) {
        zzwa.zza(obj, j, j2);
    }

    static boolean zzl(java.lang.Object obj, long j) {
        return zzwa.zzl(obj, j);
    }

    static void zza(java.lang.Object obj, long j, boolean z) {
        zzwa.zza(obj, j, z);
    }

    static float zzm(java.lang.Object obj, long j) {
        return zzwa.zzm(obj, j);
    }

    static void zza(java.lang.Object obj, long j, float f) {
        zzwa.zza(obj, j, f);
    }

    static double zzn(java.lang.Object obj, long j) {
        return zzwa.zzn(obj, j);
    }

    static void zza(java.lang.Object obj, long j, double d) {
        zzwa.zza(obj, j, d);
    }

    static java.lang.Object zzo(java.lang.Object obj, long j) {
        return zzwa.zzws.getObject(obj, j);
    }

    static void zza(java.lang.Object obj, long j, java.lang.Object obj2) {
        zzwa.zzws.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzwa.zzx(bArr, zzwc + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzwa.zze(bArr, zzwc + j, b);
    }

    static sun.misc.Unsafe zzff() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.drive.zzne());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static boolean zzfg() {
        sun.misc.Unsafe unsafe = zzuc;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", java.lang.Class.class);
            cls.getMethod("arrayIndexScale", java.lang.Class.class);
            cls.getMethod("getInt", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putInt", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE);
            cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putLong", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
            cls.getMethod("getObject", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
            if (com.google.android.gms.internal.drive.zzix.zzbr()) {
                return true;
            }
            cls.getMethod("getByte", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putByte", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Byte.TYPE);
            cls.getMethod("getBoolean", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putBoolean", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls.getMethod("getFloat", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putFloat", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Float.TYPE);
            cls.getMethod("getDouble", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putDouble", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Double.TYPE);
            return true;
        } catch (java.lang.Throwable th) {
            java.util.logging.Logger logger2 = logger;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.String strValueOf = java.lang.String.valueOf(th);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(strValueOf).toString());
            return false;
        }
    }

    private static boolean zzfh() {
        sun.misc.Unsafe unsafe = zzuc;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
            if (zzfi() == null) {
                return false;
            }
            if (com.google.android.gms.internal.drive.zzix.zzbr()) {
                return true;
            }
            cls.getMethod("getByte", java.lang.Long.TYPE);
            cls.getMethod("putByte", java.lang.Long.TYPE, java.lang.Byte.TYPE);
            cls.getMethod("getInt", java.lang.Long.TYPE);
            cls.getMethod("putInt", java.lang.Long.TYPE, java.lang.Integer.TYPE);
            cls.getMethod("getLong", java.lang.Long.TYPE);
            cls.getMethod("putLong", java.lang.Long.TYPE, java.lang.Long.TYPE);
            cls.getMethod("copyMemory", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
            cls.getMethod("copyMemory", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
            return true;
        } catch (java.lang.Throwable th) {
            java.util.logging.Logger logger2 = logger;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.String strValueOf = java.lang.String.valueOf(th);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(strValueOf).toString());
            return false;
        }
    }

    private static boolean zzk(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.drive.zzix.zzbr()) {
            return false;
        }
        try {
            java.lang.Class<?> cls2 = zzni;
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

    private static java.lang.reflect.Field zzfi() {
        java.lang.reflect.Field fieldZzb;
        if (com.google.android.gms.internal.drive.zzix.zzbr() && (fieldZzb = zzb(java.nio.Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldZzb;
        }
        java.lang.reflect.Field fieldZzb2 = zzb(java.nio.Buffer.class, org.jacoco.core.runtime.AgentOptions.ADDRESS);
        if (fieldZzb2 == null || fieldZzb2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return fieldZzb2;
    }

    private static java.lang.reflect.Field zzb(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzp(java.lang.Object obj, long j) {
        return (byte) (zzj(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzq(java.lang.Object obj, long j) {
        return (byte) (zzj(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iZzj = zzj(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (iZzj & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzj(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzr(java.lang.Object obj, long j) {
        return zzp(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(java.lang.Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(java.lang.Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(java.lang.Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static {
        sun.misc.Unsafe unsafeZzff = zzff();
        zzuc = unsafeZzff;
        zzni = com.google.android.gms.internal.drive.zzix.zzbs();
        boolean zZzk = zzk(java.lang.Long.TYPE);
        zzvy = zZzk;
        boolean zZzk2 = zzk(java.lang.Integer.TYPE);
        zzvz = zZzk2;
        com.google.android.gms.internal.drive.zznd.zzd zzcVar = null;
        if (unsafeZzff != null) {
            if (!com.google.android.gms.internal.drive.zzix.zzbr()) {
                zzcVar = new com.google.android.gms.internal.drive.zznd.zzc(unsafeZzff);
            } else if (zZzk) {
                zzcVar = new com.google.android.gms.internal.drive.zznd.zzb(unsafeZzff);
            } else if (zZzk2) {
                zzcVar = new com.google.android.gms.internal.drive.zznd.zza(unsafeZzff);
            }
        }
        zzwa = zzcVar;
        zzwb = zzfh();
        zzog = zzfg();
        long jZzi = zzi(byte[].class);
        zzwc = jZzi;
        zzwd = zzi(boolean[].class);
        zzwe = zzj(boolean[].class);
        zzwf = zzi(int[].class);
        zzwg = zzj(int[].class);
        zzwh = zzi(long[].class);
        zzwi = zzj(long[].class);
        zzwj = zzi(float[].class);
        zzwk = zzj(float[].class);
        zzwl = zzi(double[].class);
        zzwm = zzj(double[].class);
        zzwn = zzi(java.lang.Object[].class);
        zzwo = zzj(java.lang.Object[].class);
        java.lang.reflect.Field fieldZzfi = zzfi();
        zzwp = (fieldZzfi == null || zzcVar == null) ? -1L : zzcVar.zzws.objectFieldOffset(fieldZzfi);
        zzwq = (int) (jZzi & 7);
        zzwr = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }
}
