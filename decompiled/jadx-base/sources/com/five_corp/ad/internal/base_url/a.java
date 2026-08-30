package com.five_corp.ad.internal.base_url;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements com.five_corp.ad.internal.cache.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f1844a = "adchk.fivecdm.com";
    public java.lang.String b = "bc2.fivecdm.com";
    public java.lang.String c = "er.fivecdm.com";

    @Override // com.five_corp.ad.internal.cache.y
    public final void a(com.five_corp.ad.internal.cache.x xVar) {
        com.five_corp.ad.internal.media_config.a aVar = xVar.b;
        if (aVar != null) {
            com.five_corp.ad.internal.media_config.b bVar = aVar.j;
            java.lang.String str = bVar.f1950a;
            if (str == null) {
                str = "adchk.fivecdm.com";
            }
            this.f1844a = str;
            java.lang.String str2 = bVar.b;
            if (str2 == null) {
                str2 = "bc2.fivecdm.com";
            }
            this.b = str2;
            java.lang.String str3 = bVar.c;
            if (str3 == null) {
                str3 = "er.fivecdm.com";
            }
            this.c = str3;
        }
    }
}
