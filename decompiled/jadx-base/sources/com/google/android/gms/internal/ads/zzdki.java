package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzdki implements com.google.android.gms.internal.ads.zzdin {
    private final com.google.android.gms.internal.ads.zzbpt zza;
    private final com.google.android.gms.internal.ads.zzcwl zzb;
    private final com.google.android.gms.internal.ads.zzcvr zzc;
    private final com.google.android.gms.internal.ads.zzddq zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzfbo zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;
    private final com.google.android.gms.internal.ads.zzfcj zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final com.google.android.gms.internal.ads.zzbpp zzl;
    private final com.google.android.gms.internal.ads.zzbpq zzm;

    public zzdki(com.google.android.gms.internal.ads.zzbpp zzbppVar, com.google.android.gms.internal.ads.zzbpq zzbpqVar, com.google.android.gms.internal.ads.zzbpt zzbptVar, com.google.android.gms.internal.ads.zzcwl zzcwlVar, com.google.android.gms.internal.ads.zzcvr zzcvrVar, com.google.android.gms.internal.ads.zzddq zzddqVar, android.content.Context context, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfcj zzfcjVar) {
        this.zzl = zzbppVar;
        this.zzm = zzbpqVar;
        this.zza = zzbptVar;
        this.zzb = zzcwlVar;
        this.zzc = zzcvrVar;
        this.zzd = zzddqVar;
        this.zze = context;
        this.zzf = zzfboVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzfcjVar;
    }

    private final void zzb(android.view.View view) {
        try {
            com.google.android.gms.internal.ads.zzbpt zzbptVar = this.zza;
            if (zzbptVar != null && !zzbptVar.zzA()) {
                this.zza.zzw(com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkE)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzbpp zzbppVar = this.zzl;
            if (zzbppVar != null && !zzbppVar.zzx()) {
                this.zzl.zzs(com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkE)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzbpq zzbpqVar = this.zzm;
            if (zzbpqVar == null || zzbpqVar.zzv()) {
                return;
            }
            this.zzm.zzq(com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkE)).booleanValue()) {
                this.zzd.zzdd();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call handleClick", e);
        }
    }

    private static final java.util.HashMap zzc(java.util.Map map) {
        java.util.HashMap map2 = new java.util.HashMap();
        if (map != null) {
            synchronized (map) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((java.lang.String) entry.getKey(), view);
                    }
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzA(android.view.View view, java.util.Map map) {
        try {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperWrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(view);
            com.google.android.gms.internal.ads.zzbpt zzbptVar = this.zza;
            if (zzbptVar != null) {
                zzbptVar.zzz(iObjectWrapperWrap);
                return;
            }
            com.google.android.gms.internal.ads.zzbpp zzbppVar = this.zzl;
            if (zzbppVar != null) {
                zzbppVar.zzw(iObjectWrapperWrap);
                return;
            }
            com.google.android.gms.internal.ads.zzbpq zzbpqVar = this.zzm;
            if (zzbpqVar != null) {
                zzbpqVar.zzu(iObjectWrapperWrap);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzB() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzC() {
        return this.zzf.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzD(android.os.Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final org.json.JSONObject zze(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final org.json.JSONObject zzf(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzh() {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzk(com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzl(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z, android.widget.ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzL) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzm(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzn(android.os.Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzp(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z, android.widget.ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzL) {
            zzb(view2);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzr(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzv.zzt().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                com.google.android.gms.internal.ads.zzbpt zzbptVar = this.zza;
                if (zzbptVar != null && !zzbptVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                com.google.android.gms.internal.ads.zzbpp zzbppVar = this.zzl;
                if (zzbppVar != null && !zzbppVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                com.google.android.gms.internal.ads.zzbpq zzbpqVar = this.zzm;
                if (zzbpqVar == null || zzbpqVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzt(android.view.View view, android.view.MotionEvent motionEvent, android.view.View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzu(android.os.Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzv(android.view.View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzw() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzx(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzy(com.google.android.gms.internal.ads.zzbhq zzbhqVar) {
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cc A[Catch: JSONException -> 0x0044, RemoteException -> 0x0122, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0044, blocks: (B:47:0x00b1, B:48:0x00c6, B:50:0x00cc), top: B:72:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzz(android.view.View view, java.util.Map map, java.util.Map map2, android.view.View.OnTouchListener onTouchListener, android.view.View.OnClickListener onClickListener) {
        java.lang.Object obj;
        java.lang.ClassLoader classLoader;
        java.util.Iterator it;
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzn;
        try {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperWrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(view);
            org.json.JSONObject jSONObject = this.zzf.zzaj;
            boolean z = true;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbF)).booleanValue() && jSONObject.length() != 0) {
                java.util.Map map3 = map == null ? new java.util.HashMap() : map;
                java.util.Map map4 = map2 == null ? new java.util.HashMap() : map2;
                java.util.HashMap map5 = new java.util.HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            java.lang.Class<?> cls = obj.getClass();
                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbG)).booleanValue() && next.equals("3010")) {
                                com.google.android.gms.internal.ads.zzbpt zzbptVar = this.zza;
                                java.lang.Object objUnwrap = null;
                                if (zzbptVar != null) {
                                    try {
                                        iObjectWrapperZzn = zzbptVar.zzn();
                                    } catch (android.os.RemoteException | java.lang.IllegalArgumentException unused) {
                                    }
                                } else {
                                    com.google.android.gms.internal.ads.zzbpp zzbppVar = this.zzl;
                                    if (zzbppVar != null) {
                                        iObjectWrapperZzn = zzbppVar.zzk();
                                    } else {
                                        com.google.android.gms.internal.ads.zzbpq zzbpqVar = this.zzm;
                                        iObjectWrapperZzn = zzbpqVar != null ? zzbpqVar.zzj() : null;
                                    }
                                }
                                if (iObjectWrapperZzn != null) {
                                    objUnwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzn);
                                }
                                if (objUnwrap != null) {
                                    cls = objUnwrap.getClass();
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbs.zzc(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.zzv.zzq();
                                    classLoader = this.zze.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (java.lang.Class.forName((java.lang.String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbs.zzc(jSONArrayOptJSONArray, arrayList2);
                                    com.google.android.gms.ads.internal.zzv.zzq();
                                    classLoader = this.zze.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (java.lang.Class.forName((java.lang.String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (org.json.JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzk = z;
            java.util.HashMap mapZzc = zzc(map);
            java.util.HashMap mapZzc2 = zzc(map2);
            com.google.android.gms.internal.ads.zzbpt zzbptVar2 = this.zza;
            if (zzbptVar2 != null) {
                zzbptVar2.zzy(iObjectWrapperWrap, com.google.android.gms.dynamic.ObjectWrapper.wrap(mapZzc), com.google.android.gms.dynamic.ObjectWrapper.wrap(mapZzc2));
                return;
            }
            com.google.android.gms.internal.ads.zzbpp zzbppVar2 = this.zzl;
            if (zzbppVar2 != null) {
                zzbppVar2.zzv(iObjectWrapperWrap, com.google.android.gms.dynamic.ObjectWrapper.wrap(mapZzc), com.google.android.gms.dynamic.ObjectWrapper.wrap(mapZzc2));
                this.zzl.zzu(iObjectWrapperWrap);
                return;
            }
            com.google.android.gms.internal.ads.zzbpq zzbpqVar2 = this.zzm;
            if (zzbpqVar2 != null) {
                zzbpqVar2.zzt(iObjectWrapperWrap, com.google.android.gms.dynamic.ObjectWrapper.wrap(mapZzc), com.google.android.gms.dynamic.ObjectWrapper.wrap(mapZzc2));
                this.zzm.zzs(iObjectWrapperWrap);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call trackView", e);
        }
    }
}
