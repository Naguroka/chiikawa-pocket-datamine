package com.five_corp.ad.internal.tracking_data;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f2079a = new java.lang.Object();
    public final android.content.Context b;

    public e(android.content.Context context, com.five_corp.ad.internal.tracking_data.d dVar) {
        this.b = context;
    }

    public static com.five_corp.ad.internal.tracking_data.e a(android.content.Context context) {
        android.content.SharedPreferences defaultSharedPreferences = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.contains(com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY)) {
            defaultSharedPreferences.getString(com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY, "");
        }
        if (defaultSharedPreferences.contains("IABTCF_gdprApplies")) {
            defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
        }
        com.five_corp.ad.internal.tracking_data.e eVar = new com.five_corp.ad.internal.tracking_data.e(context, new com.five_corp.ad.internal.tracking_data.d());
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(eVar);
        return eVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        if (str == null || com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY.equals(str) || "IABTCF_gdprApplies".equals(str)) {
            android.content.SharedPreferences defaultSharedPreferences = androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.b);
            if (defaultSharedPreferences.contains(com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY)) {
                defaultSharedPreferences.getString(com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY, "");
            }
            if (defaultSharedPreferences.contains("IABTCF_gdprApplies")) {
                defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
            }
            synchronized (this.f2079a) {
            }
        }
    }
}
