package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ek extends com.applovin.impl.bk implements com.applovin.impl.ol {
    private final java.lang.String n;

    protected abstract com.applovin.impl.nl a(byte[] bArr, int i, boolean z);

    @Override // com.applovin.impl.ol
    public void a(long j) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.bk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final com.applovin.impl.pl a(java.lang.Throwable th) {
        return new com.applovin.impl.pl("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.bk
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final com.applovin.impl.rl f() {
        return new com.applovin.impl.rl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.bk
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final com.applovin.impl.sl g() {
        return new com.applovin.impl.fk(new com.applovin.impl.yg.a() { // from class: com.applovin.impl.ek$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.yg.a
            public final void a(com.applovin.impl.yg ygVar) {
                this.f$0.a(ygVar);
            }
        });
    }

    protected ek(java.lang.String str) {
        super(new com.applovin.impl.rl[2], new com.applovin.impl.sl[2]);
        this.n = str;
        a(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.bk
    public final com.applovin.impl.pl a(com.applovin.impl.rl rlVar, com.applovin.impl.sl slVar, boolean z) {
        try {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) com.applovin.impl.b1.a(rlVar.c);
            slVar.a(rlVar.f, a(byteBuffer.array(), byteBuffer.limit(), z), rlVar.j);
            slVar.c(Integer.MIN_VALUE);
            return null;
        } catch (com.applovin.impl.pl e) {
            return e;
        }
    }
}
