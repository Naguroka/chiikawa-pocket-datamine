package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzml extends com.google.android.gms.internal.drive.zzmr {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzmi zzvk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzml(com.google.android.gms.internal.drive.zzmi zzmiVar) {
        super(zzmiVar, null);
        this.zzvk = zzmiVar;
    }

    @Override // com.google.android.gms.internal.drive.zzmr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new com.google.android.gms.internal.drive.zzmk(this.zzvk, null);
    }

    /* synthetic */ zzml(com.google.android.gms.internal.drive.zzmi zzmiVar, com.google.android.gms.internal.drive.zzmj zzmjVar) {
        this(zzmiVar);
    }
}
