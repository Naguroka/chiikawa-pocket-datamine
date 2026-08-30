package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzdb extends com.google.android.gms.internal.consent_sdk.zzcx implements java.util.Set {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.consent_sdk.zzda zza;

    zzdb() {
    }

    static int zzf(int i) {
        int iMax = java.lang.Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new java.lang.IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static com.google.android.gms.internal.consent_sdk.zzdb zzi() {
        return com.google.android.gms.internal.consent_sdk.zzde.zza;
    }

    public static com.google.android.gms.internal.consent_sdk.zzdb zzj(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return zzl(4, com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY, "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.internal.consent_sdk.zzdb) && zzk() && ((com.google.android.gms.internal.consent_sdk.zzdb) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        java.util.Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract com.google.android.gms.internal.consent_sdk.zzdg iterator();

    public final com.google.android.gms.internal.consent_sdk.zzda zzg() {
        com.google.android.gms.internal.consent_sdk.zzda zzdaVar = this.zza;
        if (zzdaVar != null) {
            return zzdaVar;
        }
        com.google.android.gms.internal.consent_sdk.zzda zzdaVarZzh = zzh();
        this.zza = zzdaVarZzh;
        return zzdaVarZzh;
    }

    com.google.android.gms.internal.consent_sdk.zzda zzh() {
        java.lang.Object[] array = toArray();
        int i = com.google.android.gms.internal.consent_sdk.zzda.zzd;
        return com.google.android.gms.internal.consent_sdk.zzda.zzg(array, array.length);
    }

    boolean zzk() {
        return false;
    }

    private static com.google.android.gms.internal.consent_sdk.zzdb zzl(int i, java.lang.Object... objArr) {
        if (i == 0) {
            return com.google.android.gms.internal.consent_sdk.zzde.zza;
        }
        if (i == 1) {
            return new com.google.android.gms.internal.consent_sdk.zzdf(java.util.Objects.requireNonNull(objArr[0]));
        }
        int iZzf = zzf(i);
        java.lang.Object[] objArr2 = new java.lang.Object[iZzf];
        int i2 = iZzf - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            java.lang.Object obj = objArr[i5];
            if (obj == null) {
                throw new java.lang.NullPointerException("at index " + i5);
            }
            int iHashCode = obj.hashCode();
            int iZza = com.google.android.gms.internal.consent_sdk.zzcw.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                java.lang.Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(obj)) {
                    break;
                }
                iZza++;
            }
        }
        java.util.Arrays.fill(objArr, i4, i, (java.lang.Object) null);
        if (i4 == 1) {
            return new com.google.android.gms.internal.consent_sdk.zzdf(java.util.Objects.requireNonNull(objArr[0]));
        }
        if (zzf(i4) < iZzf / 2) {
            return zzl(i4, objArr);
        }
        if (i4 < 3) {
            objArr = java.util.Arrays.copyOf(objArr, i4);
        }
        return new com.google.android.gms.internal.consent_sdk.zzde(objArr, i3, objArr2, i2, i4);
    }
}
