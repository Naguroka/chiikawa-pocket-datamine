package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfly implements com.google.android.gms.internal.ads.zzflw {
    private final com.google.android.gms.internal.ads.zzflw zza;

    public zzfly(com.google.android.gms.internal.ads.zzflw zzflwVar) {
        this.zza = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflw
    public final org.json.JSONObject zza(android.view.View view) {
        org.json.JSONObject jSONObjectZza = com.google.android.gms.internal.ads.zzfmg.zza(0, 0, 0, 0);
        int iZzb = com.google.android.gms.internal.ads.zzfmj.zzb();
        int i = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZza.put("noOutputDevice", i == 0);
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.ads.zzfmh.zza("Error with setting output device status", e);
        }
        return jSONObjectZza;
    }

    @Override // com.google.android.gms.internal.ads.zzflw
    public final void zzb(android.view.View view, org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.zzflv zzflvVar, boolean z, boolean z2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.ads.zzflk zzflkVarZza = com.google.android.gms.internal.ads.zzflk.zza();
        if (zzflkVarZza != null) {
            java.util.Collection collectionZzb = zzflkVarZza.zzb();
            int size = collectionZzb.size();
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap(size + size + 3);
            java.util.Iterator it = collectionZzb.iterator();
            while (it.hasNext()) {
                android.view.View viewZzf = ((com.google.android.gms.internal.ads.zzfkt) it.next()).zzf();
                if (viewZzf != null && viewZzf.isAttachedToWindow() && viewZzf.isShown()) {
                    android.view.View view2 = viewZzf;
                    while (true) {
                        if (view2 == null) {
                            android.view.View rootView = viewZzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((android.view.View) arrayList.get(i)).getZ() <= z3) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == 0.0f) {
                            break;
                        }
                        java.lang.Object parent = view2.getParent();
                        view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzflvVar.zza((android.view.View) arrayList.get(i2), this.zza, jSONObject, z2);
        }
    }
}
