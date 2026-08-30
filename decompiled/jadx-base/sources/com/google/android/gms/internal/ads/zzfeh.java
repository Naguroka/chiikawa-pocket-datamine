package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfeh implements com.google.android.gms.internal.ads.zzfeg {
    private final java.lang.Object[] zza;

    public zzfeh(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, int i, java.lang.String str2, com.google.android.gms.ads.internal.client.zzy zzyVar) {
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(str2.split(",")));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(java.lang.Long.valueOf(zzmVar.zzb));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(zzmVar.zzc));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzmVar.zzc.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(java.lang.Integer.valueOf(zzmVar.zzd));
        }
        if (hashSet.contains("keywords")) {
            java.util.List list = zzmVar.zze;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(java.lang.Boolean.valueOf(zzmVar.zzf));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(java.lang.Integer.valueOf(zzmVar.zzg));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(java.lang.Boolean.valueOf(zzmVar.zzh));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzmVar.zzi);
        }
        if (hashSet.contains(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION)) {
            android.location.Location location = zzmVar.zzk;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzmVar.zzl);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(zzmVar.zzm));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(zzmVar.zzn));
        }
        if (hashSet.contains("categoryExclusions")) {
            java.util.List list2 = zzmVar.zzo;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzmVar.zzp);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzmVar.zzq);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(java.lang.Boolean.valueOf(zzmVar.zzr));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(java.lang.Integer.valueOf(zzmVar.zzt));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzmVar.zzu);
        }
        if (hashSet.contains("orientation")) {
            if (zzyVar != null) {
                arrayList.add(java.lang.Integer.valueOf(zzyVar.zza));
            } else {
                arrayList.add(null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static java.lang.String zza(android.os.Bundle bundle) {
        java.lang.String strZza;
        if (bundle == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = new java.util.TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            java.lang.Object obj = bundle.get((java.lang.String) it.next());
            if (obj == null) {
                strZza = "null";
            } else {
                strZza = obj instanceof android.os.Bundle ? zza((android.os.Bundle) obj) : obj.toString();
            }
            sb.append(strZza);
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfeg
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzfeh) {
            return java.util.Arrays.equals(this.zza, ((com.google.android.gms.internal.ads.zzfeh) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfeg
    public final int hashCode() {
        return java.util.Arrays.hashCode(this.zza);
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = this.zza;
        return "[PoolKey#" + java.util.Arrays.hashCode(objArr) + " " + java.util.Arrays.toString(objArr) + com.ironsource.y8.i.e;
    }
}
