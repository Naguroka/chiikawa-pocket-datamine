package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\u0005\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004J.\u0010\u0005\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\rJ\u0018\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000bJ\"\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\rR(\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\n\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ironsource/w8;", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "settings", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/ironsource/mediationsdk/model/NetworkSettings;)Ljava/lang/Boolean;", "", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", "b", "", "consentValue", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "adapters", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseWrapper;", "networkAdapters", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseInterface;", "adapter", "cmpId", com.json.pr.b, "<set-?>", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", com.ironsource.y8.i.b0, "Lcom/ironsource/if;", "Lcom/ironsource/if;", "()Lcom/ironsource/if;", "deviceInfoService", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private java.lang.Boolean consent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.Cif deviceInfoService = com.json.im.INSTANCE.d().f();

    private final int a(java.lang.String message) {
        return android.util.Log.i("ironSourceSDK: GENERAL", message);
    }

    private final java.lang.Boolean a(com.json.mediationsdk.model.NetworkSettings settings) {
        if (settings == null || settings.isCustomNetwork()) {
            return this.consent;
        }
        return settings.getApplicationSettings().has(com.json.x8.f3552a) ? java.lang.Boolean.valueOf(settings.getApplicationSettings().optBoolean(com.json.x8.f3552a)) : this.consent;
    }

    private final void b(java.lang.String message) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!android.text.TextUtils.isEmpty(message)) {
                jSONObject.put("reason", message);
            }
            com.json.jj.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.Boolean getConsent() {
        return this.consent;
    }

    public final void a(int cmpId) {
        org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, cmpId + ';' + this.deviceInfoService.I(com.json.environment.ContextProvider.getInstance().getApplicationContext()));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(kotlin.ExceptionsKt.stackTraceToString(e));
        }
        com.json.wq.i().a(new com.json.wb(42, mediationAdditionalData));
    }

    public final void a(int cmpId, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.model.NetworkSettings> providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        a("TCF Additional Consent: " + this.deviceInfoService.I(com.json.environment.ContextProvider.getInstance().getApplicationContext()));
        a("CMP ID: " + cmpId);
        a("Network Consent Reporting:");
        a("----------------------------");
        java.util.Collection<com.json.mediationsdk.model.NetworkSettings> collectionValues = providerSettings.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collectionValues, "providerSettings.values");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionValues) {
            com.json.mediationsdk.model.NetworkSettings networkSettings = (com.json.mediationsdk.model.NetworkSettings) obj;
            boolean z = false;
            if (networkSettings.getProviderDefaultInstance() != null && !kotlin.jvm.internal.Intrinsics.areEqual(networkSettings.getProviderDefaultInstance(), com.json.mediationsdk.utils.IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                org.json.JSONObject applicationSettings = networkSettings.getApplicationSettings();
                if (applicationSettings != null && applicationSettings.has(com.json.x8.f3552a)) {
                    z = true;
                }
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList<com.json.mediationsdk.model.NetworkSettings> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (hashSet.add(((com.json.mediationsdk.model.NetworkSettings) obj2).getProviderDefaultInstance())) {
                arrayList2.add(obj2);
            }
        }
        for (com.json.mediationsdk.model.NetworkSettings networkSettings2 : arrayList2) {
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(networkSettings2.getProviderDefaultInstance()).append(": ");
            org.json.JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            a(sbAppend.append(applicationSettings2 != null ? java.lang.Boolean.valueOf(applicationSettings2.optBoolean(com.json.x8.f3552a)) : null).toString());
        }
    }

    public final void a(com.json.mediationsdk.AbstractAdapter adapter, com.json.mediationsdk.model.NetworkSettings settings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            java.lang.Boolean boolA = a(settings);
            if (boolA != null) {
                adapter.setNewConsent(boolA.booleanValue());
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str = "error while setting consent of " + adapter.getProviderName() + ": " + th.getLocalizedMessage();
            b(str);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(str);
        }
    }

    public final void a(com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapter, com.json.mediationsdk.model.NetworkSettings settings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            java.lang.Boolean boolA = a(settings);
            if (boolA == null || !(adapter instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterConsentInterface)) {
                return;
            }
            ((com.json.mediationsdk.adunit.adapter.internal.AdapterConsentInterface) adapter).setConsent(boolA.booleanValue());
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str = "error while setting consent of " + (settings != null ? settings.getProviderName() : null) + ": " + th.getLocalizedMessage();
            b(str);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(str);
        }
    }

    public final void a(java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.AbstractAdapter> adapters, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> networkAdapters) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapters, "adapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        for (com.json.mediationsdk.AbstractAdapter adapter : adapters.values()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "adapter");
            a(adapter, (com.json.mediationsdk.model.NetworkSettings) null);
        }
        for (com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper adapterBaseWrapper : networkAdapters.values()) {
            com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void a(boolean consentValue) {
        this.consent = java.lang.Boolean.valueOf(consentValue);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.json.Cif getDeviceInfoService() {
        return this.deviceInfoService;
    }
}
