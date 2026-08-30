package com.google.firebase.crashlytics.ndk;

/* JADX INFO: loaded from: classes5.dex */
class SessionMetadataJsonSerializer {
    private static java.lang.String emptyIfNull(java.lang.String str) {
        return str == null ? "" : str;
    }

    private SessionMetadataJsonSerializer() {
    }

    static java.lang.String serializeBeginSession(java.lang.String str, java.lang.String str2, long j) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("session_id", str);
        map.put("generator", str2);
        map.put("started_at_seconds", java.lang.Long.valueOf(j));
        return new org.json.JSONObject(map).toString();
    }

    static java.lang.String serializeSessionApp(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, java.lang.String str6) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("app_identifier", str);
        map.put("version_code", str2);
        map.put("version_name", str3);
        map.put("install_uuid", str4);
        map.put("delivery_mechanism", java.lang.Integer.valueOf(i));
        map.put("development_platform", emptyIfNull(str5));
        map.put("development_platform_version", emptyIfNull(str6));
        return new org.json.JSONObject(map).toString();
    }

    static java.lang.String serializeSessionOs(java.lang.String str, java.lang.String str2, boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("version", str);
        map.put("build_version", str2);
        map.put("is_rooted", java.lang.Boolean.valueOf(z));
        return new org.json.JSONObject(map).toString();
    }

    static java.lang.String serializeSessionDevice(int i, java.lang.String str, int i2, long j, long j2, boolean z, int i3, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("arch", java.lang.Integer.valueOf(i));
        map.put("build_model", str);
        map.put("available_processors", java.lang.Integer.valueOf(i2));
        map.put("total_ram", java.lang.Long.valueOf(j));
        map.put("disk_space", java.lang.Long.valueOf(j2));
        map.put("is_emulator", java.lang.Boolean.valueOf(z));
        map.put("state", java.lang.Integer.valueOf(i3));
        map.put("build_manufacturer", str2);
        map.put("build_product", str3);
        return new org.json.JSONObject(map).toString();
    }
}
