package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzkk<MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.drive.zzkk.zza<MessageType, BuilderType>> extends com.google.android.gms.internal.drive.zzit<MessageType, BuilderType> {
    private static java.util.Map<java.lang.Object, com.google.android.gms.internal.drive.zzkk<?, ?>> zzrs = new java.util.concurrent.ConcurrentHashMap();
    protected com.google.android.gms.internal.drive.zzmy zzrq = com.google.android.gms.internal.drive.zzmy.zzfa();
    private int zzrr = -1;

    public static class zzb<T extends com.google.android.gms.internal.drive.zzkk<T, ?>> extends com.google.android.gms.internal.drive.zziv<T> {
        private final T zzrt;

        public zzb(T t) {
            this.zzrt = t;
        }
    }

    public static class zzd<ContainingType extends com.google.android.gms.internal.drive.zzlq, Type> extends com.google.android.gms.internal.drive.zzjv<ContainingType, Type> {
    }

    public static final enum zze {
        public static final int zzrx = 1;
        public static final int zzry = 2;
        public static final int zzrz = 3;
        public static final int zzsa = 4;
        public static final int zzsb = 5;
        public static final int zzsc = 6;
        public static final int zzsd = 7;
        public static final int zzsf = 1;
        public static final int zzsg = 2;
        public static final int zzsi = 1;
        public static final int zzsj = 2;
        private static final /* synthetic */ int[] zzse = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzsh = {1, 2};
        private static final /* synthetic */ int[] zzsk = {1, 2};

        public static int[] zzdh() {
            return (int[]) zzse.clone();
        }
    }

    protected abstract java.lang.Object zza(int i, java.lang.Object obj, java.lang.Object obj2);

    public static abstract class zzc<MessageType extends com.google.android.gms.internal.drive.zzkk.zzc<MessageType, BuilderType>, BuilderType> extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> implements com.google.android.gms.internal.drive.zzls {
        protected com.google.android.gms.internal.drive.zzkb<java.lang.Object> zzrw = com.google.android.gms.internal.drive.zzkb.zzcn();

        final com.google.android.gms.internal.drive.zzkb<java.lang.Object> zzdg() {
            if (this.zzrw.isImmutable()) {
                this.zzrw = (com.google.android.gms.internal.drive.zzkb) this.zzrw.clone();
            }
            return this.zzrw;
        }
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.drive.zzlt.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzne != 0) {
            return this.zzne;
        }
        this.zzne = com.google.android.gms.internal.drive.zzmd.zzej().zzq(this).hashCode(this);
        return this.zzne;
    }

    public static abstract class zza<MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.drive.zzkk.zza<MessageType, BuilderType>> extends com.google.android.gms.internal.drive.zziu<MessageType, BuilderType> {
        private final MessageType zzrt;
        protected MessageType zzru;
        private boolean zzrv = false;

        protected zza(MessageType messagetype) {
            this.zzrt = messagetype;
            this.zzru = (MessageType) messagetype.zza(com.google.android.gms.internal.drive.zzkk.zze.zzsa, null, null);
        }

        protected final void zzdb() {
            if (this.zzrv) {
                MessageType messagetype = (MessageType) this.zzru.zza(com.google.android.gms.internal.drive.zzkk.zze.zzsa, null, null);
                zza(messagetype, this.zzru);
                this.zzru = messagetype;
                this.zzrv = false;
            }
        }

        @Override // com.google.android.gms.internal.drive.zzls
        public final boolean isInitialized() {
            return com.google.android.gms.internal.drive.zzkk.zza(this.zzru, false);
        }

        @Override // com.google.android.gms.internal.drive.zzlr
        /* JADX INFO: renamed from: zzdc, reason: merged with bridge method [inline-methods] */
        public MessageType zzde() {
            if (this.zzrv) {
                return this.zzru;
            }
            this.zzru.zzbp();
            this.zzrv = true;
            return this.zzru;
        }

        @Override // com.google.android.gms.internal.drive.zzlr
        /* JADX INFO: renamed from: zzdd, reason: merged with bridge method [inline-methods] */
        public final MessageType zzdf() {
            MessageType messagetype = (MessageType) zzde();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new com.google.android.gms.internal.drive.zzmw(messagetype);
        }

        @Override // com.google.android.gms.internal.drive.zziu
        public final BuilderType zza(MessageType messagetype) {
            zzdb();
            zza(this.zzru, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            com.google.android.gms.internal.drive.zzmd.zzej().zzq(messagetype).zzc(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.drive.zziu
        /* JADX INFO: renamed from: zzbn */
        public final /* synthetic */ com.google.android.gms.internal.drive.zziu clone() {
            return (com.google.android.gms.internal.drive.zzkk.zza) clone();
        }

        @Override // com.google.android.gms.internal.drive.zzls
        public final /* synthetic */ com.google.android.gms.internal.drive.zzlq zzda() {
            return this.zzrt;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.drive.zziu
        public /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            com.google.android.gms.internal.drive.zzkk.zza zzaVar = (com.google.android.gms.internal.drive.zzkk.zza) this.zzrt.zza(com.google.android.gms.internal.drive.zzkk.zze.zzsb, null, null);
            zzaVar.zza((com.google.android.gms.internal.drive.zzkk) zzde());
            return zzaVar;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (((com.google.android.gms.internal.drive.zzkk) zza(com.google.android.gms.internal.drive.zzkk.zze.zzsc, (java.lang.Object) null, (java.lang.Object) null)).getClass().isInstance(obj)) {
            return com.google.android.gms.internal.drive.zzmd.zzej().zzq(this).equals(this, (com.google.android.gms.internal.drive.zzkk) obj);
        }
        return false;
    }

    protected final void zzbp() {
        com.google.android.gms.internal.drive.zzmd.zzej().zzq(this).zzd(this);
    }

    protected final <MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.drive.zzkk.zza<MessageType, BuilderType>> BuilderType zzcw() {
        return (BuilderType) zza(com.google.android.gms.internal.drive.zzkk.zze.zzsb, (java.lang.Object) null, (java.lang.Object) null);
    }

    @Override // com.google.android.gms.internal.drive.zzls
    public final boolean isInitialized() {
        return zza(this, java.lang.Boolean.TRUE.booleanValue());
    }

    @Override // com.google.android.gms.internal.drive.zzit
    final int zzbm() {
        return this.zzrr;
    }

    @Override // com.google.android.gms.internal.drive.zzit
    final void zzo(int i) {
        this.zzrr = i;
    }

    @Override // com.google.android.gms.internal.drive.zzlq
    public final void zzb(com.google.android.gms.internal.drive.zzjr zzjrVar) throws java.io.IOException {
        com.google.android.gms.internal.drive.zzmd.zzej().zzf(getClass()).zza(this, com.google.android.gms.internal.drive.zzjt.zza(zzjrVar));
    }

    @Override // com.google.android.gms.internal.drive.zzlq
    public final int zzcx() {
        if (this.zzrr == -1) {
            this.zzrr = com.google.android.gms.internal.drive.zzmd.zzej().zzq(this).zzn(this);
        }
        return this.zzrr;
    }

    static <T extends com.google.android.gms.internal.drive.zzkk<?, ?>> T zzd(java.lang.Class<T> cls) {
        com.google.android.gms.internal.drive.zzkk<?, ?> zzkkVar = zzrs.get(cls);
        if (zzkkVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzkkVar = zzrs.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzkkVar == null) {
            zzkkVar = (T) ((com.google.android.gms.internal.drive.zzkk) com.google.android.gms.internal.drive.zznd.zzh(cls)).zza(com.google.android.gms.internal.drive.zzkk.zze.zzsc, (java.lang.Object) null, (java.lang.Object) null);
            if (zzkkVar == null) {
                throw new java.lang.IllegalStateException();
            }
            zzrs.put(cls, zzkkVar);
        }
        return (T) zzkkVar;
    }

    protected static <T extends com.google.android.gms.internal.drive.zzkk<?, ?>> void zza(java.lang.Class<T> cls, T t) {
        zzrs.put(cls, t);
    }

    protected static java.lang.Object zza(com.google.android.gms.internal.drive.zzlq zzlqVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.drive.zzme(zzlqVar, str, objArr);
    }

    static java.lang.Object zza(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    protected static final <T extends com.google.android.gms.internal.drive.zzkk<T, ?>> boolean zza(T t, boolean z) {
        byte bByteValue = ((java.lang.Byte) t.zza(com.google.android.gms.internal.drive.zzkk.zze.zzrx, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzp = com.google.android.gms.internal.drive.zzmd.zzej().zzq(t).zzp(t);
        if (z) {
            t.zza(com.google.android.gms.internal.drive.zzkk.zze.zzry, zZzp ? t : null, null);
        }
        return zZzp;
    }

    private static <T extends com.google.android.gms.internal.drive.zzkk<T, ?>> T zza(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.drive.zzjx zzjxVar) throws com.google.android.gms.internal.drive.zzkq {
        T t2 = (T) t.zza(com.google.android.gms.internal.drive.zzkk.zze.zzsa, null, null);
        try {
            com.google.android.gms.internal.drive.zzmd.zzej().zzq(t2).zza(t2, bArr, 0, i2, new com.google.android.gms.internal.drive.zziz(zzjxVar));
            t2.zzbp();
            if (t2.zzne == 0) {
                return t2;
            }
            throw new java.lang.RuntimeException();
        } catch (java.io.IOException e) {
            if (e.getCause() instanceof com.google.android.gms.internal.drive.zzkq) {
                throw ((com.google.android.gms.internal.drive.zzkq) e.getCause());
            }
            throw new com.google.android.gms.internal.drive.zzkq(e.getMessage()).zzg(t2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw com.google.android.gms.internal.drive.zzkq.zzdi().zzg(t2);
        }
    }

    protected static <T extends com.google.android.gms.internal.drive.zzkk<T, ?>> T zza(T t, byte[] bArr, com.google.android.gms.internal.drive.zzjx zzjxVar) throws com.google.android.gms.internal.drive.zzkq {
        T t2 = (T) zza(t, bArr, 0, bArr.length, zzjxVar);
        if (t2 == null || t2.isInitialized()) {
            return t2;
        }
        throw new com.google.android.gms.internal.drive.zzkq(new com.google.android.gms.internal.drive.zzmw(t2).getMessage()).zzg(t2);
    }

    @Override // com.google.android.gms.internal.drive.zzlq
    public final /* synthetic */ com.google.android.gms.internal.drive.zzlr zzcy() {
        com.google.android.gms.internal.drive.zzkk.zza zzaVar = (com.google.android.gms.internal.drive.zzkk.zza) zza(com.google.android.gms.internal.drive.zzkk.zze.zzsb, (java.lang.Object) null, (java.lang.Object) null);
        zzaVar.zza(this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.drive.zzlq
    public final /* synthetic */ com.google.android.gms.internal.drive.zzlr zzcz() {
        return (com.google.android.gms.internal.drive.zzkk.zza) zza(com.google.android.gms.internal.drive.zzkk.zze.zzsb, (java.lang.Object) null, (java.lang.Object) null);
    }

    @Override // com.google.android.gms.internal.drive.zzls
    public final /* synthetic */ com.google.android.gms.internal.drive.zzlq zzda() {
        return (com.google.android.gms.internal.drive.zzkk) zza(com.google.android.gms.internal.drive.zzkk.zze.zzsc, (java.lang.Object) null, (java.lang.Object) null);
    }
}
