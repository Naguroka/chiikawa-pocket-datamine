package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class w4 extends com.applovin.impl.dc {
    private com.applovin.impl.sdk.j f;
    private java.util.List g;
    private final java.util.concurrent.atomic.AtomicBoolean h;
    private java.util.List i;

    public enum a {
        RECENT_ADS,
        COUNT
    }

    @Override // com.applovin.impl.dc
    protected int b() {
        return com.applovin.impl.w4.a.COUNT.ordinal();
    }

    public java.lang.String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.h.get() + "}";
    }

    public w4(android.content.Context context) {
        super(context);
        this.h = new java.util.concurrent.atomic.AtomicBoolean();
        this.i = new java.util.ArrayList();
    }

    public void g() {
        this.h.compareAndSet(true, false);
    }

    public boolean f() {
        return this.i.size() == 0;
    }

    public com.applovin.impl.sdk.j e() {
        return this.f;
    }

    @Override // com.applovin.impl.dc
    protected com.applovin.impl.cc e(int i) {
        return new com.applovin.impl.fj("RECENT ADS");
    }

    public java.util.List d() {
        return this.g;
    }

    @Override // com.applovin.impl.dc
    protected java.util.List c(int i) {
        return this.i;
    }

    private java.util.List a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.applovin.impl.u6((com.applovin.impl.v6) it.next(), this.f719a));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.dc
    protected int d(int i) {
        return this.i.size();
    }

    public void a(java.util.List list, com.applovin.impl.sdk.j jVar) {
        android.app.Activity activityM0;
        this.f = jVar;
        this.g = list;
        if (!(this.f719a instanceof android.app.Activity) && (activityM0 = jVar.m0()) != null) {
            this.f719a = activityM0;
        }
        if (list != null && this.h.compareAndSet(false, true)) {
            this.i = a(this.g);
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.w4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.notifyDataSetChanged();
            }
        });
    }
}
