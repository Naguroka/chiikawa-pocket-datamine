package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgxr<MessageType extends com.google.android.gms.internal.ads.zzgxr<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzgxl<MessageType, BuilderType>> extends com.google.android.gms.internal.ads.zzgvs<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Class<?>, com.google.android.gms.internal.ads.zzgxr<?, ?>> zzc = new java.util.concurrent.ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected com.google.android.gms.internal.ads.zzhai zzt = com.google.android.gms.internal.ads.zzhai.zzc();

    protected static com.google.android.gms.internal.ads.zzgxt zzbA() {
        return com.google.android.gms.internal.ads.zzgvz.zzd();
    }

    protected static com.google.android.gms.internal.ads.zzgxt zzbB(com.google.android.gms.internal.ads.zzgxt zzgxtVar) {
        int size = zzgxtVar.size();
        return zzgxtVar.zzf(size + size);
    }

    protected static com.google.android.gms.internal.ads.zzgxu zzbC() {
        return com.google.android.gms.internal.ads.zzgwy.zze();
    }

    protected static com.google.android.gms.internal.ads.zzgxu zzbD(com.google.android.gms.internal.ads.zzgxu zzgxuVar) {
        int size = zzgxuVar.size();
        return zzgxuVar.zzf(size + size);
    }

    protected static com.google.android.gms.internal.ads.zzgxy zzbE() {
        return com.google.android.gms.internal.ads.zzgxi.zze();
    }

    protected static com.google.android.gms.internal.ads.zzgxy zzbF(com.google.android.gms.internal.ads.zzgxy zzgxyVar) {
        int size = zzgxyVar.size();
        return zzgxyVar.zzf(size + size);
    }

    protected static com.google.android.gms.internal.ads.zzgxz zzbG() {
        return com.google.android.gms.internal.ads.zzgxs.zzg();
    }

    protected static com.google.android.gms.internal.ads.zzgxz zzbH(com.google.android.gms.internal.ads.zzgxz zzgxzVar) {
        int size = zzgxzVar.size();
        return zzgxzVar.zzf(size + size);
    }

    protected static com.google.android.gms.internal.ads.zzgyc zzbI() {
        return com.google.android.gms.internal.ads.zzgyr.zzh();
    }

    protected static com.google.android.gms.internal.ads.zzgyc zzbJ(com.google.android.gms.internal.ads.zzgyc zzgycVar) {
        int size = zzgycVar.size();
        return zzgycVar.zzf(size + size);
    }

    protected static <E> com.google.android.gms.internal.ads.zzgyd<E> zzbK() {
        return com.google.android.gms.internal.ads.zzgzn.zzd();
    }

    protected static <E> com.google.android.gms.internal.ads.zzgyd<E> zzbL(com.google.android.gms.internal.ads.zzgyd<E> zzgydVar) {
        int size = zzgydVar.size();
        return zzgydVar.zzf(size + size);
    }

    static java.lang.Object zzbP(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    protected static java.lang.Object zzbQ(com.google.android.gms.internal.ads.zzgzc zzgzcVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.ads.zzgzo(zzgzcVar, str, objArr);
    }

    static java.lang.reflect.Method zzbR(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr> void zzbZ(java.lang.Class<T> cls, T t) {
        t.zzbV();
        zzc.put(cls, t);
    }

    public static <ContainingType extends com.google.android.gms.internal.ads.zzgzc, Type> com.google.android.gms.internal.ads.zzgxp<ContainingType, Type> zzbe(ContainingType containingtype, com.google.android.gms.internal.ads.zzgzc zzgzcVar, com.google.android.gms.internal.ads.zzgxw zzgxwVar, int i, com.google.android.gms.internal.ads.zzhau zzhauVar, boolean z, java.lang.Class cls) {
        return new com.google.android.gms.internal.ads.zzgxp<>(containingtype, com.google.android.gms.internal.ads.zzgzn.zzd(), zzgzcVar, new com.google.android.gms.internal.ads.zzgxo(zzgxwVar, i, zzhauVar, true, z), cls);
    }

    public static <ContainingType extends com.google.android.gms.internal.ads.zzgzc, Type> com.google.android.gms.internal.ads.zzgxp<ContainingType, Type> zzbf(ContainingType containingtype, Type type, com.google.android.gms.internal.ads.zzgzc zzgzcVar, com.google.android.gms.internal.ads.zzgxw zzgxwVar, int i, com.google.android.gms.internal.ads.zzhau zzhauVar, java.lang.Class cls) {
        return new com.google.android.gms.internal.ads.zzgxp<>(containingtype, type, zzgzcVar, new com.google.android.gms.internal.ads.zzgxo(zzgxwVar, i, zzhauVar, false, false), cls);
    }

    static <T extends com.google.android.gms.internal.ads.zzgxr> T zzbh(java.lang.Class<T> cls) {
        com.google.android.gms.internal.ads.zzgxr<?, ?> zzgxrVarZzbt = zzc.get(cls);
        if (zzgxrVarZzbt == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgxrVarZzbt = zzc.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgxrVarZzbt == null) {
            zzgxrVarZzbt = ((com.google.android.gms.internal.ads.zzgxr) com.google.android.gms.internal.ads.zzhao.zzg(cls)).zzbt();
            if (zzgxrVarZzbt == null) {
                throw new java.lang.IllegalStateException();
            }
            zzc.put(cls, zzgxrVarZzbt);
        }
        return zzgxrVarZzbt;
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbk(T t, java.io.InputStream inputStream) throws com.google.android.gms.internal.ads.zzgyg {
        int i = com.google.android.gms.internal.ads.zzgxb.zzb;
        int i2 = com.google.android.gms.internal.ads.zzgzm.zza;
        T t2 = (T) zzg(t, inputStream, com.google.android.gms.internal.ads.zzgxb.zza);
        zzf(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbl(T t, java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        T t2 = (T) zzg(t, inputStream, zzgxbVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbm(T t, com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws com.google.android.gms.internal.ads.zzgyg {
        int i = com.google.android.gms.internal.ads.zzgxb.zzb;
        int i2 = com.google.android.gms.internal.ads.zzgzm.zza;
        T t2 = (T) zzbr(t, zzgwjVar, com.google.android.gms.internal.ads.zzgxb.zza);
        zzf(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbn(T t, com.google.android.gms.internal.ads.zzgwp zzgwpVar) throws com.google.android.gms.internal.ads.zzgyg {
        int i = com.google.android.gms.internal.ads.zzgxb.zzb;
        int i2 = com.google.android.gms.internal.ads.zzgzm.zza;
        return (T) zzbs(t, zzgwpVar, com.google.android.gms.internal.ads.zzgxb.zza);
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbo(T t, java.io.InputStream inputStream) throws com.google.android.gms.internal.ads.zzgyg {
        com.google.android.gms.internal.ads.zzgwp zzgwpVarZzG = com.google.android.gms.internal.ads.zzgwp.zzG(inputStream, 4096);
        int i = com.google.android.gms.internal.ads.zzgxb.zzb;
        int i2 = com.google.android.gms.internal.ads.zzgzm.zza;
        T t2 = (T) zzbz(t, zzgwpVarZzG, com.google.android.gms.internal.ads.zzgxb.zza);
        zzf(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbp(T t, java.nio.ByteBuffer byteBuffer) throws com.google.android.gms.internal.ads.zzgyg {
        int i = com.google.android.gms.internal.ads.zzgxb.zzb;
        int i2 = com.google.android.gms.internal.ads.zzgzm.zza;
        return (T) zzbv(t, byteBuffer, com.google.android.gms.internal.ads.zzgxb.zza);
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbq(T t, byte[] bArr) throws com.google.android.gms.internal.ads.zzgyg {
        int length = bArr.length;
        int i = com.google.android.gms.internal.ads.zzgxb.zzb;
        int i2 = com.google.android.gms.internal.ads.zzgzm.zza;
        T t2 = (T) zzi(t, bArr, 0, length, com.google.android.gms.internal.ads.zzgxb.zza);
        zzf(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbr(T t, com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        T t2 = (T) zzh(t, zzgwjVar, zzgxbVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbs(T t, com.google.android.gms.internal.ads.zzgwp zzgwpVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        T t2 = (T) zzbz(t, zzgwpVar, zzgxbVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbu(T t, java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        T t2 = (T) zzbz(t, com.google.android.gms.internal.ads.zzgwp.zzG(inputStream, 4096), zzgxbVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbv(T t, java.nio.ByteBuffer byteBuffer, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        com.google.android.gms.internal.ads.zzgwp zzgwpVarZzH;
        int i = com.google.android.gms.internal.ads.zzgwp.zzd;
        boolean z = false;
        if (byteBuffer.hasArray()) {
            zzgwpVarZzH = com.google.android.gms.internal.ads.zzgwp.zzH(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && com.google.android.gms.internal.ads.zzhao.zzB()) {
            zzgwpVarZzH = new com.google.android.gms.internal.ads.zzgwn(byteBuffer, z, null);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzgwpVarZzH = com.google.android.gms.internal.ads.zzgwp.zzH(bArr, 0, iRemaining, true);
        }
        T t2 = (T) zzbs(t, zzgwpVarZzH, zzgxbVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbx(T t, byte[] bArr, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        T t2 = (T) zzi(t, bArr, 0, bArr.length, zzgxbVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzby(T t, com.google.android.gms.internal.ads.zzgwp zzgwpVar) throws com.google.android.gms.internal.ads.zzgyg {
        int i = com.google.android.gms.internal.ads.zzgxb.zzb;
        int i2 = com.google.android.gms.internal.ads.zzgzm.zza;
        return (T) zzbz(t, zzgwpVar, com.google.android.gms.internal.ads.zzgxb.zza);
    }

    static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzbz(T t, com.google.android.gms.internal.ads.zzgwp zzgwpVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        T t2 = (T) t.zzbj();
        try {
            com.google.android.gms.internal.ads.zzgzv zzgzvVarZzb = com.google.android.gms.internal.ads.zzgzm.zza().zzb(t2.getClass());
            zzgzvVarZzb.zzh(t2, com.google.android.gms.internal.ads.zzgwq.zzq(zzgwpVar), zzgxbVar);
            zzgzvVarZzb.zzf(t2);
            return t2;
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            if (e.zzb()) {
                throw new com.google.android.gms.internal.ads.zzgyg(e);
            }
            throw e;
        } catch (com.google.android.gms.internal.ads.zzhag e2) {
            throw e2.zza();
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.android.gms.internal.ads.zzgyg) {
                throw ((com.google.android.gms.internal.ads.zzgyg) e3.getCause());
            }
            throw new com.google.android.gms.internal.ads.zzgyg(e3);
        } catch (java.lang.RuntimeException e4) {
            if (e4.getCause() instanceof com.google.android.gms.internal.ads.zzgyg) {
                throw ((com.google.android.gms.internal.ads.zzgyg) e4.getCause());
            }
            throw e4;
        }
    }

    private int zzc(com.google.android.gms.internal.ads.zzgzv<?> zzgzvVar) {
        if (zzgzvVar != null) {
            return zzgzvVar.zza(this);
        }
        return com.google.android.gms.internal.ads.zzgzm.zza().zzb(getClass()).zza(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends com.google.android.gms.internal.ads.zzgxn<MessageType, BuilderType>, BuilderType, T> com.google.android.gms.internal.ads.zzgxp<MessageType, T> zzd(com.google.android.gms.internal.ads.zzgwz<MessageType, T> zzgwzVar) {
        return (com.google.android.gms.internal.ads.zzgxp) zzgwzVar;
    }

    private static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzf(T t) throws com.google.android.gms.internal.ads.zzgyg {
        if (t == null || t.zzbw()) {
            return t;
        }
        throw t.zzaP().zza();
    }

    private static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzg(T t, java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            com.google.android.gms.internal.ads.zzgwp zzgwpVarZzG = com.google.android.gms.internal.ads.zzgwp.zzG(new com.google.android.gms.internal.ads.zzgvq(inputStream, com.google.android.gms.internal.ads.zzgwp.zzE(i, inputStream)), 4096);
            T t2 = (T) zzbz(t, zzgwpVarZzG, zzgxbVar);
            try {
                zzgwpVarZzG.zzy(0);
                return t2;
            } catch (com.google.android.gms.internal.ads.zzgyg e) {
                throw e;
            }
        } catch (com.google.android.gms.internal.ads.zzgyg e2) {
            if (e2.zzb()) {
                throw new com.google.android.gms.internal.ads.zzgyg(e2);
            }
            throw e2;
        } catch (java.io.IOException e3) {
            throw new com.google.android.gms.internal.ads.zzgyg(e3);
        }
    }

    private static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzh(T t, com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        com.google.android.gms.internal.ads.zzgwp zzgwpVarZzl = zzgwjVar.zzl();
        T t2 = (T) zzbz(t, zzgwpVarZzl, zzgxbVar);
        try {
            zzgwpVarZzl.zzy(0);
            return t2;
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> T zzi(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.zzbj();
        try {
            com.google.android.gms.internal.ads.zzgzv zzgzvVarZzb = com.google.android.gms.internal.ads.zzgzm.zza().zzb(t2.getClass());
            zzgzvVarZzb.zzi(t2, bArr, i, i + i2, new com.google.android.gms.internal.ads.zzgvx(zzgxbVar));
            zzgzvVarZzb.zzf(t2);
            return t2;
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            if (e.zzb()) {
                throw new com.google.android.gms.internal.ads.zzgyg(e);
            }
            throw e;
        } catch (com.google.android.gms.internal.ads.zzhag e2) {
            throw e2.zza();
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.android.gms.internal.ads.zzgyg) {
                throw ((com.google.android.gms.internal.ads.zzgyg) e3.getCause());
            }
            throw new com.google.android.gms.internal.ads.zzgyg(e3);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private void zzj() {
        if (this.zzt == com.google.android.gms.internal.ads.zzhai.zzc()) {
            this.zzt = com.google.android.gms.internal.ads.zzhai.zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends com.google.android.gms.internal.ads.zzgxr<T, ?>> boolean zzk(T t, boolean z) {
        byte bByteValue = ((java.lang.Byte) t.zzdc(com.google.android.gms.internal.ads.zzgxq.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = com.google.android.gms.internal.ads.zzgzm.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzdc(com.google.android.gms.internal.ads.zzgxq.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t, null);
        }
        return zZzl;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.google.android.gms.internal.ads.zzgzm.zza().zzb(getClass()).zzk(this, (com.google.android.gms.internal.ads.zzgxr) obj);
    }

    public int hashCode() {
        if (zzcd()) {
            return zzaW();
        }
        if (zzcc()) {
            zzca(zzaW());
        }
        return zzaX();
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.ads.zzgze.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgvs
    int zzaL() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgvs
    int zzaM(com.google.android.gms.internal.ads.zzgzv zzgzvVar) {
        if (!zzcd()) {
            if (zzaL() != Integer.MAX_VALUE) {
                return zzaL();
            }
            int iZzc = zzc(zzgzvVar);
            zzaS(iZzc);
            return iZzc;
        }
        int iZzc2 = zzc(zzgzvVar);
        if (iZzc2 >= 0) {
            return iZzc2;
        }
        throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iZzc2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvs
    public com.google.android.gms.internal.ads.zzgzh zzaO() {
        throw new java.lang.UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvs
    void zzaS(int i) {
        if (i >= 0) {
            this.zzd = i | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    int zzaW() {
        return com.google.android.gms.internal.ads.zzgzm.zza().zzb(getClass()).zzb(this);
    }

    int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzgzc
    public int zzaY() {
        return zzaM(null);
    }

    protected final <MessageType extends com.google.android.gms.internal.ads.zzgxr<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzgxl<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzdc(com.google.android.gms.internal.ads.zzgxq.NEW_BUILDER, null, null);
    }

    public final com.google.android.gms.internal.ads.zzgzk<MessageType> zzbN() {
        return (com.google.android.gms.internal.ads.zzgzk) zzdc(com.google.android.gms.internal.ads.zzgxq.GET_PARSER, null, null);
    }

    java.lang.Object zzbO() throws java.lang.Exception {
        return zzdc(com.google.android.gms.internal.ads.zzgxq.BUILD_MESSAGE_INFO, null, null);
    }

    void zzbS() {
        this.zzq = 0;
    }

    void zzbT() {
        zzaS(Integer.MAX_VALUE);
    }

    protected void zzbU() {
        com.google.android.gms.internal.ads.zzgzm.zza().zzb(getClass()).zzf(this);
        zzbV();
    }

    void zzbV() {
        this.zzd &= Integer.MAX_VALUE;
    }

    protected void zzbW(int i, com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        zzj();
        com.google.android.gms.internal.ads.zzhai zzhaiVar = this.zzt;
        zzhaiVar.zzg();
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhaiVar.zzj((i << 3) | 2, zzgwjVar);
    }

    protected final void zzbX(com.google.android.gms.internal.ads.zzhai zzhaiVar) {
        this.zzt = com.google.android.gms.internal.ads.zzhai.zze(this.zzt, zzhaiVar);
    }

    protected void zzbY(int i, int i2) {
        zzj();
        com.google.android.gms.internal.ads.zzhai zzhaiVar = this.zzt;
        zzhaiVar.zzg();
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhaiVar.zzj(i << 3, java.lang.Long.valueOf(i2));
    }

    protected final <MessageType extends com.google.android.gms.internal.ads.zzgxr<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzgxl<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) zzaZ();
        buildertype.zzbj(messagetype);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzgzc
    /* JADX INFO: renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcX() {
        return (BuilderType) zzdc(com.google.android.gms.internal.ads.zzgxq.NEW_BUILDER, null, null);
    }

    /* JADX INFO: renamed from: zzbc, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzbM() {
        BuilderType buildertype = (BuilderType) zzdc(com.google.android.gms.internal.ads.zzgxq.NEW_BUILDER, null, null);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzgzd
    /* JADX INFO: renamed from: zzbi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbt() {
        return (MessageType) zzdc(com.google.android.gms.internal.ads.zzgxq.GET_DEFAULT_INSTANCE, null, null);
    }

    MessageType zzbj() {
        return (MessageType) zzdc(com.google.android.gms.internal.ads.zzgxq.NEW_MUTABLE_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzd
    public final boolean zzbw() {
        return zzk(this, true);
    }

    @Override // com.google.android.gms.internal.ads.zzgzc
    public void zzcY(com.google.android.gms.internal.ads.zzgww zzgwwVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgzm.zza().zzb(getClass()).zzj(this, com.google.android.gms.internal.ads.zzgwx.zza(zzgwwVar));
    }

    void zzca(int i) {
        this.zzq = i;
    }

    boolean zzcc() {
        return zzaX() == 0;
    }

    boolean zzcd() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected boolean zzce(int i, com.google.android.gms.internal.ads.zzgwp zzgwpVar) throws java.io.IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzm(i, zzgwpVar);
    }

    protected abstract java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2);
}
