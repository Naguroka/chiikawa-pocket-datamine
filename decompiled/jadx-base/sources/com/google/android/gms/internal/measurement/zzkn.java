package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzkn<MessageType extends com.google.android.gms.internal.measurement.zzko<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzkn<MessageType, BuilderType>> implements com.google.android.gms.internal.measurement.zzng {
    private static void zza(java.util.List list, int i) {
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

    protected static void zzaW(java.lang.Iterable iterable, java.util.List list) {
        byte[] bArr = com.google.android.gms.internal.measurement.zzmk.zzb;
        iterable.getClass();
        if (iterable instanceof com.google.android.gms.internal.measurement.zzmt) {
            java.util.List listZza = ((com.google.android.gms.internal.measurement.zzmt) iterable).zza();
            com.google.android.gms.internal.measurement.zzmt zzmtVar = (com.google.android.gms.internal.measurement.zzmt) list;
            int size = list.size();
            for (java.lang.Object obj : listZza) {
                if (obj == null) {
                    java.lang.String str = "Element at index " + (zzmtVar.size() - size) + " is null.";
                    int size2 = zzmtVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new java.lang.NullPointerException(str);
                        }
                        zzmtVar.remove(size2);
                    }
                } else if (obj instanceof com.google.android.gms.internal.measurement.zzld) {
                    zzmtVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    com.google.android.gms.internal.measurement.zzld.zzj(bArr2, 0, bArr2.length);
                    zzmtVar.zzb();
                } else {
                    zzmtVar.add((java.lang.String) obj);
                }
            }
            return;
        }
        if (iterable instanceof com.google.android.gms.internal.measurement.zzno) {
            list.addAll((java.util.Collection) iterable);
            return;
        }
        if (iterable instanceof java.util.Collection) {
            int size3 = ((java.util.Collection) iterable).size();
            if (list instanceof java.util.ArrayList) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof com.google.android.gms.internal.measurement.zznq) {
                ((com.google.android.gms.internal.measurement.zznq) list).zzf(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof java.util.List) || !(iterable instanceof java.util.RandomAccess)) {
            for (java.lang.Object obj2 : iterable) {
                if (obj2 == null) {
                    zza(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        java.util.List list2 = (java.util.List) iterable;
        int size5 = list2.size();
        for (int i = 0; i < size5; i++) {
            java.lang.Object obj3 = list2.get(i);
            if (obj3 == null) {
                zza(list, size4);
            }
            list.add(obj3);
        }
    }

    @Override // 
    public abstract com.google.android.gms.internal.measurement.zzkn zzaR();

    public com.google.android.gms.internal.measurement.zzkn zzaS(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.measurement.zzmm {
        throw null;
    }

    public com.google.android.gms.internal.measurement.zzkn zzaT(byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzlp zzlpVar) throws com.google.android.gms.internal.measurement.zzmm {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzng zzaU(byte[] bArr) throws com.google.android.gms.internal.measurement.zzmm {
        return zzaS(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzng zzaV(byte[] bArr, com.google.android.gms.internal.measurement.zzlp zzlpVar) throws com.google.android.gms.internal.measurement.zzmm {
        return zzaT(bArr, 0, bArr.length, zzlpVar);
    }
}
