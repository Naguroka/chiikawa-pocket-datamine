package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzflo {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final java.util.List zzb = new java.util.ArrayList();

    public final java.util.List zza() {
        return this.zzb;
    }

    public final void zzb(android.view.View view, com.google.android.gms.internal.ads.zzfkw zzfkwVar, java.lang.String str) {
        com.google.android.gms.internal.ads.zzfln zzflnVar;
        if (view == null) {
            throw new java.lang.IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!zza.matcher("Ad overlay").matches()) {
            throw new java.lang.IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        java.util.Iterator it = this.zzb.iterator();
        do {
            if (!it.hasNext()) {
                zzflnVar = null;
                break;
            }
            zzflnVar = (com.google.android.gms.internal.ads.zzfln) it.next();
        } while (zzflnVar.zzb().get() != view);
        if (zzflnVar == null) {
            this.zzb.add(new com.google.android.gms.internal.ads.zzfln(view, zzfkwVar, "Ad overlay"));
        }
    }

    public final void zzc() {
        this.zzb.clear();
    }
}
