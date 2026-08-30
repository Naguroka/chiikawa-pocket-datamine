package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbxb {
    public static final com.google.android.gms.internal.ads.zzbwp zza(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        try {
            android.os.IBinder iBinderZze = ((com.google.android.gms.internal.ads.zzbwt) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbxa
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final java.lang.Object zza(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbwt ? (com.google.android.gms.internal.ads.zzbwt) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbwt(iBinder);
                }
            })).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, zzbpeVar, 244410000);
            if (iBinderZze == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbwp ? (com.google.android.gms.internal.ads.zzbwp) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbwn(iBinderZze);
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
