package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h extends com.google.android.play.integrity.internal.b implements com.google.android.play.integrity.internal.i {
    public static com.google.android.play.integrity.internal.i b(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.play.integrity.internal.i ? (com.google.android.play.integrity.internal.i) iInterfaceQueryLocalInterface : new com.google.android.play.integrity.internal.g(iBinder);
    }
}
