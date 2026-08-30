package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1277bB<K, V> extends com.facebook.ads.redexgen.core.AbstractC03932y<K, V> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1276bA A00;

    public C1277bB(com.facebook.ads.redexgen.core.C1276bA c1276bA) {
        this.A00 = c1276bA;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03932y
    public final int A04() {
        return ((com.facebook.ads.redexgen.core.AnonymousClass31) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03932y
    public final int A05(java.lang.Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03932y
    public final int A06(java.lang.Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03932y
    public final java.util.Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03932y
    public final java.lang.Object A0B(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03932y
    public final V A0C(int i, V value) {
        return this.A00.A0C(i, value);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03932y
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03932y
    public final void A0E(int i) {
        this.A00.A0A(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03932y
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
