package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqf extends com.google.android.gms.measurement.internal.zzjr {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.String[] zzb = {"firebase_", "google_", "ga_"};
    private static final java.lang.String[] zzc = {"_err"};
    private java.security.SecureRandom zzd;
    private final java.util.concurrent.atomic.AtomicLong zze;
    private int zzf;
    private androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures zzg;
    private java.lang.Boolean zzh;
    private java.lang.Integer zzi;

    zzqf(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
        this.zzi = null;
        this.zze = new java.util.concurrent.atomic.AtomicLong(0L);
    }

    static java.security.MessageDigest zzI() {
        for (int i = 0; i < 2; i++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static java.util.ArrayList zzK(java.util.List list) {
        if (list == null) {
            return new java.util.ArrayList(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.measurement.internal.zzai zzaiVar = (com.google.android.gms.measurement.internal.zzai) it.next();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("app_id", zzaiVar.zza);
            bundle.putString("origin", zzaiVar.zzb);
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzaiVar.zzd);
            bundle.putString("name", zzaiVar.zzc.zzb);
            com.google.android.gms.measurement.internal.zzjt.zzb(bundle, com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar.zzc.zza()));
            bundle.putBoolean(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzaiVar.zze);
            java.lang.String str = zzaiVar.zzf;
            if (str != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            com.google.android.gms.measurement.internal.zzbh zzbhVar = zzaiVar.zzg;
            if (zzbhVar != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzbhVar.zza);
                com.google.android.gms.measurement.internal.zzbf zzbfVar = zzbhVar.zzb;
                if (zzbfVar != null) {
                    bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzbfVar.zzc());
                }
            }
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzaiVar.zzh);
            com.google.android.gms.measurement.internal.zzbh zzbhVar2 = zzaiVar.zzi;
            if (zzbhVar2 != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzbhVar2.zza);
                com.google.android.gms.measurement.internal.zzbf zzbfVar2 = zzbhVar2.zzb;
                if (zzbfVar2 != null) {
                    bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzbfVar2.zzc());
                }
            }
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzaiVar.zzc.zzc);
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzaiVar.zzj);
            com.google.android.gms.measurement.internal.zzbh zzbhVar3 = zzaiVar.zzk;
            if (zzbhVar3 != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzbhVar3.zza);
                com.google.android.gms.measurement.internal.zzbf zzbfVar3 = zzbhVar3.zzb;
                if (zzbfVar3 != null) {
                    bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzbfVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void zzN(com.google.android.gms.measurement.internal.zzmh zzmhVar, android.os.Bundle bundle, boolean z) {
        if (bundle != null && zzmhVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                java.lang.String str = zzmhVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                java.lang.String str2 = zzmhVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzmhVar.zzc);
                return;
            }
            z = false;
        }
        if (bundle != null && zzmhVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    private final int zzaA(java.lang.String str) {
        if ("_ldl".equals(str)) {
            this.zzu.zzf();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.zzu.zzf();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.zzu.zzf();
            return 100;
        }
        this.zzu.zzf();
        return 36;
    }

    private final java.lang.Object zzaB(int i, java.lang.Object obj, boolean z, boolean z2, java.lang.String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof java.lang.Long) || (obj instanceof java.lang.Double)) {
            return obj;
        }
        if (obj instanceof java.lang.Integer) {
            return java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
        }
        if (obj instanceof java.lang.Byte) {
            return java.lang.Long.valueOf(((java.lang.Byte) obj).byteValue());
        }
        if (obj instanceof java.lang.Short) {
            return java.lang.Long.valueOf(((java.lang.Short) obj).shortValue());
        }
        if (obj instanceof java.lang.Boolean) {
            return java.lang.Long.valueOf(true != ((java.lang.Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Double.valueOf(((java.lang.Float) obj).doubleValue());
        }
        if ((obj instanceof java.lang.String) || (obj instanceof java.lang.Character) || (obj instanceof java.lang.CharSequence)) {
            return zzG(obj.toString(), i, z);
        }
        if (!z2 || (!(obj instanceof android.os.Bundle[]) && !(obj instanceof android.os.Parcelable[]))) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.os.Parcelable parcelable : (android.os.Parcelable[]) obj) {
            if (parcelable instanceof android.os.Bundle) {
                android.os.Bundle bundleZzz = zzz((android.os.Bundle) parcelable, null);
                if (!bundleZzz.isEmpty()) {
                    arrayList.add(bundleZzz);
                }
            }
        }
        return arrayList.toArray(new android.os.Bundle[arrayList.size()]);
    }

    private static boolean zzaC(java.lang.String str, java.lang.String[] strArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        for (java.lang.String str2 : strArr) {
            if (java.util.Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean zzap(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean zzaq(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    static boolean zzar(android.content.Context context) {
        android.content.pm.ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new android.content.ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    static boolean zzas(android.content.Context context, java.lang.String str) {
        android.content.pm.ServiceInfo serviceInfo;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    static boolean zzat(android.content.Context context, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        return zzas(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean zzau(java.lang.String str) {
        return !zzc[0].equals(str);
    }

    static final boolean zzaz(android.os.Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    static long zzr(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        com.google.android.gms.common.internal.Preconditions.checkState(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    final android.os.Bundle zzA(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.util.List list, boolean z) {
        int iZzi;
        int i;
        com.google.android.gms.measurement.internal.zzio zzioVar;
        boolean zZzaC = zzaC(str2, com.google.android.gms.measurement.internal.zzjy.zzd);
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        com.google.android.gms.measurement.internal.zzio zzioVar2 = this.zzu;
        int iZze = zzioVar2.zzf().zze();
        int i2 = 0;
        boolean z2 = false;
        for (java.lang.String str3 : new java.util.TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str3)) {
                iZzi = !z ? zzi(str3) : 0;
                if (iZzi == 0) {
                    iZzi = zzh(str3);
                }
            } else {
                iZzi = 0;
            }
            if (iZzi != 0) {
                zzM(bundle2, iZzi, str3, iZzi == 3 ? str3 : null);
                bundle2.remove(str3);
                i = iZze;
                zzioVar = zzioVar2;
            } else {
                i = iZze;
                zzioVar = zzioVar2;
                int iZza = zza(str, str2, str3, bundle.get(str3), bundle2, list, z, zZzaC);
                if (iZza == 17) {
                    zzM(bundle2, 17, str3, false);
                } else if (iZza != 0 && !"_ev".equals(str3)) {
                    zzM(bundle2, iZza, iZza == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (zzaq(str3)) {
                    int i3 = i2 + 1;
                    if (i3 > i) {
                        if (!zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbr) || !z2) {
                            zzioVar.zzaW().zzf().zzc("Event can't contain more than " + i + " params", zzioVar.zzj().zzd(str2), zzioVar.zzj().zzb(bundle));
                        }
                        zzaz(bundle2, 5);
                        bundle2.remove(str3);
                        z2 = true;
                    }
                    i2 = i3;
                }
                iZze = i;
                zzioVar2 = zzioVar;
            }
            iZze = i;
            zzioVar2 = zzioVar;
        }
        return bundle2;
    }

    final androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures zzB() {
        if (this.zzg == null) {
            this.zzg = androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.from(this.zzu.zzaT());
        }
        return this.zzg;
    }

    final com.google.android.gms.measurement.internal.zzbh zzC(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3, long j, boolean z, boolean z2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzf(str2) != 0) {
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            zzioVar.zzaW().zze().zzb("Invalid conditional property event name", zzioVar.zzj().zzf(str2));
            throw new java.lang.IllegalArgumentException();
        }
        android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
        bundle2.putString("_o", str3);
        android.os.Bundle bundleZzA = zzA(str, str2, bundle2, com.google.android.gms.common.util.CollectionUtils.listOf("_o"), true);
        if (z) {
            bundleZzA = zzz(bundleZzA, str);
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundleZzA);
        return new com.google.android.gms.measurement.internal.zzbh(str2, new com.google.android.gms.measurement.internal.zzbf(bundleZzA), str3, j);
    }

    final java.lang.Object zzD(java.lang.String str, java.lang.Object obj) {
        if ("_ev".equals(str)) {
            return zzaB(this.zzu.zzf().zzd(null, false), obj, true, true, null);
        }
        return zzaB(zzap(str) ? this.zzu.zzf().zzd(null, false) : this.zzu.zzf().zzc(null, false), obj, false, true, null);
    }

    final java.lang.Object zzE(java.lang.String str, java.lang.Object obj) {
        return "_ldl".equals(str) ? zzaB(zzaA(str), obj, true, false, null) : zzaB(zzaA(str), obj, false, false, null);
    }

    final java.lang.String zzF() {
        byte[] bArr = new byte[16];
        zzJ().nextBytes(bArr);
        return java.lang.String.format(java.util.Locale.US, "%032x", new java.math.BigInteger(1, bArr));
    }

    public final java.lang.String zzG(java.lang.String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return java.lang.String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public final java.net.URL zzH(long j, java.lang.String str, java.lang.String str2, long j2, java.lang.String str3) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            java.lang.String strConcat = java.lang.String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", java.lang.String.format("v%s.%s", 119002L, java.lang.Integer.valueOf(zzm())), str2, str, java.lang.Long.valueOf(j2));
            if (str.equals(this.zzu.zzf().zzp())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat(com.ironsource.y8.i.c);
                }
                strConcat = strConcat.concat(str3);
            }
            return new java.net.URL(strConcat);
        } catch (java.lang.IllegalArgumentException | java.net.MalformedURLException e) {
            this.zzu.zzaW().zze().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.secureRandom"})
    final java.security.SecureRandom zzJ() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new java.security.SecureRandom();
        }
        return this.zzd;
    }

    final void zzL(android.os.Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.zzu.zzaW().zzk().zzb("Params already contained engagement", java.lang.Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    final void zzM(android.os.Bundle bundle, int i, java.lang.String str, java.lang.Object obj) {
        if (zzaz(bundle, i)) {
            this.zzu.zzf();
            bundle.putString("_ev", zzG(str, 40, true));
            if (obj != null) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
                if ((obj instanceof java.lang.String) || (obj instanceof java.lang.CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    final void zzO(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (java.lang.String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzu.zzw().zzS(bundle, str, bundle2.get(str));
            }
        }
    }

    final void zzP(android.os.Parcelable[] parcelableArr, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(parcelableArr);
        for (android.os.Parcelable parcelable : parcelableArr) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (java.lang.String str : new java.util.TreeSet(bundle.keySet())) {
                if (zzaq(str) && !zzaC(str, com.google.android.gms.measurement.internal.zzjz.zzd) && (i2 = i2 + 1) > i) {
                    com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                    if (!zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbr) || !z) {
                        zzioVar.zzaW().zzf().zzc("Param can't contain more than " + i + " item-scoped custom parameters", zzioVar.zzj().zze(str), zzioVar.zzj().zzb(bundle));
                    }
                    zzaz(bundle, 28);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    final void zzQ(com.google.android.gms.measurement.internal.zzhf zzhfVar, int i) {
        android.os.Bundle bundle = zzhfVar.zzd;
        int i2 = 0;
        boolean z = false;
        for (java.lang.String str : new java.util.TreeSet(bundle.keySet())) {
            if (zzaq(str) && (i2 = i2 + 1) > i) {
                com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                if (!zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbr) || !z) {
                    zzioVar.zzaW().zzf().zzc("Event can't contain more than " + i + " params", zzioVar.zzj().zzd(zzhfVar.zza), zzioVar.zzj().zzb(bundle));
                    zzaz(bundle, 5);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    final void zzR(com.google.android.gms.measurement.internal.zzqe zzqeVar, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, int i2) {
        android.os.Bundle bundle = new android.os.Bundle();
        zzaz(bundle, i);
        if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        zzqeVar.zza(str, "_err", bundle);
    }

    final void zzS(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof java.lang.Long) {
            bundle.putLong(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            bundle.putString(str, java.lang.String.valueOf(obj));
            return;
        }
        if (obj instanceof java.lang.Double) {
            bundle.putDouble(str, ((java.lang.Double) obj).doubleValue());
            return;
        }
        if (obj instanceof android.os.Bundle[]) {
            bundle.putParcelableArray(str, (android.os.Bundle[]) obj);
        } else if (str != null) {
            java.lang.String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            zzioVar.zzaW().zzl().zzc("Not putting event parameter. Invalid value type. name, type", zzioVar.zzj().zze(str), simpleName);
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcy zzcyVar, boolean z) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, z);
        try {
            zzcyVar.zze(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning boolean value to wrapper", e);
        }
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcy zzcyVar, java.util.ArrayList arrayList) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, arrayList);
        try {
            zzcyVar.zze(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning bundle list to wrapper", e);
        }
    }

    public final void zzV(com.google.android.gms.internal.measurement.zzcy zzcyVar, android.os.Bundle bundle) {
        try {
            zzcyVar.zze(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    public final void zzW(com.google.android.gms.internal.measurement.zzcy zzcyVar, byte[] bArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, bArr);
        try {
            zzcyVar.zze(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning byte array to wrapper", e);
        }
    }

    public final void zzX(com.google.android.gms.internal.measurement.zzcy zzcyVar, int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, i);
        try {
            zzcyVar.zze(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning int value to wrapper", e);
        }
    }

    public final void zzY(com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, j);
        try {
            zzcyVar.zze(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning long value to wrapper", e);
        }
    }

    public final void zzZ(com.google.android.gms.internal.measurement.zzcy zzcyVar, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, str);
        try {
            zzcyVar.zze(bundle);
        } catch (android.os.RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning string value to wrapper", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    final int zza(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, android.os.Bundle bundle, java.util.List list, boolean z, boolean z2) {
        int i;
        int size;
        zzg();
        if (!zzal(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!zzaC(str3, com.google.android.gms.measurement.internal.zzjz.zzc)) {
                return 20;
            }
            com.google.android.gms.measurement.internal.zzny zznyVarZzu = this.zzu.zzu();
            zznyVarZzu.zzg();
            zznyVarZzu.zza();
            if (zznyVarZzu.zzad() && zznyVarZzu.zzu.zzw().zzm() < 200900) {
                return 25;
            }
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            zzioVar.zzf();
            boolean z3 = obj instanceof android.os.Parcelable[];
            if (z3) {
                size = ((android.os.Parcelable[]) obj).length;
            } else if (obj instanceof java.util.ArrayList) {
                size = ((java.util.ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                zzioVar.zzaW().zzl().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, java.lang.Integer.valueOf(size));
                zzioVar.zzf();
                if (z3) {
                    android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (android.os.Parcelable[]) java.util.Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof java.util.ArrayList) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new java.util.ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i = 17;
            } else {
                i = 0;
            }
        }
        if (zzaf("param", str3, (zzap(str2) || zzap(str3)) ? this.zzu.zzf().zzd(null, false) : this.zzu.zzf().zzc(null, false), obj)) {
            return i;
        }
        if (!z2) {
            return 4;
        }
        if (obj instanceof android.os.Bundle) {
            zzaa(str, str2, str3, (android.os.Bundle) obj, list, z);
        } else if (obj instanceof android.os.Parcelable[]) {
            for (android.os.Parcelable parcelable : (android.os.Parcelable[]) obj) {
                if (!(parcelable instanceof android.os.Bundle)) {
                    this.zzu.zzaW().zzl().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                    return 4;
                }
                zzaa(str, str2, str3, (android.os.Bundle) parcelable, list, z);
            }
        } else {
            if (!(obj instanceof java.util.ArrayList)) {
                return 4;
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                java.lang.Object obj2 = arrayList2.get(i2);
                if (!(obj2 instanceof android.os.Bundle)) {
                    this.zzu.zzaW().zzl().zzc("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str3);
                    return 4;
                }
                zzaa(str, str2, str3, (android.os.Bundle) obj2, list, z);
            }
        }
        return i;
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final void zzaZ() {
        zzg();
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.zzu.zzaW().zzk().zza("Utils falling back to Random for random id");
            }
        }
        this.zze.set(jNextLong);
    }

    final void zzaa(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle, java.util.List list, boolean z) {
        int iZzi;
        int i;
        char c;
        int iZza;
        if (bundle == null) {
            return;
        }
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        char c2 = 20064;
        int i2 = true != zzioVar.zzf().zzu.zzw().zzao(231100000, true) ? 0 : 35;
        int i3 = 0;
        boolean z2 = false;
        for (java.lang.String str4 : new java.util.TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                iZzi = !z ? zzi(str4) : 0;
                if (iZzi == 0) {
                    iZzi = zzh(str4);
                }
            } else {
                iZzi = 0;
            }
            if (iZzi != 0) {
                zzM(bundle, iZzi, str4, iZzi == 3 ? str4 : null);
                bundle.remove(str4);
                i = i2;
                c = c2;
            } else {
                if (zzal(bundle.get(str4))) {
                    zzioVar.zzaW().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                    iZza = 22;
                } else {
                    iZza = zza(str, str2, str4, bundle.get(str4), bundle, list, z, false);
                }
                if (iZza != 0 && !"_ev".equals(str4)) {
                    zzM(bundle, iZza, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (zzaq(str4) && !zzaC(str4, com.google.android.gms.measurement.internal.zzjz.zzd)) {
                    int i4 = i3 + 1;
                    c = 20064;
                    if (zzao(231100000, true)) {
                        i = i2;
                        if (i4 > i) {
                            if (!zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbr) || !z2) {
                                zzioVar.zzaW().zzf().zzc("Item can't contain more than " + i + " item-scoped custom params", zzioVar.zzj().zzd(str2), zzioVar.zzj().zzb(bundle));
                            }
                            zzaz(bundle, 28);
                            bundle.remove(str4);
                            i3 = i4;
                            c2 = 20064;
                            i2 = i;
                            z2 = true;
                        }
                    } else {
                        zzioVar.zzaW().zzf().zzc("Item array not supported on client's version of Google Play Services (Android Only)", zzioVar.zzj().zzd(str2), zzioVar.zzj().zzb(bundle));
                        zzaz(bundle, 23);
                        bundle.remove(str4);
                        i = i2;
                    }
                    i3 = i4;
                }
                i = i2;
                c = 20064;
            }
            c2 = c;
            i2 = i;
        }
    }

    final boolean zzab(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) com.google.android.gms.measurement.internal.zzgi.zzaq.zza(null);
        return str2.equals(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES) || java.util.Arrays.asList(str2.split(",")).contains(str);
    }

    final boolean zzac(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbp)) {
            if (android.text.TextUtils.isEmpty(str)) {
                if (this.zzu.zzL()) {
                    zzioVar.zzaW().zzf().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                    return false;
                }
            } else {
                if (zzax(str)) {
                    return true;
                }
                if (this.zzu.zzL()) {
                    zzioVar.zzaW().zzf().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                    return false;
                }
            }
            return false;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            if (android.text.TextUtils.isEmpty(str2)) {
                if (this.zzu.zzL()) {
                    zzioVar.zzaW().zzf().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            }
            if (!zzax(str2)) {
                zzioVar.zzaW().zzf().zzb("Invalid admob_app_id. Analytics disabled.", com.google.android.gms.measurement.internal.zzhe.zzn(str2));
                return false;
            }
        } else if (!zzax(str)) {
            if (this.zzu.zzL()) {
                zzioVar.zzaW().zzf().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", com.google.android.gms.measurement.internal.zzhe.zzn(str));
            }
            return false;
        }
        return true;
    }

    final boolean zzad(java.lang.String str, int i, java.lang.String str2) {
        if (str2 == null) {
            this.zzu.zzaW().zzf().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        this.zzu.zzaW().zzf().zzd("Name is too long. Type, maximum supported length, name", str, java.lang.Integer.valueOf(i), str2);
        return false;
    }

    final boolean zzae(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String str2) {
        if (str2 == null) {
            this.zzu.zzaW().zzf().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str2);
        java.lang.String[] strArr3 = zzb;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.zzu.zzaW().zzf().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzaC(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzaC(str2, strArr2)) {
            return true;
        }
        this.zzu.zzaW().zzf().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    final boolean zzaf(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Byte) && !(obj instanceof java.lang.Short) && !(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Double)) {
            if (!(obj instanceof java.lang.String) && !(obj instanceof java.lang.Character) && !(obj instanceof java.lang.CharSequence)) {
                return false;
            }
            java.lang.String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i) {
                this.zzu.zzaW().zzl().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, java.lang.Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    final boolean zzag(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            this.zzu.zzaW().zzf().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaW().zzf().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!java.lang.Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.zzu.zzaW().zzf().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = java.lang.Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzu.zzaW().zzf().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean zzah(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            this.zzu.zzaW().zzf().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaW().zzf().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!java.lang.Character.isLetter(iCodePointAt)) {
            this.zzu.zzaW().zzf().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = java.lang.Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzu.zzaW().zzf().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002c  */
    final boolean zzai() {
        java.lang.Object e;
        java.lang.Integer num;
        boolean z;
        if (this.zzh == null) {
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures measurementManagerFuturesZzB = zzB();
            if (measurementManagerFuturesZzB == null) {
                return false;
            }
            try {
                num = measurementManagerFuturesZzB.getMeasurementApiStatusAsync().get(10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        z = true;
                        if (num.intValue() != 1) {
                            z = false;
                        }
                        this.zzh = java.lang.Boolean.valueOf(z);
                    } catch (java.lang.InterruptedException e2) {
                        e = e2;
                        this.zzu.zzaW().zzk().zzb("Measurement manager api exception", e);
                        this.zzh = false;
                    } catch (java.util.concurrent.CancellationException e3) {
                        e = e3;
                        this.zzu.zzaW().zzk().zzb("Measurement manager api exception", e);
                        this.zzh = false;
                    } catch (java.util.concurrent.ExecutionException e4) {
                        e = e4;
                        this.zzu.zzaW().zzk().zzb("Measurement manager api exception", e);
                        this.zzh = false;
                    } catch (java.util.concurrent.TimeoutException e5) {
                        e = e5;
                        this.zzu.zzaW().zzk().zzb("Measurement manager api exception", e);
                        this.zzh = false;
                    }
                    this.zzu.zzaW().zzj().zzb("Measurement manager api status result", num);
                } else {
                    z = false;
                    this.zzh = java.lang.Boolean.valueOf(z);
                    this.zzu.zzaW().zzj().zzb("Measurement manager api status result", num);
                }
            } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e6) {
                e = e6;
                num = null;
            }
        }
        return this.zzh.booleanValue();
    }

    final boolean zzaj(java.lang.String str) {
        zzg();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (com.google.android.gms.common.wrappers.Wrappers.packageManager(zzioVar.zzaT()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzioVar.zzaW().zzd().zzb("Permission not granted", str);
        return false;
    }

    final boolean zzak(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str2)) {
            return true;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        java.lang.String strZzo = zzioVar.zzf().zzo();
        zzioVar.zzaV();
        return strZzo.equals(str);
    }

    final boolean zzal(java.lang.Object obj) {
        return (obj instanceof android.os.Parcelable[]) || (obj instanceof java.util.ArrayList) || (obj instanceof android.os.Bundle);
    }

    final boolean zzam(android.content.Context context, java.lang.String str) {
        javax.security.auth.x500.X500Principal x500Principal = new javax.security.auth.x500.X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                return true;
            }
            return ((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new java.io.ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            this.zzu.zzaW().zze().zzb("Package name not found", e);
            return true;
        } catch (java.security.cert.CertificateException e2) {
            this.zzu.zzaW().zze().zzb("Error obtaining certificate", e2);
            return true;
        }
    }

    final boolean zzan() {
        zzg();
        return zzq() == 1;
    }

    public final boolean zzao(int i, boolean z) {
        java.lang.Boolean boolZzl = this.zzu.zzu().zzl();
        if (zzm() < i / 1000) {
            return (boolZzl == null || boolZzl.booleanValue()) ? false : true;
        }
        return true;
    }

    final boolean zzav(java.lang.String str, java.lang.String str2) {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(str);
        boolean zIsEmpty2 = android.text.TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    final boolean zzaw(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (this.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbp)) {
            return zzav(str, str2);
        }
        boolean zIsEmpty = android.text.TextUtils.isEmpty(str);
        boolean zIsEmpty2 = android.text.TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str4)) {
                return !android.text.TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty) {
            return android.text.TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (android.text.TextUtils.isEmpty(str4)) {
            return false;
        }
        return android.text.TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    final boolean zzax(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return str.matches(true != this.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbp) ? "^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$" : "^1:\\d+:android:[a-f0-9]+$");
    }

    final byte[] zzay(android.os.Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final boolean zzc() {
        return true;
    }

    final int zzd(java.lang.String str, java.lang.Object obj) {
        return "_ldl".equals(str) ? zzaf("user property referrer", str, zzaA(str), obj) : zzaf("user property", str, zzaA(str), obj) ? 0 : 7;
    }

    final int zzf(java.lang.String str) {
        if (!zzag(androidx.core.app.NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!zzae(androidx.core.app.NotificationCompat.CATEGORY_EVENT, com.google.android.gms.measurement.internal.zzjy.zza, com.google.android.gms.measurement.internal.zzjy.zzb, str)) {
            return 13;
        }
        this.zzu.zzf();
        return !zzad(androidx.core.app.NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
    }

    final int zzh(java.lang.String str) {
        if (!zzag("event param", str)) {
            return 3;
        }
        if (!zzae("event param", null, null, str)) {
            return 14;
        }
        this.zzu.zzf();
        return !zzad("event param", 40, str) ? 3 : 0;
    }

    final int zzi(java.lang.String str) {
        if (!zzah("event param", str)) {
            return 3;
        }
        if (!zzae("event param", null, null, str)) {
            return 14;
        }
        this.zzu.zzf();
        return !zzad("event param", 40, str) ? 3 : 0;
    }

    final int zzj(java.lang.String str) {
        if (!zzag("user property", str)) {
            return 6;
        }
        if (!zzae("user property", com.google.android.gms.measurement.internal.zzka.zza, null, str)) {
            return 15;
        }
        this.zzu.zzf();
        return !zzad("user property", 24, str) ? 6 : 0;
    }

    final int zzl() {
        if (android.os.Build.VERSION.SDK_INT < 30 || android.os.ext.SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return android.os.ext.SdkExtensions.getExtensionVersion(1000000);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if (this.zzi == null) {
            this.zzi = java.lang.Integer.valueOf(com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzu.zzaT()) / 1000);
        }
        return this.zzi.intValue();
    }

    public final int zzp(int i) {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzu.zzaT(), 12451000);
    }

    final long zzq() {
        long j;
        zzg();
        if (!zzab(this.zzu.zzh().zzm())) {
            return 0L;
        }
        if (android.os.Build.VERSION.SDK_INT < 30) {
            j = 4;
        } else if (android.os.ext.SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            int iZzl = zzl();
            zzioVar.zzf();
            j = iZzl < ((java.lang.Integer) com.google.android.gms.measurement.internal.zzgi.zzak.zza(null)).intValue() ? 16L : 0L;
        }
        if (!zzaj("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0 && !zzai()) {
            j = 64;
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final long zzs() {
        long andIncrement;
        long j;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.zze;
        if (atomicLong.get() != 0) {
            java.util.concurrent.atomic.AtomicLong atomicLong2 = this.zze;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNextLong = new java.util.Random(java.lang.System.nanoTime() ^ this.zzu.zzaU().currentTimeMillis()).nextLong();
            int i = this.zzf + 1;
            this.zzf = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    public final long zzt(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    final android.os.Bundle zzu(android.net.Uri uri) {
        java.lang.String queryParameter;
        java.lang.String queryParameter2;
        java.lang.String queryParameter3;
        java.lang.String queryParameter4;
        java.lang.String queryParameter5;
        java.lang.String queryParameter6;
        java.lang.String queryParameter7;
        java.lang.String queryParameter8;
        java.lang.String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (android.text.TextUtils.isEmpty(queryParameter) && android.text.TextUtils.isEmpty(queryParameter2) && android.text.TextUtils.isEmpty(queryParameter3) && android.text.TextUtils.isEmpty(queryParameter4) && android.text.TextUtils.isEmpty(queryParameter5) && android.text.TextUtils.isEmpty(queryParameter6) && android.text.TextUtils.isEmpty(queryParameter7) && android.text.TextUtils.isEmpty(queryParameter8) && android.text.TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            if (!android.text.TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            java.lang.String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!android.text.TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            java.lang.String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!android.text.TextUtils.isEmpty(queryParameter11)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.TERM, queryParameter11);
            }
            java.lang.String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!android.text.TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            java.lang.String queryParameter13 = uri.getQueryParameter(com.google.firebase.analytics.FirebaseAnalytics.Param.ACLID);
            if (!android.text.TextUtils.isEmpty(queryParameter13)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.ACLID, queryParameter13);
            }
            java.lang.String queryParameter14 = uri.getQueryParameter(com.google.firebase.analytics.FirebaseAnalytics.Param.CP1);
            if (!android.text.TextUtils.isEmpty(queryParameter14)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.CP1, queryParameter14);
            }
            java.lang.String queryParameter15 = uri.getQueryParameter("anid");
            if (!android.text.TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.CAMPAIGN_ID, queryParameter6);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            java.lang.String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!android.text.TextUtils.isEmpty(queryParameter16)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter16);
            }
            java.lang.String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!android.text.TextUtils.isEmpty(queryParameter17)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter17);
            }
            java.lang.String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!android.text.TextUtils.isEmpty(queryParameter18)) {
                bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter18);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            return bundle;
        } catch (java.lang.UnsupportedOperationException e) {
            this.zzu.zzaW().zzk().zzb("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    final android.os.Bundle zzz(android.os.Bundle bundle, java.lang.String str) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle != null) {
            for (java.lang.String str2 : bundle.keySet()) {
                java.lang.Object objZzD = zzD(str2, bundle.get(str2));
                if (objZzD == null) {
                    com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                    zzioVar.zzaW().zzl().zzb("Param value can't be null", zzioVar.zzj().zze(str2));
                } else {
                    zzS(bundle2, str2, objZzD);
                }
            }
        }
        return bundle2;
    }
}
