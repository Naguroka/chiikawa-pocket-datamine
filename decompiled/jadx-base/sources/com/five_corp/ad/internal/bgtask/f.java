package com.five_corp.ad.internal.bgtask;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends com.five_corp.ad.internal.bgtask.m {
    public final com.five_corp.ad.internal.beacon.b c;
    public final com.five_corp.ad.internal.E d;
    public final com.five_corp.ad.internal.http.d e;

    public f(com.five_corp.ad.internal.beacon.b bVar, com.five_corp.ad.internal.E e, com.five_corp.ad.internal.http.d dVar) {
        super(4);
        this.c = bVar;
        this.d = e;
        this.e = dVar;
    }

    @Override // com.five_corp.ad.internal.bgtask.m
    public final boolean b() {
        com.five_corp.ad.FiveAdFormat fiveAdFormat;
        com.five_corp.ad.internal.E e = this.d;
        com.five_corp.ad.internal.beacon.b bVar = this.c;
        e.getClass();
        com.five_corp.ad.internal.ad.a aVar = bVar.f1846a;
        java.lang.Long l = bVar.g;
        java.util.HashMap map = new java.util.HashMap();
        e.a(map, e.g.a());
        com.five_corp.ad.internal.context.i iVar = bVar.b;
        if (iVar != null) {
            map.put("ld", iVar.b);
            map.put("sl", iVar.c);
        }
        int iOrdinal = bVar.c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            fiveAdFormat = com.five_corp.ad.FiveAdFormat.CUSTOM_LAYOUT;
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new java.lang.RuntimeException();
            }
            fiveAdFormat = com.five_corp.ad.FiveAdFormat.VIDEO_REWARD;
        }
        map.put("af", java.lang.String.valueOf(fiveAdFormat.rawValue));
        if (bVar.c == com.five_corp.ad.internal.context.h.NATIVE) {
            map.put("isnt", "1");
        }
        map.put("ss", bVar.e.a() ? "1" : "0");
        com.five_corp.ad.internal.s sVar = bVar.d;
        com.five_corp.ad.internal.t tVar = sVar.f2045a;
        map.put("c", java.lang.String.valueOf(sVar.a().value));
        map.put("dc", java.lang.String.valueOf(tVar.f2075a));
        com.five_corp.ad.internal.s sVar2 = bVar.d;
        sVar2.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.five_corp.ad.internal.s sVar3 = sVar2.d; sVar3 != null; sVar3 = sVar3.d) {
            arrayList.add(java.lang.Integer.valueOf(sVar3.f2045a.f2075a));
        }
        if (!arrayList.isEmpty()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(arrayList.get(0));
            for (int i = 1; i < arrayList.size(); i++) {
                stringBuffer.append(",");
                stringBuffer.append(arrayList.get(i));
            }
            map.put("cause", stringBuffer.toString());
        }
        if (aVar != null) {
            map.put("t", aVar.c);
            map.put("at", java.lang.String.valueOf(aVar.d));
            map.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, java.lang.String.valueOf(aVar.e.f1810a));
            map.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, java.lang.String.valueOf(aVar.e.b));
            map.put("cr", java.lang.String.valueOf(aVar.e.c));
        }
        map.put("pt", java.lang.String.valueOf(bVar.f));
        if (l != null) {
            map.put("it", java.lang.String.valueOf(l));
        }
        if (iVar != null && iVar.f1887a) {
            map.put("chk", "1");
        }
        com.five_corp.ad.internal.beacon.e eVar = bVar.h;
        if (eVar != null) {
            map.put("spt", java.lang.String.valueOf(eVar.f1848a));
        }
        com.five_corp.ad.internal.base_url.a aVar2 = e.f1783a;
        aVar2.getClass();
        com.five_corp.ad.internal.util.f fVarA = this.e.a(com.five_corp.ad.internal.E.a(new android.net.Uri.Builder().scheme("https").authority(aVar2.c), androidx.core.app.NotificationCompat.CATEGORY_ERROR, map), "POST", this.c.d.b(), null);
        return fVarA.f2085a && ((com.five_corp.ad.internal.http.c) fVarA.c).f1919a == 200;
    }
}
