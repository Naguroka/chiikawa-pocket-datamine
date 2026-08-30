package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m extends com.google.android.play.integrity.internal.b implements com.google.android.play.integrity.internal.n {
    public static com.google.android.play.integrity.internal.n b(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.play.integrity.internal.n ? (com.google.android.play.integrity.internal.n) iInterfaceQueryLocalInterface : new com.google.android.play.integrity.internal.l(iBinder);
    }
}
