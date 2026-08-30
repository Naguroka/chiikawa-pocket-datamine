package com.iab.omid.library.bytedance2.adsession;

/* JADX INFO: loaded from: classes5.dex */
public class Partner {
    private final java.lang.String name;
    private final java.lang.String version;

    private Partner(java.lang.String str, java.lang.String str2) {
        this.name = str;
        this.version = str2;
    }

    public static com.iab.omid.library.bytedance2.adsession.Partner createPartner(java.lang.String str, java.lang.String str2) {
        com.iab.omid.library.bytedance2.utils.g.a(str, "Name is null or empty");
        com.iab.omid.library.bytedance2.utils.g.a(str2, "Version is null or empty");
        return new com.iab.omid.library.bytedance2.adsession.Partner(str, str2);
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getVersion() {
        return this.version;
    }
}
