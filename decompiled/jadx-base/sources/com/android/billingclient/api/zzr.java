package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzr extends android.content.BroadcastReceiver {
    final /* synthetic */ com.android.billingclient.api.zzs zza;
    private boolean zzb;
    private final boolean zzc;

    zzr(com.android.billingclient.api.zzs zzsVar, boolean z) {
        java.util.Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
        this.zzc = z;
    }

    private final void zzd(android.os.Bundle bundle, com.android.billingclient.api.BillingResult billingResult, int i, com.google.android.gms.internal.play_billing.zzil zzilVar, long j, boolean z) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.zza.zze.zzd(com.google.android.gms.internal.play_billing.zzhx.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), com.google.android.gms.internal.play_billing.zzeu.zza()), j, z);
            } else {
                this.zza.zze.zzd(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i, billingResult, null, zzilVar), j, z);
            }
        } catch (java.lang.Throwable unused) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        byte b;
        com.google.android.gms.internal.play_billing.zzil zzilVar;
        com.android.billingclient.api.BillingResult billingResultZzh;
        int iIntValue;
        java.lang.String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            zzilVar = com.google.android.gms.internal.play_billing.zzil.PURCHASES_UPDATED_ACTION;
        } else if (b != 1) {
            zzilVar = b != 2 ? com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED : com.google.android.gms.internal.play_billing.zzil.ALTERNATIVE_BILLING_ACTION;
        } else {
            zzilVar = com.google.android.gms.internal.play_billing.zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        com.google.android.gms.internal.play_billing.zzil zzilVar2 = zzilVar;
        com.google.android.gms.internal.play_billing.zzil zzilVar3 = com.google.android.gms.internal.play_billing.zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        int i = (zzilVar2.equals(zzilVar3) || zzilVar2.equals(com.google.android.gms.internal.play_billing.zzil.ALTERNATIVE_BILLING_ACTION)) ? 2 : zzilVar2.equals(com.google.android.gms.internal.play_billing.zzil.PURCHASES_UPDATED_ACTION) ? 32 : 1;
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "Bundle is null.");
            com.android.billingclient.api.zzs zzsVar = this.zza;
            com.android.billingclient.api.zzch zzchVar = zzsVar.zze;
            com.google.android.gms.internal.play_billing.zzie zzieVar = com.google.android.gms.internal.play_billing.zzie.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzcj.zzh;
            zzchVar.zza(com.android.billingclient.api.zzcg.zzb(zzieVar, i, billingResult, null, zzilVar2));
            if (zzsVar.zzb != null) {
                zzsVar.zzb.onPurchasesUpdated(billingResult, null);
                return;
            }
            return;
        }
        if (i == 2) {
            int i2 = com.google.android.gms.internal.play_billing.zzc.zza;
            if (intent == null) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingHelper", "Got null intent!");
                com.android.billingclient.api.BillingResult.Builder builderNewBuilder = com.android.billingclient.api.BillingResult.newBuilder();
                builderNewBuilder.setResponseCode(6);
                builderNewBuilder.setOnPurchasesUpdatedSubResponseCode(0);
                builderNewBuilder.setDebugMessage("An internal error occurred.");
                billingResultZzh = builderNewBuilder.build();
            } else {
                com.android.billingclient.api.BillingResult.Builder builderNewBuilder2 = com.android.billingclient.api.BillingResult.newBuilder();
                builderNewBuilder2.setResponseCode(com.google.android.gms.internal.play_billing.zzc.zzb(intent.getExtras(), "BillingBroadcastManager"));
                android.os.Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "Unexpected null bundle received!");
                } else {
                    java.lang.Object obj = extras2.get("SUB_RESPONSE_CODE");
                    if (obj == null) {
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                    } else {
                        if (obj instanceof java.lang.Integer) {
                            iIntValue = ((java.lang.Integer) obj).intValue();
                        } else {
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(java.lang.String.valueOf(obj.getClass().getName())));
                        }
                        builderNewBuilder2.setOnPurchasesUpdatedSubResponseCode(iIntValue);
                        builderNewBuilder2.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.zzj(intent.getExtras(), "BillingBroadcastManager"));
                        billingResultZzh = builderNewBuilder2.build();
                    }
                }
                iIntValue = 0;
                builderNewBuilder2.setOnPurchasesUpdatedSubResponseCode(iIntValue);
                builderNewBuilder2.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.zzj(intent.getExtras(), "BillingBroadcastManager"));
                billingResultZzh = builderNewBuilder2.build();
            }
        } else {
            billingResultZzh = com.google.android.gms.internal.play_billing.zzc.zzh(intent, "BillingBroadcastManager");
        }
        com.android.billingclient.api.BillingResult billingResult2 = billingResultZzh;
        long j = extras.getLong("billingClientTransactionId", 0L);
        boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
        if (zzilVar2.equals(com.google.android.gms.internal.play_billing.zzil.PURCHASES_UPDATED_ACTION) || zzilVar2.equals(zzilVar3)) {
            java.util.List<com.android.billingclient.api.Purchase> listZzl = com.google.android.gms.internal.play_billing.zzc.zzl(extras);
            if (billingResult2.getResponseCode() == 0) {
                this.zza.zze.zzh(com.android.billingclient.api.zzcg.zzc(i, zzilVar2), j, z);
            } else {
                zzd(extras, billingResult2, i, zzilVar2, j, z);
            }
            this.zza.zzb.onPurchasesUpdated(billingResult2, listZzl);
            return;
        }
        if (zzilVar2.equals(com.google.android.gms.internal.play_billing.zzil.ALTERNATIVE_BILLING_ACTION)) {
            if (billingResult2.getResponseCode() != 0) {
                zzd(extras, billingResult2, i, zzilVar2, j, z);
                this.zza.zzb.onPurchasesUpdated(billingResult2, com.google.android.gms.internal.play_billing.zzbt.zzk());
                return;
            }
            com.android.billingclient.api.zzs zzsVar2 = this.zza;
            if (zzsVar2.zzc == null && zzsVar2.zzd == null) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                com.android.billingclient.api.zzs zzsVar3 = this.zza;
                com.android.billingclient.api.zzch zzchVar2 = zzsVar3.zze;
                com.google.android.gms.internal.play_billing.zzie zzieVar2 = com.google.android.gms.internal.play_billing.zzie.MISSING_USER_CHOICE_BILLING_LISTENER;
                com.android.billingclient.api.BillingResult billingResult3 = com.android.billingclient.api.zzcj.zzh;
                zzchVar2.zzd(com.android.billingclient.api.zzcg.zzb(zzieVar2, i, billingResult3, null, zzilVar2), j, z);
                zzsVar3.zzb.onPurchasesUpdated(billingResult3, com.google.android.gms.internal.play_billing.zzbt.zzk());
                return;
            }
            java.lang.String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                com.android.billingclient.api.zzch zzchVar3 = zzsVar2.zze;
                com.google.android.gms.internal.play_billing.zzie zzieVar3 = com.google.android.gms.internal.play_billing.zzie.MISSING_ALTERNATIVE_BILLING_USER_CHOICE_DATA;
                com.android.billingclient.api.BillingResult billingResult4 = com.android.billingclient.api.zzcj.zzh;
                zzchVar3.zzd(com.android.billingclient.api.zzcg.zzb(zzieVar3, i, billingResult4, null, zzilVar2), j, z);
                zzsVar2.zzb.onPurchasesUpdated(billingResult4, com.google.android.gms.internal.play_billing.zzbt.zzk());
                return;
            }
            try {
                if (zzsVar2.zzd != null) {
                    zzsVar2.zzd.userSelectedAlternativeBilling(new com.android.billingclient.api.UserChoiceDetails(string));
                } else {
                    org.json.JSONArray jSONArrayOptJSONArray = new org.json.JSONObject(string).optJSONArray("products");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (jSONArrayOptJSONArray != null) {
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                            org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i3);
                            if (jSONObjectOptJSONObject != null) {
                                arrayList.add(new com.android.billingclient.api.zzc(jSONObjectOptJSONObject, null));
                            }
                        }
                    }
                    zzsVar2.zzc.zza();
                }
                this.zza.zze.zzh(com.android.billingclient.api.zzcg.zzc(i, zzilVar2), j, z);
            } catch (org.json.JSONException unused) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", java.lang.String.format("Error when parsing invalid user choice data: [%s]", string));
                com.android.billingclient.api.zzs zzsVar4 = this.zza;
                com.android.billingclient.api.zzch zzchVar4 = zzsVar4.zze;
                com.google.android.gms.internal.play_billing.zzie zzieVar4 = com.google.android.gms.internal.play_billing.zzie.INVALID_ALTERNATIVE_BILLING_USER_CHOICE_DATA;
                com.android.billingclient.api.BillingResult billingResult5 = com.android.billingclient.api.zzcj.zzh;
                zzchVar4.zzd(com.android.billingclient.api.zzcg.zzb(zzieVar4, i, billingResult5, null, zzilVar2), j, z);
                zzsVar4.zzb.onPurchasesUpdated(billingResult5, com.google.android.gms.internal.play_billing.zzbt.zzk());
            }
        }
    }

    public final synchronized void zza(android.content.Context context, android.content.IntentFilter intentFilter) {
        if (this.zzb) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, true != this.zzc ? 4 : 2);
        } else {
            context.registerReceiver(this, intentFilter);
        }
        this.zzb = true;
    }

    public final synchronized void zzb(android.content.Context context, android.content.IntentFilter intentFilter, java.lang.String str) {
        if (this.zzb) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.zzc ? 4 : 2);
        } else {
            context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
        }
        this.zzb = true;
    }

    public final synchronized void zzc(android.content.Context context) {
        if (!this.zzb) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.zzb = false;
        }
    }
}
