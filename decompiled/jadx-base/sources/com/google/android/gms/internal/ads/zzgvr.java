package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgvr<MessageType extends com.google.android.gms.internal.ads.zzgvs<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzgvr<MessageType, BuilderType>> implements com.google.android.gms.internal.ads.zzgzb {
    private java.lang.String zza(java.lang.String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    private static <T> void zzb(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        if (iterable instanceof java.util.Collection) {
            int size = ((java.util.Collection) iterable).size();
            if (list instanceof java.util.ArrayList) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof com.google.android.gms.internal.ads.zzgzn) {
                ((com.google.android.gms.internal.ads.zzgzn) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof java.util.List) || !(iterable instanceof java.util.RandomAccess)) {
            for (java.lang.Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        java.util.List list2 = (java.util.List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            android.Manifest.permission_group permission_groupVar = (java.lang.Object) list2.get(i);
            if (permission_groupVar == null) {
                zzc(list, size2);
            }
            list.add(permission_groupVar);
        }
    }

    protected static com.google.android.gms.internal.ads.zzhag zzbb(com.google.android.gms.internal.ads.zzgzc zzgzcVar) {
        return new com.google.android.gms.internal.ads.zzhag(zzgzcVar);
    }

    @java.lang.Deprecated
    protected static <T> void zzbc(java.lang.Iterable<T> iterable, java.util.Collection<? super T> collection) {
        zzbd(iterable, (java.util.List) collection);
    }

    protected static <T> void zzbd(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
        iterable.getClass();
        if (!(iterable instanceof com.google.android.gms.internal.ads.zzgyo)) {
            if (iterable instanceof com.google.android.gms.internal.ads.zzgzl) {
                list.addAll((java.util.Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        java.util.List listZza = ((com.google.android.gms.internal.ads.zzgyo) iterable).zza();
        com.google.android.gms.internal.ads.zzgyo zzgyoVar = (com.google.android.gms.internal.ads.zzgyo) list;
        int size = list.size();
        for (java.lang.Object obj : listZza) {
            if (obj == null) {
                java.lang.String str = "Element at index " + (zzgyoVar.size() - size) + " is null.";
                int size2 = zzgyoVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new java.lang.NullPointerException(str);
                    }
                    zzgyoVar.remove(size2);
                }
            } else if (obj instanceof com.google.android.gms.internal.ads.zzgwj) {
                zzgyoVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                com.google.android.gms.internal.ads.zzgwj.zzv(bArr2, 0, bArr2.length);
                zzgyoVar.zzb();
            } else {
                zzgyoVar.add((java.lang.String) obj);
            }
        }
    }

    private static void zzc(java.util.List<?> list, int i) {
        java.lang.String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new java.lang.NullPointerException(str);
            }
            list.remove(size);
        }
    }

    @Override // 
    public abstract BuilderType zzaP();

    protected abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws com.google.android.gms.internal.ads.zzgyg {
        try {
            com.google.android.gms.internal.ads.zzgwp zzgwpVarZzl = zzgwjVar.zzl();
            zzaR(zzgwpVarZzl);
            zzgwpVarZzl.zzy(0);
            return this;
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(zza("ByteString"), e2);
        }
    }

    /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaR(com.google.android.gms.internal.ads.zzgwp zzgwpVar) throws java.io.IOException {
        int i = com.google.android.gms.internal.ads.zzgxb.zzb;
        int i2 = com.google.android.gms.internal.ads.zzgzm.zza;
        return (BuilderType) zzaW(zzgwpVar, com.google.android.gms.internal.ads.zzgxb.zza);
    }

    /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaS(com.google.android.gms.internal.ads.zzgzc zzgzcVar) {
        if (zzbt().getClass().isInstance(zzgzcVar)) {
            return (BuilderType) zzaD((com.google.android.gms.internal.ads.zzgvs) zzgzcVar);
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(java.io.InputStream inputStream) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgwp zzgwpVarZzG = com.google.android.gms.internal.ads.zzgwp.zzG(inputStream, 4096);
        zzaR(zzgwpVarZzG);
        zzgwpVarZzG.zzy(0);
        return this;
    }

    /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(byte[] bArr) throws com.google.android.gms.internal.ads.zzgyg {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        try {
            com.google.android.gms.internal.ads.zzgwp zzgwpVarZzl = zzgwjVar.zzl();
            zzaW(zzgwpVarZzl, zzgxbVar);
            zzgwpVarZzl.zzy(0);
            return this;
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(zza("ByteString"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzaW(com.google.android.gms.internal.ads.zzgwp zzgwpVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException;

    public BuilderType zzaL(java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgwp zzgwpVarZzG = com.google.android.gms.internal.ads.zzgwp.zzG(inputStream, 4096);
        zzaW(zzgwpVarZzG, zzgxbVar);
        zzgwpVarZzG.zzy(0);
        return this;
    }

    /* JADX INFO: renamed from: zzaM, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (BuilderType) zzba(bArr, 0, bArr.length, zzgxbVar);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaN, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgyg {
        try {
            com.google.android.gms.internal.ads.zzgwp zzgwpVarZzH = com.google.android.gms.internal.ads.zzgwp.zzH(bArr, i, i2, false);
            zzaR(zzgwpVarZzH);
            zzgwpVarZzH.zzy(0);
            return this;
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(zza("byte array"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: zzaO, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        try {
            com.google.android.gms.internal.ads.zzgwp zzgwpVarZzH = com.google.android.gms.internal.ads.zzgwp.zzH(bArr, i, i2, false);
            zzaW(zzgwpVarZzH, zzgxbVar);
            zzgwpVarZzH.zzy(0);
            return this;
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(zza("byte array"), e2);
        }
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgzb zzaQ(com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws com.google.android.gms.internal.ads.zzgyg {
        zzaE(zzgwjVar);
        return this;
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgzb zzaT(java.io.InputStream inputStream) throws java.io.IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgzb zzaV(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        zzaJ(zzgwjVar, zzgxbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgzb zzaX(java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        zzaL(inputStream, zzgxbVar);
        return this;
    }

    public boolean zzbe(java.io.InputStream inputStream) throws java.io.IOException {
        int i = com.google.android.gms.internal.ads.zzgxb.zzb;
        int i2 = com.google.android.gms.internal.ads.zzgzm.zza;
        return zzbf(inputStream, com.google.android.gms.internal.ads.zzgxb.zza);
    }

    public boolean zzbf(java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws java.io.IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        zzaL(new com.google.android.gms.internal.ads.zzgvq(inputStream, com.google.android.gms.internal.ads.zzgwp.zzE(i, inputStream)), zzgxbVar);
        return true;
    }
}
