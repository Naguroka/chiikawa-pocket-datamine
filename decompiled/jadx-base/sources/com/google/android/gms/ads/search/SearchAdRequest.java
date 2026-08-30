package com.google.android.gms.ads.search;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final java.lang.String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.ads.internal.client.zzei zza;
    private final java.lang.String zzb;

    /* synthetic */ SearchAdRequest(com.google.android.gms.ads.search.zzb zzbVar, com.google.android.gms.ads.search.zzc zzcVar) {
        this.zzb = zzbVar.zzb;
        this.zza = new com.google.android.gms.ads.internal.client.zzei(zzbVar.zza, this);
    }

    @java.lang.Deprecated
    public int getAnchorTextColor() {
        return 0;
    }

    @java.lang.Deprecated
    public int getBackgroundColor() {
        return 0;
    }

    @java.lang.Deprecated
    public int getBackgroundGradientBottom() {
        return 0;
    }

    @java.lang.Deprecated
    public int getBackgroundGradientTop() {
        return 0;
    }

    @java.lang.Deprecated
    public int getBorderColor() {
        return 0;
    }

    @java.lang.Deprecated
    public int getBorderThickness() {
        return 0;
    }

    @java.lang.Deprecated
    public int getBorderType() {
        return 0;
    }

    @java.lang.Deprecated
    public int getCallButtonColor() {
        return 0;
    }

    @java.lang.Deprecated
    public java.lang.String getCustomChannels() {
        return null;
    }

    public <T extends com.google.android.gms.ads.mediation.customevent.CustomEvent> android.os.Bundle getCustomEventExtrasBundle(java.lang.Class<T> cls) {
        return this.zza.zzd(cls);
    }

    @java.lang.Deprecated
    public int getDescriptionTextColor() {
        return 0;
    }

    @java.lang.Deprecated
    public java.lang.String getFontFace() {
        return null;
    }

    @java.lang.Deprecated
    public int getHeaderTextColor() {
        return 0;
    }

    @java.lang.Deprecated
    public int getHeaderTextSize() {
        return 0;
    }

    public android.location.Location getLocation() {
        return null;
    }

    @java.lang.Deprecated
    public <T extends com.google.android.gms.ads.mediation.NetworkExtras> T getNetworkExtras(java.lang.Class<T> cls) {
        return (T) this.zza.zzh(cls);
    }

    public <T extends com.google.android.gms.ads.mediation.MediationAdapter> android.os.Bundle getNetworkExtrasBundle(java.lang.Class<T> cls) {
        return this.zza.zzf(cls);
    }

    public java.lang.String getQuery() {
        return this.zzb;
    }

    public boolean isTestDevice(android.content.Context context) {
        return this.zza.zzs(context);
    }

    final com.google.android.gms.ads.internal.client.zzei zza() {
        return this.zza;
    }
}
