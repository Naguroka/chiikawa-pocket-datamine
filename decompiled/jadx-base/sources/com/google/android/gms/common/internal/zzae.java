package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzae extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzaf {
    public static com.google.android.gms.common.internal.zzaf zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.zzaf ? (com.google.android.gms.common.internal.zzaf) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.zzad(iBinder);
    }
}
