package com.bytedance.sdk.component.adexpress.dynamic.zx;

/* JADX INFO: loaded from: classes3.dex */
public class eo {
    public static float bg(float f) {
        return (float) java.lang.Math.ceil((f * 16.0f) / 16.0f);
    }

    public static java.util.List<com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg> bg(float f, java.util.List<com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg> list) {
        java.util.ArrayList<com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg> arrayList = new java.util.ArrayList();
        java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg) it.next().clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg bgVar : arrayList) {
            if (bgVar.IL) {
                i = (int) (i + bgVar.bg);
            } else {
                i2 = (int) (i2 + bgVar.bg);
                z = false;
            }
        }
        if (z && f > i) {
            return arrayList;
        }
        float f2 = i;
        float f3 = f < f2 ? f / f2 : 1.0f;
        float f4 = f > f2 ? (f - f2) / i2 : 0.0f;
        if (f4 > 1.0f) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            boolean z2 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg bgVar2 : arrayList) {
                if (!bgVar2.IL && bgVar2.bX != 0.0f && bgVar2.bg * f4 > bgVar2.bX) {
                    bgVar2.bg = bgVar2.bX;
                    bgVar2.IL = true;
                    z2 = true;
                }
                arrayList2.add(bgVar2);
            }
            if (z2) {
                return bg(f, arrayList2);
            }
        }
        int i3 = 0;
        for (com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg bgVar3 : arrayList) {
            if (bgVar3.IL) {
                bgVar3.bg = bg(bgVar3.bg * f3);
            } else {
                bgVar3.bg = bg(bgVar3.bg * f4);
            }
            i3 = (int) (i3 + bgVar3.bg);
        }
        float f5 = i3;
        if (f5 < f) {
            float f6 = f - f5;
            for (int size = 0; size < arrayList.size() && f6 > 0.0f; size = (size + 1) % arrayList.size()) {
                com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg bgVar4 = (com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg) arrayList.get(size);
                if ((f < f2 && bgVar4.IL) || (f > f2 && !bgVar4.IL)) {
                    bgVar4.bg += 0.0625f;
                    f6 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
