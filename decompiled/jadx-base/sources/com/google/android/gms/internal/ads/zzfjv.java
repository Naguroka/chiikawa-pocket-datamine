package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfjv {
    private final java.util.concurrent.ConcurrentMap zza = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.ConcurrentMap zzb = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.ads.zzfki zzc;
    private final com.google.android.gms.internal.ads.zzfjp zzd;
    private final android.content.Context zze;
    private volatile android.net.ConnectivityManager zzf;
    private final com.google.android.gms.common.util.Clock zzg;
    private java.util.concurrent.atomic.AtomicInteger zzh;

    zzfjv(com.google.android.gms.internal.ads.zzfki zzfkiVar, com.google.android.gms.internal.ads.zzfjp zzfjpVar, android.content.Context context, com.google.android.gms.common.util.Clock clock) {
        this.zzc = zzfkiVar;
        this.zzd = zzfjpVar;
        this.zze = context;
        this.zzg = clock;
    }

    static java.lang.String zzd(java.lang.String str, com.google.android.gms.ads.AdFormat adFormat) {
        return str + "#" + (adFormat == null ? "NULL" : adFormat.name());
    }

    private final synchronized com.google.android.gms.internal.ads.zzfkh zzn(java.lang.String str, com.google.android.gms.ads.AdFormat adFormat) {
        return (com.google.android.gms.internal.ads.zzfkh) this.zza.get(zzd(str, adFormat));
    }

    private final synchronized java.util.List zzo(java.util.List list) {
        java.util.ArrayList arrayList;
        java.util.HashSet hashSet = new java.util.HashSet();
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.client.zzft zzftVar = (com.google.android.gms.ads.internal.client.zzft) it.next();
            java.lang.String strZzd = zzd(zzftVar.zza, com.google.android.gms.ads.AdFormat.getAdFormat(zzftVar.zzb));
            hashSet.add(strZzd);
            com.google.android.gms.internal.ads.zzfkh zzfkhVar = (com.google.android.gms.internal.ads.zzfkh) this.zza.get(strZzd);
            if (zzfkhVar != null) {
                if (zzfkhVar.zze.equals(zzftVar)) {
                    zzfkhVar.zzs(zzftVar.zzd);
                } else {
                    this.zzb.put(strZzd, zzfkhVar);
                    this.zza.remove(strZzd);
                }
            } else if (this.zzb.containsKey(strZzd)) {
                com.google.android.gms.internal.ads.zzfkh zzfkhVar2 = (com.google.android.gms.internal.ads.zzfkh) this.zzb.get(strZzd);
                if (zzfkhVar2.zze.equals(zzftVar)) {
                    zzfkhVar2.zzs(zzftVar.zzd);
                    zzfkhVar2.zzp();
                    this.zza.put(strZzd, zzfkhVar2);
                    this.zzb.remove(strZzd);
                }
            } else {
                arrayList.add(zzftVar);
            }
        }
        java.util.Iterator it2 = this.zza.entrySet().iterator();
        while (it2.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
            if (!hashSet.contains((java.lang.String) entry.getKey())) {
                this.zzb.put((java.lang.String) entry.getKey(), (com.google.android.gms.internal.ads.zzfkh) entry.getValue());
                it2.remove();
            }
        }
        java.util.Iterator it3 = this.zzb.entrySet().iterator();
        while (it3.hasNext()) {
            com.google.android.gms.internal.ads.zzfkh zzfkhVar3 = (com.google.android.gms.internal.ads.zzfkh) ((java.util.Map.Entry) it3.next()).getValue();
            zzfkhVar3.zzr();
            if (!zzfkhVar3.zzt()) {
                it3.remove();
            }
        }
        return arrayList;
    }

    private final synchronized java.util.Optional zzp(final java.lang.Class cls, java.lang.String str, final com.google.android.gms.ads.AdFormat adFormat) {
        this.zzd.zzd(adFormat, this.zzg.currentTimeMillis());
        com.google.android.gms.internal.ads.zzfkh zzfkhVarZzn = zzn(str, adFormat);
        if (zzfkhVarZzn == null) {
            return java.util.Optional.empty();
        }
        try {
            final java.util.Optional optionalZzf = zzfkhVarZzn.zzf();
            java.util.Optional optionalOfNullable = java.util.Optional.ofNullable(zzfkhVarZzn.zze());
            java.util.Objects.requireNonNull(cls);
            java.util.Optional map = optionalOfNullable.map(new java.util.function.Function() { // from class: com.google.android.gms.internal.ads.zzfjr
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return cls.cast(obj);
                }
            });
            map.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.zzfjs
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    this.zza.zzg(adFormat, optionalZzf, obj);
                }
            });
            return map;
        } catch (java.lang.ClassCastException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(java.lang.String.valueOf(cls.getName())), e);
            return java.util.Optional.empty();
        }
    }

    private final synchronized void zzq(java.lang.String str, com.google.android.gms.internal.ads.zzfkh zzfkhVar) {
        zzfkhVar.zzc();
        this.zza.put(str, zzfkhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzr(boolean z) {
        try {
            if (z) {
                java.util.Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.internal.ads.zzfkh) it.next()).zzp();
                }
            } else {
                java.util.Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((com.google.android.gms.internal.ads.zzfkh) it2.next()).zzf.set(false);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzs(boolean z) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzt)).booleanValue()) {
            zzr(z);
        }
    }

    private final synchronized boolean zzt(java.lang.String str, com.google.android.gms.ads.AdFormat adFormat) {
        boolean z;
        long jCurrentTimeMillis = this.zzg.currentTimeMillis();
        com.google.android.gms.internal.ads.zzfkh zzfkhVarZzn = zzn(str, adFormat);
        z = false;
        if (zzfkhVarZzn != null && zzfkhVarZzn.zzt()) {
            z = true;
        }
        this.zzd.zza(adFormat, jCurrentTimeMillis, z ? java.util.Optional.of(java.lang.Long.valueOf(this.zzg.currentTimeMillis())) : java.util.Optional.empty(), zzfkhVarZzn == null ? java.util.Optional.empty() : zzfkhVarZzn.zzf());
        return z;
    }

    public final synchronized com.google.android.gms.internal.ads.zzbad zza(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzbad) zzp(com.google.android.gms.internal.ads.zzbad.class, str, com.google.android.gms.ads.AdFormat.APP_OPEN_AD).orElse(null);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzby zzb(java.lang.String str) {
        return (com.google.android.gms.ads.internal.client.zzby) zzp(com.google.android.gms.ads.internal.client.zzby.class, str, com.google.android.gms.ads.AdFormat.INTERSTITIAL).orElse(null);
    }

    public final synchronized com.google.android.gms.internal.ads.zzbwp zzc(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzbwp) zzp(com.google.android.gms.internal.ads.zzbwp.class, str, com.google.android.gms.ads.AdFormat.REWARDED).orElse(null);
    }

    final /* synthetic */ void zzg(com.google.android.gms.ads.AdFormat adFormat, java.util.Optional optional, java.lang.Object obj) {
        this.zzd.zze(adFormat, this.zzg.currentTimeMillis(), optional);
    }

    public final void zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    try {
                        this.zzf = (android.net.ConnectivityManager) this.zze.getSystemService("connectivity");
                    } catch (java.lang.ClassCastException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get connectivity manager", e);
                    }
                }
            }
        }
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO() || this.zzf == null) {
            this.zzh = new java.util.concurrent.atomic.AtomicInteger(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzy)).intValue());
            return;
        }
        try {
            this.zzf.registerDefaultNetworkCallback(new com.google.android.gms.internal.ads.zzfju(this));
        } catch (java.lang.RuntimeException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to register network callback", e2);
            this.zzh = new java.util.concurrent.atomic.AtomicInteger(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzy)).intValue());
        }
    }

    public final void zzi(com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        this.zzc.zzb(zzbpeVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final synchronized void zzj(java.util.List list, com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        java.util.List<com.google.android.gms.ads.internal.client.zzft> listZzo = zzo(list);
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.ads.AdFormat.class);
        for (com.google.android.gms.ads.internal.client.zzft zzftVar : listZzo) {
            java.lang.String str = zzftVar.zza;
            com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(zzftVar.zzb);
            com.google.android.gms.internal.ads.zzfkh zzfkhVarZza = this.zzc.zza(zzftVar, zzcfVar);
            if (adFormat != null && zzfkhVarZza != null) {
                java.util.concurrent.atomic.AtomicInteger atomicInteger = this.zzh;
                if (atomicInteger != null) {
                    zzfkhVarZza.zzo(atomicInteger.get());
                }
                zzfkhVarZza.zzq(this.zzd);
                zzq(zzd(str, adFormat), zzfkhVarZza);
                enumMap.put(adFormat, java.lang.Integer.valueOf(((java.lang.Integer) enumMap.getOrDefault(adFormat, 0)).intValue() + 1));
            }
        }
        this.zzd.zzf(enumMap, this.zzg.currentTimeMillis());
        com.google.android.gms.ads.internal.zzv.zzb().zzc(new com.google.android.gms.internal.ads.zzfjt(this));
    }

    public final synchronized boolean zzk(java.lang.String str) {
        return zzt(str, com.google.android.gms.ads.AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzl(java.lang.String str) {
        return zzt(str, com.google.android.gms.ads.AdFormat.INTERSTITIAL);
    }

    public final synchronized boolean zzm(java.lang.String str) {
        return zzt(str, com.google.android.gms.ads.AdFormat.REWARDED);
    }
}
