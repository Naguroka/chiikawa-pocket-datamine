package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class k {
    private static java.lang.String i;
    private static final java.util.concurrent.atomic.AtomicReference j = new java.util.concurrent.atomic.AtomicReference();
    private static final java.util.concurrent.atomic.AtomicReference k = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1298a;
    private final com.applovin.impl.sdk.n b;
    private final android.content.Context c;
    private final java.util.Map d;
    private final java.util.Map f;
    private boolean g;
    private final java.lang.Object e = new java.lang.Object();
    private final java.util.concurrent.atomic.AtomicReference h = new java.util.concurrent.atomic.AtomicReference();

    class a implements com.applovin.impl.em.a {
        a() {
        }

        @Override // com.applovin.impl.em.a
        public void a(com.applovin.impl.l0.a aVar) {
            com.applovin.impl.sdk.k.j.set(aVar);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f1300a;
        public final int b;

        public b(java.lang.String str, int i) {
            this.f1300a = str;
            this.b = i;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1301a = -1;
        public int b = -1;
        public java.lang.Boolean c = null;
    }

    protected k(com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new java.lang.IllegalArgumentException("No sdk specified");
        }
        this.f1298a = jVar;
        this.b = jVar.I();
        this.c = com.applovin.impl.sdk.j.m();
        this.d = z();
        this.f = y();
    }

    private double A() {
        return java.lang.Math.round((((double) java.util.TimeZone.getDefault().getOffset(new java.util.Date().getTime())) * 10.0d) / 3600000.0d) / 10.0d;
    }

    private java.util.Map F() {
        return com.applovin.impl.yp.a(a(null, true, false));
    }

    private org.json.JSONArray I() {
        if (com.applovin.impl.z3.f()) {
            return com.applovin.impl.sdk.utils.CollectionUtils.toJSONArray(android.os.Build.SUPPORTED_ABIS);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONArray, android.os.Build.CPU_ABI);
        com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONArray, android.os.Build.CPU_ABI2);
        return jSONArray;
    }

    private boolean J() {
        try {
            return b() || c();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private boolean K() {
        android.net.ConnectivityManager connectivityManager;
        if (com.applovin.impl.z3.h() && (connectivityManager = (android.net.ConnectivityManager) this.c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (java.lang.Throwable th) {
                this.f1298a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1298a.I().a("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private java.lang.Boolean L() {
        if (com.applovin.impl.z3.i()) {
            return java.lang.Boolean.valueOf(this.c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        this.h.set(o());
    }

    private java.lang.String a(int i2) {
        if (i2 == 0) {
            return "landscape_right";
        }
        if (i2 == 1) {
            return "portrait_upside_down";
        }
        if (i2 != 2) {
            return i2 != 3 ? "unknown" : com.ironsource.y8.h.D;
        }
        return "landscape_left";
    }

    private java.lang.String b(int i2) {
        if (i2 == 0) {
            return com.ironsource.y8.h.D;
        }
        if (i2 == 1) {
            return "landscape_right";
        }
        if (i2 != 2) {
            return i2 != 3 ? "unknown" : "landscape_left";
        }
        return "portrait_upside_down";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.sdk.AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            java.lang.String strD = D();
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strD)) {
                this.f1298a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1298a.I().a("DataCollector", "Successfully retrieved bid token");
                }
                com.applovin.impl.fc.a(appLovinBidTokenCollectionListener, strD);
                return;
            }
            this.f1298a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1298a.I().b("DataCollector", "Empty bid token");
            }
            com.applovin.impl.fc.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("DataCollector", "Failed to collect bid token", th);
            }
            this.f1298a.D().a("DataCollector", "collectBidToken", th);
            com.applovin.impl.fc.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private int c(java.lang.String str) {
        try {
            return android.provider.Settings.Secure.getInt(this.c.getContentResolver(), str);
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x01aa, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:112:0x01c1, please report this as an issue */
    private long d() {
        long j2;
        int iC;
        int iC2;
        int iC3;
        long j3;
        long j4;
        long j5;
        java.util.List listAsList = java.util.Arrays.asList(com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(android.provider.Settings.Secure.getString(this.c.getContentResolver(), "enabled_accessibility_services")).split(":"));
        long j6 = listAsList.contains("AccessibilityMenuService") ? 256L : 0L;
        if (listAsList.contains("SelectToSpeakService")) {
            j6 |= 512;
        }
        if (listAsList.contains("SoundAmplifierService")) {
            j6 |= 2;
        }
        if (listAsList.contains("SpeechToTextAccessibilityService")) {
            j6 |= 128;
        }
        if (listAsList.contains("SwitchAccessService")) {
            j6 |= 4;
        }
        if ((this.c.getResources().getConfiguration().uiMode & 48) == 32) {
            j6 |= 1024;
        }
        if (a("accessibility_enabled")) {
            j6 |= 8;
        }
        if (a("touch_exploration_enabled")) {
            j6 |= 16;
        }
        if (com.applovin.impl.z3.f()) {
            if (a("accessibility_display_inversion_enabled")) {
                j6 |= 32;
            }
            if (a("skip_first_use_hints")) {
                j6 |= 64;
            }
        }
        if (a("lock_screen_allow_remote_input")) {
            j6 |= 2048;
        }
        if (a("enabled_accessibility_audio_description_by_default")) {
            j6 |= 4096;
        }
        if (a("accessibility_shortcut_on_lock_screen")) {
            j6 |= 8192;
        }
        if (a("wear_talkback_enabled")) {
            j6 |= 16384;
        }
        if (a("hush_gesture_used")) {
            j6 |= 32768;
        }
        if (a("high_text_contrast_enabled")) {
            j6 |= 65536;
        }
        if (a("accessibility_display_magnification_enabled")) {
            j6 |= 131072;
        }
        if (a("accessibility_display_magnification_navbar_enabled")) {
            j6 |= 262144;
        }
        if (a("accessibility_captioning_enabled")) {
            j6 |= 524288;
        }
        if (a("accessibility_display_daltonizer_enabled")) {
            j6 |= 1048576;
        }
        if (a("accessibility_autoclick_enabled")) {
            j6 |= 2097152;
        }
        if (a("accessibility_large_pointer_icon")) {
            j6 |= 4194304;
        }
        if (a("reduce_bright_colors_activated")) {
            j6 |= 8388608;
        }
        if (a("reduce_bright_colors_persist_across_reboots")) {
            j6 |= 16777216;
        }
        if (a("tty_mode_enabled")) {
            j6 |= 33554432;
        }
        if (a("rtt_calling_mode")) {
            j6 |= 67108864;
        }
        if (a("accessibility_floating_menu_fade_enabled")) {
            j6 |= 134217728;
        }
        if (a("accessibility_show_window_magnification_prompt")) {
            j6 |= 268435456;
        }
        if (a("accessibility_floating_menu_migration_tooltip_prompt")) {
            j6 |= 536870912;
        }
        int iC4 = c("accessibility_magnification_mode");
        if (iC4 == 0) {
            j2 = 1073741824;
        } else if (iC4 == 1) {
            j2 = 2147483648L;
        } else {
            if (iC4 != 2) {
                if (iC4 == 3) {
                    j2 = 8589934592L;
                }
                iC = c("accessibility_button_mode");
                if (iC == 0) {
                    j5 = iC == 1 ? 34359738368L : 17179869184L;
                    iC2 = c("accessibility_floating_menu_size");
                    if (iC2 == 0) {
                        j4 = iC2 == 1 ? 137438953472L : 68719476736L;
                        iC3 = c("accessibility_floating_menu_icon_type");
                        if (iC3 == 0) {
                            j3 = 274877906944L;
                        } else {
                            if (iC3 == 1) {
                                return j6;
                            }
                            j3 = 549755813888L;
                        }
                        return j6 | j3;
                    }
                    j6 |= j4;
                    iC3 = c("accessibility_floating_menu_icon_type");
                    if (iC3 == 0) {
                        j3 = 274877906944L;
                    } else {
                        if (iC3 == 1) {
                            return j6;
                        }
                        j3 = 549755813888L;
                    }
                    return j6 | j3;
                }
                j6 |= j5;
                iC2 = c("accessibility_floating_menu_size");
                if (iC2 == 0) {
                    if (iC2 == 1) {
                    }
                    iC3 = c("accessibility_floating_menu_icon_type");
                    if (iC3 == 0) {
                        j3 = 274877906944L;
                    } else {
                        if (iC3 == 1) {
                            return j6;
                        }
                        j3 = 549755813888L;
                    }
                    return j6 | j3;
                }
                j6 |= j4;
                iC3 = c("accessibility_floating_menu_icon_type");
                if (iC3 == 0) {
                    j3 = 274877906944L;
                } else {
                    if (iC3 == 1) {
                        return j6;
                    }
                    j3 = 549755813888L;
                }
                return j6 | j3;
            }
            j2 = 4294967296L;
        }
        j6 |= j2;
        iC = c("accessibility_button_mode");
        if (iC == 0) {
            if (iC == 1) {
            }
            iC2 = c("accessibility_floating_menu_size");
            if (iC2 == 0) {
                if (iC2 == 1) {
                }
                iC3 = c("accessibility_floating_menu_icon_type");
                if (iC3 == 0) {
                    j3 = 274877906944L;
                } else {
                    if (iC3 == 1) {
                        return j6;
                    }
                    j3 = 549755813888L;
                }
                return j6 | j3;
            }
            j6 |= j4;
            iC3 = c("accessibility_floating_menu_icon_type");
            if (iC3 == 0) {
                j3 = 274877906944L;
            } else {
                if (iC3 == 1) {
                    return j6;
                }
                j3 = 549755813888L;
            }
            return j6 | j3;
        }
        j6 |= j5;
        iC2 = c("accessibility_floating_menu_size");
        if (iC2 == 0) {
            if (iC2 == 1) {
            }
            iC3 = c("accessibility_floating_menu_icon_type");
            if (iC3 == 0) {
                j3 = 274877906944L;
            } else {
                if (iC3 == 1) {
                    return j6;
                }
                j3 = 549755813888L;
            }
            return j6 | j3;
        }
        j6 |= j4;
        iC3 = c("accessibility_floating_menu_icon_type");
        if (iC3 == 0) {
            j3 = 274877906944L;
        } else {
            if (iC3 == 1) {
                return j6;
            }
            j3 = 549755813888L;
        }
        return j6 | j3;
    }

    private com.applovin.impl.sdk.k.c h() {
        com.applovin.impl.sdk.k.c cVar = new com.applovin.impl.sdk.k.c();
        android.content.Intent intentRegisterReceiver = this.c.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.b = -1;
        } else {
            cVar.b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f1301a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        if (com.applovin.impl.z3.d()) {
            cVar.c = java.lang.Boolean.valueOf(android.provider.Settings.Global.getInt(this.c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        } else {
            cVar.c = java.lang.Boolean.valueOf(((intentRegisterReceiver.getIntExtra("plugged", -1) & 1) | 14) > 0);
        }
        return cVar;
    }

    private java.lang.String i() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (java.lang.Throwable th) {
            if (!com.applovin.impl.sdk.n.a()) {
                return "";
            }
            this.b.a("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    private java.lang.String k() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(java.util.Locale.ENGLISH) : "";
    }

    private java.lang.String l() {
        android.graphics.Point pointB = com.applovin.impl.z3.b(this.c);
        int i2 = pointB.x;
        int i3 = pointB.y;
        int iC = com.applovin.impl.yp.c(this.c);
        return ((i2 <= i3 || !(iC == 0 || iC == 2)) && (i3 <= i2 || !(iC == 1 || iC == 3))) ? b(iC) : a(iC);
    }

    private java.lang.String n() {
        if (!com.applovin.impl.z3.h()) {
            return null;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            android.os.LocaleList locales = this.c.getResources().getConfiguration().getLocales();
            for (int i2 = 0; i2 < locales.size(); i2++) {
                sb.append(locales.get(i2));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private java.lang.Integer o() {
        android.media.AudioManager audioManager = (android.media.AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf((int) (audioManager.getStreamVolume(3) * ((java.lang.Float) this.f1298a.a(com.applovin.impl.sj.Z3)).floatValue()));
        } catch (java.lang.Throwable th) {
            this.f1298a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1298a.I().a("DataCollector", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    private float p() {
        try {
            return android.provider.Settings.System.getFloat(this.c.getContentResolver(), "font_scale");
        } catch (android.provider.Settings.SettingNotFoundException e) {
            if (!com.applovin.impl.sdk.n.a()) {
                return -1.0f;
            }
            this.b.a("DataCollector", "Error collecting font scale", e);
            return -1.0f;
        }
    }

    private boolean q() {
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) this.c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private java.util.Map r() {
        java.util.HashMap map = new java.util.HashMap();
        com.applovin.impl.sdk.utils.CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f1298a.j0().g(), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid(com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY, this.f1298a.j0().k(), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f1298a.j0().c(), map);
        return map;
    }

    private java.lang.Boolean s() {
        android.media.AudioManager audioManager = (android.media.AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(audioManager.isMusicActive());
    }

    private java.lang.Boolean t() {
        android.media.AudioManager audioManager = (android.media.AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private java.lang.String u() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            java.lang.String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, java.lang.Math.min(3, networkOperator.length()));
        } catch (java.lang.Throwable th) {
            if (!com.applovin.impl.sdk.n.a()) {
                return "";
            }
            this.b.a("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    private java.lang.String v() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            java.lang.String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(java.lang.Math.min(3, networkOperator.length()));
        } catch (java.lang.Throwable th) {
            if (!com.applovin.impl.sdk.n.a()) {
                return "";
            }
            this.b.a("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    private java.lang.String x() {
        android.media.AudioManager audioManager = (android.media.AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (com.applovin.impl.z3.g()) {
            for (android.media.AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb.append(audioDeviceInfo.getType());
                sb.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb.append("3,");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb.append("7,");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb.append(8);
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        java.lang.String string = sb.toString();
        if (android.text.TextUtils.isEmpty(string) && com.applovin.impl.sdk.n.a()) {
            this.b.a("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    private java.util.Map y() {
        android.content.pm.PackageInfo packageInfo;
        java.util.HashMap map = new java.util.HashMap();
        android.content.pm.PackageManager packageManager = this.c.getPackageManager();
        android.content.pm.ApplicationInfo applicationInfo = this.c.getApplicationInfo();
        long jLastModified = new java.io.File(applicationInfo.sourceDir).lastModified();
        java.lang.String installerPackageName = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.c.getPackageName(), 0);
            try {
                installerPackageName = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (java.lang.Throwable unused) {
            }
        } catch (java.lang.Throwable unused2) {
            packageInfo = null;
        }
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        map.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        map.put("app_version_code", java.lang.Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        if (installerPackageName == null) {
            installerPackageName = "";
        }
        map.put("installer_name", installerPackageName);
        map.put("tg", com.applovin.impl.wp.a(this.f1298a));
        map.put("debug", java.lang.Boolean.valueOf(com.applovin.impl.yp.c(this.f1298a)));
        map.put("ia", java.lang.Long.valueOf(jLastModified));
        map.put("alts_ms", java.lang.Long.valueOf(com.applovin.impl.sdk.j.l()));
        map.put("j8", java.lang.Boolean.valueOf(com.applovin.impl.sdk.j.w0()));
        map.put("ps_tpg", java.lang.Boolean.valueOf(com.applovin.impl.wh.d(this.c)));
        map.put("ps_apg", java.lang.Boolean.valueOf(com.applovin.impl.wh.b(this.c)));
        map.put("ps_capg", java.lang.Boolean.valueOf(com.applovin.impl.wh.c(this.c)));
        map.put("ps_aipg", java.lang.Boolean.valueOf(com.applovin.impl.wh.a(this.c)));
        com.applovin.impl.sdk.j jVar = this.f1298a;
        com.applovin.impl.uj ujVar = com.applovin.impl.uj.f;
        java.lang.Long l = (java.lang.Long) jVar.a(ujVar);
        if (l != null) {
            map.put("ia_v2", l);
        } else {
            this.f1298a.b(ujVar, java.lang.Long.valueOf(jLastModified));
        }
        map.put("sdk_version", com.applovin.sdk.AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f1298a.V().c());
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.v.b(), map);
        map.put("api_did", this.f1298a.a(com.applovin.impl.sj.g));
        map.put("first_install_v3_ms", packageInfo != null ? java.lang.Long.valueOf(packageInfo.firstInstallTime) : "");
        map.put("target_sdk", java.lang.Integer.valueOf(applicationInfo.targetSdkVersion));
        if (com.applovin.impl.z3.h()) {
            map.put("min_sdk", java.lang.Integer.valueOf(applicationInfo.minSdkVersion));
        }
        map.put("epv", java.lang.Integer.valueOf(com.applovin.impl.yp.f()));
        if (this.f1298a.z0()) {
            map.put("unity_version", com.applovin.impl.yp.a(this.f1298a.f0()));
        }
        return map;
    }

    private java.util.Map z() {
        java.util.HashMap map = new java.util.HashMap(35);
        map.put("api_level", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        map.put("brand", android.os.Build.MANUFACTURER);
        map.put("brand_name", android.os.Build.BRAND);
        map.put("hardware", android.os.Build.HARDWARE);
        map.put("sim", java.lang.Boolean.valueOf(com.applovin.sdk.AppLovinSdkUtils.isEmulator()));
        map.put("aida", java.lang.Boolean.valueOf(com.applovin.impl.l0.a()));
        map.put("locale", java.util.Locale.getDefault().toString());
        map.put(com.json.ce.v, android.os.Build.MODEL);
        map.put(com.json.ce.y, android.os.Build.VERSION.RELEASE);
        map.put(com.json.ce.A, w());
        map.put("revision", android.os.Build.DEVICE);
        map.put("tz_offset", java.lang.Double.valueOf(A()));
        map.put("gy", java.lang.Boolean.valueOf(q()));
        map.put("country_code", k());
        map.put("mcc", u());
        map.put("mnc", v());
        map.put(com.json.ce.F0, i());
        map.put("tv", java.lang.Boolean.valueOf(com.applovin.sdk.AppLovinSdkUtils.isTv(this.c)));
        map.put("pc", java.lang.Integer.valueOf(java.lang.Runtime.getRuntime().availableProcessors()));
        map.put("hdr", L());
        map.put("supported_abis", I());
        android.util.DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", java.lang.Float.valueOf(displayMetrics.density));
            map.put("adnsd", java.lang.Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", java.lang.Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", java.lang.Float.valueOf(displayMetrics.ydpi));
            com.applovin.impl.z3.a aVarA = com.applovin.impl.z3.a(this.c, this.f1298a);
            if (aVarA != null) {
                map.put("tl_cr", java.lang.Integer.valueOf(aVarA.c()));
                map.put("tr_cr", java.lang.Integer.valueOf(aVarA.d()));
                map.put("bl_cr", java.lang.Integer.valueOf(aVarA.a()));
                map.put("br_cr", java.lang.Integer.valueOf(aVarA.b()));
            }
        }
        map.put("bt_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime()));
        map.put("tbalsi_ms", java.lang.Long.valueOf(this.f1298a.H() - com.applovin.impl.sdk.j.l()));
        com.applovin.impl.sdk.utils.CollectionUtils.putBooleanIfValid("psase", java.lang.Boolean.valueOf(com.applovin.impl.wh.e(this.c)), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("process_name", com.applovin.impl.yp.b(this.c), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putBooleanIfValid("is_main_process", com.applovin.impl.yp.g(this.c), map);
        try {
            android.content.pm.PackageInfo packageInfo = this.c.getPackageManager().getPackageInfo("com.android.vending", 0);
            map.put("ps_version", packageInfo.versionName);
            map.put("ps_version_code", java.lang.Integer.valueOf(packageInfo.versionCode));
        } catch (java.lang.Throwable unused) {
            map.put("ps_version", "");
            map.put("ps_version_code", -1);
        }
        com.applovin.impl.sdk.utils.CollectionUtils.putBooleanIfValid("play_store_disabled", com.applovin.impl.tp.a(this.c), map);
        a(map);
        return map;
    }

    public java.util.Map B() {
        java.util.Map map = com.applovin.impl.sdk.utils.CollectionUtils.map(this.f);
        java.lang.String str = com.applovin.impl.sdk.utils.StringUtils.isValidString(i) ? i : this.c.getApplicationInfo().packageName;
        map.put(com.ironsource.y8.h.V, str);
        map.put("vz", com.applovin.impl.sdk.utils.StringUtils.toShortSHA1Hash(str));
        map.put("first_install", java.lang.Boolean.valueOf(this.f1298a.t0()));
        map.put("first_install_v2", java.lang.Boolean.valueOf(!this.f1298a.r0()));
        map.put("test_ads", java.lang.Boolean.valueOf(this.g));
        map.put("muted", java.lang.Boolean.valueOf(this.f1298a.f0().isMuted()));
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.B3)).booleanValue()) {
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("cuid", this.f1298a.o0().c(), map);
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.E3)).booleanValue()) {
            map.put("compass_random_token", this.f1298a.r());
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.G3)).booleanValue()) {
            map.put("applovin_random_token", this.f1298a.Z());
        }
        map.putAll(r());
        if (this.f1298a.Y() != null) {
            com.applovin.impl.sdk.utils.CollectionUtils.putJsonArrayIfValid("ps_topics", this.f1298a.Y().a(), map);
        }
        return map;
    }

    public com.applovin.impl.sdk.k.b C() {
        return (com.applovin.impl.sdk.k.b) k.get();
    }

    protected java.lang.String D() {
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(new org.json.JSONObject(F()).toString().getBytes(java.nio.charset.Charset.defaultCharset()), 2);
        return ((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.c5)).booleanValue() ? com.applovin.impl.vi.b(strEncodeToString, com.applovin.impl.yp.a(this.f1298a), com.applovin.impl.vi.a.a(((java.lang.Integer) this.f1298a.a(com.applovin.impl.sj.d5)).intValue()), this.f1298a.a0(), this.f1298a) : strEncodeToString;
    }

    public java.lang.String E() {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) this.c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public java.util.Map G() {
        return com.applovin.impl.sdk.utils.CollectionUtils.map(this.f);
    }

    public java.util.Map H() {
        return com.applovin.impl.sdk.utils.CollectionUtils.map(this.d);
    }

    public boolean M() {
        return this.g;
    }

    public void O() {
        com.applovin.impl.tm tmVarI0 = this.f1298a.i0();
        com.applovin.impl.em emVar = new com.applovin.impl.em(this.f1298a, new com.applovin.impl.sdk.k.a());
        com.applovin.impl.tm.b bVar = com.applovin.impl.tm.b.OTHER;
        tmVarI0.a((com.applovin.impl.yl) emVar, bVar);
        this.f1298a.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.f1298a, true, "setDeviceVolume", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.N();
            }
        }), bVar);
    }

    public void P() {
        synchronized (this.e) {
            a(this.d);
        }
    }

    public java.util.Map e() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("sc", this.f1298a.a(com.applovin.impl.sj.m));
        map.put("sc2", this.f1298a.a(com.applovin.impl.sj.n));
        map.put("sc3", this.f1298a.a(com.applovin.impl.sj.o));
        map.put("server_installed_at", this.f1298a.a(com.applovin.impl.sj.p));
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("persisted_data", (java.lang.String) this.f1298a.a(com.applovin.impl.uj.H), map);
        return map;
    }

    public java.util.Map j() {
        com.applovin.impl.d4.d dVarA = this.f1298a.t().a();
        if (dVarA == null) {
            return null;
        }
        java.util.HashMap map = new java.util.HashMap(4);
        map.put("lrm_ts_ms", java.lang.String.valueOf(dVarA.c()));
        map.put("lrm_url", dVarA.d());
        map.put("lrm_ct_ms", java.lang.String.valueOf(dVarA.a()));
        map.put("lrm_rs", java.lang.String.valueOf(dVarA.b()));
        return map;
    }

    public java.util.Map m() {
        return a(false);
    }

    public java.lang.String w() {
        return com.applovin.sdk.AppLovinSdkUtils.isFireOS(this.c) ? "fireos" : "android";
    }

    private boolean c() {
        java.lang.String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i2 = 0; i2 < 9; i2++) {
            if (new java.io.File(d(strArr[i2])).exists()) {
                return true;
            }
        }
        return false;
    }

    private java.lang.String g() {
        int orientation = com.applovin.sdk.AppLovinSdkUtils.getOrientation(this.c);
        if (orientation == 1) {
            return com.ironsource.y8.h.D;
        }
        return orientation == 2 ? com.ironsource.y8.h.C : "none";
    }

    protected void a(final com.applovin.sdk.AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f1298a.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.f1298a, ((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.M3)).booleanValue(), "DataCollector", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(appLovinBidTokenCollectionListener);
            }
        }), com.applovin.impl.tm.b.CORE);
    }

    public java.util.Map a(java.util.Map map, boolean z, boolean z2) {
        java.util.HashMap map2 = new java.util.HashMap(64);
        java.util.Map mapA = a(z);
        java.util.Map mapB = B();
        java.util.Map mapJ = j();
        java.util.Map mapC0 = this.f1298a.c0();
        if (z2) {
            map2.put("device_info", mapA);
            map2.put("app_info", mapB);
            if (mapJ != null) {
                map2.put("connection_info", mapJ);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (!com.applovin.impl.sdk.utils.CollectionUtils.isEmpty(mapC0)) {
                map2.put("segments", mapC0);
            }
        } else {
            map2.putAll(mapA);
            map2.putAll(mapB);
            if (mapJ != null) {
                map2.putAll(mapJ);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (!com.applovin.impl.sdk.utils.CollectionUtils.isEmpty(mapC0)) {
                map2.putAll(mapC0);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("mediation_provider", this.f1298a.N(), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("mediation_provider_v2", this.f1298a.y(), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("plugin_version", (java.lang.String) this.f1298a.a(com.applovin.impl.sj.K3), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putLongIfValid("tssf_ms", java.lang.Long.valueOf(this.f1298a.l0()), map2);
        if (!((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.a5)).booleanValue()) {
            map2.put(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1298a.a0());
        }
        map2.putAll(e());
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.B4)).booleanValue()) {
            com.applovin.impl.ca caVarC = this.f1298a.C();
            map2.put("li", java.lang.Long.valueOf(caVarC.b(com.applovin.impl.ba.e)));
            map2.put("si", java.lang.Long.valueOf(caVarC.b(com.applovin.impl.ba.h)));
            map2.put("mad", java.lang.Long.valueOf(caVarC.b(com.applovin.impl.ba.f)));
            map2.put("msad", java.lang.Long.valueOf(caVarC.b(com.applovin.impl.ba.i)));
            map2.put("pf", java.lang.Long.valueOf(caVarC.b(com.applovin.impl.ba.m)));
            map2.put("mpf", java.lang.Long.valueOf(caVarC.b(com.applovin.impl.ba.t)));
            map2.put("gpf", java.lang.Long.valueOf(caVarC.b(com.applovin.impl.ba.n)));
            map2.put("asoac", java.lang.Long.valueOf(caVarC.b(com.applovin.impl.ba.r)));
        }
        map2.put("rid", java.util.UUID.randomUUID().toString());
        return map2;
    }

    public static void b(java.lang.String str) {
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(com.applovin.impl.sdk.j.m().getPackageManager().getInstallerPackageName(com.applovin.impl.sdk.j.m().getApplicationInfo().packageName))) {
            return;
        }
        i = str;
    }

    private boolean b() {
        java.lang.String str = android.os.Build.TAGS;
        return str != null && str.contains(d("lz}$blpz"));
    }

    public java.util.Map a(boolean z) {
        java.util.Map map;
        synchronized (this.e) {
            map = com.applovin.impl.sdk.utils.CollectionUtils.map(this.d);
        }
        return a(map, z);
    }

    private void a(java.util.Map map) {
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.T3)).booleanValue() && !map.containsKey("af")) {
            map.put("af", java.lang.Long.valueOf(d()));
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.U3)).booleanValue() && !map.containsKey("font")) {
            map.put("font", java.lang.Float.valueOf(p()));
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.b4)).booleanValue() && com.applovin.impl.yp.d(this.f1298a)) {
            com.applovin.impl.sr.a(this.f1298a);
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.p4)).booleanValue()) {
            com.applovin.impl.sr.b(this.f1298a);
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.a4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", java.lang.System.getProperty("http.agent"));
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.W3)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", java.lang.Boolean.valueOf(K()));
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.f4)).booleanValue()) {
            boolean z = true;
            boolean z2 = this.c.getResources().getConfiguration().keyboard == 2;
            boolean zHasSystemFeature = this.c.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
            boolean zHasSystemFeature2 = this.c.getPackageManager().hasSystemFeature("android.hardware.type.pc");
            if (!z2 || (!zHasSystemFeature && !zHasSystemFeature2)) {
                z = false;
            }
            map.put("is_pc", java.lang.Boolean.valueOf(z));
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.r4)).booleanValue()) {
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("oglv", E(), map);
        }
    }

    private java.util.Map a(java.util.Map map, boolean z) {
        com.applovin.impl.l0.a aVarF;
        android.os.PowerManager powerManager;
        java.util.Map map2 = com.applovin.impl.sdk.utils.CollectionUtils.map(map);
        android.graphics.Point pointB = com.applovin.impl.z3.b(this.c);
        map2.put("dx", java.lang.Integer.valueOf(pointB.x));
        map2.put("dy", java.lang.Integer.valueOf(pointB.y));
        android.util.DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map2.put("screen_size_in", java.lang.Double.valueOf(java.lang.Math.sqrt(java.lang.Math.pow(pointB.x, 2.0d) + java.lang.Math.pow(pointB.y, 2.0d)) / ((double) displayMetrics.xdpi)));
        }
        map2.put("is_tablet", java.lang.Boolean.valueOf(com.applovin.sdk.AppLovinSdkUtils.isTablet(this.c)));
        if (z) {
            aVarF = (com.applovin.impl.l0.a) j.get();
            if (aVarF != null) {
                O();
            } else if (com.applovin.impl.yp.h()) {
                aVarF = new com.applovin.impl.l0.a();
                map2.put("inc", java.lang.Boolean.TRUE);
            } else {
                aVarF = f();
            }
        } else {
            aVarF = f();
        }
        java.lang.String strA = aVarF.a();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
            map2.put("idfa", strA);
        }
        map2.put("dnt", java.lang.Boolean.valueOf(aVarF.c()));
        map2.put("dnt_code", aVarF.b().b());
        com.applovin.impl.sdk.k.b bVar = (com.applovin.impl.sdk.k.b) k.get();
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.A3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f1300a);
            map2.put("idfv_scope", java.lang.Integer.valueOf(bVar.b));
        }
        java.lang.Boolean boolB = com.applovin.impl.a4.b().b(this.c);
        if (boolB != null) {
            map2.put("huc", boolB);
        }
        java.lang.Boolean boolB2 = com.applovin.impl.a4.c().b(this.c);
        if (boolB2 != null) {
            map2.put("aru", boolB2);
        }
        java.lang.Boolean boolB3 = com.applovin.impl.a4.a().b(this.c);
        if (boolB3 != null) {
            map2.put("dns", boolB3);
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.N3)).booleanValue()) {
            com.applovin.impl.sdk.k.c cVarH = h();
            com.applovin.impl.sdk.utils.CollectionUtils.putIntegerIfValid("act", java.lang.Integer.valueOf(cVarH.f1301a), map2);
            com.applovin.impl.sdk.utils.CollectionUtils.putIntegerIfValid("acm", java.lang.Integer.valueOf(cVarH.b), map2);
            com.applovin.impl.sdk.utils.CollectionUtils.putBooleanIfValid("sowpie", cVarH.c, map2);
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.V3)).booleanValue()) {
            map2.put("mtl", java.lang.Integer.valueOf(this.f1298a.e0().getLastTrimMemoryLevel()));
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.Y3)).booleanValue()) {
            map2.put("adr", java.lang.Boolean.valueOf(J()));
        }
        java.lang.Integer numO = z ? (java.lang.Integer) this.h.get() : o();
        if (numO != null) {
            map2.put("volume", numO);
        }
        com.applovin.impl.sdk.utils.CollectionUtils.putBooleanIfValid("ma", s(), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putBooleanIfValid("spo", t(), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putBooleanIfValid("aif", java.lang.Boolean.valueOf(!this.f1298a.e0().isApplicationPaused()), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putLongIfValid("af_ts_ms", java.lang.Long.valueOf(this.f1298a.e0().getAppEnteredForegroundTimeMillis()), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putLongIfValid("ab_ts_ms", java.lang.Long.valueOf(this.f1298a.e0().getAppEnteredBackgroundTimeMillis()), map2);
        try {
            map2.put("sb", java.lang.Integer.valueOf((int) ((android.provider.Settings.System.getInt(this.c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (android.provider.Settings.SettingNotFoundException e) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("DataCollector", "Unable to collect screen brightness", e);
            }
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.b4)).booleanValue() && com.applovin.impl.yp.d(this.f1298a)) {
            com.applovin.impl.sr.a(this.f1298a);
            java.lang.String strA2 = com.applovin.impl.sr.a();
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA2)) {
                map2.put(com.json.ce.U, strA2);
            }
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.p4)).booleanValue()) {
            com.applovin.impl.sr.b(this.f1298a);
            com.applovin.impl.sdk.utils.CollectionUtils.putIntegerIfValid("wvvc", java.lang.Integer.valueOf(com.applovin.impl.sr.d()), map2);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("wvv", com.applovin.impl.sr.c(), map2);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("wvpn", com.applovin.impl.sr.b(), map2);
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.P3)).booleanValue()) {
            try {
                map2.put(com.json.ce.J0, java.lang.Long.valueOf(android.os.Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", java.lang.Long.valueOf(android.os.Environment.getDataDirectory().getTotalSpace()));
            } catch (java.lang.Throwable th) {
                map2.put(com.json.ce.J0, -1);
                map2.put("tds", -1);
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.Q3)).booleanValue()) {
            android.app.ActivityManager.MemoryInfo memoryInfoA = com.applovin.impl.yp.a((android.app.ActivityManager) this.c.getSystemService("activity"));
            if (memoryInfoA != null) {
                map2.put("fm", java.lang.Long.valueOf(memoryInfoA.availMem));
                map2.put("tm", java.lang.Long.valueOf(memoryInfoA.totalMem));
                map2.put("lmt", java.lang.Long.valueOf(memoryInfoA.threshold));
                map2.put("lm", java.lang.Boolean.valueOf(memoryInfoA.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.R3)).booleanValue() && com.applovin.impl.z3.a("android.permission.READ_PHONE_STATE", this.c) && com.applovin.impl.z3.h()) {
            map2.put("rat", java.lang.Integer.valueOf(((android.telephony.TelephonyManager) this.c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.O3)).booleanValue()) {
            java.lang.String strX = x();
            if (!android.text.TextUtils.isEmpty(strX)) {
                map2.put("so", strX);
            }
        }
        map2.put("device_orientation", l());
        map2.put("orientation_lock", g());
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.S3)).booleanValue()) {
            map2.put("vs", java.lang.Boolean.valueOf(com.applovin.impl.yp.j()));
        }
        if (com.applovin.impl.z3.f() && (powerManager = (android.os.PowerManager) this.c.getSystemService("power")) != null) {
            map2.put(com.json.ce.O0, java.lang.Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.d4)).booleanValue() && this.f1298a.d0() != null) {
            map2.put("da", java.lang.Float.valueOf(this.f1298a.d0().a()));
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.e4)).booleanValue() && this.f1298a.d0() != null) {
            map2.put("dm", java.lang.Float.valueOf(this.f1298a.d0().b()));
        }
        map2.put("mute_switch", java.lang.Integer.valueOf(this.f1298a.o().a()));
        map2.put("network", com.applovin.impl.e4.g(this.f1298a));
        java.lang.String strN = n();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strN)) {
            map2.put("kb", strN);
        }
        com.applovin.impl.sdk.array.ArrayService arrayServiceN = this.f1298a.n();
        if (arrayServiceN.isAppHubInstalled()) {
            if (arrayServiceN.getIsDirectDownloadEnabled() != null) {
                map2.put("ah_dd_enabled", arrayServiceN.getIsDirectDownloadEnabled());
            }
            map2.put("ah_sdk_version_code", java.lang.Long.valueOf(arrayServiceN.getAppHubVersionCode()));
            map2.put("ah_random_user_token", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(arrayServiceN.getRandomUserToken()));
            map2.put("ah_sdk_package_name", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(arrayServiceN.getAppHubPackageName()));
        }
        return map2;
    }

    private java.lang.String d(java.lang.String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = str.charAt(i2);
            for (int i3 = 9; i3 >= 0; i3--) {
                cArr[i2] = (char) (cArr[i2] ^ iArr[i3]);
            }
        }
        return new java.lang.String(cArr);
    }

    public static void a(com.applovin.impl.l0.a aVar) {
        j.set(aVar);
    }

    public static void a(com.applovin.impl.sdk.k.b bVar) {
        k.set(bVar);
    }

    private boolean a(java.lang.String str) {
        return c(str) == 1;
    }

    public com.applovin.impl.l0.a f() {
        java.util.List<java.lang.String> testDeviceAdvertisingIds;
        com.applovin.impl.l0.a aVarB = com.applovin.impl.l0.b(this.c);
        if (aVarB == null) {
            return new com.applovin.impl.l0.a();
        }
        if (((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.z3)).booleanValue()) {
            if (aVarB.c() && !((java.lang.Boolean) this.f1298a.a(com.applovin.impl.sj.y3)).booleanValue()) {
                aVarB.a("");
            }
            j.set(aVarB);
        } else {
            aVarB = new com.applovin.impl.l0.a();
        }
        if (this.f1298a.x0().get()) {
            testDeviceAdvertisingIds = this.f1298a.f0().getTestDeviceAdvertisingIds();
        } else {
            testDeviceAdvertisingIds = this.f1298a.G() != null ? this.f1298a.G().getTestDeviceAdvertisingIds() : null;
        }
        if (testDeviceAdvertisingIds != null) {
            java.lang.String strA = aVarB.a();
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
                this.g = testDeviceAdvertisingIds.contains(strA);
            }
            com.applovin.impl.sdk.k.b bVarC = C();
            java.lang.String str = bVarC != null ? bVarC.f1300a : null;
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
                this.g = testDeviceAdvertisingIds.contains(str) | this.g;
            }
        } else {
            this.g = false;
        }
        return aVarB;
    }
}
