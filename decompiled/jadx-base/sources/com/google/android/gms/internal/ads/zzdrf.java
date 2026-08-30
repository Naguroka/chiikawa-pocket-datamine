package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdrf {
    public static final com.google.android.gms.internal.ads.zzfxn zza;
    public static final com.google.android.gms.internal.ads.zzfxn zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzdre zzd;
    private final com.google.android.gms.internal.ads.zzdre zze;

    static {
        com.google.android.gms.internal.ads.zzdre zzdreVar = com.google.android.gms.internal.ads.zzdre.PUBLIC_API_CALL;
        com.google.android.gms.internal.ads.zzdre zzdreVar2 = com.google.android.gms.internal.ads.zzdre.PUBLIC_API_CALLBACK;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar = new com.google.android.gms.internal.ads.zzdrf("tqgt", zzdreVar, zzdreVar2);
        com.google.android.gms.internal.ads.zzdre zzdreVar3 = com.google.android.gms.internal.ads.zzdre.PUBLIC_API_CALL;
        com.google.android.gms.internal.ads.zzdre zzdreVar4 = com.google.android.gms.internal.ads.zzdre.DYNAMITE_ENTER;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar2 = new com.google.android.gms.internal.ads.zzdrf("l.dl", zzdreVar3, zzdreVar4);
        com.google.android.gms.internal.ads.zzdre zzdreVar5 = com.google.android.gms.internal.ads.zzdre.READ_FROM_DISK_START;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar3 = new com.google.android.gms.internal.ads.zzdrf("l.rccde", zzdreVar4, zzdreVar5);
        com.google.android.gms.internal.ads.zzdrf zzdrfVar4 = new com.google.android.gms.internal.ads.zzdrf("l.rfd", zzdreVar5, com.google.android.gms.internal.ads.zzdre.READ_FROM_DISK_END);
        com.google.android.gms.internal.ads.zzdre zzdreVar6 = com.google.android.gms.internal.ads.zzdre.CLIENT_SIGNALS_START;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar5 = new com.google.android.gms.internal.ads.zzdrf("l.rcc", zzdreVar4, zzdreVar6);
        com.google.android.gms.internal.ads.zzdre zzdreVar7 = com.google.android.gms.internal.ads.zzdre.CLIENT_SIGNALS_END;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar6 = new com.google.android.gms.internal.ads.zzdrf("l.cs", zzdreVar6, zzdreVar7);
        com.google.android.gms.internal.ads.zzdrf zzdrfVar7 = new com.google.android.gms.internal.ads.zzdrf("l.cts", zzdreVar7, com.google.android.gms.internal.ads.zzdre.SERVICE_CONNECTED);
        com.google.android.gms.internal.ads.zzdre zzdreVar8 = com.google.android.gms.internal.ads.zzdre.GMS_SIGNALS_START;
        com.google.android.gms.internal.ads.zzdre zzdreVar9 = com.google.android.gms.internal.ads.zzdre.GMS_SIGNALS_END;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar8 = new com.google.android.gms.internal.ads.zzdrf("l.gs", zzdreVar8, zzdreVar9);
        com.google.android.gms.internal.ads.zzdre zzdreVar10 = com.google.android.gms.internal.ads.zzdre.GET_SIGNALS_SDKCORE_START;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar9 = new com.google.android.gms.internal.ads.zzdrf("l.jse", zzdreVar9, zzdreVar10);
        com.google.android.gms.internal.ads.zzdre zzdreVar11 = com.google.android.gms.internal.ads.zzdre.GET_SIGNALS_SDKCORE_END;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar10 = new com.google.android.gms.internal.ads.zzdrf("l.gs-sdkcore", zzdreVar10, zzdreVar11);
        com.google.android.gms.internal.ads.zzdrf zzdrfVar11 = new com.google.android.gms.internal.ads.zzdrf("l.gs-pp", zzdreVar11, zzdreVar2);
        com.google.android.gms.internal.ads.zzdre zzdreVar12 = com.google.android.gms.internal.ads.zzdre.RENDERING_START;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar12 = new com.google.android.gms.internal.ads.zzdrf("l.render", zzdreVar12, zzdreVar2);
        com.google.android.gms.internal.ads.zzdre zzdreVar13 = com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_CREATION_START;
        com.google.android.gms.internal.ads.zzdre zzdreVar14 = com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_CREATION_END;
        com.google.android.gms.internal.ads.zzdre zzdreVar15 = com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_LOAD_HTML_START;
        com.google.android.gms.internal.ads.zzdre zzdreVar16 = com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = com.google.android.gms.internal.ads.zzfxn.zzt(zzdrfVar, zzdrfVar2, zzdrfVar3, zzdrfVar4, zzdrfVar5, zzdrfVar6, zzdrfVar7, zzdrfVar8, zzdrfVar9, zzdrfVar10, zzdrfVar11, zzdrfVar12, new com.google.android.gms.internal.ads.zzdrf("l.render.pre", zzdreVar12, zzdreVar13), new com.google.android.gms.internal.ads.zzdrf("l.render.wvc", zzdreVar13, zzdreVar14), new com.google.android.gms.internal.ads.zzdrf("l.render.acc", zzdreVar14, com.google.android.gms.internal.ads.zzdre.RENDERING_AD_COMPONENT_CREATION_END), new com.google.android.gms.internal.ads.zzdrf("l.render.cfg-wv", com.google.android.gms.internal.ads.zzdre.RENDERING_CONFIGURE_WEBVIEW_START, com.google.android.gms.internal.ads.zzdre.RENDERING_CONFIGURE_WEBVIEW_END), new com.google.android.gms.internal.ads.zzdrf("l.render.wvlh", zzdreVar15, zzdreVar16), new com.google.android.gms.internal.ads.zzdrf("l.render.post", zzdreVar16, zzdreVar2), new com.google.android.gms.internal.ads.zzdrf("l.sodv", com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_VALIDATION_START, com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_VALIDATION_END), new com.google.android.gms.internal.ads.zzdrf("l.sodck", com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_CACHE_KEY_START, com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_CACHE_KEY_END), new com.google.android.gms.internal.ads.zzdrf("l.sodrar", com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_READ_AND_REMOVE_START, com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new com.google.android.gms.internal.ads.zzdrf("l.soddc", com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_DECODE_START, com.google.android.gms.internal.ads.zzdre.SIGNAL_ON_DISK_DECODE_END));
        com.google.android.gms.internal.ads.zzdre zzdreVar17 = com.google.android.gms.internal.ads.zzdre.PUBLIC_API_CALL;
        com.google.android.gms.internal.ads.zzdre zzdreVar18 = com.google.android.gms.internal.ads.zzdre.PUBLIC_API_CALLBACK;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar13 = new com.google.android.gms.internal.ads.zzdrf("l.al", zzdreVar17, zzdreVar18);
        com.google.android.gms.internal.ads.zzdre zzdreVar19 = com.google.android.gms.internal.ads.zzdre.DYNAMITE_ENTER;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar14 = new com.google.android.gms.internal.ads.zzdrf("l.al2", zzdreVar19, zzdreVar18);
        com.google.android.gms.internal.ads.zzdrf zzdrfVar15 = new com.google.android.gms.internal.ads.zzdrf("l.dl", zzdreVar17, zzdreVar19);
        com.google.android.gms.internal.ads.zzdre zzdreVar20 = com.google.android.gms.internal.ads.zzdre.CLIENT_SIGNALS_START;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar16 = new com.google.android.gms.internal.ads.zzdrf("l.rcc", zzdreVar19, zzdreVar20);
        com.google.android.gms.internal.ads.zzdre zzdreVar21 = com.google.android.gms.internal.ads.zzdre.CLIENT_SIGNALS_END;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar17 = new com.google.android.gms.internal.ads.zzdrf("l.cs", zzdreVar20, zzdreVar21);
        com.google.android.gms.internal.ads.zzdrf zzdrfVar18 = new com.google.android.gms.internal.ads.zzdrf("l.cts", zzdreVar21, com.google.android.gms.internal.ads.zzdre.SERVICE_CONNECTED);
        com.google.android.gms.internal.ads.zzdre zzdreVar22 = com.google.android.gms.internal.ads.zzdre.GMS_SIGNALS_START;
        com.google.android.gms.internal.ads.zzdre zzdreVar23 = com.google.android.gms.internal.ads.zzdre.GMS_SIGNALS_END;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar19 = new com.google.android.gms.internal.ads.zzdrf("l.gs", zzdreVar22, zzdreVar23);
        com.google.android.gms.internal.ads.zzdre zzdreVar24 = com.google.android.gms.internal.ads.zzdre.GET_AD_DICTIONARY_SDKCORE_START;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar20 = new com.google.android.gms.internal.ads.zzdrf("l.jse", zzdreVar23, zzdreVar24);
        com.google.android.gms.internal.ads.zzdre zzdreVar25 = com.google.android.gms.internal.ads.zzdre.GET_AD_DICTIONARY_SDKCORE_END;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar21 = new com.google.android.gms.internal.ads.zzdrf("l.gad-js", zzdreVar24, zzdreVar25);
        com.google.android.gms.internal.ads.zzdre zzdreVar26 = com.google.android.gms.internal.ads.zzdre.HTTP_RESPONSE_READY;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar22 = new com.google.android.gms.internal.ads.zzdrf("l.http", zzdreVar25, zzdreVar26);
        com.google.android.gms.internal.ads.zzdre zzdreVar27 = com.google.android.gms.internal.ads.zzdre.NORMALIZATION_AD_RESPONSE_START;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar23 = new com.google.android.gms.internal.ads.zzdrf("l.jse-nml", zzdreVar26, zzdreVar27);
        com.google.android.gms.internal.ads.zzdre zzdreVar28 = com.google.android.gms.internal.ads.zzdre.NORMALIZATION_AD_RESPONSE_END;
        com.google.android.gms.internal.ads.zzdrf zzdrfVar24 = new com.google.android.gms.internal.ads.zzdrf("l.nml-js", zzdreVar27, zzdreVar28);
        com.google.android.gms.internal.ads.zzdre zzdreVar29 = com.google.android.gms.internal.ads.zzdre.BINDER_CALL_START;
        com.google.android.gms.internal.ads.zzdre zzdreVar30 = com.google.android.gms.internal.ads.zzdre.SERVER_RESPONSE_PARSE_START;
        com.google.android.gms.internal.ads.zzdre zzdreVar31 = com.google.android.gms.internal.ads.zzdre.RENDERING_START;
        com.google.android.gms.internal.ads.zzdre zzdreVar32 = com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_CREATION_START;
        com.google.android.gms.internal.ads.zzdre zzdreVar33 = com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_CREATION_END;
        com.google.android.gms.internal.ads.zzdre zzdreVar34 = com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_LOAD_HTML_END;
        zzb = com.google.android.gms.internal.ads.zzfxn.zzt(zzdrfVar13, zzdrfVar14, zzdrfVar15, zzdrfVar16, zzdrfVar17, zzdrfVar18, zzdrfVar19, zzdrfVar20, zzdrfVar21, zzdrfVar22, zzdrfVar23, zzdrfVar24, new com.google.android.gms.internal.ads.zzdrf("l.nml-gmsg", zzdreVar28, zzdreVar29), new com.google.android.gms.internal.ads.zzdrf("l.binder", zzdreVar29, zzdreVar30), new com.google.android.gms.internal.ads.zzdrf("l.sr", zzdreVar30, zzdreVar31), new com.google.android.gms.internal.ads.zzdrf("l.render", zzdreVar31, zzdreVar18), new com.google.android.gms.internal.ads.zzdrf("l.t2", com.google.android.gms.internal.ads.zzdre.RENDERING_ADSTRING_TYPE2_FETCH_START, com.google.android.gms.internal.ads.zzdre.RENDERING_ADSTRING_TYPE2_FETCH_END), new com.google.android.gms.internal.ads.zzdrf("l.render.wvc", zzdreVar32, zzdreVar33), new com.google.android.gms.internal.ads.zzdrf("l.render.acc", zzdreVar33, com.google.android.gms.internal.ads.zzdre.RENDERING_AD_COMPONENT_CREATION_END), new com.google.android.gms.internal.ads.zzdrf("l.render.cfg-wv", com.google.android.gms.internal.ads.zzdre.RENDERING_CONFIGURE_WEBVIEW_START, com.google.android.gms.internal.ads.zzdre.RENDERING_CONFIGURE_WEBVIEW_END), new com.google.android.gms.internal.ads.zzdrf("l.render.pre", zzdreVar31, zzdreVar32), new com.google.android.gms.internal.ads.zzdrf("l.render.post", zzdreVar34, zzdreVar18), new com.google.android.gms.internal.ads.zzdrf("l.render.wvlh", com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_LOAD_HTML_START, zzdreVar34));
    }

    public zzdrf(java.lang.String str, com.google.android.gms.internal.ads.zzdre zzdreVar, com.google.android.gms.internal.ads.zzdre zzdreVar2) {
        this.zzc = str;
        this.zzd = zzdreVar;
        this.zze = zzdreVar2;
    }

    public final com.google.android.gms.internal.ads.zzdre zza() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzdre zzb() {
        return this.zze;
    }

    public final java.lang.String zzc() {
        return this.zzc;
    }
}
