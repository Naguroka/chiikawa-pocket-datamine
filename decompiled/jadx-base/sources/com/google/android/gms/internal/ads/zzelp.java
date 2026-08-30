package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzelp implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzfcj zzc;
    private final android.view.View zzd;

    public zzelp(com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.content.Context context, com.google.android.gms.internal.ads.zzfcj zzfcjVar, android.view.ViewGroup viewGroup) {
        this.zza = zzgcsVar;
        this.zzb = context;
        this.zzc = zzfcjVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.android.gms.internal.ads.zzbcl.zza(this.zzb);
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzelo
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzelq zzc() throws java.lang.Exception {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.View view = this.zzd;
        while (view != null) {
            java.lang.Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof android.view.ViewGroup ? ((android.view.ViewGroup) parent).indexOfChild(view) : -1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof android.view.View)) {
                break;
            }
            view = (android.view.View) parent;
        }
        return new com.google.android.gms.internal.ads.zzelq(this.zzb, this.zzc.zze, arrayList);
    }
}
