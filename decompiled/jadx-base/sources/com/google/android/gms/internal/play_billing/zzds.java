package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzds<MessageType extends com.google.android.gms.internal.play_billing.zzds<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.play_billing.zzdr<MessageType, BuilderType>> implements com.google.android.gms.internal.play_billing.zzgl {
    protected int zza = 0;

    protected static void zzg(java.lang.Iterable iterable, java.util.List list) {
        byte[] bArr = com.google.android.gms.internal.play_billing.zzfo.zzb;
        int size = ((java.util.Collection) iterable).size();
        if (list instanceof java.util.ArrayList) {
            ((java.util.ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof com.google.android.gms.internal.play_billing.zzgt) {
            ((com.google.android.gms.internal.play_billing.zzgt) list).zzf(list.size() + size);
        }
        int size2 = list.size();
        java.util.List list2 = (java.util.List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            java.lang.Object obj = list2.get(i);
            if (obj == null) {
                java.lang.String str = "Element at index " + (list.size() - size2) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new java.lang.NullPointerException(str);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public final byte[] zzM() {
        try {
            int iZzj = zzj();
            byte[] bArr = new byte[iZzj];
            int i = com.google.android.gms.internal.play_billing.zzep.zzb;
            com.google.android.gms.internal.play_billing.zzem zzemVar = new com.google.android.gms.internal.play_billing.zzem(bArr, 0, iZzj);
            zzL(zzemVar);
            zzemVar.zzE();
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    int zze(com.google.android.gms.internal.play_billing.zzgv zzgvVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final com.google.android.gms.internal.play_billing.zzei zzf() {
        try {
            int iZzj = zzj();
            com.google.android.gms.internal.play_billing.zzei zzeiVar = com.google.android.gms.internal.play_billing.zzei.zzb;
            byte[] bArr = new byte[iZzj];
            int i = com.google.android.gms.internal.play_billing.zzep.zzb;
            com.google.android.gms.internal.play_billing.zzem zzemVar = new com.google.android.gms.internal.play_billing.zzem(bArr, 0, iZzj);
            zzL(zzemVar);
            return com.google.android.gms.internal.play_billing.zzee.zza(zzemVar, bArr);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
