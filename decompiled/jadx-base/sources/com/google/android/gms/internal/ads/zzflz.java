package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzflz implements com.google.android.gms.internal.ads.zzflw {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzflw
    public final org.json.JSONObject zza(android.view.View view) {
        if (view == null) {
            return com.google.android.gms.internal.ads.zzfmg.zza(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.zza;
        return com.google.android.gms.internal.ads.zzfmg.zza(iArr2[0], iArr2[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzflw
    public final void zzb(android.view.View view, org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.zzflv zzflvVar, boolean z, boolean z2) {
        int i;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (!z) {
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    zzflvVar.zza(viewGroup.getChildAt(i2), this, jSONObject, z2);
                }
                return;
            }
            java.util.HashMap map = new java.util.HashMap();
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                android.view.View childAt = viewGroup.getChildAt(i3);
                java.util.ArrayList arrayList = (java.util.ArrayList) map.get(java.lang.Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    map.put(java.lang.Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map.keySet());
            java.util.Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) map.get((java.lang.Float) arrayList2.get(i4));
                int size2 = arrayList3.size();
                int i5 = 0;
                while (true) {
                    i = i4 + 1;
                    if (i5 < size2) {
                        zzflvVar.zza((android.view.View) arrayList3.get(i5), this, jSONObject, z2);
                        i5++;
                    }
                }
                i4 = i;
            }
        }
    }
}
