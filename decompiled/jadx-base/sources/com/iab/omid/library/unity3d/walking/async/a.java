package com.iab.omid.library.unity3d.walking.async;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends com.iab.omid.library.unity3d.walking.async.b {
    protected final java.util.HashSet<java.lang.String> c;
    protected final org.json.JSONObject d;
    protected final long e;

    public a(com.iab.omid.library.unity3d.walking.async.b.InterfaceC0228b interfaceC0228b, java.util.HashSet<java.lang.String> hashSet, org.json.JSONObject jSONObject, long j) {
        super(interfaceC0228b);
        this.c = new java.util.HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
