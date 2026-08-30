package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class m2 {
    public static final int e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.ironsource.m2.a f2909a;
    private final long b;
    private final long c;
    private final long d;

    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public m2(com.ironsource.m2.a aVar, long j, long j2, long j3) {
        this.f2909a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public com.ironsource.m2.a a() {
        return this.f2909a;
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
        com.ironsource.m2.a aVar = this.f2909a;
        return aVar == com.ironsource.m2.a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == com.ironsource.m2.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        com.ironsource.m2.a aVar = this.f2909a;
        return aVar == com.ironsource.m2.a.MANUAL || aVar == com.ironsource.m2.a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
