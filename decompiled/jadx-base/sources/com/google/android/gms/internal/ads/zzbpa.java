package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbpa extends com.google.android.gms.internal.ads.zzbpd {
    @Override // com.google.android.gms.internal.ads.zzbpe
    public final com.google.android.gms.internal.ads.zzbph zzb(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbqf zzbqfVar;
        try {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(str, false, com.google.android.gms.internal.ads.zzbpa.class.getClassLoader());
                if (com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(cls)) {
                    return new com.google.android.gms.internal.ads.zzbqf((com.google.android.gms.ads.mediation.MediationAdapter) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                }
                if (com.google.android.gms.ads.mediation.Adapter.class.isAssignableFrom(cls)) {
                    return new com.google.android.gms.internal.ads.zzbqf((com.google.android.gms.ads.mediation.Adapter) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                }
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new android.os.RemoteException();
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new android.os.RemoteException();
            }
        } catch (java.lang.Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Reflection failed, retrying using direct instantiation");
            if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    zzbqfVar = new com.google.android.gms.internal.ads.zzbqf(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
                }
                throw new android.os.RemoteException();
            }
            zzbqfVar = new com.google.android.gms.internal.ads.zzbqf(new com.google.ads.mediation.admob.AdMobAdapter());
            return zzbqfVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final com.google.android.gms.internal.ads.zzbrd zzc(java.lang.String str) throws android.os.RemoteException {
        try {
            return new com.google.android.gms.internal.ads.zzbrq((com.google.android.gms.ads.mediation.rtb.RtbAdapter) java.lang.Class.forName(str, false, com.google.android.gms.internal.ads.zzbrh.class.getClassLoader()).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
        } catch (java.lang.Throwable unused) {
            throw new android.os.RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final boolean zzd(java.lang.String str) throws android.os.RemoteException {
        try {
            return com.google.android.gms.ads.mediation.Adapter.class.isAssignableFrom(java.lang.Class.forName(str, false, com.google.android.gms.internal.ads.zzbpa.class.getClassLoader()));
        } catch (java.lang.Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final boolean zze(java.lang.String str) throws android.os.RemoteException {
        try {
            return com.google.android.gms.ads.mediation.customevent.CustomEvent.class.isAssignableFrom(java.lang.Class.forName(str, false, com.google.android.gms.internal.ads.zzbpa.class.getClassLoader()));
        } catch (java.lang.Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
