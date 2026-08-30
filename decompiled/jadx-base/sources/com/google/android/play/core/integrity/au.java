package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class au implements com.google.android.play.integrity.internal.ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f2293a;
    private final com.google.android.play.integrity.internal.an b;

    public au(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2) {
        this.f2293a = anVar;
        this.b = anVar2;
    }

    @Override // com.google.android.play.integrity.internal.an
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final com.google.android.play.core.integrity.at a() {
        return new com.google.android.play.core.integrity.at(this.f2293a, this.b);
    }
}
