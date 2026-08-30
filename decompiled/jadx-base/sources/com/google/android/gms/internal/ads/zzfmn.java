package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfmn {
    private final java.util.HashMap zza = new java.util.HashMap();
    private final java.util.HashMap zzb = new java.util.HashMap();
    private final java.util.HashMap zzc = new java.util.HashMap();
    private final java.util.HashSet zzd = new java.util.HashSet();
    private final java.util.HashSet zze = new java.util.HashSet();
    private final java.util.HashSet zzf = new java.util.HashSet();
    private final java.util.HashMap zzg = new java.util.HashMap();
    private final java.util.HashSet zzh = new java.util.HashSet();
    private final java.util.Map zzi = new java.util.WeakHashMap();
    private boolean zzj;

    public final android.view.View zza(java.lang.String str) {
        return (android.view.View) this.zzc.get(str);
    }

    public final com.google.android.gms.internal.ads.zzfmm zzb(android.view.View view) {
        com.google.android.gms.internal.ads.zzfmm zzfmmVar = (com.google.android.gms.internal.ads.zzfmm) this.zzb.get(view);
        if (zzfmmVar != null) {
            this.zzb.remove(view);
        }
        return zzfmmVar;
    }

    public final java.lang.String zzc(java.lang.String str) {
        return (java.lang.String) this.zzg.get(str);
    }

    public final java.lang.String zzd(android.view.View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        java.lang.String str = (java.lang.String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final java.util.HashSet zze() {
        return this.zzf;
    }

    public final java.util.HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
        this.zzh.clear();
    }

    public final void zzh() {
        this.zzj = true;
    }

    public final void zzi() {
        java.lang.String str;
        android.app.Activity activity;
        java.lang.Boolean bool;
        com.google.android.gms.internal.ads.zzflk zzflkVarZza = com.google.android.gms.internal.ads.zzflk.zza();
        if (zzflkVarZza != null) {
            for (com.google.android.gms.internal.ads.zzfkt zzfktVar : zzflkVarZza.zzb()) {
                android.view.View viewZzf = zzfktVar.zzf();
                if (zzfktVar.zzj()) {
                    java.lang.String strZzh = zzfktVar.zzh();
                    if (viewZzf != null) {
                        android.content.Context context = viewZzf.getContext();
                        while (true) {
                            str = null;
                            if (!(context instanceof android.content.ContextWrapper)) {
                                activity = null;
                                break;
                            } else {
                                if (context instanceof android.app.Activity) {
                                    activity = (android.app.Activity) context;
                                    break;
                                }
                                context = ((android.content.ContextWrapper) context).getBaseContext();
                            }
                        }
                        boolean zIsInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                        if (zIsInPictureInPictureMode) {
                            this.zzh.add(strZzh);
                        }
                        if (viewZzf.isAttachedToWindow()) {
                            if (viewZzf.hasWindowFocus()) {
                                this.zzi.remove(viewZzf);
                                bool = false;
                            } else if (this.zzi.containsKey(viewZzf)) {
                                bool = (java.lang.Boolean) this.zzi.get(viewZzf);
                            } else {
                                bool = false;
                                this.zzi.put(viewZzf, bool);
                            }
                            if (!bool.booleanValue() || zIsInPictureInPictureMode) {
                                java.util.HashSet hashSet = new java.util.HashSet();
                                android.view.View view = viewZzf;
                                while (true) {
                                    if (view == null) {
                                        this.zzd.addAll(hashSet);
                                        break;
                                    }
                                    java.lang.String strZza = com.google.android.gms.internal.ads.zzfml.zza(view);
                                    if (strZza != null) {
                                        str = strZza;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        java.lang.Object parent = view.getParent();
                                        view = parent instanceof android.view.View ? (android.view.View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.zze.add(strZzh);
                            this.zza.put(viewZzf, strZzh);
                            for (com.google.android.gms.internal.ads.zzfln zzflnVar : zzfktVar.zzi()) {
                                android.view.View view2 = (android.view.View) zzflnVar.zzb().get();
                                if (view2 != null) {
                                    com.google.android.gms.internal.ads.zzfmm zzfmmVar = (com.google.android.gms.internal.ads.zzfmm) this.zzb.get(view2);
                                    if (zzfmmVar != null) {
                                        zzfmmVar.zzc(zzfktVar.zzh());
                                    } else {
                                        this.zzb.put(view2, new com.google.android.gms.internal.ads.zzfmm(zzflnVar, zzfktVar.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(strZzh);
                            this.zzc.put(strZzh, viewZzf);
                            this.zzg.put(strZzh, str);
                        }
                    } else {
                        this.zzf.add(strZzh);
                        this.zzg.put(strZzh, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(java.lang.String str) {
        return this.zzh.contains(str);
    }

    public final boolean zzk(android.view.View view) {
        if (!this.zzi.containsKey(view)) {
            return true;
        }
        this.zzi.put(view, true);
        return false;
    }

    public final int zzl(android.view.View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzj ? 2 : 3;
    }
}
