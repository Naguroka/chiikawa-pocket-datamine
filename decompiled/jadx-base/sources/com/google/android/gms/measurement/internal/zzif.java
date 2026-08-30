package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzif extends com.google.android.gms.measurement.internal.zzpg implements com.google.android.gms.measurement.internal.zzal {
    final java.util.Map zza;
    final java.util.Map zzb;
    final java.util.Map zzc;
    final androidx.collection.LruCache zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final java.util.Map zzf;
    private final java.util.Map zzh;
    private final java.util.Map zzi;
    private final java.util.Map zzj;
    private final java.util.Map zzk;
    private final java.util.Map zzl;

    zzif(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        super(zzpvVar);
        this.zzf = new androidx.collection.ArrayMap();
        this.zza = new androidx.collection.ArrayMap();
        this.zzb = new androidx.collection.ArrayMap();
        this.zzc = new androidx.collection.ArrayMap();
        this.zzh = new androidx.collection.ArrayMap();
        this.zzj = new androidx.collection.ArrayMap();
        this.zzk = new androidx.collection.ArrayMap();
        this.zzl = new androidx.collection.ArrayMap();
        this.zzi = new androidx.collection.ArrayMap();
        this.zzd = new com.google.android.gms.measurement.internal.zzic(this, 20);
        this.zze = new com.google.android.gms.measurement.internal.zzid(this);
    }

    private final com.google.android.gms.internal.measurement.zzgo zzG(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzgo.zzh();
        }
        try {
            com.google.android.gms.internal.measurement.zzgo zzgoVar = (com.google.android.gms.internal.measurement.zzgo) ((com.google.android.gms.internal.measurement.zzgn) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzgo.zzf(), bArr)).zzba();
            this.zzu.zzaW().zzj().zzc("Parsed config. version, gmp_app_id", zzgoVar.zzw() ? java.lang.Long.valueOf(zzgoVar.zzc()) : null, zzgoVar.zzu() ? zzgoVar.zzj() : null);
            return zzgoVar;
        } catch (com.google.android.gms.internal.measurement.zzmm e) {
            this.zzu.zzaW().zzk().zzc("Unable to merge remote config. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
            return com.google.android.gms.internal.measurement.zzgo.zzh();
        } catch (java.lang.RuntimeException e2) {
            this.zzu.zzaW().zzk().zzc("Unable to merge remote config. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e2);
            return com.google.android.gms.internal.measurement.zzgo.zzh();
        }
    }

    private final void zzH(java.lang.String str, com.google.android.gms.internal.measurement.zzgn zzgnVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
        androidx.collection.ArrayMap arrayMap3 = new androidx.collection.ArrayMap();
        java.util.Iterator it = zzgnVar.zzh().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.zzgk) it.next()).zzb());
        }
        for (int i = 0; i < zzgnVar.zza(); i++) {
            com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) zzgnVar.zzb(i).zzch();
            if (zzglVar.zzc().isEmpty()) {
                this.zzu.zzaW().zzk().zza("EventConfig contained null event name");
            } else {
                java.lang.String strZzc = zzglVar.zzc();
                java.lang.String strZzb = com.google.android.gms.measurement.internal.zzjy.zzb(zzglVar.zzc());
                if (!android.text.TextUtils.isEmpty(strZzb)) {
                    zzglVar.zzb(strZzb);
                    zzgnVar.zze(i, zzglVar);
                }
                if (zzglVar.zzf() && zzglVar.zzd()) {
                    arrayMap.put(strZzc, true);
                }
                if (zzglVar.zzg() && zzglVar.zze()) {
                    arrayMap2.put(zzglVar.zzc(), true);
                }
                if (zzglVar.zzh()) {
                    if (zzglVar.zza() < 2 || zzglVar.zza() > 65535) {
                        this.zzu.zzaW().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzglVar.zzc(), java.lang.Integer.valueOf(zzglVar.zza()));
                    } else {
                        arrayMap3.put(zzglVar.zzc(), java.lang.Integer.valueOf(zzglVar.zza()));
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, arrayMap);
        this.zzc.put(str, arrayMap2);
        this.zzi.put(str, arrayMap3);
    }

    private final void zzI(java.lang.String str) throws java.lang.Throwable {
        zzav();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        java.util.Map map = this.zzh;
        if (map.get(str) == null) {
            com.google.android.gms.measurement.internal.zzar zzarVarZzn = this.zzg.zzj().zzn(str);
            if (zzarVarZzn != null) {
                com.google.android.gms.internal.measurement.zzgn zzgnVar = (com.google.android.gms.internal.measurement.zzgn) zzG(str, zzarVarZzn.zza).zzch();
                zzH(str, zzgnVar);
                this.zzf.put(str, zzK((com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba()));
                map.put(str, (com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba());
                zzJ(str, (com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba());
                this.zzj.put(str, zzgnVar.zzf());
                this.zzk.put(str, zzarVarZzn.zzb);
                this.zzl.put(str, zzarVarZzn.zzc);
                return;
            }
            this.zzf.put(str, null);
            this.zzb.put(str, null);
            this.zza.put(str, null);
            this.zzc.put(str, null);
            map.put(str, null);
            this.zzj.put(str, null);
            this.zzk.put(str, null);
            this.zzl.put(str, null);
            this.zzi.put(str, null);
        }
    }

    private final void zzJ(final java.lang.String str, com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        if (zzgoVar.zza() == 0) {
            this.zzd.remove(str);
            return;
        }
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzj().zzb("EES programs found", java.lang.Integer.valueOf(zzgoVar.zza()));
        com.google.android.gms.internal.measurement.zziv zzivVar = (com.google.android.gms.internal.measurement.zziv) zzgoVar.zzo().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zzd("internal.remoteConfig", new java.util.concurrent.Callable() { // from class: com.google.android.gms.measurement.internal.zzhy
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new com.google.android.gms.measurement.internal.zzie(this.zza, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new java.util.concurrent.Callable() { // from class: com.google.android.gms.measurement.internal.zzhz
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    final com.google.android.gms.measurement.internal.zzif zzifVar = this.zza;
                    final java.lang.String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new java.util.concurrent.Callable() { // from class: com.google.android.gms.measurement.internal.zzib
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            com.google.android.gms.measurement.internal.zzif zzifVar2 = zzifVar;
                            com.google.android.gms.measurement.internal.zzaw zzawVarZzj = zzifVar2.zzg.zzj();
                            java.lang.String str3 = str2;
                            com.google.android.gms.measurement.internal.zzh zzhVarZzl = zzawVarZzj.zzl(str3);
                            java.util.HashMap map = new java.util.HashMap();
                            map.put(com.json.ce.A, "android");
                            map.put(com.ironsource.y8.h.V, str3);
                            zzifVar2.zzu.zzf().zzj();
                            map.put("gmp_version", 119002L);
                            if (zzhVarZzl != null) {
                                java.lang.String strZzF = zzhVarZzl.zzF();
                                if (strZzF != null) {
                                    map.put("app_version", strZzF);
                                }
                                map.put("app_version_int", java.lang.Long.valueOf(zzhVarZzl.zze()));
                                map.put("dynamite_version", java.lang.Long.valueOf(zzhVarZzl.zzo()));
                            }
                            return map;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new java.util.concurrent.Callable() { // from class: com.google.android.gms.measurement.internal.zzia
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(this.zza.zze);
                }
            });
            zzcVar.zzc(zzivVar);
            this.zzd.put(str, zzcVar);
            zzioVar.zzaW().zzj().zzc("EES program loaded for appId, activities", str, java.lang.Integer.valueOf(zzivVar.zza().zza()));
            java.util.Iterator it = zzivVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzioVar.zzaW().zzj().zzb("EES program activity", ((com.google.android.gms.internal.measurement.zzit) it.next()).zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzu.zzaW().zze().zzb("Failed to load EES program. appId", str);
        }
    }

    private static final java.util.Map zzK(com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        if (zzgoVar != null) {
            for (com.google.android.gms.internal.measurement.zzgw zzgwVar : zzgoVar.zzp()) {
                arrayMap.put(zzgwVar.zzb(), zzgwVar.zzc());
            }
        }
        return arrayMap;
    }

    private static final com.google.android.gms.measurement.internal.zzjw zzL(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return com.google.android.gms.measurement.internal.zzjw.AD_STORAGE;
        }
        if (i2 == 2) {
            return com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return com.google.android.gms.measurement.internal.zzjw.AD_PERSONALIZATION;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(com.google.android.gms.measurement.internal.zzif zzifVar, java.lang.String str) throws java.lang.Throwable {
        zzifVar.zzav();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        if (!zzifVar.zzs(str)) {
            return null;
        }
        java.util.Map map = zzifVar.zzh;
        if (!map.containsKey(str) || map.get(str) == null) {
            zzifVar.zzI(str);
        } else {
            zzifVar.zzJ(str, (com.google.android.gms.internal.measurement.zzgo) map.get(str));
        }
        return (com.google.android.gms.internal.measurement.zzc) zzifVar.zzd.snapshot().get(str);
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zze(com.google.android.gms.measurement.internal.zzif zzifVar, java.lang.String str) throws java.lang.Throwable {
        zzifVar.zzav();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.measurement.internal.zzar zzarVarZzn = zzifVar.zzg.zzj().zzn(str);
        if (zzarVarZzn == null) {
            return null;
        }
        zzifVar.zzu.zzaW().zzj().zzb("Populate EES config from database on cache miss. appId", str);
        zzifVar.zzJ(str, zzifVar.zzG(str, zzarVarZzn.zza));
        return (com.google.android.gms.internal.measurement.zzc) zzifVar.zzd.snapshot().get(str);
    }

    final boolean zzA(java.lang.String str) throws java.lang.Throwable {
        zzg();
        zzI(str);
        java.util.Map map = this.zza;
        return map.get(str) != null && ((java.util.Set) map.get(str)).contains("app_instance_id");
    }

    final boolean zzB(java.lang.String str) throws java.lang.Throwable {
        zzg();
        zzI(str);
        java.util.Map map = this.zza;
        if (map.get(str) != null) {
            return ((java.util.Set) map.get(str)).contains("device_model") || ((java.util.Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean zzC(java.lang.String str) throws java.lang.Throwable {
        zzg();
        zzI(str);
        java.util.Map map = this.zza;
        return map.get(str) != null && ((java.util.Set) map.get(str)).contains("enhanced_user_id");
    }

    final boolean zzD(java.lang.String str) throws java.lang.Throwable {
        zzg();
        zzI(str);
        java.util.Map map = this.zza;
        return map.get(str) != null && ((java.util.Set) map.get(str)).contains("google_signals");
    }

    final boolean zzE(java.lang.String str) throws java.lang.Throwable {
        zzg();
        zzI(str);
        java.util.Map map = this.zza;
        if (map.get(str) != null) {
            return ((java.util.Set) map.get(str)).contains("os_version") || ((java.util.Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean zzF(java.lang.String str) throws java.lang.Throwable {
        zzg();
        zzI(str);
        java.util.Map map = this.zza;
        return map.get(str) != null && ((java.util.Set) map.get(str)).contains("user_id");
    }

    @Override // com.google.android.gms.measurement.internal.zzal
    public final java.lang.String zza(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        zzg();
        zzI(str);
        java.util.Map map = (java.util.Map) this.zzf.get(str);
        if (map != null) {
            return (java.lang.String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
        return false;
    }

    final int zzc(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        java.lang.Integer num;
        zzg();
        zzI(str);
        java.util.Map map = (java.util.Map) this.zzi.get(str);
        if (map == null || (num = (java.lang.Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final com.google.android.gms.measurement.internal.zzju zzf(java.lang.String str, com.google.android.gms.measurement.internal.zzjw zzjwVar) throws java.lang.Throwable {
        zzg();
        zzI(str);
        com.google.android.gms.internal.measurement.zzgi zzgiVarZzi = zzi(str);
        if (zzgiVarZzi == null) {
            return com.google.android.gms.measurement.internal.zzju.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.zzfz zzfzVar : zzgiVarZzi.zzf()) {
            if (zzL(zzfzVar.zzc()) == zzjwVar) {
                int iZzb = zzfzVar.zzb() - 1;
                if (iZzb != 1) {
                    return iZzb != 2 ? com.google.android.gms.measurement.internal.zzju.UNINITIALIZED : com.google.android.gms.measurement.internal.zzju.DENIED;
                }
                return com.google.android.gms.measurement.internal.zzju.GRANTED;
            }
        }
        return com.google.android.gms.measurement.internal.zzju.UNINITIALIZED;
    }

    final com.google.android.gms.measurement.internal.zzjw zzh(java.lang.String str, com.google.android.gms.measurement.internal.zzjw zzjwVar) {
        zzg();
        zzI(str);
        com.google.android.gms.internal.measurement.zzgi zzgiVarZzi = zzi(str);
        if (zzgiVarZzi == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.zzgb zzgbVar : zzgiVarZzi.zze()) {
            if (zzjwVar == zzL(zzgbVar.zzc())) {
                return zzL(zzgbVar.zzb());
            }
        }
        return null;
    }

    final com.google.android.gms.internal.measurement.zzgi zzi(java.lang.String str) throws java.lang.Throwable {
        zzg();
        zzI(str);
        com.google.android.gms.internal.measurement.zzgo zzgoVarZzj = zzj(str);
        if (zzgoVarZzj == null || !zzgoVarZzj.zzt()) {
            return null;
        }
        return zzgoVarZzj.zzd();
    }

    protected final com.google.android.gms.internal.measurement.zzgo zzj(java.lang.String str) {
        zzav();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzI(str);
        return (com.google.android.gms.internal.measurement.zzgo) this.zzh.get(str);
    }

    protected final java.lang.String zzk(java.lang.String str) {
        zzg();
        return (java.lang.String) this.zzl.get(str);
    }

    protected final java.lang.String zzl(java.lang.String str) {
        zzg();
        return (java.lang.String) this.zzk.get(str);
    }

    final java.lang.String zzm(java.lang.String str) {
        zzg();
        zzI(str);
        return (java.lang.String) this.zzj.get(str);
    }

    final java.util.Set zzo(java.lang.String str) {
        zzg();
        zzI(str);
        return (java.util.Set) this.zza.get(str);
    }

    final java.util.SortedSet zzp(java.lang.String str) {
        zzg();
        zzI(str);
        java.util.TreeSet treeSet = new java.util.TreeSet();
        com.google.android.gms.internal.measurement.zzgi zzgiVarZzi = zzi(str);
        if (zzgiVarZzi != null) {
            java.util.Iterator it = zzgiVarZzi.zzc().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.zzgh) it.next()).zzb());
            }
        }
        return treeSet;
    }

    protected final void zzq(java.lang.String str) {
        zzg();
        this.zzk.put(str, null);
    }

    final void zzr(java.lang.String str) {
        zzg();
        this.zzh.remove(str);
    }

    public final boolean zzs(java.lang.String str) {
        com.google.android.gms.internal.measurement.zzgo zzgoVar;
        return (android.text.TextUtils.isEmpty(str) || (zzgoVar = (com.google.android.gms.internal.measurement.zzgo) this.zzh.get(str)) == null || zzgoVar.zza() == 0) ? false : true;
    }

    final boolean zzt(java.lang.String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    final boolean zzu(java.lang.String str, com.google.android.gms.measurement.internal.zzjw zzjwVar) throws java.lang.Throwable {
        zzg();
        zzI(str);
        com.google.android.gms.internal.measurement.zzgi zzgiVarZzi = zzi(str);
        if (zzgiVarZzi == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.zzfz zzfzVar : zzgiVarZzi.zzd()) {
            if (zzjwVar == zzL(zzfzVar.zzc())) {
                if (zzfzVar.zzb() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean zzv(java.lang.String str) {
        zzg();
        zzI(str);
        com.google.android.gms.internal.measurement.zzgi zzgiVarZzi = zzi(str);
        return zzgiVarZzi == null || !zzgiVarZzi.zzh() || zzgiVarZzi.zzg();
    }

    final boolean zzw(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        java.lang.Boolean bool;
        zzg();
        zzI(str);
        if ("ecommerce_purchase".equals(str2) || com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE.equals(str2) || com.google.firebase.analytics.FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        java.util.Map map = (java.util.Map) this.zzc.get(str);
        if (map == null || (bool = (java.lang.Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean zzx(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        java.lang.Boolean bool;
        zzg();
        zzI(str);
        if (zzt(str) && com.google.android.gms.measurement.internal.zzqf.zzap(str2)) {
            return true;
        }
        if (zzy(str) && com.google.android.gms.measurement.internal.zzqf.zzaq(str2)) {
            return true;
        }
        java.util.Map map = (java.util.Map) this.zzb.get(str);
        if (map == null || (bool = (java.lang.Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean zzy(java.lang.String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    protected final boolean zzz(java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3) {
        zzav();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzgn zzgnVar = (com.google.android.gms.internal.measurement.zzgn) zzG(str, bArr).zzch();
        zzH(str, zzgnVar);
        zzJ(str, (com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba());
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba());
        this.zzj.put(str, zzgnVar.zzf());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzf.put(str, zzK((com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba()));
        this.zzg.zzj().zzR(str, new java.util.ArrayList(zzgnVar.zzg()));
        try {
            zzgnVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba()).zzcd();
        } catch (java.lang.RuntimeException e) {
            this.zzu.zzaW().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
        }
        com.google.android.gms.measurement.internal.zzaw zzawVarZzj = this.zzg.zzj();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzawVarZzj.zzg();
        zzawVarZzj.zzav();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzawVarZzj.zzj().update("apps", contentValues, "app_id = ?", new java.lang.String[]{str}) == 0) {
                zzawVarZzj.zzu.zzaW().zze().zzb("Failed to update remote config (got 0). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            zzawVarZzj.zzu.zzaW().zze().zzc("Error storing remote config. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e2);
        }
        if (this.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbn)) {
            zzgnVar.zzd();
        }
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzgo) zzgnVar.zzba());
        return true;
    }
}
