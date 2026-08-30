package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class l2 {
    public static final int e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.ironsource.l2.a f2870a;
    private final long b;
    private final long c;
    private final long d;

    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        MANUAL_WITH_LOAD_ON_SHOW,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public l2(com.ironsource.l2.a aVar, long j, long j2, long j3) {
        this.f2870a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public com.ironsource.l2.a a() {
        return this.f2870a;
    }

    public long b() {
        return this.d;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public boolean e() {
        com.ironsource.l2.a aVar = this.f2870a;
        return aVar == com.ironsource.l2.a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == com.ironsource.l2.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        com.ironsource.l2.a aVar = this.f2870a;
        return aVar == com.ironsource.l2.a.MANUAL || aVar == com.ironsource.l2.a.MANUAL_WITH_AUTOMATIC_RELOAD || aVar == com.ironsource.l2.a.MANUAL_WITH_LOAD_ON_SHOW;
    }
}
