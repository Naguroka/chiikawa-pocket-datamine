package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzf {
    private static final java.util.Map<java.lang.String, com.google.android.gms.drive.metadata.MetadataField<?>> zzjf = new java.util.HashMap();
    private static final java.util.Map<java.lang.String, com.google.android.gms.drive.metadata.internal.zzg> zzjg = new java.util.HashMap();

    private static void zzb(com.google.android.gms.drive.metadata.MetadataField<?> metadataField) {
        java.util.Map<java.lang.String, com.google.android.gms.drive.metadata.MetadataField<?>> map = zzjf;
        if (map.containsKey(metadataField.getName())) {
            java.lang.String strValueOf = java.lang.String.valueOf(metadataField.getName());
            throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "Duplicate field name registered: ".concat(strValueOf) : new java.lang.String("Duplicate field name registered: "));
        }
        map.put(metadataField.getName(), metadataField);
    }

    public static com.google.android.gms.drive.metadata.MetadataField<?> zzf(java.lang.String str) {
        return zzjf.get(str);
    }

    public static java.util.Collection<com.google.android.gms.drive.metadata.MetadataField<?>> zzbc() {
        return java.util.Collections.unmodifiableCollection(zzjf.values());
    }

    public static void zza(com.google.android.gms.common.data.DataHolder dataHolder) {
        java.util.Iterator<com.google.android.gms.drive.metadata.internal.zzg> it = zzjg.values().iterator();
        while (it.hasNext()) {
            it.next().zzb(dataHolder);
        }
    }

    private static void zza(com.google.android.gms.drive.metadata.internal.zzg zzgVar) {
        if (zzjg.put(zzgVar.zzbd(), zzgVar) == null) {
            return;
        }
        java.lang.String strZzbd = zzgVar.zzbd();
        throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(strZzbd).length() + 46).append("A cleaner for key ").append(strZzbd).append(" has already been registered").toString());
    }

    static {
        zzb(com.google.android.gms.internal.drive.zzhs.zzjl);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkr);
        zzb(com.google.android.gms.internal.drive.zzhs.zzki);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkp);
        zzb(com.google.android.gms.internal.drive.zzhs.zzks);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjy);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjx);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjz);
        zzb(com.google.android.gms.internal.drive.zzhs.zzka);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkb);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjv);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkd);
        zzb(com.google.android.gms.internal.drive.zzhs.zzke);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkf);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkn);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjm);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkk);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjo);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjw);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjp);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjq);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjr);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjs);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkh);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkc);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkj);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkl);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkm);
        zzb(com.google.android.gms.internal.drive.zzhs.zzko);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkt);
        zzb(com.google.android.gms.internal.drive.zzhs.zzku);
        zzb(com.google.android.gms.internal.drive.zzhs.zzju);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjt);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkq);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkg);
        zzb(com.google.android.gms.internal.drive.zzhs.zzjn);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkv);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkw);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkx);
        zzb(com.google.android.gms.internal.drive.zzhs.zzky);
        zzb(com.google.android.gms.internal.drive.zzhs.zzkz);
        zzb(com.google.android.gms.internal.drive.zzhs.zzla);
        zzb(com.google.android.gms.internal.drive.zzhs.zzlb);
        zzb(com.google.android.gms.internal.drive.zzif.zzld);
        zzb(com.google.android.gms.internal.drive.zzif.zzlf);
        zzb(com.google.android.gms.internal.drive.zzif.zzlg);
        zzb(com.google.android.gms.internal.drive.zzif.zzlh);
        zzb(com.google.android.gms.internal.drive.zzif.zzle);
        zzb(com.google.android.gms.internal.drive.zzif.zzli);
        zzb(com.google.android.gms.internal.drive.zzin.zzlk);
        zzb(com.google.android.gms.internal.drive.zzin.zzll);
        zza(com.google.android.gms.drive.metadata.internal.zzo.zzjk);
        zza(com.google.android.gms.internal.drive.zzid.zzlc);
    }
}
