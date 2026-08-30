package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3113a = true;
    private com.json.mediationsdk.logger.IronSourceError b = null;

    public com.json.mediationsdk.logger.IronSourceError a() {
        return this.b;
    }

    public void a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f3113a = false;
        this.b = ironSourceError;
    }

    public boolean b() {
        return this.f3113a;
    }

    public void c() {
        this.f3113a = true;
        this.b = null;
    }

    public java.lang.String toString() {
        return (b() ? new java.lang.StringBuilder("valid:").append(this.f3113a) : new java.lang.StringBuilder("valid:").append(this.f3113a).append(", IronSourceError:").append(this.b)).toString();
    }
}
