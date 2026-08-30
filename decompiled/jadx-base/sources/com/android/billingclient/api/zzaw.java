package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaw implements java.util.concurrent.Callable {
    final /* synthetic */ com.android.billingclient.api.PurchasesResponseListener zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.android.billingclient.api.BillingClientImpl zzc;

    zzaw(com.android.billingclient.api.BillingClientImpl billingClientImpl, com.android.billingclient.api.PurchasesResponseListener purchasesResponseListener, java.lang.String str, boolean z) {
        this.zza = purchasesResponseListener;
        this.zzb = str;
        java.util.Objects.requireNonNull(billingClientImpl);
        this.zzc = billingClientImpl;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.android.billingclient.api.BillingClientImpl billingClientImpl = this.zzc;
        if (!billingClientImpl.zzaX(30000L)) {
            com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.SERVICE_CONNECTION_NOT_READY;
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzj;
            billingClientImpl.zzbd(zzieVar, 9, billingResult);
            this.zza.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzbt.zzk());
            return null;
        }
        java.lang.String str = this.zzb;
        if (android.text.TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Please provide a valid product type.");
            com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.EMPTY_PRODUCT_TYPE;
            com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzcj.zze;
            billingClientImpl.zzbd(zzieVar2, 9, billingResult2);
            this.zza.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.zzbt.zzk());
            return null;
        }
        com.android.billingclient.api.zzcw zzcwVarZzbb = billingClientImpl.zzbb(str, false, 9);
        if (zzcwVarZzbb.zzb() != null) {
            this.zza.onQueryPurchasesResponse(zzcwVarZzbb.zza(), zzcwVarZzbb.zzb());
            return null;
        }
        this.zza.onQueryPurchasesResponse(zzcwVarZzbb.zza(), com.google.android.gms.internal.play_billing.zzbt.zzk());
        return null;
    }
}
